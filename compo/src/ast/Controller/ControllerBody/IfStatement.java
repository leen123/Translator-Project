package ast.Controller.ControllerBody;

import color.Colors;
import error_handling.ErrorHandling;
import symbol_table.Row;
import symbol_table.SymbolTable;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class IfStatement {
    private Expression expression;
    private List<ControllerBody> bodies;
    private List<ElseIfStatement> elseIfStatements;
    private ElseStatement elseStatement;

    public ElseStatement getElseStatement() {
        return elseStatement;
    }

    public void setElseStatement(ElseStatement elseStatement) {
        this.elseStatement = elseStatement;
    }

    public IfStatement(){
        this.bodies = new LinkedList<>();
        this.elseIfStatements = new LinkedList<>();
    }
    public Expression getExpression() {
        return expression;
    }


    public void setExpression(Expression expression) {
        this.expression = expression;
    }

    public void addBody(ControllerBody body) {
        this.bodies.add(body);
    }
    public void addElseIf(ElseIfStatement elseIfStatement) {
        this.elseIfStatements.add(elseIfStatement);
    }

    public List<ControllerBody> getBodies() {
        return this.bodies;
    }
    public List<ElseIfStatement> getElseIfStatements() {
        return this.elseIfStatements;
    }
    public void debug(List key, String scope){
        Row row= SymbolTable.findRow(key);
        List tempPath=new ArrayList();
        tempPath.addAll(key);
        //find name if
        String nameLoop="if";
        int i=1;
        while (true){
            if(!row.table.containsKey(nameLoop+i)) break;
            i++;
        }
        nameLoop+=i;
        tempPath.add(nameLoop);
        row.table.put(nameLoop,
                new Row("if",scope, tempPath));
        if(expression!=null){
            expression.debug(tempPath,"if");
        }
        if(SymbolTable.stop) return;
        for (ControllerBody body:bodies) {
            body.debug(tempPath,"if");
            if(SymbolTable.stop) return;
        }
        for (ElseIfStatement elseIf:elseIfStatements) {
            elseIf.debug(tempPath,scope);
            if(SymbolTable.stop) return;
        }
        if(elseStatement!=null){
            elseStatement.debug(tempPath,scope);
        }
        if(SymbolTable.stop) return;
    }
    public String generating(String space,List key){
        String codeGenerating="";
        //Row row= SymbolTable.findRow(key);
        List tempPath=new ArrayList();
        tempPath.addAll(key);
        tempPath.add("if");
        codeGenerating+=space+"if("+expression.generating(space,key)+"){\n";
        for (ControllerBody body:bodies) {
            codeGenerating+=body.generating(space+"\t",tempPath);
        }
        codeGenerating+=space+"}\n";
        for (ElseIfStatement elseIfStatement:elseIfStatements) {
            codeGenerating+=elseIfStatement.generating(space,tempPath);
        }
        if(elseStatement!=null)
        codeGenerating+=elseStatement.generating(space,tempPath);

        return codeGenerating;
    }
}
