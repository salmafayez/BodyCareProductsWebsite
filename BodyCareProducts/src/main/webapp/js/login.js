
const email = document.getElementById("email");
const form = document.getElementById("loginform");

email.addEventListener('blur',validateEmail);









form.addEventListener('submit', (e) => {
    if(isInputsNotValid()){
        e.preventDefault();
    }
})


function checkInputs() {


    contactName.addEventListener('blur', validateContactName);
    contactEmail.addEventListener('blur', validateContactEmail);
    contactMessage.addEventListener('blur', validateContactMessage);


}






function validateEmail(){
    var emailValue = email.value.trim();
    if(emailValue ===''){
            setErrorMessage(email,'Field can not be blank !!');

        }else if(!isEmail(emailValue)){

            setErrorMessage(email,'Email format is not valid !!');

        }else{
            setSuccess(email);
        }
}


function isEmail(emailValue){

    return /^[a-zA-Z0-9_+&*-]+(?:\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\.)+[a-zA-Z]{2,7}$/.test(emailValue);
}

function setSuccess(input){
    const groupInput=input.parentElement;
    groupInput.className='group-input success';
}

function setErrorMessage(input,message){
    const groupInput=input.parentElement;
    const small =groupInput.querySelector('small');
    small.innerText=message;
    groupInput.className='group-input error';
}



function isInputsNotValid(){

    var counterFailed = 0;
    var emailClassName=email.parentElement.className;

    if(emailClassName == 'group-input error'){
        counterFailed++;
    }
   return counterFailed > 0;
}

