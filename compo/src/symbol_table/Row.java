package symbol_table;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Row {
   public String dataType;
    public String type;
    public String scope;
    //public String value;
    public HashMap<String,Row> table = new HashMap<>();
    public int numLine;
    public List<String> path= new ArrayList<>();
    public Row(){};
    public Row(String dataType,String scope, List<String> path){
        this.dataType=dataType;
        this.scope=scope;
        this.path=path;
    }
    public Row(String dataType,String type,String scope, List<String> path){
        this.dataType=dataType;
        this.scope=scope;
        this.path=path;
        this.type=type;
    }
}
