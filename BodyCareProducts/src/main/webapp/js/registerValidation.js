


const myRegisterForm = document.getElementById("myRegisterForm");
const registerButton = document.getElementById("register");
const username = document.getElementById("username");
const phoneNumber = document.getElementById("phoneNumber");
const email = document.getElementById("email");
const password = document.getElementById("password");
const confirmPassword = document.getElementById("confirmPassword");
const birthday = document.getElementById("birthday");
const job = document.getElementById("job");
//const country = document.getElementById("country");
//const city = document.getElementById("city");
const address = document.getElementById("address");
const creditLimit = document.getElementById("creditLimit");
const gender = document.getElementById("gender");

register.addEventListener('click', (e) => {

    console.log("hiiiiiiii")
    e.preventDefault();
    checkInputs();
})

function checkInputs() {

    // get inputs values

    console.log("inCheck");
    const usernameValue = username.value.trim();
    const phoneNumberValue = phoneNumber.value.trim();
    const emailValue = email.value.trim();
    const passwordValue = password.value.trim();
    const confirmPasswordValue = confirmPassword.value.trim();
    const birthdayValue = birthday.value.trim();
    const jobValue = job.value.trim();
    const addressValue = address.value.trim();
    const creditLimitValue = creditLimit.value.trim();
    // const genderValue = gender.value;

    if(usernameValue ===''){
        console.log("emptyUserName");
        setErrorMessage(username,'Field can not be blank!!');
        

    }else if(usernameValue.length <4){
        setErrorMessage(username,'Username should be at least 4 characters');
    }
    else{

        setSuccess(username);
    }



    if(phoneNumberValue===''){
        console.log("emptyUser Email");
        setErrorMessage(phoneNumber,'Field can not be blank!!');
        

    }else if(phoneNumberValue.length<11){

        setErrorMessage(phoneNumber,"Phone number should be of length 11 characters");

    }else if(!isPhoneNumber(phoneNumberValue)){

        setErrorMessage(phoneNumber,'Wrong phone number format!!');
    }
    else{
        setSuccess(phoneNumber);
    }

    if(emailValue ===''){
        console.log("emptyUser Email");
        setErrorMessage(email,'Field can not be blank!!');
        

    }else if(!isEmail(emailValue)){

        setErrorMessage(email,'Email format is not valid !!');
    }else{
        setSuccess(email);
    }



    if(passwordValue ===''){

        console.log("emptyUser password");
        setErrorMessage(password,'Field can not be blank!!');
        

    }else if(passwordValue.length < 8){

        setErrorMessage(password,'Password should be at least 8 characters');

    }else if(!isStrongPassword(passwordValue)){

        setErrorMessage(password,'Strong password should consist of a combination of        Uppercase and Lowercase letters,'+
                                    'Numbers and        Special symbols, such as punctuation.');

    }else {
        setSuccess(password);
    }


    if(confirmPasswordValue===''){
        console.log("emptyUser Email");
        setErrorMessage(confirmPassword,'Field can not be blank!!');
        

    }else if(confirmPasswordValue !==passwordValue){

        setErrorMessage(confirmPassword,"Passwords doesn't match!!");
    }else{
        setSuccess(confirmPassword);
    }


    if(birthdayValue ===''){
        
        setErrorMessage(birthday,'Field can not be blank!!');
        

    }
    else if(!isValidBirthday(birthdayValue)){
        setErrorMessage(birthday,'not a valid date of birth,you should be over 12 years old!!');
    }
    else{

        setSuccess(birthday);
    }

    if(jobValue ===''){
        
        setErrorMessage(job,'Field can not be blank!!');
        

    }else if(jobValue.length <5){
        setErrorMessage(job,'Specify enough information about your job ');
    }
    else{

        setSuccess(job);
    }


    if(addressValue ===''){
        
        setErrorMessage(address,'Field can not be blank!!');
        

    }else if(addressValue.length <15){
        setErrorMessage(address,'Specify enough information about your address');
    }
    else{

        setSuccess(address);
    }

    if(creditLimitValue ===''){
        
        setErrorMessage(creditLimit,'Field can not be blank!!');
        

    }else if(!isNumber(creditLimitValue)){

        setErrorMessage(creditLimit,'Credit should contain only numbers');

    }else if(creditLimitValue<50){
        setErrorMessage(creditLimit,'You sould start with at least 50 pounds');
    }else if(creditLimitValue>10000){

        setErrorMessage(creditLimit,'Your wallet range starts from 50 pounds till 10,000 pounds');
    }
    else{

        setSuccess(creditLimit);
    }





}



function setSuccess(input){
    const groupInput=input.parentElement;//.group-input

    groupInput.className='group-input success';


}

function setErrorMessage(input,message){
    const groupInput=input.parentElement;//.group-input
    const small =groupInput.querySelector('small');
    small.innerText=message;
    console.log("emptyUserName in error");
    groupInput.className='group-input error';


}

function isEmail(emailValue){

    return /^\w+([\.-]?\w+)*@\w+([\.-]?\w+)*(\.\w{2,3})+$/.test(emailValue);
}

function isStrongPassword(passwordValue){

    return /^(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])(?=.*[!@#\$%\^&\*])(?=.{8,})/.test(passwordValue);
}

function isPhoneNumber(phoneNumberValue){

    return /^(010|011|012)\d{8}$/.test(phoneNumberValue);
}

function isNumber(inputValue){

    return inputValue.match(/^[0-9]+$/);
}

function isValidBirthday(birthdayValue){

    
    const date12YrsAgo = new Date();
   
    date12YrsAgo.setFullYear(date12YrsAgo.getFullYear() - 12);
   

    // check if the date of birth is before that date
    return new Date(birthdayValue).getYear() <= date12YrsAgo.getYear();
}

