
checkInputs();

const addProductForm = document.getElementById("addProductForm");

var counterSuccess = 0;


addProductForm.addEventListener('submit', (e) => {

    if (!isAllInputsValid()) {
       

        e.preventDefault();
    }
    


})

function checkInputs() {


const productName = document.getElementById("productName");

const price = document.getElementById("price");
const description = document.getElementById("description");
const quantity = document.getElementById("quantity");
const productImage= document.getElementById("productImage");
    console.log("working!!");
    productName.addEventListener('blur', validateProductName);
    price.addEventListener('blur', validatePrice);
    description.addEventListener('blur', validateDescription);
    quantity.addEventListener('blur', validateQuantity);
    productImage.addEventListener('blur', validateProductImage);
    


}


function validateProductName() {
   

    var productNameValue = productName.value.trim();

    if (productNameValue === '') {

        setErrorMessage(productName, 'Field can not be blank!!');


    } else if (productNameValue.length < 4) {

        setErrorMessage(productName, 'ProductName should be at least 4 characters');
    }

    else {

        setSuccess(productName);

    }
}



function validatePrice() {


    var priceValue = price.value.trim();

    if (priceValue === '') {

        setErrorMessage(price, 'Field can not be blank!!');

    } else if (!isNumber(priceValue)) {

        setErrorMessage(creditLimit, 'Price should contain only numbers');

    } else if (priceValue < 50) {
        setErrorMessage(price, 'Product price should start with at least 50 pounds');
    } 
    else {

        setSuccess(price);
    }
}







function validateDescription() {

    var descriptionValue = description.value.trim();
    if (descriptionValue === '') {

        setErrorMessage(description, 'Field can not be blank!!');

    } else if (descriptionValue.length < 10) {

        setErrorMessage(description, 'Specify enough information description about the product');
    }
    else {

        setSuccess(description);
    }
}

function validateQuantity() {

    var quantityValue = quantity.value.trim();
    if (quantityValue === '') {

        setErrorMessage(price, 'Field can not be blank!!');

    } else if (!isNumber(quantityValue)) {

        setErrorMessage(quantity, 'Quantity should contain only numbers');

    } else if (quantityValue < 10) {
        setErrorMessage(quantity, 'Quantity should start with at least 10 product in stock');
    } 
    else {

        setSuccess(quantity);
    }
}

function validateProductImage() {

    var productImageValue = productImage.value;
    if (productImageValue === '') {

        setErrorMessage(productImage, 'Field can not be blank!!');

    } 
    else {

        setSuccess(productImage);
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

function isNumber(inputValue) {

    return inputValue.match(/^[0-9]+$/);
}






function isAllInputsValid() {

    counterSuccess = 0;
    var productNameClassName = productName.parentElement.className;
    var priceClassName = price.parentElement.className;
    var descriptionClassName = description.parentElement.className;
    var quantityClassName = quantity.parentElement.className;
    var productImageClassName = productImage.parentElement.className;

 
    


    if (productNameClassName == 'group-input success') {
        counterSuccess++;
    }

    if (priceClassName  == 'group-input success') {
        counterSuccess++;
    }

    if (descriptionClassName == 'group-input success') {
        counterSuccess++;
    }
    if (quantityClassName  == 'group-input success') {
        counterSuccess++;
    }
    if (productImageClassName == 'group-input success') {
        counterSuccess++;
    }


    return counterSuccess == 5;

}






