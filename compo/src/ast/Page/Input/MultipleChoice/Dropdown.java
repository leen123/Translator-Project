package ast.Page.Input.MultipleChoice;


import ast.Page.Input.Field;

import ast.Page.Input.FieldType.InputText;
import ast.Page.Location;
import color.Colors;
import error_handling.ErrorHandling;
import symbol_table.Row;
import symbol_table.SymbolTable;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Dropdown {
    private List<InputText> inputTexts;
    private String Key;

    public String getKey() {
        return Key;
    }

    public void setKey(String key) {
        Key = key;
    }


    public Dropdown(){
        this.inputTexts = new LinkedList<>();
    }
    public void addField(InputText inputText){
        this.inputTexts.add(inputText);
    }
    public void debug(List key, String scope){
        List tempPath= new ArrayList();
        tempPath.addAll(key);
        tempPath.add(Key);
        if(SymbolTable.checkFound(Key,"","global").size()<=0){
            Row row=SymbolTable.findRow(key);
            if(SymbolTable.checkFound(row.table,Key,"","").size()<=0){
                row.table.put(Key.toString(),
                        new Row("dropdown","page", tempPath));
                for (InputText inputText:inputTexts) {
                    inputText.debug(tempPath,"dropdown");
                }
            }else {
                ErrorHandling.error.add(Colors.TEXT_B+Colors.TEXT_RED+"[a name '"+Key+"' is found in this scope'"+scope+"']:"+Colors.TEXT_RESET+Colors.TEXT_RED+" can't define the dropdown by that name"
                        + Colors.TEXT_YELLOW+ ", path: '"+SymbolTable.formatPath(tempPath)+"'"+Colors.TEXT_RESET);
                SymbolTable.stop=true;
            }
        }else {
            ErrorHandling.error.add(Colors.TEXT_B+Colors.TEXT_RED+"[a name '"+Key+"' is found in the scope'"+scope+"']:"+Colors.TEXT_RESET+Colors.TEXT_RED+" can't define the dropdown by that name"
                    + Colors.TEXT_YELLOW+ ", path: '"+SymbolTable.formatPath(tempPath)+"'"+Colors.TEXT_RESET);
            SymbolTable.stop=true;
        }


    }
    public String generating(String space, boolean required, Location location){
        String codeGenerating=space;
        codeGenerating+="<select name=\""+getKey()+"\"";
        if(location!=null){
            if(location.getLocation().contains("left"))
                codeGenerating+=" style=\"align-self:start;\" ";
            else if(location.getLocation().contains("right"));
            codeGenerating+=" style=\"align-self:end;\" ";
        }
        if (required)codeGenerating+=" required ";
        codeGenerating+="id=\""+getKey()+"\">\n";
        for (InputText inputText:inputTexts) {
            codeGenerating+=space+"\t"+"<option value=\""+inputText.generating()+"\">"+inputText.generating()+"</option>\n";
        }

        codeGenerating+=space+"</select>\n";
        return codeGenerating;
    }
}
