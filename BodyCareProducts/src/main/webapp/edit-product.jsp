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

    <!-- Header Section Begin -->

    <header class="header-section">
        <div class="container">
            <div class="inner-header">
                <div class="row">
                    <div class="col-lg-2 col-md-2">
                        <div class="logo">
                            <a href="./index.html">
                                <img src="img/logo.png" alt="">
                            </a>
                        </div>
                    </div>
                    <div class="col-lg-5 col-md-5">
                        <div class="advanced-search">
                            <!-- <button type="button" class="category-btn">All Categories</button> -->
                            <form action="#" class="input-group" name="myRegisterForm" id="myRegisterForm">
                                <input type="text" placeholder="What do you need?">
                                <button type="button"><i class="ti-search"></i></button>
                            </form>
                        </div>
                    </div>
                    <div class="col-lg-2 text-right col-md-2">
                        <ul class="nav-right">
                            <li class="heart-icon"><a href="#">
                                    <i class="icon_heart_alt"></i>
                                    <span>1</span>
                                </a>
                            </li>
                            <li class="cart-icon"><a href="#">
                                    <i class="icon_bag_alt"></i>
                                    <span>3</span>
                                </a>
                                <div class="cart-hover">
                                    <div class="select-items">
                                        <table>
                                            <tbody>
                                                <tr>
                                                    <td class="si-pic"><img src="img/select-product-1.jpg" alt=""></td>
                                                    <td class="si-text">
                                                        <div class="product-selected">
                                                            <p>$60.00 x 1</p>
                                                            <h6>Kabino Bedside Table</h6>
                                                        </div>
                                                    </td>
                                                    <td class="si-close">
                                                        <i class="ti-close"></i>
                                                    </td>
                                                </tr>
                                                <tr>
                                                    <td class="si-pic"><img src="img/select-product-2.jpg" alt=""></td>
                                                    <td class="si-text">
                                                        <div class="product-selected">
                                                            <p>$60.00 x 1</p>
                                                            <h6>Kabino Bedside Table</h6>
                                                        </div>
                                                    </td>
                                                    <td class="si-close">
                                                        <i class="ti-close"></i>
                                                    </td>
                                                </tr>
                                            </tbody>
                                        </table>
                                    </div>
                                    <div class="select-total">
                                        <span>total:</span>
                                        <h5>$120.00</h5>
                                    </div>
                                    <div class="select-button">
                                        <a href="#" class="primary-btn view-card">VIEW CARD</a>
                                        <a href="#" class="primary-btn checkout-btn">CHECK OUT</a>
                                    </div>
                                </div>
                            </li>
                            <li class="cart-price">$150.00</li>
                        </ul>
                    </div>

                    <div class="col-lg-3 col-md-3">
                        <div>
                            <button class="btn primary-btn sign-in">Sign in</button>
                            <button class="btn primary-btn sign-in">Sign up</button>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <div class="nav-item ">
            <div class="container">
                <div class="nav-depart">
                    <div class="depart-btn">
                        <i class="ti-menu"></i>
                        <span>All Categories</span>
                        <ul class="depart-hover">
                            <li class="active"><a href="#">Bath & Shower</a></li>
                            <li><a href="#">Fragrance</a></li>
                            <li><a href="#">Candles</a></li>
                        </ul>
                    </div>
                </div>
                <nav class="nav-menu mobile-menu">
                    <ul>
                        <li><a href="./index.html">Home</a></li>
                        <li><a href="./shop.html">Shop</a></li>
                        <!--
                            <li><a href="#">Collection</a>
                                <ul class="dropdown">
                                    <li><a href="#">Men's</a></li>
                                    <li><a href="#">Women's</a></li>
                                    <li><a href="#">Kid's</a></li>
                                </ul>
                            </li>
                            <li><a href="./blog.html">Blog</a></li>
                        -->
                        <li><a href="./contact.html">Contact</a></li>
                        <li><a href="./contact.html"> Cart</a></li>
                        <li><a href="./contact.html">Wishlist</a></li>
                        <li><a href="./contact.html">Check-out</a></li>
                        <!--
                        <li><a href="#">Pages</a>
                            <ul class="dropdown">
                                <li><a href="./blog-details.html">Blog Details</a></li>
                                <li><a href="./shopping-cart.html">Shopping Cart</a></li>
                                <li><a href="./check-out.html">Checkout</a></li>
                                <li><a href="./faq.html">Faq</a></li>
                                <li><a href="./register.html">Register</a></li>
                                <li><a href="./login.html">Login</a></li>
                            </ul>
                        </li>
                        -->
                    </ul>
                </nav>
                <div id="mobile-menu-wrap"></div>
            </div>
        </div>
    </header>
    <!-- Header End -->

    <!-- Breadcrumb Section Begin -->
    <!--<div class="breacrumb-section">

        <div class="container">
            <div class="row">
                <div class="col-lg-12">
                    <div class="breadcrumb-text">
                        <a href="#"><i class="fa fa-home"></i> Home</a>
                        <span>Login</span>
                    </div>
                </div>
            </div>
        </div>
    </div>-->
    <!-- Breadcrumb Form Section Begin -->

    <!-- Register Section Begin -->
    <div class="container-fluid pageBody ">
        <div class="register-login-section spad">
            <div class="container ">
                <div class="row">
                    <div class="col-lg-8 m-auto">
                        <div class="card px-4 py-4" style="color:white;border-radius: 15px;background-color: #f5f5f5;">
                            <div class="card-body">
                                <div class="register-form">
                                    <h2>Edit product</h2>

                                    <form action="#" id="myRegisterForm" name="myRegisterForm" class="row g-3">

                                        <!--  Name -->

                                        <div class="col-md-6">
                                            <div class="group-input ">
                                                <label for="productName" class="registerLabel">Name *</label>
                                                <input type="text" id="productName" name="productName"
                                                    class="defaultBorders " required>

                                                <i class="fa fa-check-circle" aria-hidden="true"></i><br>
                                                <i class="fa fa-exclamation-circle" aria-hidden="true"></i>

                                                <small style="color: rgb(238, 0, 0);font-size: 12px;"></small>

                                            </div>
                                        </div>

                                        <!-- Price -->
                                        <div class="col-md-6">
                                            <div class="group-input defaultBorders ">
                                                <label for="price" class="registerLabel">Price *</label>
                                                <input type="text" id="price" name="price" class="defaultBorders "
                                                    required>
                                                <i class="fa fa-check-circle" aria-hidden="true"></i><br>
                                                <i class="fa fa-exclamation-circle" aria-hidden="true"></i>

                                                <small style="color: rgb(238, 0, 0);font-size: 12px;"></small>

                                            </div>
                                        </div>

                                        <!-- Description-->

                                        <div class="col-md-12">
                                            <div class="group-input ">
                                                <label for="description" class="registerLabel">Description *</label>
                                                <input type="email" id="description" name="description"
                                                    class="defaultBorders" required>
                                                <i class="fa fa-check-circle" aria-hidden="true"></i><br>
                                                <i class="fa fa-exclamation-circle" aria-hidden="true"></i>

                                                <small style="color: rgb(238, 0, 0);font-size: 12px;"></small>
                                            </div>
                                        </div>

                                        <!-- Category -->

                                        <div class="col-md-6 defaultBorders">
                                            <label for="countriesLabel"
                                                class="form-label registerLabel">Categories *</label>
                                            <select id="category" name="category" class="form-select selectRegion"
                                                style="margin-top: 13px;border-radius: 15px;">
                                                <option value="Afghanistan">Bath & Shower</option>
                                                <option value="Åland Islands">Fragrance</option>
                                                <option value="Åland Islands">Candles</option>
                                            </select>
                                        </div>
                                        <!-- PHONENUMBER -->
                                        <div class="col-md-6">
                                            <div class="group-input defaultBorders ">
                                                <label for="quantity" class="registerLabel">Quantity *</label>
                                                <input type="number" id="quantity" name="quantity"
                                                    class="defaultBorders " required>
                                                <i class="fa fa-check-circle" aria-hidden="true"></i><br>
                                                <i class="fa fa-exclamation-circle" aria-hidden="true"></i>

                                                <small style="color: rgb(238, 0, 0);font-size: 12px;"></small>

                                            </div>
                                        </div>

                                        <!-- Image -->

                                        <div class="col-md-12 mb-3">
                                            <div class="defaultBorders">
                                                <label for="productImage" class="registerLabel">Image *</label>
                                                <input class="form-control form-control-lg product-image" type="file" id="formFileMultiple" id="productImage"  class="defaultBorders" name="productImage" required>
                                              
                                            </div>
                                        </div>

                                        <div class="col-md-12" style="text-align: center;">
                                            <button type="submit" class="site-btn register-btn defaultBorders"
                                                style="width: 30vw;" id="register">Edit Product</button>
                                        </div>

                                    </form>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
    <!-- Register Form Section End -->


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