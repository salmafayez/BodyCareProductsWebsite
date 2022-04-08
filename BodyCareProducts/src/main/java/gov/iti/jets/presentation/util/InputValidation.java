package gov.iti.jets.presentation.util;

import java.time.LocalDate;
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
    
    public String EmailValidation (String email){
        String validator = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";
        if ( isEmpty(email) ){
            return "Email shouldn't be emtpy";
        }else if ( !isValid(email,validator) ) {
            return "Email format not valid";
        }
        return "";
    }

    public String validateUserName(String userName){
        if ( isEmpty(userName) ){
            return "Username  shouldn't be emtpy";
        }
        return "";
    }

    public String validatePhoneNumber(String phoneNumber){
        String validator = "^(010|011|012)\\d{8}$";
        if ( isEmpty(phoneNumber) ){
            return "Phonenumber  shouldn't be emtpy";
        }else if ( isValid(phoneNumber,validator) ) {
            return "Phonenumber format not valid";
        }
        return "";
    }

    public String validatePassword(String password){
        String validator = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@$!%*?&])[A-Za-z\\d@$!%*?&]{8,}$";
        if ( isEmpty(password) ){
            return "Password shouldn't be emtpy";
        }else if ( isValid(password,validator) ) {
            return "Password should contain at least 1 uppercase letter and 1 lowercase letter and 1 specail characters";
        }
        return "";
    }

    // public String validateBirthDate(LocalDate birthDate){
    //     String validator = "\\s+(?:19\\d{2}|20[01][0-9]|2010)[-/.](?:0[1-9]|1[012])[-/.](?:0[1-9]|[12][0-9]|3[01])\\b";
    //     if ( isEmpty(birthDate) ){
    //         return "Password shouldn't be emtpy";
    //     }else if ( isValid(birthDate,validator) ) {
    //         return "Password should contain at least 1 uppercase letter and 1 lowercase letter and 1 specail characters";
    //     }
    //     return "";
    // }

    public String validateJob(String job){
        if ( isEmpty(job) ){
            return "Job shouldn't be emtpy";
        }
        return "";
    }
    public String validateAddress(String address){
        String validator = "^^[A-Za-z]{15,50}$";
        if ( isEmpty(address) ){
            return "Address shouldn't be emtpy";
        }else if ( isValid(address,validator) ) {
            return "Too long address";
        }
        return "";
    }
    public String validateCreditLimit(double creditLimit){
        if ( creditLimit < 1000 || creditLimit > 100000 ){
            return "Credit limit should be between 1000 and 100000";
        }
        return "";
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

    public String validateMessage(String message){
        if ( isEmpty(message) ){
            return "Message shouldn't be emtpy";
        }else if( message.length() < 15  && message.length() > 200){
            return "Too long message";
        }
        return "";
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

    public String validateCategoryname(String name){
        if ( isEmpty(name) ){
            return "Category name  shouldn't be emtpy";
        }else if( name.length() < 4){
            return "Category name  shouldn't be less than 4 characters";
        }
        return "";
    }

    public String validateOTP(String otp){
        if ( isEmpty(otp) ){
            return "Code  shouldn't be emtpy";
        }else if(otp.length()!=6){
            return "Code  should is incoorect";
        }
        return "";
    }

    private boolean isEmpty(String input){
        if (input == null || "".equals(input)) 
            return true;
        return false;
    }

    private boolean isValid ( String input , String validator){
        Pattern reg = Pattern.compile(validator);
        Matcher match = reg.matcher(input);
        if (match.find()){
            return true;
        }
        return false;
    }
}
 
 

