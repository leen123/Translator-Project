package ast.Controller.ControllerBody;

import symbol_table.Row;
import symbol_table.SymbolTable;

import java.util.List;

public class ControllerBody {
    ForLoop forLoop;
    IfStatement ifStatement;
    BuiltInFunction function;
    Goto aGoto;
    DefinedArray definedArray;

    public DefinedArray getDefinedArray() {
        return definedArray;
    }

    public void setDefinedArray(DefinedArray definedArray) {
        this.definedArray = definedArray;
    }

    public BuiltInFunction getFunction() {
        return function;
    }

    public void setFunction(BuiltInFunction function) {
        this.function = function;
    }

    public ForLoop getForLoop() {
        return forLoop;
    }

    public void setForLoop(ForLoop forLoop) {
        this.forLoop = forLoop;
    }

    public IfStatement getIfStatement() {
        return ifStatement;
    }

    public void setIfStatement(IfStatement ifStatement) {
        this.ifStatement = ifStatement;
    }

    public Goto getaGoto() {
        return aGoto;
    }

    public void setaGoto(Goto aGoto) {
        this.aGoto = aGoto;
    }
    public void debug(List key, String scope){
        if(definedArray!=null){
           definedArray.debug(key,scope);
        }else if(ifStatement!=null){
            ifStatement.debug(key, scope);
        }else if(function!=null){
            function.debug(key, scope);
        }else if(forLoop!=null){
            forLoop.debug(key,scope);
        }else if (aGoto!=null){
            aGoto.debug(key,scope);
        }
    }
    public String generating(String space,List<String> key){
        if(definedArray!=null){
           return definedArray.generating(space,key);
        }else if(ifStatement!=null){
            return ifStatement.generating(space,key);
        }else if(function!=null){
            return function.generating(space,key);
        }else if(forLoop!=null){
            return forLoop.generating(space,key);
        }else if (aGoto!=null){
            return aGoto.generating(space);
        }
        return "";
    }
}
