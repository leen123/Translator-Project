package ast.Controller.ControllerBody.BuiltInFunctions;

import ast.Controller.Variable;
import symbol_table.Row;
import symbol_table.SymbolTable;

import java.util.ArrayList;
import java.util.List;

public class ToLowerFunction {
    private Variable variable;

    public Variable getVariable() {
        return variable;
    }

    public void setVariable(Variable variable) {
        this.variable = variable;
    }

    public void debug(List key, String scope){
        Row row= SymbolTable.findRow(key);
        List tempPath=new ArrayList();
        tempPath.addAll(key);
        String nameLoop="toLower";
        int i=1;
        while (true){
            if(!row.table.containsKey(nameLoop+i)) break;
            i++;
        }
        nameLoop+=i;
        tempPath.add(nameLoop);
        row.table.put(nameLoop,
                new Row("function",scope, tempPath));
        if(variable!=null){
            variable.debug(tempPath,"toLower");
        }
    }
    public String generating(String space,List<String> key){
        String codeGenerating="";
        codeGenerating+=space+variable.generating(key)+" = "+"strtolower("+variable.generating(key)+");\n";

        return codeGenerating;
    }
}
