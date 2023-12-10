package ast.Page.Output;

import ast.Page.IO;
import ast.Page.Location;

import java.util.List;

public class Output extends IO {
    Image outputImage;
    OutputText outputText;
    Location location;

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public Image getOutputImage() {
        return outputImage;
    }

    public void setOutputImage(Image outputImage) {
        this.outputImage = outputImage;
    }

    public OutputText getOutputText() {
        return outputText;
    }

    public void setOutputText(OutputText outputText) {
        this.outputText = outputText;
    }
    public void debug(List key, String scope){
        if (outputImage!=null){
            outputImage.debug(key,scope);
        }else if(outputText!=null){
            outputText.debug(key,scope);
        }
    }public String generating(String space){
        if(outputImage != null){
            return outputImage.generating(space, location);
        }
        else if(outputText != null){
           return outputText.generating(space, location);
        }
        return "";
    }
}
