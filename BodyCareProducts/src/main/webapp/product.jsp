<!DOCTYPE html>
<html lang="zxx">

<head>
   <head>
    <meta charset="UTF-8">
    <meta name="description" content="Fashi Template">
    <meta name="keywords" content="Fashi, unica, creative, html">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Product Details</title>

    <%@ include file="commons-styles.jsp" %>

</head>

    <!-- Google Font -->
    <link href="https://fonts.googleapis.com/css?family=Muli:300,400,500,600,700,800,900&display=swap" rel="stylesheet">

    <!-- Css Styles -->
     <link rel="stylesheet" href="css/product.css" type="text/css">
    <link rel="stylesheet" href="css/bootstrap.min.css" type="text/css">
    <link rel="stylesheet" href="css/font-awesome.min.css" type="text/css">
    <link rel="stylesheet" href="css/themify-icons.css" type="text/css">
    <link rel="stylesheet" href="css/elegant-icons.css" type="text/css">
    <link rel="stylesheet" href="css/owl.carousel.min.css" type="text/css">
    <link rel="stylesheet" href="css/nice-select.css" type="text/css">
    <link rel="stylesheet" href="css/jquery-ui.min.css" type="text/css">
    <link rel="stylesheet" href="css/slicknav.min.css" type="text/css">
    <link rel="stylesheet" href="css/style.css" type="text/css">
   

</head>

<body>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

    <!-- Page Preloder -->
   <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

    <div id="preloder">
        <div class="loader"></div>
    </div>

    <%@ include file="header.jsp" %>

    <!-- Header Section Begin -->
   
    <!-- Breadcrumb Section Begin -->

    <!-- Product Shop Section Begin -->
    <section class="product-shop spad page-details">
    
         <div class="container" id = "center">
                <div class="col-lg-9">
                    <div class="row">
                        <div class="col-lg-6">
                            <div class="product-pic-zoom">
                                <img src="img/products/product-3.jpg" alt="">
                            
                            </div>
                            
                        </div> 
                        <div class="col-lg-6">
                            <div class="product-details">
                                <div class="pd-title">
                                    <span>${product.categoryName}</span>
                                
                                    <h4>${product.name}</h4>
                                    <br>
                                    <div class="pd-desc">
                                     <h4 >EGP ${product.price}</h4>
                                    </div>
                                    <a href="#" class="heart-icon"><i class="icon_heart_alt"  onclick="addToWishlist(${product.id})"></i></a>
                                </div>
                                
                                  <hr size="8" width="100%" color="#d79681">  

                                <div class="pd-desc">
                                <h5>Product Description</h5>
                                    <p>${product.description}</p>
                                    <hr size="8" width="100%" color="#d79681">  
                                    <br>
                                </div>
                               
                                <div class="quantity" id="outer">
                                     <div id = "increment_container" >            
                                    <!-- adding button and heading to show the digits -->
                                    <!--increment() and decrement() functions on button click-->
                                         
                                          <%-- <div class="inner">
                                         
                                            <button onclick="increment()"  class ="myButton" >+</button> </div> 
                                            <div class="inner"><h2 id="counting"></h2></div>
                                             
                                            <div class="inner"><button onclick="decrement()" class = "myButton">-</button></div>
                                          
                                         </div>     --%>

                                    </div>
                                    <br>

                           <div class="col-md-12" style="text-align: center;">
                                           <a href="#"> <ul class="site-btn register-btn defaultBorders"
                                                style="width: 20vw;" id="register" onclick="addToCart(${product.id})">ADD TO CART</ul></a>
                                                
                               
                            </div>
                        </div>
                    
                  
                </div>
            </div>
        </div>
    </section>
    <!-- Product Shop Section End -->

    <!-- Related Products Section End -->
    
    <!-- Footer Section End -->

    <%@ include file="footer.jsp" %>
    <%@ include file="commons-js.jsp" %>
    <script src="js/shop-categories.js" type="text/javascript"></script>
    <script src="js/wishlist-ajax.js" type="text/javascript"></script>
    <script src="js/IncrementProduct.js" type="text/javascript"></script>


</body>

</html>