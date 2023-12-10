package ast.Controller.ControllerBody;

import ast.Controller.Variable;
import symbol_table.Row;
import symbol_table.SymbolTable;

import java.util.ArrayList;
import java.util.List;

public class RightSideExpression {
    String expressionString;
    Integer expressionInteger;
    Variable expressionVar;

    public String getExpressionString() {
        return expressionString;
    }

    public void setExpressionString(String expressionString) {
        this.expressionString = expressionString;
    }

    public Integer getExpressionInteger() {
        return expressionInteger;
    }

    public void setExpressionInteger(Integer expressionInteger) {
        this.expressionInteger = expressionInteger;
    }

    public Variable getExpressionVar() {
        return expressionVar;
    }

    public void setExpressionVar(Variable expressionVar) {
        this.expressionVar = expressionVar;
    }
    public void debug(List key, String scope){
        Row row= SymbolTable.findRow(key);
        List tempPath=new ArrayList();
        tempPath.addAll(key);
        if(expressionInteger!=null){
            tempPath.add(expressionInteger.toString());
            row.table.put(expressionInteger.toString(),
                    new Row("integer","val",scope, tempPath));
        }else if(expressionString!=null){
            tempPath.add(expressionString);
            row.table.put(expressionString,
                    new Row("string","val",scope, tempPath));
        }else if(expressionVar!=null){
            expressionVar.debug(key,scope);
        }
    }
    public String generating(List<String> key) {
        if (expressionVar != null) {
            return  expressionVar.generating(key);
        } else if (expressionInteger != null) {
            return expressionInteger.toString();
        } else if (expressionString != null) {
            return  expressionString ;
        }
        return "";
    }
}
