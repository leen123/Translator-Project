package ast.Controller;

import ast.Controller.Controller;
import ast.Node;
import ast.Page.Body;
import color.Colors;
import error_handling.ErrorHandling;
import org.antlr.v4.runtime.ParserRuleContext;
import symbol_table.Row;
import symbol_table.SymbolTable;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DefinedController extends Node {
    private String controllerId,pageId;
    private Controller controller;

    public DefinedController(ParserRuleContext parserRuleContext) {
        super(parserRuleContext);
    }

    public Controller getController() {
        return controller;
    }

    public void setController(Controller controller) {
        this.controller = controller;
    }

    public String getControllerId() {
        return controllerId;
    }

    public void setControllerId(String controllerId) {
        this.controllerId = controllerId;
    }

    public String getPageId() {
        return pageId;
    }

    public void setPageId(String pageId) {
        this.pageId = pageId;
    }
    public void debug(){

        //pageId found

        if(SymbolTable.checkFound(pageId,"pageId","").size()>0){
            //pageId repet
            if(SymbolTable.checkFound(pageId,"controllerPageId","").size()>0){
                ErrorHandling.error.add(Colors.TEXT_B+Colors.TEXT_RED+"[a name '"+pageId+"' is found]:"+Colors.TEXT_RESET+Colors.TEXT_RED+" can't define the controllerPageId by that name"+
                        Colors.TEXT_YELLOW+", path: '"+SymbolTable.formatPath(Arrays.asList(new String[]{controllerId,pageId}))+"'"+Colors.TEXT_RESET);
                SymbolTable.stop=true;
            }else {
                SymbolTable.table.get(controllerId).table.put(pageId,
                        new Row("controllerPageId","controller", Arrays.asList(new String[]{controllerId,pageId})));
            }
        }else {
            ErrorHandling.error.add(Colors.TEXT_B+Colors.TEXT_RED+"[a name '"+pageId+"' is not found]:"+Colors.TEXT_RESET+Colors.TEXT_RED+" can't define the controllerPageId by that name"
                    + Colors.TEXT_YELLOW+ ", path: '"+SymbolTable.formatPath(Arrays.asList(new String[]{controllerId,pageId}))+"'"+Colors.TEXT_RESET);
            SymbolTable.stop=true;
        }
        if (SymbolTable.stop) return;
        controller.debug(Arrays.asList(new String[]{controllerId}));
    }
    public String generating(){
        List<String> tempPath = new ArrayList();
        tempPath.add(controllerId);
        return controller.generating(tempPath);
    }
}

