
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
            document.getElementById("wishlistNumber").innerText=response;
        },
    }); 
}

var deleteButton = $('.ti-close');
deleteButton.on('click', function () {
    var $button = $(this);
    console.log("removeeeee");
    $button.parent().parent().remove();
    var wishlistRows=document.getElementsByClassName('wichListRow');
    console.log("rows"+wishlistRows);
    if(wishlistRows.length == 0){
        console.log("hi");
        var child = document.getElementById("tableChild");
        var parent = document.getElementById("tableParent");
        

        

        // Delete child
        parent.removeChild(child);
        
        document.getElementById('emptyMessage').innerHTML='<h4 style="display:flex;align-items: center;justify-content: center;">Emptyyy WishList</h4>';
    }
});


