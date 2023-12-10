package ast.Controller;

import ast.Controller.ControllerBody.ControllerBody;
import ast.Page.Body;
import symbol_table.SymbolTable;

import java.util.LinkedList;
import java.util.List;

public class Controller {

    List<ControllerBody> bodies;
    public Controller (){
        this.bodies = new LinkedList<>();
    }
    public void addBody(ControllerBody controllerBody){
        this.bodies.add(controllerBody);
    }
    public List<ControllerBody> getBodies(){
        return this.bodies;
    }
    public void debug(List key){
        for (ControllerBody body:bodies) {
            body.debug(key,"controller");
            if(SymbolTable.stop) return;
        }
    }
    public String generating(List key){
        String codeGenerating="<?php\n";
        for (ControllerBody controllerBody:bodies) {
            codeGenerating+=controllerBody.generating("",key);
        }
        codeGenerating+="\n?>";
        return codeGenerating;
    }
}
