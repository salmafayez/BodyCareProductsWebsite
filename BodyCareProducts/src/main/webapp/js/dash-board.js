var loadData = function () {
    if (window.XMLHttpRequest) {
        request = new XMLHttpRequest();
    } else if (window.ActiveXObject) {
        request = new ActiveXObject("Microsoft.XMLHTTP");
    }
    request.onreadystatechange = getCategoryList
    request.open('GET', 'loadadmindata?t=' + new Date().getTime(), true);
    request.send(null);
}

var getCategoryList = function () {
    if (request.readyState == 4 && request.status == 200) {
        //document.getElementById("numberofusers").innerText=response;
        console.log("hareaain ajkjkbckbkbkasj")
    }
}
