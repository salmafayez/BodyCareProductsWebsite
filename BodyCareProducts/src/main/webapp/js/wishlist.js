
function addToWishlist(id){
    $.ajax({
        url: 'wishlist?t='+new Date().getTime(),
        type: 'POST',
        data: jQuery.param({ productId: id}) ,
        contentType: 'application/x-www-form-urlencoded; charset=UTF-8',
        success: function (response) {
            document.getElementById("wishlistNumber").innerText=response;
        },
    }); 
}

function removeFromWishlist(id){
    $.ajax({
        url: 'wishlist-remove?t='+new Date().getTime(),
        type: 'POST',
        data: jQuery.param({ productId: id}) ,
        contentType: 'application/x-www-form-urlencoded; charset=UTF-8',
        success: function (response) {
            document.getElementById("wishlistNumber").innerText=response;
        },
    }); 
}

var deleteButton = $('.ti-close');
deleteButton.on('click', function () {
    var $button = $(this);
    $button.parent().parent().remove();
});


