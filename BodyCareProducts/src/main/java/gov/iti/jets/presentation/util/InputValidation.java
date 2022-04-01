package gov.iti.jets.presentation.util;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class InputValidation {
    
    public boolean EmailValidation (String email){
        String validator = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";
        Pattern reg = Pattern.compile(validator);
        Matcher match = reg.matcher(email);
        if (match.find()){
            return true;
        }
        return false;
    }
}
 
 

