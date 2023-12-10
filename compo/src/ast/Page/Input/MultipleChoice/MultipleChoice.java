package ast.Page.Input.MultipleChoice;


import ast.Page.Location;
import color.Colors;
import error_handling.ErrorHandling;
import symbol_table.Row;
import symbol_table.SymbolTable;

import java.util.ArrayList;
import java.util.List;

public class MultipleChoice{
    private Dropdown dropdown;
    private Radio radio;
    private Checkbox checkbox;

    public Dropdown getDropdown() {
        return dropdown;
    }

    public void setDropdown(Dropdown dropdown) {
        this.dropdown = dropdown;
    }

    public Radio getRadio() {
        return radio;
    }

    public void setRadio(Radio radio) {
        this.radio = radio;
    }

    public Checkbox getCheckbox() {
        return checkbox;
    }

    public void setCheckbox(Checkbox checkbox) {
        this.checkbox = checkbox;
    }
    public void debug(List key, String scope){
        if (checkbox!=null){
            checkbox.debug(key,scope);
        }else if(radio!=null){
          radio.debug(key,scope);
        }else if(dropdown!=null){
           dropdown.debug(key,scope);
        }
    }
    public String generating(String space,boolean required,Location location){
        if(radio != null){
            return radio.generating(space, required,  location);
        }
        else if(checkbox != null){
            return checkbox.generating(space, required, location);
        }
        else if(dropdown != null){
            return dropdown.generating(space, required, location);
        }
        return "";
    }
}
