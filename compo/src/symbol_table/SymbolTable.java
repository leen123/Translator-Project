package symbol_table;

import color.Colors;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class SymbolTable {
    public static boolean stop=false;
    public static HashMap<String, Row> table = new HashMap<>();
    public static List<String> checkFound(String name, String dataType, String scope) {
        return checkFound(table,name,dataType,scope);
    }
    public static List<String> checkFound(String name, String dataType, String scope,List paths) {
        return checkFound(table,name,dataType,scope,paths);
    }
    public static List<String> checkFound(HashMap<String, Row> tableMap,String name, String dataType, String scope) {
        List<String> path = new ArrayList<>();
        Row row;
        if(tableMap.containsKey(name)
            &&(dataType==""||dataType.equals(tableMap.get(name).dataType))
                &&(scope==""||scope.equals(tableMap.get(name).scope))
                    &&(tableMap.get(name).type==null||!tableMap.get(name).type.equals("value"))){
                row=tableMap.get(name);
             /*   if(dataType!="")
                    System.out.println(tableMap+" "+row.path+" "+name+" "+row.table+" "+row.dataType+" "+dataType);*/
                    path = tableMap.get(name).path;
        }else {
            for (int i=0;i<tableMap.values().toArray().length;i++){
                row= (Row) tableMap.values().toArray()[i];
                if(!row.table.isEmpty()){

                    path=checkFound(row.table,name,dataType,scope);
                }if (path.size()>0){
                    break;
                }
            }
        }
        return path;
    }
    public static List<String> checkFound(HashMap<String, Row> tableMap,String name, String dataType, String scope,List paths) {
        List<String> path = new ArrayList<>();
        Row row;
        if(tableMap.containsKey(name)
                &&(dataType==""||dataType.equals(tableMap.get(name).dataType))
                &&(scope==""||scope.equals(tableMap.get(name).scope))
                &&(tableMap.get(name).type==null||!tableMap.get(name).type.equals("value"))
                &&(checkPaths(paths,tableMap.get(name).path))){
            row=tableMap.get(name);
             /*   if(dataType!="")
                    System.out.println(tableMap+" "+row.path+" "+name+" "+row.table+" "+row.dataType+" "+dataType);*/
            path = tableMap.get(name).path;
        }else {
            for (int i=0;i<tableMap.values().toArray().length;i++){
                row= (Row) tableMap.values().toArray()[i];
                if(!row.table.isEmpty()){

                    path=checkFound(row.table,name,dataType,scope,paths);
                }if (path.size()>0){
                    break;
                }
            }
        }
        return path;
    }
    public static String findControllerToPage(String name) {
        for (String key:table.keySet()) {
            if(table.get(key).dataType.equals("controllerId")){
                int i=0;
                for (Row row:table.get(key).table.values()){
                    if(row.dataType.equals("controllerPageId")&&
                    (table.get(key).table.keySet().toArray()[i].equals(name))){
                        return key;
                }
                    i++;
                }

            }

        }
        return "";
    }
    public static Row findRow(List<String> path){
       Row row=new Row();
        row.table=table;
        for (String key:path) {
            if(row.table.containsKey(key)){
                row=row.table.get(key);
            }else {
                return null;
            }
        }
        return row;
    }
    public static String formatPath(List<String> path){
        String formatPath="";
        for (String element:path) {
            formatPath+="/"+element;
        }
        return formatPath;
    }
    public static String toStringTable(){
        String tableToSt= "";
         tableToSt+=toStringTable(table,"");
         return tableToSt;
    }
     static String toStringTable(HashMap<String, Row> tableMap, String space){
        String tableToSt= space+Colors.TEXT_BLUE+ "name\tdataType\tscope\tpath\n"+Colors.TEXT_RESET;
       Object[] keys= (tableMap.keySet().toArray());
        //Row [] values= (Row[]) rows;
        for (int i=0;i< keys.length;i++){
            Row row=(Row) tableMap.values().toArray()[i];
            tableToSt+=space+keys[i]+"\t"+row.dataType+"\t"+row.scope+"\t"+row.path+"\n";
        }
        for (int i=0;i< keys.length;i++){
            Row row=(Row) tableMap.values().toArray()[i];
            if(!row.table.isEmpty()){
                tableToSt+=toStringTable(row.table,space+"\t");
            }

        }
        return tableToSt;
    }
    public static void printTable() {
        List[] tableToAr = toStringArrayTable(table, "");
        for (int i = 0 ;i < tableToAr[0].size(); i++) {
            System.out.print(tableToAr[0].get(i));
            System.out.print(tableToAr[1].get(i));
            for (int j = 2; j < 5; j++) {
                int before = tableToAr[j - 1].get(i).toString().length();
                int after = tableToAr[j].get(i).toString().length();
                int fi = 20 + (after - before) ;
                String g = "%" + fi + "s";
                System.out.printf(g, tableToAr[j].get(i));
            }
            System.out.println();
        }
    }
    public static String printTableFile() {
        String text="";
        List[] tableToAr = toStringArrayTableFile(table, "");
        for (int i = 0 ;i < tableToAr[0].size(); i++) {
            text+=tableToAr[0].get(i);
            text+=tableToAr[1].get(i);
            for (int j = 2; j < 5; j++) {
                int before = tableToAr[j - 1].get(i).toString().length();
                int after = tableToAr[j].get(i).toString().length();
                int fi = 20 + (after - before) ;
                String g = "%" + fi + "s";
                text+=spaces(fi)+tableToAr[j].get(i);
            }
            text+="\n";
        }
        return text;
    }
    static List[] toStringArrayTable(HashMap<String, Row> tableMap, String space){
        List[] tableToAr= new ArrayList[5];
        for (int i=0;i<5;i++) {
            tableToAr[i]=new ArrayList();
        }
        tableToAr[0].add(Colors.TEXT_BLUE+space);
        tableToAr[1].add("name");
        tableToAr[2].add("dataType");
        tableToAr[3].add("scope");
        tableToAr[4].add("path"+Colors.TEXT_RESET);
        Object[] keys= (tableMap.keySet().toArray());
        //Row [] values= (Row[]) rows;
        for (int i=0;i< keys.length;i++){
            Row row=(Row) tableMap.values().toArray()[i];
            tableToAr[0].add(space);
            tableToAr[1].add(keys[i]);
            tableToAr[2].add(row.dataType);
            tableToAr[3].add(row.scope);
            tableToAr[4].add(row.path);
        }
        for (int i=0;i< keys.length;i++){
            Row row=(Row) tableMap.values().toArray()[i];
            if(!row.table.isEmpty()){
                int j=0;
                for (List element: toStringArrayTable(row.table,space+"\t") ) {
                    tableToAr[j].addAll(element);
                    j++;
                }
            }

        }
        return tableToAr;
    }
    static List[] toStringArrayTableFile(HashMap<String, Row> tableMap, String space){
        List[] tableToAr= new ArrayList[5];
        for (int i=0;i<5;i++) {
            tableToAr[i]=new ArrayList();
        }
        tableToAr[0].add(space);
        tableToAr[1].add("name");
        tableToAr[2].add("dataType");
        tableToAr[3].add("scope");
        tableToAr[4].add("path");
        Object[] keys= (tableMap.keySet().toArray());
        //Row [] values= (Row[]) rows;
        for (int i=0;i< keys.length;i++){
            Row row=(Row) tableMap.values().toArray()[i];
            tableToAr[0].add(space);
            tableToAr[1].add(keys[i]);
            tableToAr[2].add(row.dataType);
            tableToAr[3].add(row.scope);
            tableToAr[4].add(row.path);
        }
        for (int i=0;i< keys.length;i++){
            Row row=(Row) tableMap.values().toArray()[i];
            if(!row.table.isEmpty()){
                int j=0;
                for (List element: toStringArrayTableFile(row.table,space+"\t") ) {
                    tableToAr[j].addAll(element);
                    j++;
                }
            }

        }
        return tableToAr;
    }
    static boolean checkPaths(List shortPath,List longPath){
        for (int i=0;i<shortPath.size();i++){
            if(!shortPath.get(i).equals(longPath.get(i)))
                return false;
        }

        return true;
    }
    static String spaces(int num){
        String text="";
        for (int i=0;i<num;i++)
            text+=" ";
        return  text;
    }
}

