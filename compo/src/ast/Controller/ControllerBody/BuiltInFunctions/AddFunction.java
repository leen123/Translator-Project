package ast.Controller.ControllerBody.BuiltInFunctions;


import ast.Controller.Variable;
import symbol_table.Row;
import symbol_table.SymbolTable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AddFunction {
    private Variable variable;
    private int IncrementingValue;


    public Variable getVariable() {
        return variable;
    }

    public void setVariable(Variable variable) {
        this.variable = variable;
    }

    public int getIncrementingValue() {
        return IncrementingValue;
    }

    public void setIncrementingValue(int incrementingValue) {
        IncrementingValue = incrementingValue;
    }
    public void debug(List key, String scope){
        Row row= SymbolTable.findRow(key);
        List tempPath=new ArrayList();
        tempPath.addAll(key);
        String nameLoop="add";
        int i=1;
        while (true){
            if(!row.table.containsKey(nameLoop+i)) break;
            i++;
        }
        nameLoop+=i;
        tempPath.add(nameLoop);
        row.table.put(nameLoop,
                new Row("function",scope, tempPath));
        List tempPath1=new ArrayList();
        tempPath1.addAll(tempPath);
        tempPath1.addAll(Collections.singleton(IncrementingValue));
        row.table.get(nameLoop).table.put(String.valueOf(IncrementingValue),
                new Row("integer","value",nameLoop, tempPath1));
        if(variable!=null){
            variable.debug(tempPath,"add");
        }
    }
    public String generating(String space,List<String> key){
        String codeGenerating="";
        codeGenerating+=space+variable.generating(key)+" = "+variable.generating(key)+" + "+Collections.singleton(IncrementingValue).toArray()[0]+";\n";

        return codeGenerating;
    }
}
