var loadCategories = function () {
    if (window.XMLHttpRequest) {
        request = new XMLHttpRequest();
    } else if (window.ActiveXObject) {
        request = new ActiveXObject("Microsoft.XMLHTTP");
    }

    request.onreadystatechange = getCategoryList
    request.open('GET', 'categoryload?t=' + new Date().getTime(), true);
    request.send(null);
}

var getCategoryList = function () {
    if (request.readyState == 4 && request.status == 200) {
        var ul = document.getElementById("list");
        var li = document.createElement("li");

        var categories = JSON.parse(request.responseText);

        for (var i = 0; i < categories.length; i++) {
            var a = document.createElement("a");
            var newItem = document.createElement("li");
            a.textContent = categories[i].categoryName;
            a.setAttribute('href', "products?category=" + categories[i].categoryName);
            newItem.appendChild(a);
            ul.appendChild(newItem);
        }

    }
}

function addToCart(id){
    $.ajax({
        url: 'addproducttocartplus?t='+new Date().getTime(),
        type: 'POST',
        data: jQuery.param({ productId: id}) ,
        contentType: 'application/x-www-form-urlencoded; charset=UTF-8',
        success: function (response) {
            document.getElementById("cartNumber").innerText=response;
        },
    });
}
