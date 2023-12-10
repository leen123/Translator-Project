package ast.Controller.ControllerBody;

import ast.Controller.Variable;
import symbol_table.Row;
import symbol_table.SymbolTable;

import java.util.ArrayList;
import java.util.List;

public class Expression {
    private String operator;
    private LeftSideExpression leftSideExpression;
    private RightSideExpression rightSideExpression;
    private String connectOperator;
    private Expression connectedExpression;

    public String getConnectOperator() {
        return connectOperator;
    }

    public void setConnectOperator(String connectOperator) {
        this.connectOperator = connectOperator;
    }

    public Expression getConnectedExpression() {
        return connectedExpression;
    }

    public void setConnectedExpression(Expression connectedExpression) {
        this.connectedExpression = connectedExpression;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    public LeftSideExpression getLeftSideExpression() {
        return leftSideExpression;
    }

    public void setLeftSideExpression(LeftSideExpression leftSideExpression) {
        this.leftSideExpression = leftSideExpression;
    }

    public RightSideExpression getRightSideExpression() {
        return rightSideExpression;
    }

    public void setRightSideExpression(RightSideExpression rightSideExpression) {
        this.rightSideExpression = rightSideExpression;
    }
    public void debug(List key, String scope){
        Row row= SymbolTable.findRow(key);
        List tempPath=new ArrayList();
        tempPath.addAll(key);
        tempPath.add(operator);
        //find name if
        String nameLoop=operator;
        row.table.put(operator,
                new Row("operator",scope, tempPath));
        List tempPath1=new ArrayList();
        tempPath1.addAll(tempPath);
        tempPath1.add("left");
        leftSideExpression.debug(tempPath,"operator");
        List tempPath2=new ArrayList();
        tempPath2.addAll(tempPath);
        tempPath2.add("right");
        rightSideExpression.debug(tempPath,"operator");
    }
    public String generating(String space,List key){
        String codeGenerating="";
        //Row row= SymbolTable.findRow(key);
        List tempPath=new ArrayList();
        tempPath.addAll(key);
        tempPath.add(operator);
        codeGenerating+=leftSideExpression.generating(tempPath)+" "+operator+" "+rightSideExpression.generating(tempPath);
        return codeGenerating;
    }

}
