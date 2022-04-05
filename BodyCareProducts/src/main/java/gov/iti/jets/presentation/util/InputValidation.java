package gov.iti.jets.presentation.util;

import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class InputValidation {

    public static InputValidation INSTANCE = new InputValidation();

    private InputValidation(){

    }
    
    public static InputValidation getInstance(){
        return INSTANCE;
    }
    
    public boolean EmailValidation (String email){
        String validator = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";
        Pattern reg = Pattern.compile(validator);
        Matcher match = reg.matcher(email);
        if (match.find()){
            return true;
        }
        return false;
    }

    public boolean validateUserName(String userName){
        String validator = "^[A-Za-z][A-Za-z0-9_]{5,15}$";
        Pattern reg = Pattern.compile(validator);
        Matcher match = reg.matcher(userName);
        if (match.find()){
            return true;
        }
        return false;
    }

    public boolean validatePhoneNumber(String phoneNumber){
        String validator = "^(010|011|012)\\d{8}$";
        Pattern reg = Pattern.compile(validator);
        Matcher match = reg.matcher(phoneNumber);
        if (match.find()){
            return true;
        }
        return false;
    }

    public boolean validatePassword(String password){
        String validator = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@$!%*?&])[A-Za-z\\d@$!%*?&]{8,}$";
        Pattern reg = Pattern.compile(validator);
        Matcher match = reg.matcher(password);
        if (match.find()){
            return true;
        }
        return false;
    }

    public boolean validateBirthDate(String birthDate){
        String validator = "\\s+(?:19\\d{2}|20[01][0-9]|2010)[-/.](?:0[1-9]|1[012])[-/.](?:0[1-9]|[12][0-9]|3[01])\\b";
        Pattern reg = Pattern.compile(validator);
        Matcher match = reg.matcher(birthDate);
        if (match.find()){
            return true;
        }
        return false;
    }

    public boolean validateJob(String job){
        String validator = "^[A-Za-z][A-Za-z0-9_]{5,15}$";
        Pattern reg = Pattern.compile(validator);
        Matcher match = reg.matcher(job);
        if (match.find()){
            return true;
        }
        return false;
    }
    public boolean validateAddress(String address){
        String validator = "^^[A-Za-z][A-Za-z0-9_]{15,50}$";
        Pattern reg = Pattern.compile(validator);
        Matcher match = reg.matcher(address);
        if (match.find()){
            return true;
        }
        return false;
    }
    public boolean validateCreditLimit(String creditLimit){
        String validator = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";
        Pattern reg = Pattern.compile(validator);
        Matcher match = reg.matcher(creditLimit);
        if (match.find()){
            return true;
        }
        return false;
    }

    public boolean validateSearchKeyword(String searchKeyword){
        String validator = "^[A-Za-z][A-Za-z0-9_]{3,20}$";
        Pattern reg = Pattern.compile(validator);
        Matcher match = reg.matcher(searchKeyword);
        if (match.find()){
            return true;
        }
        return false;
    }

    public boolean validateMessage(String message){
        String validator = "^[A-Za-z][A-Za-z0-9_]{15,200}$";
        Pattern reg = Pattern.compile(validator);
        Matcher match = reg.matcher(message);
        if (match.find()){
            return true;
        }
        return false;
    }

    public boolean validateProductName(String name){
        String validator = "^[A-Za-z][A-Za-z0-9_]{3,20}$";
        Pattern reg = Pattern.compile(validator);
        Matcher match = reg.matcher(name);
        if (match.find()){
            return true;
        }
        return false;
    }
    public boolean validateProductQuantity(String quantity){
        String validator = "";
        Pattern reg = Pattern.compile(validator);
        Matcher match = reg.matcher(quantity);
        if (match.find()){
            return true;
        }
        return false;
    }
    public boolean validateProductDescription(String description){
        String validator = "^[A-Za-z][A-Za-z0-9_]{5,100}$";
        Pattern reg = Pattern.compile(validator);
        Matcher match = reg.matcher(description);
        if (match.find()){
            return true;
        }
        return false;
    } 

    public boolean validateProductImage(String image){
        String validator = "";
        Pattern reg = Pattern.compile(validator);
        Matcher match = reg.matcher(image);
        if (match.find()){
            return true;
        }
        return false;
    }

    public boolean validateCategoryname(String name){
        String validator = "^[A-Za-z][A-Za-z0-9_]{5,20}$";
        Pattern reg = Pattern.compile(validator);
        Matcher match = reg.matcher(name);
        if (match.find()){
            return true;
        }
        return false;
    }
}
 
 

