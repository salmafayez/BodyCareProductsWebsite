console.log("wroking cart");


/*-------------------
        Quantity change
    --------------------- */

var proQty = $('.pro-qty');
function addToCartProduct(product) {

    var $button = $(this);
    var oldValue = $button.parent().find('input').val();
    if (parseFloat(oldValue) <= parseFloat(10)) {
        if ($button.hasClass('inc')) {
            console.log("in" + oldValue);

            if (parseFloat(oldValue) == parseFloat(10)) {
                newVal = 10;
            } else {
                var newVal = parseFloat(oldValue) + 1;
                incrementCartProductQuantity(product);

            }


            console.log("in copy main jquery")
            //   updateTotalPrice()  
        } else {
            // Don't allow decrementing below zero
            if (oldValue > 0) {
                var newVal = parseFloat(oldValue) - 1;
                decrementCartProductQuantity(product);

            } else {
                newVal = 0;
            }
        }



        $button.parent().find('input').val(newVal);
        $button.parent().find('input').change(updateTotalPrice());
    }
}

function deleteFromCartProduct(product){
    console.log("in delete");
    var $button = $(this);
    $button.parent().parent().remove();
    updateTotalPrice();
    removeFromCart(product)

}


function updateTotalPrice() {

    var totalPriceSummation = 0;
    var cartItemContainer = document.getElementsByClassName('cart-items')[0];
    var cartRows = cartItemContainer.getElementsByClassName('cart-row');
    for (var i = 0; i < cartRows.length; i++) {

        var cartRow = cartRows[i];
        var priceElement = cartRow.getElementsByClassName('p-price')[0];
        var totalPriceElement = cartRow.getElementsByClassName('total-price')[0];
        var priceValue = priceElement.innerText.replace('$', '');

        var quantityElement = cartRow.getElementsByClassName('pro-qty-input')[0];
        var quantityValue = quantityElement.value;
        console.log("quantity= " + quantityValue + " priceElement= " + priceValue);

        var totalPriceValue = priceValue * quantityValue;
        totalPriceElement.innerHTML = "$" + parseFloat(totalPriceValue);
        var totalPriceSummation = totalPriceSummation + totalPriceValue;


    }
    var cartTotal = document.getElementsByClassName('cart-total')[0].children[0].innerHTML = "$" + parseFloat(totalPriceSummation);
}

function incrementCartProductQuantity(product) {
    if (window.XMLHttpRequest)
        req = new XMLHttpRequest();
    else if (window.ActiveXObject)
        req = new ActiveXObject(Microsoft.XMLHTTP);
    var add = "addplus";
    url = "addproducttocart" + "?productid=" + product + "&action=" + add + "&timeStamp=" + new Date().getTime();
    req.open("GET", url, true);
    req.onreadystatechange = handleStateChange(product);
    req.send(null);

}
function decrementCartProductQuantity(product) {
    if (window.XMLHttpRequest)
        req = new XMLHttpRequest();
    else if (window.ActiveXObject)
        req = new ActiveXObject(Microsoft.XMLHTTP);
    var add = "addminus";
    url = "addproducttocart" + "?productid=" + product + "&action=" + add + "&timeStamp=" + new Date().getTime();
    req.open("GET", url, true);
    req.onreadystatechange = handleStateChange(product);
    req.send(null);

}

function handleStateChange(product) {
    if (req.readyState == 4 && req.status == 200) {
        //        document.getElementById('addalert').innerHTML += `
        //        <div class="alert success">
        //            <span class="closebtn">&times;</span>
        //            <strong>Success!</strong> product ${product} successfully added to your cart.
        //        </div>`;

        //            xmlvalue = req.responseText;
        //            document.getElementById("status").value = xmlvalue;
        console.log("haraaaaaaaa");
    }
}

function removeFromCart(product) {
    if (window.XMLHttpRequest)
        req = new XMLHttpRequest();
    else if (window.ActiveXObject)
        req = new ActiveXObject(Microsoft.XMLHTTP);
    var deleteFromCarrt = "delete";
    url = "addproducttocart" + "?productid=" + product + "&action=" + deleteFromCarrt;
    req.open("GET", url, true);
    req.onreadystatechange = handleStateChangeDelete;
    req.send(null);

}


function handleStateChangeDelete() {
    if (req.readyState == 4 && req.status == 200) {
        //            xmlvalue = req.responseText;
        //            document.getElementById("status").value = xmlvalue;
        console.log("haraaaaaaaa");
    }
}


