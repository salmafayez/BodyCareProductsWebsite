<!DOCTYPE html>
<html lang="zxx">

<head>
    <meta charset="UTF-8">
    <meta name="description" content="Fashi Template">
    <meta name="keywords" content="Fashi, unica, creative, html">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Fashi | Template</title>
    <link rel="stylesheet" href="https://ajax.googleapis.com/ajax/libs/jqueryui/1.12.1/themes/smoothness/jquery-ui.css">

    <%@ include file="commons-styles.jsp" %>
</head>

<body>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

    <!-- Page Preloder -->
   
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

            <!-- Page Preloder -->
            <div id="preloder">
                <div class="loader"></div>
            </div>

            <%@ include file="header.jsp" %>
                <!-- Hero Section Begin -->
                <section class="hero-section">
                    <div class="hero-items owl-carousel">
                        <div class="single-hero-items set-bg" data-setbg="img/index/slider2.jpg">
                            <div class="container">
                                <div class="row">
                                    <div class="col-lg-5">
                                        <h1>Body Care</h1>
                                        <p>FATAKAT Works is your go-to place for gifts & goodies that surprise & delight.
                                       </p>
                                        <a href="products" class="primary-btn">Shop Now</a>
                                    </div>
                                </div>
                                <!--
                        <div class="off-card">
                            <h2>Sale <span>50%</span></h2>
                        </div>
                    -->
                            </div>
                        </div>
                        <div class="single-hero-items set-bg" data-setbg="img/index/slider1.jpg">
                            <div class="container">
                                <div class="row">
                                    <div class="col-lg-5">
                                        <h1>Body Care</h1>
                                        <p> Fresh
                                        fragrances to soothing skin care, we make finding your perfect something special
                                        a
                                        happy-memory-making experience.</p>
                                        <a href="#" class="primary-btn">Shop Now</a>
                                    </div>
                                </div>
                                <!--
                        <div class="off-card">
                            <h2>Sale <span>50%</span></h2>
                        </div>
                    -->
                            </div>
                        </div>

                        <div class="single-hero-items set-bg" data-setbg="img/index/slider3.jpg">
                            <div class="container">
                                <div class="row">
                                    <div class="col-lg-5">
                                        <h1>Body Care</h1>
                                        <p> Oh! And while you're browsing, shop our latest &
                                        greatest
                                        selection of lotions, soaps and candles!</p>
                                        <a href="#" class="primary-btn">Shop Now</a>
                                    </div>
                                </div>
                                <!--
                        <div class="off-card">
                            <h2>Sale <span>50%</span></h2>
                        </div>
                    -->
                            </div>
                        </div>
                    </div>
                </section>
                <!-- Hero Section End -->

                <!-- Banner Section Begin -->
                <div class="banner-section spad">
                    <div class="container-fluid">
                        <div class="row">
                            <div class="col-lg-4">
                            <a href="products?category=Bath and shower">
                                <div class="single-banner">
                               
                                
                                    <img src="img/index/shower.jpg" alt="">
                                   
                                    <div class="inner-text">

                                        <h4>Bath & Shower</h4>
                                    </div>
                                </div>
                                 </a>
                            </div>



                            <div class="col-lg-4">
                            <a href="products?category=Fragrance">
                                <div class="single-banner">
                                
                                    <img src="img/index/fragrance.jpg" alt="">
                                   
                                    <div class="inner-text"> 
                                        <h4>Fragrance</h4>
                                    </div>
                                </div>
                                 </a>
                            </div>


                            <div class="col-lg-4">
                            <a href="products?category=candels">
                                <div class="single-banner">
                                
                                    <img src="img/index/candles.jpg" alt="">
                                   
                                    <div class="inner-text">
                                        <h4>Candles</h4>
                                </div> </div> </a>
                            </div>
                                
                           
                        </div>
                    </div>
                </div>
                <!-- Banner Section End -->

                <!-- Women Banner Section Begin -->
                <section class="women-banner spad">
                    <div class="container-fluid">
                        <div class="row">
                            <div class="col-lg-3">
                                <div class="product-large set-bg" data-setbg="img/index/sideImage.jpg">
                                   
                                </div>
                            </div>
                            <div class="col-lg-8 offset-lg-1">
                               
                                <div class="product-slider owl-carousel">
                                    <div class="product-item">
                                        <div class="pi-pic">
                                            <img src="img/index/woman1.jpg" alt="">
                                            <%-- <div class="icon">
                                                    <a href="#" class="heart-icon"><i class="icon_heart_alt"  onclick="addToWishlist(${product.id})"></i></a>
                                            </div> --%>
                                               <%-- <ul>
                                                    <li class="w-icon active"><a href="shopping-cart.jsp"><i
                                                                class="icon_bag_alt"></i></a></li>
                                                   <a href="#"> <ul class="site-btn register-btn defaultBorders"
                                                style="width: 20vw;" id="register" onclick="addToCart(${product.id})">ADD TO CART</ul></a>
                                              
                                                </ul> --%>
                                        </div>
                                         <c:forEach items="${products}" var="product">  
 
                                        <div class="pi-text">
                                            <div class="catagory-name">${product.categoryName}</div>
                                            <a href="product?id=${product.id}">
                                                <h5>${product.name}</h5>
                                            </a>
                                            <div class="product-price">
                                                ${product.price}
                                                <%-- <span>$35.00</span> --%>
                                            </div>
                                        </div>
                                    </div>
                                    
                                    <div class="product-item">
                                        <div class="pi-pic">
                                        <a href="product?id=${product.id}">
                                            <img src=" ${product.price}" alt="">
                                            <%-- </a>
                                            <div class="icon">
                                               
                                                <ul>
                                                    <li class="w-icon active"><a href="shopping-cart.jsp"><i
                                                                class="icon_bag_alt"></i></a></li>
                                                     <a href="#"> <ul class="site-btn register-btn defaultBorders"
                                                style="width: 20vw;" id="register" onclick="addToCart(${product.id})">ADD TO CART</ul></a>
                                              
                                                </ul>
                                          
                                        </div> --%>
                                        </div>
                                        </c:forEach>

                                        <%-- <div class="pi-text">
                                            <div class="catagory-name">Shoes</div>
                                            <a href="#">
                                                <h5>Guangzhou sweater</h5>
                                            </a>
                                            <div class="product-price">
                                                $13.00
                                            </div>
                                        </div>
                                    </div>



                                    <div class="product-item">
                                        <div class="pi-pic">
                                            <img src="img/index/woman3.jpg" alt="">
                                            <div class="icon">
                                                <i class="icon_heart_alt"></i>
                                            </div>
                                            <ul>
                                                <li class="w-icon active"><a href="#"><i class="icon_bag_alt"></i></a>
                                                </li>
                                                <li class="quick-view"><a href="#">+ ADD TO CART</a></li>
                                            </ul>
                                        </div>
                                        <div class="pi-text">
                                            <div class="catagory-name">Towel</div>
                                            <a href="#">
                                                <h5>Pure Pineapple</h5>
                                            </a>
                                            <div class="product-price">
                                                $34.00
                                            </div>
                                        </div>
                                    </div>
                                    <div class="product-item">
                                        <div class="pi-pic">
                                            <img src="img/index/woman4.jpg" alt="">
                                            <div class="icon">
                                                <i class="icon_heart_alt"></i>
                                            </div>
                                            <ul>
                                                <li class="w-icon active"><a href="#"><i class="icon_bag_alt"></i></a>
                                                </li>
                                                <li class="quick-view"><a href="#">+ Quick View</a></li>
                                            </ul>
                                        </div>
                                        <div class="pi-text">
                                            <div class="catagory-name">Towel</div>
                                            <a href="#">
                                                <h5>Converse Shoes</h5>
                                            </a>
                                            <div class="product-price">
                                                $34.00
                                            </div>
                                        </div></div>
                                     --%>
                                </div>
                            </div>
                        </div>
                    </div>
                </section>
                <!-- Women Banner Section End -->

  
                <!-- Instagram Section End -->

                <!-- Latest Blog Section Begin -->
                <section class="latest-blog spad">
                    <div class="container">
                        <div class="row">
                            <div class="col-lg-12">
                                <div class="section-title">
                                    <h2>Fatakat</h2>
                                </div>
                            </div>
                        </div>
                        <div class="row">
                            <div class="col-lg-12">
                                <div class="section-title">
                                    <p>FATAKAT Works is your go-to place for gifts & goodies that surprise & delight.
                                        From fresh
                                        fragrances to soothing skin care, we make finding your perfect something special
                                        a
                                        happy-memory-making experience. Oh! And while you're browsing, shop our latest &
                                        greatest
                                        selection of lotions, soaps and candles!</p>
                                </div>
                            </div>
                        </div>
                        <div class="benefit-items">
                            <div class="row">
                                <div class="col-lg-4">
                                    <div class="single-benefit">
                                        <div class="sb-icon">
                                            <img src="img/icon-1.png" alt="">
                                        </div>
                                        <div class="sb-text">
                                            <h6>Free Shipping</h6>
                                            <p>For all order over 99$</p>
                                        </div>
                                    </div>
                                </div>
                                <div class="col-lg-4">
                                    <div class="single-benefit">
                                        <div class="sb-icon">
                                            <img src="img/icon-2.png" alt="">
                                        </div>
                                        <div class="sb-text">
                                            <h6>Delivery On Time</h6>
                                            <p>If good have prolems</p>
                                        </div>
                                    </div>
                                </div>
                                <div class="col-lg-4">
                                    <div class="single-benefit">
                                        <div class="sb-icon">
                                            <img src="img/icon-3.png" alt="">
                                        </div>
                                        <div class="sb-text">
                                            <h6>Secure Payment</h6>
                                            <p>100% secure payment</p>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </section>
                <!-- Latest Blog Section End -->

             <%@ include file="footer.jsp" %>
            <%@ include file="commons-js.jsp" %>
            <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
            <script src="https://ajax.googleapis.com/ajax/libs/jqueryui/1.12.1/jquery-ui.min.js"></script>
            <script src="js/shop-categories.js" type="text/javascript"></script>
            <script src="js/wishlist-ajax.js" type="text/javascript"></script>
            <script src="js/shopping-cart.js" type="text/javascript"></script>
            <script src="js/IncrementProduct.js" type="text/javascript"></script>

</body>

</html>