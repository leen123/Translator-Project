package ast.Page;

import ast.Controller.DefinedController;
import color.Colors;
import error_handling.ErrorHandling;
import symbol_table.Row;
import symbol_table.SymbolTable;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

public class DefinedPage {
    private String pageAttribute;
    private String pageId;
    private String extendedPageId;
    private List<Body> bodies;
    private Location SubmitLocation;

    public Location getSubmitLocation() {
        return SubmitLocation;
    }

    public void setSubmitLocation(Location submitLocation) {
        SubmitLocation = submitLocation;
    }

    public DefinedPage(){
        this.bodies = new LinkedList<>();
    }
    public String getPageAttribute() {
        return pageAttribute;
    }

    public void setPageAttribute(String pageAttribute) {
        this.pageAttribute = pageAttribute;
    }

    public String getPageId() {
        return pageId;
    }

    public void setPageId(String pageId) {
        this.pageId = pageId;
    }

    public void addBody(Body body){
        this.bodies.add(body);
    }

    public String getExtendedPageId() {
        return extendedPageId;
    }

    public void setExtendedPageId(String extendedPageId) {
        this.extendedPageId = extendedPageId;
    }

    public List<Body> getBodies() {
        return bodies;
    }

    public void setBodies(List<Body> bodies) {
        this.bodies = bodies;
    }
    public void debug(){
        //extendedPageId found

        if(extendedPageId!=null){
            if(SymbolTable.checkFound(extendedPageId,"pageId","").size()>0){
                if(!extendedPageId.equals(pageId)){
                    SymbolTable.table.get(pageId).table.put(pageId,
                            new Row("extendedPageId","page", Arrays.asList(new String[]{pageId,extendedPageId})));
                }else{
                    ErrorHandling.error.add(Colors.TEXT_B+Colors.TEXT_RED+"[a name '"+extendedPageId+"' is same name pageId '"+pageId+"']:"+Colors.TEXT_RESET+Colors.TEXT_RED+" can't define the extendedPageId by that name"
                            + Colors.TEXT_YELLOW+ ", path: '"+SymbolTable.formatPath(Arrays.asList(new String[]{pageId,extendedPageId}))+"'"+Colors.TEXT_RESET);
                    SymbolTable.stop=true;
                }
            }else {
                ErrorHandling.error.add(Colors.TEXT_B+Colors.TEXT_RED+"[a name '"+extendedPageId+"' is not found]:"+Colors.TEXT_RESET+Colors.TEXT_RED+" can't define the extendedPageId by that name"
                        + Colors.TEXT_YELLOW+ ", path: '"+SymbolTable.formatPath(Arrays.asList(new String[]{pageId,extendedPageId}))+"'"+Colors.TEXT_RESET);
                SymbolTable.stop=true;
            }
        }

        if (SymbolTable.stop) return;
        for (Body body:bodies) {
            body.debug(Arrays.asList(new String[]{pageId}),"page");
            if (SymbolTable.stop) return;
        }
        //controller.debug(Arrays.asList(new String[]{controllerId}));

    }
    public String generating(){
        String codeGenerating="";
        String  codeGeneratingInput="";
        String   codeGeneratingOutput="";
        codeGenerating+="<html>\n" +
                          "\t<body>\n\n";
        for (Body body:bodies) {
            if(body.getInput()!=null){
                codeGeneratingInput+=body.generating("\t\t\t");
            }
            else {
                codeGeneratingOutput+=body.generating("\t\t");
            }

        }
        if(!codeGeneratingInput.equals("")){
            String controllerId=SymbolTable.findControllerToPage(pageId);
            if(!controllerId.equals("")){
                codeGenerating+="\t\t<form style=\"width:100%; display:flex;\n" +
                        "        \t  align-items:center; justify-content:center;\n" +
                        "        flex-direction:column;\" action=\""+controllerId+".php\" method=\"post\">\n";
            }
            else {
                codeGenerating+="\t\t<form style=\"width:100%; display:flex;\n" +
                        "        \t  align-items:center; justify-content:center;\n" +
                        "        flex-direction:column;\">\n";
            }
              codeGenerating+=codeGeneratingInput;
            codeGenerating+="\t\t<button type=“submit” >submit your form</button>\n";
            codeGenerating+="\t\t<form>\n";
        }
            codeGenerating+=codeGeneratingOutput;


        codeGenerating+="\n\t</body>\n" +
                          "</html>\n";
        return codeGenerating;
    }
   /* public String generating(){
        String codeGenerating="";

        return codeGenerating;
    }*/
}
