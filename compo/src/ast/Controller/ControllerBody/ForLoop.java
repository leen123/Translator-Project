package ast.Controller.ControllerBody;

import color.Colors;
import error_handling.ErrorHandling;
import symbol_table.Row;
import symbol_table.SymbolTable;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class ForLoop {
    private String startVariable;
    private ForLoopVarOrNumber rangeStart;
    private ForLoopVarOrNumber rangeEnd;
    private List<ControllerBody> bodies;

    public ForLoop (){
        this.bodies = new LinkedList<>();
    }
    public String getStartVariable() {
        return startVariable;
    }

    public void setStartVariable(String startVariable) {
        this.startVariable = startVariable;
    }

    public ForLoopVarOrNumber getRangeStart() {
        return rangeStart;
    }

    public void setRangeStart(ForLoopVarOrNumber rangeStart) {
        this.rangeStart = rangeStart;
    }

    public ForLoopVarOrNumber getRangeEnd() {
        return rangeEnd;
    }

    public void setRangeEnd(ForLoopVarOrNumber rangeEnd) {
        this.rangeEnd = rangeEnd;
    }

    public void addBody(ControllerBody body) {
        this.bodies.add(body);
    }

    public List<ControllerBody> getBodies() {
        return this.bodies;
    }
    public void debug(List key, String scope){
        Row row= SymbolTable.findRow(key);
        List tempPath=new ArrayList();
        tempPath.addAll(key);
        //find name loop
        String nameLoop="for";
        int i=1;
        while (true){
            if(!row.table.containsKey(nameLoop+i)) break;
            i++;
        }
        nameLoop+=i;
        tempPath.add(nameLoop);
        row.table.put(nameLoop,
                new Row("forLoop",scope, tempPath));
        List tempPath1=new ArrayList();
        tempPath1.addAll(tempPath);
        tempPath1.add(startVariable);
        row.table.get(nameLoop).table.put(startVariable,
                new Row("forLoop",scope, tempPath1));
        rangeStart.debug(tempPath,"startForLoop");
        rangeEnd.debug(tempPath,"endForLoop");
        Row row1 = (Row) row.table.get(nameLoop).table.values().toArray()[0];
        Row row2 = (Row) row.table.get(nameLoop).table.values().toArray()[1];
        if(row1.dataType.equals("integer")&&row2.dataType.equals("integer")){
            if(rangeEnd.getNumber()<=rangeStart.getNumber()){
                ErrorHandling.errorLogic.add(Colors.TEXT_B+Colors.TEXT_RED+"[in forLoop '"+nameLoop+"' is not correct!]:"+Colors.TEXT_RESET+Colors.TEXT_RED+
                        " start range '"+rangeStart.getNumber()+"'is bigger than end range '"+rangeEnd.getNumber()+"'"
                        + Colors.TEXT_YELLOW+ ", path: '"+SymbolTable.formatPath(tempPath)+"'"+Colors.TEXT_RESET);
                SymbolTable.stop=true;
            }
        }
        if (SymbolTable.stop) return;
        for (ControllerBody body:bodies) {
           body.debug(tempPath,"forLoop");
            if(SymbolTable.stop) return;
        }
    }
    public String generating(String space,List<String> key){
        String codeGenerating="";
        List tempPath=new ArrayList();
        tempPath.addAll(key);
        codeGenerating+=space+"for($"+startVariable+" = "+rangeStart.generating(key)+
                " ;$"+startVariable+" <= "+rangeEnd.generating(key)+" ;$"+startVariable+"++){\n";
        for (ControllerBody body:bodies) {
            codeGenerating+=body.generating(space+"\t",tempPath);
        }
        codeGenerating+=space+"}\n";
        return codeGenerating;
    }

}
