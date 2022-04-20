var data = 0;
  
//printing default value of data that is 0 in h2 tag
document.getElementById("counting").innerText = data;
  
//creation of increment function
function increment() {
    if (data < 10){
    data = data + 1;
    document.getElementById("counting").innerText = data;}
}
//creation of decrement function
function decrement() {
    if (data >= 1){
        data = data - 1;
        document.getElementById("counting").innerText = data;
    }
   
}