package ast.Controller.ControllerBody;

import color.Colors;
import error_handling.ErrorHandling;
import symbol_table.Row;
import symbol_table.SymbolTable;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class DefinedArray {
    private String arrayName;
    private List<ArrayValue> arrayValueList;
    public DefinedArray(){
        this.arrayValueList = new LinkedList<>();
    }
    public void addArrayValue(ArrayValue arrayValue) {
        this.arrayValueList.add(arrayValue);
    }

    public String getArrayName() {
        return arrayName;
    }

    public void setArrayName(String arrayName) {
        this.arrayName = arrayName;
    }
    public void debug(List key, String scope){
        Row row= SymbolTable.findRow(key);
        List tempPath=new ArrayList();
        tempPath.addAll(key);
        tempPath.add(arrayName);
        if(SymbolTable.checkFound(arrayName,"","global").size()<=0){
            //pageId repet
            if(SymbolTable.checkFound(arrayName,"",scope).size()>0){
                ErrorHandling.error.add(Colors.TEXT_B+Colors.TEXT_RED+"[a name '"+arrayName+"' is found]:"+Colors.TEXT_RESET+Colors.TEXT_RED+" can't define the arrayName by that name"+
                        Colors.TEXT_YELLOW+", path: '"+SymbolTable.formatPath(tempPath)+"'"+Colors.TEXT_RESET);
                SymbolTable.stop=true;
            }else {
                row.table.put(arrayName,
                        new Row("arrayName",scope, tempPath));
                for (ArrayValue element:arrayValueList) {
                    element.debug(tempPath,"array");
                    if(SymbolTable.stop) return;
                }
            }
        }else {
            ErrorHandling.error.add(Colors.TEXT_B+Colors.TEXT_RED+"[a name '"+arrayName+"' is found]:"+Colors.TEXT_RESET+Colors.TEXT_RED+" can't define the arrayName by that name"+
                    Colors.TEXT_YELLOW+", path: '"+SymbolTable.formatPath(tempPath)+"'"+Colors.TEXT_RESET);
            SymbolTable.stop=true;
        }
    }
    public String generating(String space,List key){
        String codeGenerating="";
        String codeGenerating1="";
        List<String> tempPath = new ArrayList();
        tempPath.addAll(key);
        tempPath.add(arrayName);
        Row row= SymbolTable.findRow(tempPath);

        codeGenerating+=space+"$"+arrayName+" = [";
        boolean smc=false;
        for (String element:row.table.keySet()) {
            if (smc) codeGenerating1+=",";
            if(row.table.get(element).type==null){
                codeGenerating1+="$"+element;
            }else if(row.table.get(element).dataType.equals("integer")){
                codeGenerating1+=element;
            }else if(row.table.get(element).dataType.equals("string")){
                codeGenerating1+="\""+element+"\"";
            }
            smc=true;
           // codeGenerating+= space+element;
        }
        smc=false;
        for (ArrayValue element:arrayValueList) {
            if (smc) codeGenerating+=",";
            codeGenerating+=element.generating( space, key);
            smc=true;
        }
        codeGenerating+="];\n";
        return codeGenerating;
    }
}
