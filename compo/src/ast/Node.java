package ast;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.misc.Interval;

public class Node {
    transient public Token start, stop;

    public Node(ParserRuleContext parserRuleContext) {
        if (parserRuleContext != null) {
            this.start = parserRuleContext.start;
            this.stop = parserRuleContext.stop;
        }
    }

    @Override
    public String toString() {
        CharStream inputStream = start.getInputStream();
        return inputStream.getText(new Interval(start.getStartIndex(), stop.getStopIndex()));
    }

}
