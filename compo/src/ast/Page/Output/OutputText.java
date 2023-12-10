package ast.Page.Output;

import ast.Page.Location;
import symbol_table.Row;
import symbol_table.SymbolTable;

import java.util.ArrayList;
import java.util.List;

public class OutputText {
    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    private String text;
    public void debug(List key, String scope){
        List tempPath= new ArrayList();
        tempPath.addAll(key);
        tempPath.add(text);
        Row row= SymbolTable.findRow(key);
        row.table.put(text,
                new Row("text","var","page", tempPath));
    }
    public String generating(String space, Location location){
        String codeGenerating=space;
        codeGenerating+="<h1 ";
        if(location!=null){
            if(location.getLocation().contains("left"))
                codeGenerating+=" style=\"align-self:start;\" ";
            else if(location.getLocation().contains("right"));
            codeGenerating+=" style=\"align-self:end;\" ";
        }
                codeGenerating+=">"+text+"</h1>\n";
        return codeGenerating;
    }
}
