package ast.Controller.ControllerBody;

import symbol_table.Row;
import symbol_table.SymbolTable;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ElseStatement {

    private List<ControllerBody> bodies;
    public ElseStatement (){
        this.bodies = new LinkedList<>();
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
        //find name if
        String nameLoop="else";
        int i=1;
        while (true){
            if(!row.table.containsKey(nameLoop+i)) break;
            i++;
        }
        nameLoop+=i;
        tempPath.add(nameLoop);
        row.table.put(nameLoop,
                new Row("else",scope, tempPath));
        for (ControllerBody body:bodies) {
            body.debug(tempPath,"else");
            if(SymbolTable.stop) return;
        }

    }
    public String generating(String space,List key){
        String codeGenerating="";
        //Row row= SymbolTable.findRow(key);
        List tempPath=new ArrayList();
        tempPath.addAll(key);
        tempPath.add("else");
        codeGenerating+=space+"else {\n";
        for (ControllerBody body:bodies) {
            codeGenerating+=body.generating(space+"\t",tempPath);
        }
        codeGenerating+=space+"}\n";
        return codeGenerating;
    }
}
