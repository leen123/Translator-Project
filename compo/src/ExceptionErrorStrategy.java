import gen.HTMLPHPLEXER;
import org.antlr.v4.runtime.DefaultErrorStrategy;
import org.antlr.v4.runtime.InputMismatchException;
import org.antlr.v4.runtime.Parser;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.misc.IntervalSet;
import symbol_table.SymbolTable;

public class ExceptionErrorStrategy extends DefaultErrorStrategy {

    @Override
    public void reset(Parser recognizer) {

    }

    @Override
    public void recover(Parser recognizer, RecognitionException e) {
        SymbolTable.stop = true;
        if (e.getOffendingToken() == null) {
            System.out.println(e.getMessage());
            return;
        }

        String msg = "line : " + e.getOffendingToken().getLine() + " ,mismatched input " + getTokenErrorDisplay(e.getOffendingToken());
        msg += " expecting one of " + e.getExpectedTokens().toString(recognizer.getTokenNames());
        System.out.println(msg);
    }

    @Override
    protected void reportInputMismatch(Parser recognizer, InputMismatchException e) {
        SymbolTable.stop = true;
        String msg = "mismatched input " + getTokenErrorDisplay(e.getOffendingToken());
        msg += " expecting one of " + e.getExpectedTokens().toString(recognizer.getTokenNames());
        RecognitionException ex = new RecognitionException(msg, recognizer, recognizer.getInputStream(), recognizer.getContext());
        ex.initCause(e);
        throw ex;
    }

    @Override
    protected void reportMissingToken(Parser recognizer) {
        SymbolTable.stop = true;
        System.out.println("missing token of type " + recognizer.getExpectedTokens().toString(recognizer.getTokenNames()));
    }
}