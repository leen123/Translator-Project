package ast.Controller.ControllerBody;

import color.Colors;
import error_handling.ErrorHandling;
import symbol_table.Row;
import symbol_table.SymbolTable;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayDimension {
    private Integer indexNumber;
    private String indexVar;

    public ArrayDimension(){
        this.indexNumber = null;
    }
    public int getIndexNumber() {
        return indexNumber;
    }

    public void setIndexNumber(int indexNumber) {
        this.indexNumber = indexNumber;
    }

    public String getIndexVar() {
        return indexVar;
    }

    public void setIndexVar(String indexVar) {
        this.indexVar = indexVar;
    }
    public void debug(List key, String scope){
        Row row= SymbolTable.findRow(key);
        List tempPath=new ArrayList();
        tempPath.addAll(key);
        if(indexNumber!=null){
            tempPath.add(indexNumber);
            row.table.put(indexNumber.toString(),
                    new Row("integer","var",scope, tempPath));
        }else if(indexVar!=null){

                tempPath.add(indexVar);
                String controllerPageId= (String) SymbolTable.table.get(key.get(0)).table.keySet().toArray()[0];
                //  System.out.println(controllerPageId);
                if(SymbolTable.checkFound(indexVar,"","page", Arrays.asList(new String[]{controllerPageId})).size()>0){
                    row.table.put(indexVar,
                            new Row("var",scope, tempPath));
                }else {
                    String extendPageId= (String) SymbolTable.table.get(controllerPageId).table.keySet().toArray()[0];
                    if(SymbolTable.checkFound(indexVar,"","page", Arrays.asList(new String[]{extendPageId})).size()>0){
                        row.table.put(indexVar,
                                new Row("var",scope, tempPath));
                    }else if(SymbolTable.checkFound(indexVar,"","", key.subList(0,2)).size()>0){
                        row.table.put(indexVar,
                                new Row("var",scope, tempPath));
                    }else{
                        ErrorHandling.error.add(Colors.TEXT_B+Colors.TEXT_RED+"[a name '"+indexVar+"' is not found in page '"+controllerPageId+"']:"+Colors.TEXT_RESET+Colors.TEXT_RED+" can't define the variable by that name"+
                                Colors.TEXT_YELLOW+", path: '"+SymbolTable.formatPath(tempPath)+"'"+Colors.TEXT_RESET);SymbolTable.stop=true;
                    }


                }
        }

    }
    public String generating(){
        if(indexVar!=null){
             return "$"+indexVar;
        }else if(indexNumber!=null){
            return  indexNumber.toString();
        }
        return "";
    }
}
