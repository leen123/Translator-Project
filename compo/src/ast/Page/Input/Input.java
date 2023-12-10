package ast.Page.Input;

import ast.Page.Body;
import ast.Page.IO;
import ast.Page.Input.MultipleChoice.MultipleChoice;
import ast.Page.Location;

import java.util.List;

public class Input extends IO {
    private MultipleChoice multipleChoice;
    private Field field;
    private File file;
    private Location location;
    private boolean required;

    public boolean isRequired() {
        return required;
    }

    public void setRequired(boolean required) {
        this.required = required;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public MultipleChoice getMultipleChoice() {
        return multipleChoice;
    }

    public void setMultipleChoice(MultipleChoice multipleChoice) {
        this.multipleChoice = multipleChoice;
    }

    public Field getField() {
        return field;
    }

    public void setField(Field field) {
        this.field = field;
    }

    public File getFile() {
        return file;
    }

    public void setFile(File file) {
        this.file = file;
    }
    public void debug(List key, String scope){
        if (multipleChoice!=null){
            multipleChoice.debug(key,scope);
        }else if(field!=null){
            field.debug(key,scope);
        }else if(file!=null){
            file.debug(key,scope);
        }
    }
    public String generating(String space){
        if(field != null){
            return field.generating(space, required, location);
        }
        else if(file != null){
            return file.generating(space, required, location);
        }
        else if(multipleChoice != null){
            return multipleChoice.generating(space, required, location);
        }
        return "";
    }
}
