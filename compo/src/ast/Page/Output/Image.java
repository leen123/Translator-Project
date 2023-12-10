package ast.Page.Output;

import ast.Page.Input.FieldType.InputText;
import ast.Page.Location;
import color.Colors;
import error_handling.ErrorHandling;
import symbol_table.Row;
import symbol_table.SymbolTable;

import java.util.ArrayList;
import java.util.List;

public class Image {
    private String path;

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }
    public void debug(List key, String scope){
        List tempPath= new ArrayList();
        tempPath.addAll(key);
        tempPath.add(path);
        Row row=SymbolTable.findRow(key);
        row.table.put(path,
                new Row("image","value","page", tempPath));
    }
    public String generating(String space, Location location){
        String codeGenerating=space;
        codeGenerating+="<img ";
        if(location!=null){
            if(location.getLocation().contains("left"))
                codeGenerating+=" style=\"align-self:start;\" ";
            else if(location.getLocation().contains("right"));
            codeGenerating+=" style=\"align-self:end;\" ";
        }
        codeGenerating+="src=\""+path+"\" alt=\"image\"/>\n";
        return codeGenerating;
    }
}
