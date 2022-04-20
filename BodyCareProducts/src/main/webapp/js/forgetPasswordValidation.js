const form = document.getElementById("forgetpasswordform");
const email = document.getElementById("email");

form.addEventListener('submit', (e) => {

    if (isInputNotValid()) {

        e.preventDefault();
    }

})

function checkInput() {

    email.addEventListener('blur', validateEmail);
}

function validateEmail() {

    var emailValue = email.value.trim();
    if (emailValue === '') {
        console.log("emptyUser Email");
        console.log("hereerrerererre 2 Email");

        setErrorMessage(email, 'Field can not be blank!!');

    } else if (!isEmail(emailValue)) {

        console.log("hereerrerererre 3 Email");

        setErrorMessage(email, 'Email format is not valid !!');
    }
    else {
        

        setSuccess(email)

    }
}

function isEmail(emailValue) {

    return /^[a-zA-Z0-9_+&*-]+(?:\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\.)+[a-zA-Z]{2,7}$/.test(emailValue)
    //return /^[a-zA-Z0-9+&*-]+(?:.[a-zA-Z0-9+&-]+)@(?:[a-zA-Z0-9-]+.)+[a-zA-Z]{2,15}$/.test(emailValue);
}



function isInputNotValid() {

    var counterFailed = 0;
    var emailClassName = email.parentElement.className;
    if (emailClassName == 'group-input error') {
        counterFailed++;

    }

    return counterFailed >0;
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