const contactForm = document.getElementById("contactForm");

const contactName = document.getElementById("contactName");

const contactEmail = document.getElementById("contactEmail");
const contactMessage = document.getElementById("contactMessage");


var counterFailed = 0;


contactForm.addEventListener('submit', (e) => {

    if (isInputsNotValid()) {
        console.log("COUNTERFail in if = " +counterFailed);

        e.preventDefault();
    }
    console.log("COUNTERFailed = out if" +counterFailed);


})

function checkInputs() {


    contactName.addEventListener('blur', validateContactName);
    contactEmail.addEventListener('blur', validateContactEmail);
    contactMessage.addEventListener('blur', validateContactMessage);


}


function validateContactName() {
    console.log("in Validate user")
    var contactNameValue = contactName.value.trim();
    if (contactNameValue === '') {

        setErrorMessage(contactName, 'Field can not be blank!!');


    } else if (contactNameValue.length < 4) {

        setErrorMessage(contactName, 'contactName should be at least 4 characters');
    }

    else {

        setSuccess(contactName);

    }
}



function validateContactEmail() {


    var contactEmailValue = contactEmail.value;

    console.log("email value="+contactEmailValue);

    if (contactEmailValue === '') {


        setErrorMessage(contactEmail, 'Field can not be blank!!');

    } else if (!isEmail(contactEmailValue)) {

        setErrorMessage(contactEmail, 'Email format is not valid !!');
    }
    else {

        setSuccess(contactEmail);

    }
}







function validateContactMessage() {

    var contactMessageValue = contactMessage.value.trim();
    if (contactMessageValue === '') {

        setErrorMessage(contactMessage, 'Field can not be blank!!');

    } else if (contactMessageValue.length < 10) {

        setErrorMessage(contactMessage, 'Specify enough information about your complain');
    }
    else {

        setSuccess(contactMessage);
    }
}


function setSuccess(input) {

    input.style.borderColor = 'rgb(0, 112, 47)';
    const groupInput = input.parentElement;

    groupInput.className = 'group-input success';
    

}

function setErrorMessage(input, message) {
    input.style.borderColor = 'rgb(238, 0, 0)';
    const groupInput = input.parentElement;//.group-input
    
    const small = groupInput.querySelector('small');
    small.innerText = message;
    
    groupInput.className = 'group-input error';

    

}

function isEmail(emailValue) {
    console.log("in email valid");
    console.log(/^[a-zA-Z0-9+&*-]+(?:.[a-zA-Z0-9+&-]+)@(?:[a-zA-Z0-9-]+.)+[a-zA-Z]{2,7}$/.test(emailValue));
    console.log("email value here ="+emailValue)

    
return /^[a-zA-Z0-9_+&*-]+(?:\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\.)+[a-zA-Z]{2,7}$/.test(emailValue)

    
}





function isInputsNotValid() {

    counterFailed = 0;
    var contactNameClassName = contactName.parentElement.className;
    var contactEmailClassName = contactEmail.parentElement.className;
    var contactMessageClassName = contactMessage.parentElement.className;



    if (contactNameClassName == 'group-input error') {
        counterFailed++;
    }

    if (contactEmailClassName == 'group-input error') {
        counterFailed++;
    }

    if (contactMessageClassName == 'group-input error') {
        counterFailed++;
    }

console.log("COUNTERfail = " +counterFailed);
console.log("COUNTERfail ==3 " +counterFailed==3);
    return counterFailed > 0;

}






