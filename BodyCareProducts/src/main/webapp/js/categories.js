var loadCategories = function(){
    console.log("categro!!");

    if(window.XMLHttpRequest){
        request = new XMLHttpRequest();
    }else if(window.ActiveXObject){
        request = new ActiveXObject("Microsoft.XMLHTTP");
    }

    request.onreadystatechange = getCategoryList
    request.open('GET','categoryload?t='+new Date().getTime(),true);
    request.send(null);

}

var getCategoryList = function(){
    if(request.readyState == 4 && request.status == 200){
        temp="";
        var categories = JSON.parse(request.responseText);
        for (var i = 0; i < categories.length; i++) {
            temp+="<option value=\""+categories[i].categoryName+"\">"+categories[i].categoryName+"</option>";
        }
        document.getElementById("category").innerHTML = temp;
    }
}
