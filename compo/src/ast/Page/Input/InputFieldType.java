package ast.Page.Input;

import ast.Page.Body;
import color.Colors;
import error_handling.ErrorHandling;
import symbol_table.Row;
import symbol_table.SymbolTable;

import java.util.ArrayList;
import java.util.List;

public class InputFieldType {
    private String type;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
    public void debug(List key, String scope){
        List path= new ArrayList();
        path.addAll(key);
        path.add(type);
        Row row= SymbolTable.findRow(key);
        if(type!=null){
            row.table.put(type,
                    new Row("fieldType","val",scope, path));
        }else {
            row.table.put("text",
                    new Row("fieldType","val",scope, path));
        }
    }
    public String generating(){
        if(type!=null){
            return type;
        }else {
            return "text";
        }
    }
}
