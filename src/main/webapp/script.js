function getProducts(str) {
    var request = new XMLHttpRequest();
    request.onreadystatechange = function() {
        if (this.readyState == 4 && this.status ==200) {
            document.getElementById("shop_items").innerHTML = this.responseText;
        }
    }
    request.open("GET","/webshop_war/getTime?category="+str,true)
    request.send();
}
function order(str) {
    var request = new XMLHttpRequest();
    request.onreadystatechange = function() {
        if (this.readyState == 4 && this.status ==200) {
            document.getElementById("ordered_items").innerHTML = this.responseText;
        }
    }
    request.open("POST","/webshop_war/getTime",true)
    request.setRequestHeader("Content-type", "application/x-www-form-urlencoded");
    request.send("productId=" + str);
}
