document.getElementById("minamount").value = localStorage.getItem("min");
document.getElementById("maxamount").value = localStorage.getItem("max");


function saveComment() {
    var min = document.getElementById("minamount").value;
    var max = document.getElementById("maxamount").value;
    if (min == "" ) {
        return false;
    }

    localStorage.setItem("max", max);
    localStorage.setItem("min", min);
    
    location.reload();
    return false;
    //return true;
}