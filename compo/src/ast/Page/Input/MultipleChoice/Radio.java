package ast.Page.Input.MultipleChoice;


import ast.Page.Input.Field;
import ast.Page.Input.FieldType.InputText;
import ast.Page.Input.Input;
import ast.Page.Location;
import color.Colors;
import error_handling.ErrorHandling;
import symbol_table.Row;
import symbol_table.SymbolTable;

import java.util.ArrayList;
import java.util.List;

public class Radio extends MultipleChoice {
    InputText firstInputText;
    InputText secondInputText;
    private String Key;

    public String getKey() {
        return Key;
    }

    public void setKey(String key) {
        Key = key;
    }

    public InputText getFirstFieldType() {
        return this.secondInputText;
    }

    public void setFirstInputText(InputText firstInputText) {
        this.firstInputText = firstInputText;
    }

    public InputText getSecondFieldType() {
        return this.secondInputText;
    }

    public void setSecondInputText(InputText secondInputText) {
        this.secondInputText = secondInputText;
    }

    public void debug(List key, String scope){
        List tempPath= new ArrayList();
        tempPath.addAll(key);
        tempPath.add(Key);
        if(SymbolTable.checkFound(Key,"","global").size()<=0){
            Row row=SymbolTable.findRow(key);
            if(SymbolTable.checkFound(row.table,Key,"","").size()<=0){
                row.table.put(Key.toString(),
                        new Row("radio","page", tempPath));
                firstInputText.debug(tempPath,"radio");
                secondInputText.debug(tempPath,"radio");

            }else {
                ErrorHandling.error.add(Colors.TEXT_B+Colors.TEXT_RED+"[a name '"+Key+"' is found in this scope'"+scope+"']:"+Colors.TEXT_RESET+Colors.TEXT_RED+" can't define the radio by that name"
                        + Colors.TEXT_YELLOW+ ", path: '"+SymbolTable.formatPath(tempPath)+"'"+Colors.TEXT_RESET);
                SymbolTable.stop=true;
            }
        }else {
            ErrorHandling.error.add(Colors.TEXT_B+Colors.TEXT_RED+"[a name '"+Key+"' is found in the scope'"+scope+"']:"+Colors.TEXT_RESET+Colors.TEXT_RED+" can't define the radio by that name"
                    + Colors.TEXT_YELLOW+ ", path: '"+SymbolTable.formatPath(tempPath)+"'"+Colors.TEXT_RESET);
            SymbolTable.stop=true;
        }
    }
    public String generating(String space, boolean required, Location location){
        String codeGenerating=space;
        codeGenerating+="<p>"+getKey()+"</p>\n";
        if(firstInputText!=null){
            codeGenerating+=space+"\t"+"<input ";
            if(location!=null){
                if(location.getLocation().contains("left"))
                    codeGenerating+=" style=\"align-self:start;\" ";
                else if(location.getLocation().contains("right"));
                codeGenerating+=" style=\"align-self:end;\" ";
            }
            if (required)codeGenerating+=" required ";
            codeGenerating+="type=\"radio\"" +
                    "id=\""+firstInputText.generating()+
                    "\" name=\""+getKey()+"\" value=\""+firstInputText.generating()+"\">\n";
            codeGenerating+=space+"\t\t"+"<label for=\""+firstInputText.generating()+
                                "\">"+firstInputText.generating()+"</label>\n";
        }
        if(secondInputText!=null){
            codeGenerating+=space+"\t"+"<input ";
            if(location!=null){
                codeGenerating+=" style=\"align-self:start;\" ";
                if(location.getLocation().contains("left"))
                    codeGenerating+=" style=\"align-self:start;\" ";
                else if(location.getLocation().contains("right"));
                codeGenerating+=" style=\"align-self:end;\" ";
            }
            codeGenerating+="type=\"radio\"";
            codeGenerating+="id=\""+secondInputText.generating()+
                    "\" name=\""+getKey()+"\" value=\""+
                    secondInputText.generating()+"\">\n";
            codeGenerating+=space+"\t\t"+"<label for=\""+secondInputText.generating()+
                    "\">"+secondInputText.generating()+"</label>\n";
        }
        return codeGenerating;
    }
}
