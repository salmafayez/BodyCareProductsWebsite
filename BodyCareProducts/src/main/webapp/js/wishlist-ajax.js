
function addToWishlist(id){
    $.ajax({
        url: 'wishlist-add?t='+new Date().getTime(),
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
            var number = parseInt(response);
            if(number != 0){
                document.getElementById("wishlistNumber").innerText=response;
            }else{
            $.ajax({
                    url: 'empty-wishlist?t='+new Date().getTime(),
                    type: 'GET',
                    contentType: 'application/x-www-form-urlencoded; charset=UTF-8',
                });
            }
        },
    }); 
}

var deleteButton = $('.ti-close');
deleteButton.on('click', function () {
    var $button = $(this);
    $button.parent().parent().remove();
});


