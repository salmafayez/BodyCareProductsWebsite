const form = document.getElementById("category-form");
const addButton = document.getElementById("addButton");
const category = document.getElementById("category-name");

form.addEventListener('submit', (e) => {

    if (!isInputValid()) {

        e.preventDefault();
    }

})

function checkInput() {

    category.addEventListener('blur', validateInput);
}

function validateInput() {

    var categoryValue = category.value.trim();
    if (categoryValue === '') {

        setErrorMessage(category, 'Field can not be blank!!');


    } else if (categoryValue.length < 4) {
        setErrorMessage(category, 'Category should be at least 4 characters');
    }
    else {

        setSuccess(category);
    }
}



function isInputValid() {

    var counterSuccess = 0;
    var categoryClassName = category.parentElement.className;
    if (categoryClassName == 'group-input success') {
        counterSuccess++;

    }

    return counterSuccess == 1;
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