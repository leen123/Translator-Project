package ast.Controller.ControllerBody;

import java.util.LinkedList;
import java.util.List;

public class ExpressionVar {
    private String varName;
    private List<ArrayDimension> arrayDimensionList;
    public ExpressionVar() {
        this.arrayDimensionList = new LinkedList<>();
    }
    public void addDimension(ArrayDimension arrayDimension){
        this.arrayDimensionList.add(arrayDimension);
    }

    public String getVarName() {
        return varName;
    }

    public void setVarName(String varName) {
        this.varName = varName;
    }
}
