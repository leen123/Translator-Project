import ast.App;
import color.Colors;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import error_handling.ErrorHandling;
import gen.HTMLPHPLEXER;
import gen.HTMLPHPPARSER;
import org.antlr.v4.runtime.ANTLRErrorListener;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import symbol_table.SymbolTable;
import visitor.BaseVisitor;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Collections;

import static org.antlr.v4.runtime.CharStreams.fromFileName;

public class Main {
    static void printSt(){
        System.out.print(Colors.TEXT_GREEN);
        System.out.println("=================================================================");
        System.out.println("=                         Symbol Table                          =");
        System.out.println("=================================================================");
        System.out.print(Colors.TEXT_RESET);
        SymbolTable.printTable();
    }
    public static void print() throws IOException{
        String symbolTable = "symbol_table.txt";
        String errorHandling = "log.txt";
        String errorLogic = "log(2).txt";
        String temp = "";
        printSt();
        Files.write(Paths.get((symbolTable)), Collections.singleton(SymbolTable.printTableFile()));
        System.out.println(Colors.TEXT_CYAN+"create Symbol Table"+Colors.TEXT_RESET);
        if(ErrorHandling.error.size()>0){
            System.out.println(Colors.TEXT_YELLOW+"=================================================================");
            System.out.println("=                         "+Colors.TEXT_RED+"Error Handling"+Colors.TEXT_YELLOW+"                        =");
            System.out.println("=================================================================");
            System.out.print(Colors.TEXT_RESET);

        }else {
            System.out.println(Colors.TEXT_GREEN+"check error : correct"+Colors.TEXT_RESET);
        }
        for (String error:ErrorHandling.error) {
            System.out.println(error);
                temp+=error.replace("\u001B[1m\u001B[31m","").
                        replace("\u001B[0m\u001B[31m","").
                        replace("\u001B[33m","").
                        replace("\u001B[0m","")+"\n";
        }Files.write(Paths.get((errorHandling)), Collections.singleton(temp));

        if(ErrorHandling.errorLogic.size()>0){
            System.out.println(Colors.TEXT_YELLOW+"=================================================================");
            System.out.println("=                         "+Colors.TEXT_RED+"Error Logic"+Colors.TEXT_YELLOW+"                        =");
            System.out.println("=================================================================");
            System.out.print(Colors.TEXT_RESET);
            temp="";
            for (String errorLog:ErrorHandling.errorLogic) {
                System.out.println(errorLog);
                temp+=errorLog.replace("\u001B[1m\u001B[31m","").
                        replace("\u001B[0m\u001B[31m","").
                        replace("\u001B[33m","").
                        replace("\u001B[0m","")+"\n";
            }
        }
        Files.write(Paths.get((errorLogic)), Collections.singleton(temp));
    }
    public static void main(String[] args) throws IOException {
        String source = "input.txt";
        String out = "out.txt";
        CharStream cs = fromFileName(source);
        HTMLPHPLEXER lexer = new HTMLPHPLEXER(cs);
        lexer.removeErrorListeners();
        lexer.addErrorListener(new LexerErrorListener());
        CommonTokenStream token = new CommonTokenStream(lexer);
        HTMLPHPPARSER parser = new HTMLPHPPARSER(token);
          parser.removeErrorListeners();
        parser.setErrorHandler(new ExceptionErrorStrategy());
        ParseTree tree = parser.app();
        App page = (App) new BaseVisitor().visit(tree);
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        //System.out.println(gson.toJson(page));
        if(!SymbolTable.stop){
            Files.write(Paths.get((out)), Collections.singleton(gson.toJson(page)));
            page.debug();
            print();
            page.generating();
        }

    }

}
