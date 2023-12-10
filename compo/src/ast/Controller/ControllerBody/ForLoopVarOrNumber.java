package ast.Controller.ControllerBody;

import ast.Controller.Variable;
import color.Colors;
import error_handling.ErrorHandling;
import symbol_table.Row;
import symbol_table.SymbolTable;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ForLoopVarOrNumber {
    private Variable var;
    private Integer number;

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public Variable getVar() {
        return var;
    }

    public void setVar(Variable var) {
        this.var = var;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }
    public void debug(List key, String scope){
        Row row= SymbolTable.findRow(key);
        List tempPath=new ArrayList();
        tempPath.addAll(key);
        //  tempPath.add(arrayName);
        if(number!=null){
            tempPath.add(number.toString());
            row.table.put(number.toString(),
                    new Row("integer","value",scope, tempPath));
        }else if(var!=null){
            var.debug(tempPath,scope);
        }
    }
    public String generating(List<String> key){
        if(var!=null){
            return var.generating(key);
        }else if(number!=null){
            return  number.toString();
        }
        return "";
    }
}
