package ast.Page;

import ast.Page.Input.Input;
import ast.Page.Output.Output;

import java.util.ArrayList;
import java.util.List;

public class Body {
    private Input input;
    private Output output;
    private boolean hasNewLine;

    public boolean isHasNewLine() {
        return hasNewLine;
    }

    public void setHasNewLine(boolean hasNewLine) {
        this.hasNewLine = hasNewLine;
    }

    public Input getInput() {
        return input;
    }

    public void setInput(Input input) {
        this.input = input;
    }

    public Output getOutput() {
        return output;
    }

    public void setOutput(Output output) {
        this.output = output;
    }
    public void debug(List key, String scope){
        if(input != null){
            input.debug(key,scope);
        }
        if(output != null){
            output.debug(key,scope);
        }
    }
    public String generating(String space){
        String codeGenerating="";

        if(input != null){
            codeGenerating= input.generating(space);
        }
        else if(output != null){
           codeGenerating= output.generating(space);
        }
        if(hasNewLine&&!codeGenerating.equals("")) {
            codeGenerating+=space+"<br/>\n";
          //  codeGenerating+=space+"<br/>\n";
        }
        return codeGenerating;
    }
}
