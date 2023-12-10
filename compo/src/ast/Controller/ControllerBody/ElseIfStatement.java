package ast.Controller.ControllerBody;

import symbol_table.Row;
import symbol_table.SymbolTable;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ElseIfStatement {
    private Expression expression;
    private List<ControllerBody> bodies;

    public  ElseIfStatement (){
        this.bodies = new LinkedList<>();
    }
    public void addBody(ControllerBody body) {
        this.bodies.add(body);
    }
    public List<ControllerBody> getBodies() {
        return this.bodies;
    }

    public Expression getExpression() {
        return expression;
    }

    public void setExpression(Expression expression) {
        this.expression = expression;
    }
    public void debug(List key, String scope){
        Row row= SymbolTable.findRow(key);
        List tempPath=new ArrayList();
        tempPath.addAll(key);
        //find name if
        String nameLoop="elseIf";
        int i=1;
        while (true){
            if(!row.table.containsKey(nameLoop+i)) break;
            i++;
        }
        nameLoop+=i;
        tempPath.add(nameLoop);
        row.table.put(nameLoop,
                new Row("elseIf",scope, tempPath));
        if(expression!=null){
            expression.debug(tempPath,"elseIf");
        }
        if(SymbolTable.stop) return;
        for (ControllerBody body:bodies) {
            body.debug(tempPath,"elseIf");
            if(SymbolTable.stop) return;
        }
    }
    public String generating(String space,List key){
        String codeGenerating="";
        //Row row= SymbolTable.findRow(key);
        List tempPath=new ArrayList();
        tempPath.addAll(key);
        tempPath.add("elseIf");
        codeGenerating+=space+"else if("+expression.generating(space,tempPath)+"){\n";
        for (ControllerBody body:bodies) {
            codeGenerating+=body.generating(space+"\t",tempPath);
        }
        codeGenerating+=space+"}\n";
        return codeGenerating;
    }
}
