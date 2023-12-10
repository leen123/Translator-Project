package ast.Controller.ControllerBody;

import color.Colors;
import error_handling.ErrorHandling;
import symbol_table.Row;
import symbol_table.SymbolTable;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayValue {
    private String variable;
    private String stringValue;
    private Integer numericValue;

    public String getVariable() {
        return variable;
    }

    public void setVariable(String variable) {
        this.variable = variable;
    }

    public String getStringValue() {
        return stringValue;
    }

    public void setStringValue(String stringValue) {
        this.stringValue = stringValue;
    }

    public int getNumericValue() {
        return numericValue;
    }

    public void setNumericValue(int numericValue) {
        this.numericValue = numericValue;
    }
    public void debug(List key,String scope){
        Row row= SymbolTable.findRow(key);
        List tempPath=new ArrayList();
        tempPath.addAll(key);
      //  tempPath.add(arrayName);
        if(numericValue!=null){
            tempPath.add(numericValue.toString());
            row.table.put(numericValue.toString(),
                    new Row("integer","value",scope, tempPath));
        }else if(stringValue!=null){
            tempPath.add(stringValue);
            row.table.put(stringValue,
                    new Row("string","value",scope, tempPath));
        }else if(variable!=null){
            tempPath.add(variable);
            String controllerPageId= (String) SymbolTable.table.get(key.get(0)).table.keySet().toArray()[0];

            if(SymbolTable.checkFound(variable,"","page", Arrays.asList(new String[]{controllerPageId})).size()>0){
                row.table.put(variable,
                        new Row("var",scope, tempPath));
            }else {
                String extendPageId= (String) SymbolTable.table.get(controllerPageId).table.keySet().toArray()[0];
                if(SymbolTable.checkFound(variable,"","page", Arrays.asList(new String[]{extendPageId})).size()>0){
                    row.table.put(variable,
                            new Row("var",scope, tempPath));
                }else{
                    ErrorHandling.error.add(Colors.TEXT_B+Colors.TEXT_RED+"[a name '"+variable+"' is not found in page '"+controllerPageId+"']:"+Colors.TEXT_RESET+Colors.TEXT_RED+" can't define the variable by that name"+
                            Colors.TEXT_YELLOW+", path: '"+SymbolTable.formatPath(tempPath)+"'"+Colors.TEXT_RESET);
                    SymbolTable.stop=true;
                }


            }
        }
    }
    public String generating(String space,List key){

            if(variable!=null){
                String controllerPageId= (String) SymbolTable.table.get(key.get(0)).table.keySet().toArray()[0];
                //System.out.println(controllerPageId + " "+variable);
                if(SymbolTable.checkFound(variable,"","page", Arrays.asList(new String[]{controllerPageId})).size()>0){
                    //System.out.println(controllerPageId + " "+variable);
                    return "$_POST['"+variable+"']";
                }else {
                    return "$_SESSION[\""+variable+"\"]";
                }

            }else if(numericValue!=null){
                return  numericValue.toString();
            }else if(stringValue!=null){
                return "\""+stringValue+"\"";
            }
            return "";
    }
}
