

var addToWishli = function(id){
    if(window.XMLHttpRequest){
        request = new XMLHttpRequest();
    }else if(window.ActiveXObject){
        request = new ActiveXObject("Microsoft.XMLHTTP");
    }

    request.onreadystatechange = getCategoryList
    request.open('POST','wishlist?t='+new Date().getTime(),true);
    request.send("productId"+id);
}

var getCategoryList = function(){
    if(request.readyState == 4 && request.status == 200){
        var wishlistCount = parseInt(request.responseText);
        console.log(request.responseText);
        console.log(wishlistCount);
        document.getElementById("wishlistNumber").innerText = wishlistCount;
    }
}

function addToWishlist(id){
    $.ajax({
        url: 'wishlist?t='+new Date().getTime(),
        type: 'POST',
        data: jQuery.param({ productId: id}) ,
        contentType: 'application/x-www-form-urlencoded; charset=UTF-8',
        success: function (response) {
            console.log(response);
        },
    }); 
}


