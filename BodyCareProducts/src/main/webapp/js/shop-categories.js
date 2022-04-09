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

var req;
function addToCart(productId) {
    if (window.XMLHttpRequest)
        req = new XMLHttpRequest();
    else if (window.ActiveXObject)
        req = new ActiveXObject(Microsoft.XMLHTTP);

    url = "addproducttocart" + "?productid=" + productId + "&timeStamp=" + new Date().getTime();
    req.open("GET", url, true);
    req.onreadystatechange = handleStateChange;
    req.send();

}

function handleStateChange() {
        if (req.readyState == 4 && req.status == 200) {
//            xmlvalue = req.responseText;
//            document.getElementById("status").value = xmlvalue;
              console.log("haraaaaaaaa");
        }
    }
