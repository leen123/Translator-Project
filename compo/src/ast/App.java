package ast;

import ast.Controller.DefinedController;
import ast.Page.DefinedPage;
import error_handling.ErrorHandling;
import symbol_table.Row;
import symbol_table.SymbolTable;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;

public class App {
    List<DefinedController> definedControllers;
    List<DefinedPage> pages;
    public App(){
        this.definedControllers = new LinkedList<>();
        this.pages = new LinkedList<>();
    }
    public void addController(DefinedController definedController){
        this.definedControllers.add(definedController);
    }
    public void addPage(DefinedPage page){
        this.pages.add(page);
    }
    public void debug(){
        boolean error =false;
        //pages
        for (DefinedPage page:pages) {
            if(SymbolTable.checkFound(page.getPageId(),"","").size()>0){
                ErrorHandling.error.add("[a name '"+page.getPageId()+"' is already found]: can't define the page by that name");
                SymbolTable.stop=true;
            }else {
                SymbolTable.table.put(page.getPageId(),
                        new Row("pageId","global", Arrays.asList(new String[]{page.getPageId()})));
            }
        }
        //controllers
        for (DefinedController controller:definedControllers) {
            //ControllerId

            if(SymbolTable.checkFound(controller.getControllerId(),"","").size()>0){
                ErrorHandling.error.add("[a name '"+controller.getControllerId()+"' is already found]: can't define the controller by that name");
                SymbolTable.stop=true;
            }else {
                SymbolTable.table.put(controller.getControllerId(),
                        new Row("controllerId","global", Arrays.asList(new String[]{controller.getControllerId()})));
            }

        }
        if (SymbolTable.stop) return;
        //pages
        for (DefinedPage page:pages) {
            page.debug();
        }
        if (SymbolTable.stop) return;
        //controllers
        for (DefinedController controller:definedControllers) {

            controller.debug();
        }
        if (SymbolTable.stop) return;

    }
    public void generating() throws IOException {
        if(SymbolTable.stop){
            return;
        }
        HashMap<String ,String> generationPages = new HashMap<>();
        HashMap<String ,String> generationControllers = new HashMap<>();
        //pages
        for (DefinedPage page:pages) {
            generationPages.put(page.getPageId(),page.generating());
        }

        //System.out.println(generationPages.get("p1"));
        //controllers
        for (DefinedController controller:definedControllers) {
             generationControllers.put(controller.getControllerId(),controller.generating());
        }
       //System.out.println(generationControllers.get("c1"));
        //generation Pages
        for (DefinedPage page:pages) {
            Files.write(Paths.get(("generation\\pages\\"+page.getPageId()+".txt")), Collections.singleton(generationPages.get(page.getPageId())));
            Files.write(Paths.get(("generation\\pages\\"+page.getPageId()+".html")), Collections.singleton(generationPages.get(page.getPageId())));
            Files.write(Paths.get(("c:\\xampp\\htdocs\\generation\\"+page.getPageId()+".html")), Collections.singleton(generationPages.get(page.getPageId())));
        }
        for (DefinedController controller:definedControllers) {
            Files.write(Paths.get(("generation\\controllers\\"+controller.getControllerId()+".txt")), Collections.singleton(generationControllers.get(controller.getControllerId())));
            Files.write(Paths.get(("generation\\controllers\\"+controller.getControllerId()+".php")), Collections.singleton(generationControllers.get(controller.getControllerId())));
            Files.write(Paths.get(("c:\\xampp\\htdocs\\generation\\"+controller.getControllerId()+".php")), Collections.singleton(generationControllers.get(controller.getControllerId())));
        }
    }
}
