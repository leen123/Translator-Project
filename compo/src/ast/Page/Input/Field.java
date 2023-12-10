package ast.Page.Input;

import ast.Page.Body;
import ast.Page.Input.FieldType.InputText;
import ast.Page.Location;
import color.Colors;
import error_handling.ErrorHandling;
import symbol_table.Row;
import symbol_table.SymbolTable;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Field  {
    String inputText;
    private InputFieldType fieldType;

    public InputFieldType getFieldType() {
        return fieldType;
    }

    public void setFieldType(InputFieldType fieldType) {
        this.fieldType = fieldType;
    }

    public String getInputText() {
        return inputText;
    }

    public void setInputText(String inputText) {
        this.inputText = inputText;
    }
    public void debug(List key, String scope){
        List path= new ArrayList();
        path.addAll(key);
        path.add(inputText);
        Row row=SymbolTable.findRow(key);
       if(SymbolTable.checkFound(inputText,"","global").size()<=0){
           if(SymbolTable.checkFound(row.table,inputText,"","").size()<=0){
               row.table.put(inputText,
                       new Row("field",fieldType.getType(),"page", path));

           }else {
               ErrorHandling.error.add(Colors.TEXT_B+Colors.TEXT_RED+"[a name '"+inputText+"' is found in this scope'"+scope+"']:"+Colors.TEXT_RESET+Colors.TEXT_RED+" can't define the inputText by that name"
                       + Colors.TEXT_YELLOW+ ", path: '"+SymbolTable.formatPath(path)+"'"+Colors.TEXT_RESET);
               SymbolTable.stop=true;
           }
       }else {
           ErrorHandling.error.add(Colors.TEXT_B+Colors.TEXT_RED+"[a name '"+inputText+"' is found in the scope'"+scope+"']:"+Colors.TEXT_RESET+Colors.TEXT_RED+" can't define the inputText by that name"
                   + Colors.TEXT_YELLOW+ ", path: '"+SymbolTable.formatPath(path)+"'"+Colors.TEXT_RESET);
           SymbolTable.stop=true;
       }
       if(fieldType!=null){
           fieldType.debug(path,"field");
       }
    }
    public String generating(String space, boolean required, Location location){
        String codeGenerating=space;
        codeGenerating+="<input ";
        if(location!=null){
            if(location.getLocation().contains("left"))
                codeGenerating+=" style=\"align-self:start;\" ";
            else if(location.getLocation().contains("right"));
            codeGenerating+=" style=\"align-self:end;\" ";
        }
        codeGenerating+="type=\""+fieldType.generating()+"\" ";
        if(required) codeGenerating+=" required ";
        codeGenerating+="name=\""+inputText+"\" ";
       // codeGenerating+="id=\""+inputText+"\" ";
        codeGenerating+="placeholder=\""+inputText+"\" ";
        codeGenerating+="/>\n";
        return codeGenerating;
    }

}
