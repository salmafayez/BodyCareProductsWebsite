console.log("wroking cart");
updateTotalPrice();

/*-------------------
        Quantity change
    --------------------- */

var proQty = $('.pro-qty');
proQty.on('click', '.qtybtn', function () {
    // var productId = document.getElementById('productid').value;
    // console.log(productId);
    var $button = $(this);
    // var parentId =$button.parent().parent().parent().id;
    var parentId =$button.closest("tr").attr("id");
     var productId =parentId.substring(10);
    console.log("in button click product id = "+ parentId);
    console.log("in button click product id = "+ productId);
    
        var oldValue = $button.parent().find('input').val();
        if (parseFloat(oldValue) <= parseFloat(10)) {
            if ($button.hasClass('inc')) {
                console.log("in" + oldValue);

                if (parseFloat(oldValue) == parseFloat(10)) {
                    newVal = 10;
                } else {
                    var newVal = parseFloat(oldValue) + 1;
                    $.ajax({
                            url: 'addproducttocartplus?t='+new Date().getTime(),
                            type: 'POST',
                            data: jQuery.param({ productId: productId}) ,
                            contentType: 'application/x-www-form-urlencoded; charset=UTF-8',
                            success: function (response) {
                                document.getElementById("cartNumber").innerText=response;
                            },
                        });
                }


                console.log("in copy main jquery")
                //   updateTotalPrice()
            } else {
                // Don't allow decrementing below zero
                if (oldValue > 0) {
                    var newVal = parseFloat(oldValue) - 1;
                     $.ajax({
                            url: 'addproducttocartminus?t='+new Date().getTime(),
                            type: 'POST',
                            data: jQuery.param({ productId: productId}) ,
                            contentType: 'application/x-www-form-urlencoded; charset=UTF-8',
                            success: function (response) {
                                document.getElementById("cartNumber").innerText=response;
                            },
                        });
                } else {
                    newVal = 0;
                }
            }



            $button.parent().find('input').val(newVal);
            $button.parent().find('input').change(updateTotalPrice());
        }});

var deleteButton = $('.ti-close');
deleteButton.on('click', function () {
    
    var $button = $(this);
    
    var parentId =$button.closest("tr").attr("id");
     var productId =parentId.substring(10);

    console.log("in delete product id = "+ parentId);
    console.log("in delete product id = "+ productId);
    $button.parent().parent().remove();
    
    updateTotalPrice();
    
    $.ajax({
            url: 'removeproductfromcart?t='+new Date().getTime(),
            type: 'POST',
            data: jQuery.param({ productId: productId}) ,
            contentType: 'application/x-www-form-urlencoded; charset=UTF-8',
            success: function (response) {
                // document.getElementById("cartNumber").innerText=response;
            },
        });

   

});


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
    // cart total:
     document.getElementsByClassName('cart-total')[0].children[0].innerHTML = "$" + parseFloat(totalPriceSummation);
     console.log("totalprice summation="+totalPriceSummation);

     if(totalPriceSummation == 0){
        console.log("hereeee 0")
        window.location.replace("shopping-cart"); 
     }
     
}


$( "#cartNumber" ).load(function() {
  $.ajax({
          url: 'addproducttocartplus?t='+new Date().getTime(),
          type: 'GET',
          data: jQuery.param({ productId: id}) ,
          contentType: 'application/x-www-form-urlencoded; charset=UTF-8',
          success: function (response) {
              document.getElementById("cartNumber").innerText=response;
          },
      });
});


