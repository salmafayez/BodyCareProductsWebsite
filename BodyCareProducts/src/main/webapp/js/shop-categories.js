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
        url: 'addproducttocart?t='+new Date().getTime(),
        type: 'POST',
        data: jQuery.param({ productId: id}) ,
        contentType: 'application/x-www-form-urlencoded; charset=UTF-8',
        success: function (response) {
            document.getElementById("cartNumber").innerText=response;
        },
    });
}

//
//var req;
//function addToCart(product) {
//    if (window.XMLHttpRequest)
//        req = new XMLHttpRequest();
//    else if (window.ActiveXObject)
//        req = new ActiveXObject(Microsoft.XMLHTTP);
//    var add = "addplus";
//    url = "addproducttocart" + "?productid=" + product + "&action=" + add + "&timeStamp=" + new Date().getTime();
//    req.open("GET", url, true);
//    req.onreadystatechange = handleStateChange(product);
//    req.send(null);
//
//}
//
//function handleStateChange(product) {
//    if (req.readyState == 4 && req.status == 200) {
//        document.getElementById("cartNumber").innerText=response;
//
//        //        document.getElementById('addalert').innerHTML += `
//        //        <div class="alert success">
//        //            <span class="closebtn">&times;</span>
//        //            <strong>Success!</strong> product ${product} successfully added to your cart.
//        //        </div>`;
//
//        //            xmlvalue = req.responseText;
//        //            document.getElementById("status").value = xmlvalue;
//        console.log("haraaaaaaaa");
//    }
//}
//
//function removeFromCart(product) {
//    if (window.XMLHttpRequest)
//        req = new XMLHttpRequest();
//    else if (window.ActiveXObject)
//        req = new ActiveXObject(Microsoft.XMLHTTP);
//    var deleteFromCarrt = "delete";
//    url = "addproducttocart" + "?productid=" + product + "&action=" + deleteFromCarrt;
//    req.open("GET", url, true);
//    req.onreadystatechange = handleStateChangeDelete;
//    req.send(null);
//
//}
//
//function handleStateChangeDelete() {
//    if (req.readyState == 4 && req.status == 200) {
//        //            xmlvalue = req.responseText;
//        //            document.getElementById("status").value = xmlvalue;
//        console.log("haraaaaaaaa");
//    }
//}
