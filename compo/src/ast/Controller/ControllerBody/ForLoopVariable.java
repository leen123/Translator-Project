package ast.Controller.ControllerBody;

import java.util.LinkedList;
import java.util.List;

public class ForLoopVariable {
    private String variableName;
    private List<ArrayDimension> arrayDimensionList;
    public ForLoopVariable() {
        this.arrayDimensionList = new LinkedList<>();
    }
    public void addDimension(ArrayDimension arrayDimension){
        this.arrayDimensionList.add(arrayDimension);
    }

    public String getVariableName() {
        return variableName;
    }

    public void setVariableName(String variableName) {
        this.variableName = variableName;
    }
}
