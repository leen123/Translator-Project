package ast.Controller.ControllerBody;

import color.Colors;
import error_handling.ErrorHandling;
import symbol_table.Row;
import symbol_table.SymbolTable;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Goto {
    private String targetPage;
    private List<String> gotoVars;
    public Goto(){
        this.gotoVars = new LinkedList<>();
    }
    public void addGotoVar(String var){
        this.gotoVars.add(var);
    }
    public String getTargetPage() {
        return targetPage;
    }

    public void setTargetPage(String targetPage) {
        this.targetPage = targetPage;
    }
    public void debug(List key, String scope){
        Row row= SymbolTable.findRow(key);
        List tempPath=new ArrayList();
        tempPath.addAll(key);
        //  tempPath.add(arrayName);

            tempPath.add(targetPage);
            if(SymbolTable.checkFound(targetPage,"pageId","global").size()>0){
                row.table.put(targetPage,
                        new Row("gotoPageId",scope, tempPath));
            }else {
                ErrorHandling.error.add(Colors.TEXT_B+Colors.TEXT_RED+"[a name '"+targetPage+"' is not found]:"+Colors.TEXT_RESET+Colors.TEXT_RED+" can't define the Page by that name"+
                        Colors.TEXT_YELLOW+", path: '"+SymbolTable.formatPath(tempPath)+"'"+Colors.TEXT_RESET);
                SymbolTable.stop=true;
            }
        for (String gotoVar:gotoVars) {
            row= SymbolTable.findRow(tempPath);
            List tempPath1=new ArrayList();
            tempPath1.addAll(tempPath);
            tempPath1.add(gotoVar);
            String controllerPageId="";
            for (int i=0;i<SymbolTable.table.get(key.get(0)).table.keySet().size();i++) {
                Row row1=(Row) SymbolTable.table.get(key.get(0)).table.values().toArray()[i];
                if(row1.dataType.equals("controllerPageId")){
                    controllerPageId= (String) SymbolTable.table.get(key.get(0)).table.keySet().toArray()[i];
                }
            }
            if(SymbolTable.checkFound(gotoVar,"","page", Arrays.asList(new String[]{controllerPageId})).size()>0){
                row.table.put(gotoVar,
                        new Row("var","goto", tempPath1));
            }else {
                String extendPageId= (String) SymbolTable.table.get(controllerPageId).table.keySet().toArray()[0];
                if(SymbolTable.checkFound(gotoVar,"","page", Arrays.asList(new String[]{extendPageId})).size()>0){
                    row.table.put(gotoVar,
                            new Row("var","goto", tempPath1));
                }else if(SymbolTable.checkFound(gotoVar,"","controller", Arrays.asList(new String[]{(String) key.get(0)})).size()>0){
                    row.table.put(gotoVar,
                            new Row("var",scope, tempPath1));
                }else{
                    ErrorHandling.error.add(Colors.TEXT_B+Colors.TEXT_RED+"[a name '"+gotoVar+"' is not found ]:"+Colors.TEXT_RESET+Colors.TEXT_RED+" can't define the gotoVar by that name"+
                            Colors.TEXT_YELLOW+", path: '"+SymbolTable.formatPath(tempPath1)+"'"+Colors.TEXT_RESET);
                    SymbolTable.stop=true;
                }
            }
        }

    }
    public String generating(String space){

        String codeGenerating="";
        for (String gotoVar:gotoVars) {
            codeGenerating+=space+"\t"+"$_SESSION[\""+gotoVar+"\"] = $"+gotoVar+";\n";
        }
        codeGenerating+=space+"header('Location: "+targetPage+".html');\n";

        return codeGenerating;
    }
}
