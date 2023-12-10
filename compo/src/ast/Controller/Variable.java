package ast.Controller;

import ast.Controller.ControllerBody.ArrayDimension;
import ast.Controller.ControllerBody.ControllerBody;
import color.Colors;
import error_handling.ErrorHandling;
import symbol_table.Row;
import symbol_table.SymbolTable;

import java.util.*;

public class Variable {
    private String name;
    private List<ArrayDimension> arrayDimensionList;
    public Variable() {
        this.arrayDimensionList = new LinkedList<>();
    }
    public void addDimension(ArrayDimension arrayDimension){
        this.arrayDimensionList.add(arrayDimension);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void debug(List key, String scope){
        Row row= SymbolTable.findRow(key);
        List tempPath=new ArrayList();
        tempPath.addAll(key);
        tempPath.add(name);
        if(SymbolTable.checkFound(name,"arrayName","", Collections.singletonList(key.get(0))).size()>0){
            row.table.put(name,
                    new Row("var",scope, tempPath));
        }else if(arrayDimensionList.size()<1){
            String controllerPageId= (String) SymbolTable.table.get(key.get(0)).table.keySet().toArray()[0];
            //  System.out.println(controllerPageId);
            if(SymbolTable.checkFound(name,"","page", Arrays.asList(new String[]{controllerPageId})).size()>0){
                row.table.put(name,
                        new Row("var",scope, tempPath));
            }else {
                String extendPageId= (String) SymbolTable.table.get(controllerPageId).table.keySet().toArray()[0];
                if(SymbolTable.checkFound(name,"","page", Arrays.asList(new String[]{extendPageId})).size()>0){
                    row.table.put(name,
                            new Row("var",scope, tempPath));
                }else if(SymbolTable.checkFound(name,"","", key.subList(0,2)).size()>0){
                    row.table.put(name,
                            new Row("var",scope, tempPath));
                }else{
                    ErrorHandling.error.add(Colors.TEXT_B+Colors.TEXT_RED+"[a name '"+name+"' is not found in page '"+controllerPageId+"']:"+Colors.TEXT_RESET+Colors.TEXT_RED+" can't define the variable by that name"+
                            Colors.TEXT_YELLOW+", path: '"+SymbolTable.formatPath(tempPath)+"'"+Colors.TEXT_RESET);SymbolTable.stop=true;
                }


            }
            row.table.put(name,
                    new Row("var",scope, tempPath));
        }else{
            ErrorHandling.error.add(Colors.TEXT_B+Colors.TEXT_RED+"[a name '"+name+"' is not array ]:"+Colors.TEXT_RESET+Colors.TEXT_RED+" can't found the array by that name"+
                    Colors.TEXT_YELLOW+", path: '"+SymbolTable.formatPath(tempPath)+"'"+Colors.TEXT_RESET);
            SymbolTable.stop=true;
        }
        if(SymbolTable.stop) return;
        if(arrayDimensionList.size()>0){
            for (ArrayDimension arrayDimension:arrayDimensionList) {
                arrayDimension.debug(tempPath,"arrayDimension");
            }
        }
    }
    public String generating(List<String> key){
        String codeGenerating="";
        String controllerPageId= (String) SymbolTable.table.get(key.get(0)).table.keySet().toArray()[0];
        if(SymbolTable.checkFound(name,"","page", Arrays.asList(new String[]{controllerPageId})).size()>0){
            Row row=SymbolTable.findRow(SymbolTable.checkFound(name,"","page", Arrays.asList(new String[]{controllerPageId})));
            //System.out.println(controllerPageId + " "+variable);
            if(row.type.equals("number")){
                codeGenerating+="(int)";
            }
            codeGenerating+="$_POST['"+name+"']";
        }else {
            codeGenerating+="$_SESSION[\""+name+"\"]";
        }

        for (ArrayDimension arrayDimension:arrayDimensionList) {
            codeGenerating +="["+arrayDimension.generating()+"]";
        }
        return codeGenerating;
    }
}
