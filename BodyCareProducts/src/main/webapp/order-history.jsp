<!DOCTYPE html>
<html lang="zxx">
<head>
    <meta charset="UTF-8">
    <meta name="description" content="Fashi Template">
    <meta name="keywords" content="Fashi, unica, creative, html">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Fashi | Template</title>

   <%@ include file="commons.jsp" %>
    
</head>

<body>
    <!-- Page Preloder -->
    <div id="preloder">
        <div class="loader"></div>
    </div>

    <%@ include file="header.jsp" %>

    <!-- Breadcrumb Section Begin -->
    <!--
    <div class="breacrumb-section">
        <div class="container">
            <div class="row">
                <div class="col-lg-12">
                    <div class="breadcrumb-text product-more">
                        <a href="./home.html"><i class="fa fa-home"></i> Home</a>
                        <a href="./shop.html">Shop</a>
                        <span>Shopping Cart</span>
                    </div>
                </div>
            </div>
        </div>
    </div>
    -->
    <!-- Breadcrumb Section Begin -->

    <!-- Shopping Cart Section Begin -->
    <div class="container-fluid"
        style="background-image: url(img/background_img.jpg); background-repeat: no-repeat; background-size: cover;">
        <section class="shopping-cart spad">
            <div class="container">
                <div class="row" style="justify-content: center;">
                    <div class="col-lg-3 px-4 py-4" style="background-color: #f5f5f5; border-radius: 15px 0px 0px 15px;">
                        
                        <h4>My Account</h4>
                        <br>
                        <ul class="my-account">
                            <li>
                                <a href="order-history.html" class="active">Orders</a>
                            </li>
                            <li>
                                <a href="contact-details.html" >Contact Details</a>
                            </li>
                        </ul>
                
                    </div>

                    <div class="col-lg-8" style="background-color: #f5f5f5; border-radius: 0px 15px 15px 0px;">
                        <div class="order-history-table">
                            <table>
                                <thead>
                                    <tr>
                                        <th>Order ID</th>
                                        <th>Date</th>
                                        <th>Amount</th>
                                        <th>Status</th>
                                    </tr>
                                </thead>
                                <tbody>
                                    <tr>
                                        <td><a href="#">#10001</a></td>
                                        <td>01/01/2015</td>
                                        <td>$200.00</td>
                                        <td>Delievered</td>
                                      </tr>

                                      <tr>
                                        <td><a href="#">#10002</a></td>
                                        <td>01/02/2020</td>
                                        <td>$450.00</td>
                                        <td>Delievered</td>
                                      </tr>
                                      <tr>
                                        <td><a href="#">#10002</a></td>
                                        <td>01/02/2020</td>
                                        <td>$450.00</td>
                                        <td>Delievered</td>
                                      </tr>
                                      <tr>
                                        <td><a href="#">#10002</a></td>
                                        <td>01/02/2020</td>
                                        <td>$450.00</td>
                                        <td>Delievered</td>
                                      </tr>
                                      <tr>
                                        <td><a href="#">#10002</a></td>
                                        <td>01/02/2020</td>
                                        <td>$450.00</td>
                                        <td>Delievered</td>
                                      </tr>
                                      <tr>
                                        <td><a href="#">#10002</a></td>
                                        <td>01/02/2020</td>
                                        <td>$450.00</td>
                                        <td>Delievered</td>
                                      </tr>
                                      <tr>
                                        <td><a href="#">#10002</a></td>
                                        <td>01/02/2020</td>
                                        <td>$450.00</td>
                                        <td>Delievered</td>
                                      </tr>
                                      <tr>
                                        <td><a href="#">#10002</a></td>
                                        <td>01/02/2020</td>
                                        <td>$450.00</td>
                                        <td>Delievered</td>
                                      </tr>
                                    <!-- <tr>
                                        <td class="cart-pic first-row"><img src="img/cart-page/product-1.jpg" alt=""
                                                style="border-radius: 15px;"></td>
                                        <td class="cart-title first-row">
                                            <h5>Pure Pineapple</h5>
                                        </td>
                                        <td class="p-price first-row">$60.00</td>
                                        <td class="qua-col first-row">
                                            <div class="quantity">
                                                <div class="pro-qty">
                                                    <input type="text" value="1">
                                                </div>
                                            </div>
                                        </td>
                                        <td class="total-price first-row">$60.00</td>
                                        <td class="close-td first-row"><i class="ti-close"></i></td>
                                    </tr> -->
                                </tbody>
                            </table>
                        </div>
                    </div>
                </div>
            </div>
    </div>
    </section>
    </div>

    <!-- Footer Section Begin -->
    <footer class="footer-section">
        <div class="container">
            <div class="row">
                <div class="col-lg-3">
                    <div class="footer-left">
                        <div class="footer-logo">
                            <a href="#"><img src="img/footer-logo.png" alt=""></a>
                        </div>
                        <ul>
                            <li>Address: 60-49 Road 11378 New York</li>
                            <li>Phone: +65 11.188.888</li>
                            <li>Email: hello.colorlib@gmail.com</li>
                        </ul>
                        <div class="footer-social">
                            <a href="#"><i class="fa fa-facebook"></i></a>
                            <a href="#"><i class="fa fa-instagram"></i></a>
                            <a href="#"><i class="fa fa-twitter"></i></a>
                            <a href="#"><i class="fa fa-pinterest"></i></a>
                        </div>
                    </div>
                </div>
                <div class="col-lg-2 offset-lg-1">
                    <div class="footer-widget">
                        <h5>Information</h5>
                        <ul>
                            <li><a href="#">About Us</a></li>
                            <li><a href="#">Checkout</a></li>
                            <li><a href="#">Contact</a></li>
                            <li><a href="#">Serivius</a></li>
                        </ul>
                    </div>
                </div>
                <div class="col-lg-2">
                    <div class="footer-widget">
                        <h5>My Account</h5>
                        <ul>
                            <li><a href="#">My Account</a></li>
                            <li><a href="#">Contact</a></li>
                            <li><a href="#">Shopping Cart</a></li>
                            <li><a href="#">Shop</a></li>
                        </ul>
                    </div>
                </div>
                <div class="col-lg-4">
                    <div class="newslatter-item">
                        <h5>Join Our Newsletter Now</h5>
                        <p>Get E-mail updates about our latest shop and special offers.</p>
                        <form action="#" class="subscribe-form">
                            <input type="text" placeholder="Enter Your Mail">
                            <button type="button">Subscribe</button>
                        </form>
                    </div>
                </div>
            </div>
        </div>
        <div class="copyright-reserved">
            <div class="container">
                <div class="row">
                    <div class="col-lg-12">
                        <div class="copyright-text">
                            <!-- Link back to Colorlib can't be removed. Template is licensed under CC BY 3.0. -->
                            Copyright &copy;
                            <script>document.write(new Date().getFullYear());</script> All rights reserved | This
                            template is made with <i class="fa fa-heart-o" aria-hidden="true"></i> by <a
                                href="https://colorlib.com" target="_blank">Colorlib</a>
                            <!-- Link back to Colorlib can't be removed. Template is licensed under CC BY 3.0. -->
                        </div>
                        <div class="payment-pic">
                            <img src="img/payment-method.png" alt="">
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </footer>
    <!-- Footer Section End -->

    <!-- Js Plugins -->
    <script src="js/jquery-3.3.1.min.js"></script>
    <script src="js/bootstrap.min.js"></script>
    <script src="js/jquery-ui.min.js"></script>
    <script src="js/jquery.countdown.min.js"></script>
    <script src="js/jquery.nice-select.min.js"></script>
    <script src="js/jquery.zoom.min.js"></script>
    <script src="js/jquery.dd.min.js"></script>
    <script src="js/jquery.slicknav.js"></script>
    <script src="js/owl.carousel.min.js"></script>
    <script src="js/main.js"></script>
</body>

</html>