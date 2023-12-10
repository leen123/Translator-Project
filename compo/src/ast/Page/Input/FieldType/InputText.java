package ast.Page.Input.FieldType;

import color.Colors;
import error_handling.ErrorHandling;
import symbol_table.Row;
import symbol_table.SymbolTable;

import java.util.ArrayList;
import java.util.List;

public class InputText {
    private Integer integer;
    private String string;

    public Integer getInteger() {
        return integer;
    }

    public void setInteger(Integer integer) {
        this.integer = integer;
    }

    public String getString() {
        return string;
    }

    public void setString(String string) {
        this.string = string;
    }
    public void debug(List key, java.lang.String scope){
        List tempPath= new ArrayList();
        tempPath.addAll(key);
        Row row=SymbolTable.findRow(key);
        if(string!=null){
            tempPath.add(string.getText());
            row.table.put(string.getText(),
                    new Row("string","value",scope, tempPath));
        }else if(integer!=null){
            tempPath.add(integer.getNumber());
            row.table.put(integer.getNumber().toString(),
                    new Row("integer","value",scope, tempPath));
        }





    }
    public java.lang.String generating(){
        if(string!=null){
            return string.getText();
        }else if(integer!=null){
            return integer.getNumber().toString();
        }

        return "";
    }
}
