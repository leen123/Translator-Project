package ast.Page.Input;

import ast.Page.Input.FieldType.String;
import ast.Page.Location;
import color.Colors;
import error_handling.ErrorHandling;
import symbol_table.Row;
import symbol_table.SymbolTable;

import java.util.ArrayList;
import java.util.List;

public class File  {
    private java.lang.String name;

    public java.lang.String getName() {
        return name;
    }

    public void setName(java.lang.String name) {
        this.name = name;
    }


    public void debug(List key, java.lang.String scope){
        List tempPath= new ArrayList();
        tempPath.addAll(key);
        tempPath.add(name);
        if(SymbolTable.checkFound(name,"","global").size()<=0){
            Row row=SymbolTable.findRow(key);
            if(SymbolTable.checkFound(row.table,name,"","").size()<=0){
                row.table.put(name.toString(),
                        new Row("file","page", tempPath));

            }else {
                ErrorHandling.error.add(Colors.TEXT_B+Colors.TEXT_RED+"[a name '"+name+"' is found in this scope'"+scope+"']:"+Colors.TEXT_RESET+Colors.TEXT_RED+" can't define the file by that name"
                        + Colors.TEXT_YELLOW+ ", path: '"+SymbolTable.formatPath(tempPath)+"'"+Colors.TEXT_RESET);
                SymbolTable.stop=true;
            }
        }else {
            ErrorHandling.error.add(Colors.TEXT_B+Colors.TEXT_RED+"[a name '"+name+"' is found in the scope'"+scope+"']:"+Colors.TEXT_RESET+Colors.TEXT_RED+" can't define the file by that name"
                    + Colors.TEXT_YELLOW+ ", path: '"+SymbolTable.formatPath(tempPath)+"'"+Colors.TEXT_RESET);
            SymbolTable.stop=true;
        }


    }
    public java.lang.String generating(java.lang.String space, boolean required, Location location){
        java.lang.String codeGenerating=space;
        codeGenerating+="<input ";
       // codeGenerating+="id=\""+name+"\" ";
        codeGenerating+="type=\""+"file"+"\" ";
        if (required)codeGenerating+=" required ";
        codeGenerating+="name=\""+name+"\" ";
        codeGenerating+="/>\n";
        return codeGenerating;
    }
}
