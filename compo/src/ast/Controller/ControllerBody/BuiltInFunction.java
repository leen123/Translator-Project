package ast.Controller.ControllerBody;

import ast.Controller.ControllerBody.BuiltInFunctions.AddFunction;
import ast.Controller.ControllerBody.BuiltInFunctions.ToLowerFunction;
import ast.Controller.ControllerBody.BuiltInFunctions.ToUpperFunction;
import color.Colors;
import error_handling.ErrorHandling;
import symbol_table.Row;
import symbol_table.SymbolTable;

import java.util.ArrayList;
import java.util.List;

public class BuiltInFunction {
    AddFunction addFunction;
    ToLowerFunction toLowerFunction;
    ToUpperFunction toUpperFunction;

    public AddFunction getAddFunction() {
        return addFunction;
    }

    public void setAddFunction(AddFunction addFunction) {
        this.addFunction = addFunction;
    }

    public ToLowerFunction getToLowerFunction() {
        return toLowerFunction;
    }

    public void setToLowerFunction(ToLowerFunction toLowerFunction) {
        this.toLowerFunction = toLowerFunction;
    }

    public ToUpperFunction getToUpperFunction() {
        return toUpperFunction;
    }

    public void setToUpperFunction(ToUpperFunction toUpperFunction) {
        this.toUpperFunction = toUpperFunction;
    }
    public void debug(List key, String scope){
        Row row= SymbolTable.findRow(key);
        List tempPath=new ArrayList();
        tempPath.addAll(key);
        if(addFunction!=null){
            addFunction.debug(tempPath,scope);
        }else if(toLowerFunction!=null){
            toLowerFunction.debug(tempPath,scope);
        }else if(toUpperFunction!=null){
            toUpperFunction.debug(tempPath,scope);
        }
    }
    public String generating(String space,List<String> key){
        if(addFunction!=null){
            return addFunction.generating(space,key);
        }else if(toLowerFunction!=null){
             return toLowerFunction.generating(space,key);
        }else if(toUpperFunction!=null){
             return toUpperFunction.generating(space,key);
        }
        return "";
    }
}
