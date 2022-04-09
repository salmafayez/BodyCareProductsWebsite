const form = document.getElementById("myRegisterForm");
const registerButton = document.getElementById("register");
const username = document.getElementById("username");
const phoneNumber = document.getElementById("phoneNumber");
const email = document.getElementById("email");
const password = document.getElementById("password");
const confirmPassword = document.getElementById("confirmPassword");
const birthday = document.getElementById("birthday");
const job = document.getElementById("job");
//var country = document.getElementById("country");
//const city = document.getElementById("city");
const address = document.getElementById("address");
const creditLimit = document.getElementById("creditLimit");
const gender = document.getElementById("gender");

var counterSuccess = 0;
var passwordValue;

form.addEventListener('submit', (e) => {

    if (!isAllInputsValid()) {
        console.log("successCounter=" + counterSuccess);
        e.preventDefault();
    }

})

function checkInputs() {


    username.addEventListener('blur', validateUserName);

    phoneNumber.addEventListener('blur', validatePhoneNumber);

    email.addEventListener('blur', validateEmail);

    password.addEventListener('blur', validatePassword);

    confirmPassword.addEventListener('blur', validateConfirmPassword);

    birthday.addEventListener('blur', validateBirthday);

    job.addEventListener('blur', validateJob);

    address.addEventListener('blur', validateAddress);

    creditLimit.addEventListener('blur', validateCreditLimit);


}


function validateUserName() {
    console.log("in Validate user")
    var usernameValue = username.value.trim();
    if (usernameValue === '') {

        setErrorMessage(username, 'Field can not be blank!!');


    } else if (usernameValue.length < 4) {
        setErrorMessage(username, 'Username should be at least 4 characters');
    }
    else {

        setSuccess(username);
    }
}

function validatePhoneNumber() {
    var phoneNumberValue = phoneNumber.value.trim();

    if (phoneNumberValue === '') {
        console.log("emptyUser Email");
        setErrorMessage(phoneNumber, 'Field can not be blank!!');


    } else if (phoneNumberValue.length < 10) {

        setErrorMessage(phoneNumber, "Phone number should be of length 10 characters");

    } else if (!isPhoneNumber(phoneNumberValue)) {

        setErrorMessage(phoneNumber, 'Wrong phone number format!!');
    }
    else {
        setSuccess(phoneNumber);
    }
}

function validateEmail() {
    console.log("hereerrerererre 1 Email");

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
        console.log("hereerrerererre 4 Email");

        checkEmailAjax(emailValue);

    }
}


function validatePassword() {
    passwordValue = password.value.trim();
    if (passwordValue === '') {

        console.log("emptyUser password");
        setErrorMessage(password, 'Field can not be blank!!');


    } else if (passwordValue.length < 8) {

        setErrorMessage(password, 'Password should be at least 8 characters');

    } else if (!isStrongPassword(passwordValue)) {

        setErrorMessage(password, 'Strong password should consist of a combination of        Uppercase and Lowercase letters,' +
            'Numbers and        Special symbols, such as punctuation.');

    } else {
        setSuccess(password);
    }
}

function validateConfirmPassword() {

    var confirmPasswordValue = confirmPassword.value.trim();
    if (confirmPasswordValue === '') {
        console.log("emptyUser Email");
        setErrorMessage(confirmPassword, 'Field can not be blank!!');


    } else if (confirmPasswordValue !== passwordValue) {

        setErrorMessage(confirmPassword, "Passwords doesn't match!!");
    } else {
        setSuccess(confirmPassword);
    }
}

function validateBirthday() {
    var birthdayValue = birthday.value.trim();
    if (birthdayValue === '') {

        setErrorMessage(birthday, 'Field can not be blank!!');

    }
    else if (!isValidBirthday(birthdayValue)) {
        setErrorMessage(birthday, 'not a valid date of birth,you should be over 12 years old!!');
    }
    else {

        setSuccess(birthday);
    }
}

function validateJob() {

    var jobValue = job.value.trim();
    if (jobValue === '') {

        setErrorMessage(job, 'Field can not be blank!!');

    } else if (jobValue.length < 5) {
        setErrorMessage(job, 'Specify enough information about your job ');
    }
    else {

        setSuccess(job);
    }
}

function validateAddress() {

    var addressValue = address.value.trim();
    if (addressValue === '') {

        setErrorMessage(address, 'Field can not be blank!!');

    } else if (addressValue.length < 15) {
        setErrorMessage(address, 'Specify enough information about your address');
    }
    else {

        setSuccess(address);
    }

}

function validateCreditLimit() {
    var creditLimitValue = creditLimit.value.trim();
    if (creditLimitValue === '') {

        setErrorMessage(creditLimit, 'Field can not be blank!!');

    } else if (!isNumber(creditLimitValue)) {

        setErrorMessage(creditLimit, 'Credit should contain only numbers');

    } else if (creditLimitValue < 50) {
        setErrorMessage(creditLimit, 'You should start with at least 50 pounds');
    } else if (creditLimitValue > 10000) {

        setErrorMessage(creditLimit, 'Your wallet range starts from 50 pounds till 10,000 pounds');
    }
    else {

        setSuccess(creditLimit);
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
    console.log("emptyUserName in error");
    groupInput.className = 'group-input error';

}

function isEmail(emailValue) {

    return /^[a-zA-Z0-9+&*-]+(?:.[a-zA-Z0-9+&-]+)@(?:[a-zA-Z0-9-]+.)+[a-zA-Z]{2,7}$/.test(emailValue);
}

function isStrongPassword(passwordValue) {

    return /^(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])(?=.*[!@#\$%\^&\*])(?=.{8,})/.test(passwordValue);
}

function isPhoneNumber(phoneNumberValue) {

    return /^(010|011|012)\d{8}$/.test(phoneNumberValue);
}

function isNumber(inputValue) {

    return inputValue.match(/^[0-9]+$/);
}

function isValidBirthday(birthdayValue) {

    const date12YrsAgo = new Date();
    date12YrsAgo.setFullYear(date12YrsAgo.getFullYear() - 12);
    return new Date(birthdayValue).getYear() <= date12YrsAgo.getYear();
}

function isAllInputsValid() {

    counterSuccess = 0;
    var usernameClassName = username.parentElement.className;
    var phoneNumberClassName = phoneNumber.parentElement.className;
    var passwordClassName = password.parentElement.className;
    var confirmPasswordClassName = confirmPassword.parentElement.className;
    var birthdayClassName = birthday.parentElement.className;
    var jobClassName = job.parentElement.className;
    var addressClassName = address.parentElement.className;
    var creditLimitClassName = creditLimit.parentElement.className;


    if (usernameClassName == 'group-input success') {
        counterSuccess++;
    }

    if (phoneNumberClassName == 'group-input success') {
        counterSuccess++;
    }

    if (passwordClassName == 'group-input success') {
        counterSuccess++;
    }

    if (confirmPasswordClassName == 'group-input success') {
        counterSuccess++;
    }

    if (birthdayClassName == 'group-input success') {
        counterSuccess++;
    }

    if (jobClassName == 'group-input success') {
        counterSuccess++;
    }

    if (addressClassName == 'group-input success') {
        counterSuccess++;
    }

    if (creditLimitClassName == 'group-input success') {
        counterSuccess++;
    }

    console.log(counterSuccess == 8)
    return counterSuccess == 8;

}

var req = null;
function checkEmailAjax(emailajax) {
    console.log("hree");
    req = new XMLHttpRequest();
    req.open("POST", "checkemail?email=" + emailajax);
    req.onreadystatechange = handleCheckMail;
    req.send();


}
function handleCheckMail() {
    if (req.readyState == 4) {
        if (req.status == 200) {
            console.log("reeee" + req.responseText);
            console.log(typeof req.responseText);

            if (req.responseText == 'true') {
                console.log("faileddddddd");
                setErrorMessage(email, 'Email already exists!!');

            } else {
                setSuccess(email);
                console.log("successss");
            }


        }
        else {

            console.log("Error code " + req.responseText);
            //emailAjaxResponse=req.responseText;

        }


    }

}

var auth_token;
$(document).ready(function () {
    $.ajax({
        type: 'get',
        url: 'https://www.universal-tutorial.com/api/getaccesstoken',
        success: function (data) {

            auth_token = data.auth_token;
            getCountries(auth_token);

        },
        headers: {
            "Accept": "application/json",
            "api-token": "kEs5h1bPeNjpuHjC-LLQJiKhENJnhBVet3qhYMYQP27AcvDgFZEK32oKa4IboSDhGto",
            "user-email": "1998hend@gmail.com"
        },

    })
    $('#country').change(function () {
        getState(auth_token);
    })
    $('#state').change(function () {
        getCity(auth_token);
    })
})


function getCountries(auth_token) {

    var countryName = $('#country').val();
    $.ajax({
        type: 'get',
        url: 'https://www.universal-tutorial.com/api/countries/',
        success: function (data) {
            data.forEach(element => {
                $('#country').append('<option value=' + element.country_name + '>' + element.country_name + '</option>')
            })
            getState(auth_token);
        },
        headers: {
            "Authorization": "Bearer " + auth_token,
            "Accept": "application/json"
        }
    })
}

function getState(auth_token) {
    let country_name = $('#country').val() + "/";
    $.ajax({
        type: 'get',
        url: 'https://www.universal-tutorial.com/api/states/' + country_name,
        success: function (data) {
            $('#state').empty();
            data.forEach(element => {
                $('#state').append('<option value=' + element.state_name + '>' + element.state_name + '</option>')
            });
            getCity(auth_token);
        },
        headers: {
            "Authorization": "Bearer " + auth_token,
            "Accept": "application/json"
        }
    })
}

function getCity(auth_token) {
    var state_name = $('#state').val() + "/";
    $.ajax({
        type: 'get',
        url: 'https://www.universal-tutorial.com/api/cities/' + state_name,
        success: function (data) {
            $('#city').empty();
            data.forEach(element => {
                $('#city').append('<option value=' + element.city_name + '>' + element.city_name + '</option>')
            })
        },
        headers: {
            "Authorization": "Bearer " + auth_token,
            "Accept": "application/json"
        }
    })
}