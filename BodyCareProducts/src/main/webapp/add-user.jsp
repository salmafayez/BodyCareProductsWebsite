<!DOCTYPE html>
<html lang="zxx">

<head>
    <meta charset="UTF-8">
    <meta name="description" content="Fashi Template">
    <meta name="keywords" content="Fashi, unica, creative, html">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Fashi | Template</title>

   
    <%@ include file="commons-styles.jsp" %>
</head>

<body>
    <!-- Page Preloder -->
    <div id="preloder">
        <div class="loader"></div>
    </div>

    <!-- Header Section Begin -->
    <header class="header-section">
        <div class="container">
            <!-- <div class="inner-header">
                <div class="row">
                    <div class="col-lg-2 col-md-2">
                        <div class="logo">
                            <a href="./index.jsp">
                                <img src="img/logo.png" alt="">
                            </a>
                        </div>
                    </div>
                    <div class="col-lg-5 col-md-5">
                        <div class="advanced-search" > -->
                            <!-- <button type="button" class="category-btn">All Categories</button> -->
                            <!-- <form action="#" class="input-group">
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
            </div> -->
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
                        <li><a href="./index.jsp">Home</a></li>
                        <li><a href="./shop.jsp">Shop</a></li>
                        <!--
                            <li><a href="#">Collection</a>
                                <ul class="dropdown">
                                    <li><a href="#">Men's</a></li>
                                    <li><a href="#">Women's</a></li>
                                    <li><a href="#">Kid's</a></li>
                                </ul>
                            </li>
                            <li><a href="./blog.jsp">Blog</a></li>
                        -->
                        <li><a href="./contact.jsp">Contact</a></li>
                        <li><a href="./contact.jsp"> Cart</a></li>
                        <li><a href="./contact.jsp">Wishlist</a></li>
                        <li><a href="./contact.jsp">Check-out</a></li>
                        <!--
                        <li><a href="#">Pages</a>
                            <ul class="dropdown">
                                <li><a href="./blog-details.jsp">Blog Details</a></li>
                                <li><a href="./shopping-cart.jsp">Shopping Cart</a></li>
                                <li><a href="./check-out.jsp">Checkout</a></li>
                                <li><a href="./faq.jsp">Faq</a></li>
                                <li><a href="./register.jsp">Register</a></li>
                                <li><a href="./login.jsp">Login</a></li>
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
    <!--
    <div class="breacrumb-section">
        <div class="container">
            <div class="row">
                <div class="col-lg-12">
                    <div class="breadcrumb-text product-more">
                        <a href="./home.jsp"><i class="fa fa-home"></i> Home</a>
                        <a href="./shop.jsp">Shop</a>
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
                        
                        <h4>Users</h4>
                        <br>
                        <ul class="my-account">
                            <li>
                                <a href="user-history-admin.jsp">User Details</a>
                            </li>
                            <li>
                                <a href="add-user-admin.jsp"class="active" >Add a user</a>
                            </li>
                        </ul>
                
                    </div>

                    <div class="col-lg-8 px-4 py-4" style="background-color: #f5f5f5; border-radius: 0px 15px 15px 0px;">
                        <div class="card-body">
                            <div class="register-form">
                                <h4 style="color: #2B394A; margin-bottom: 30px;">Add User</h4>
                                <form action="#" class="row g-3">
                                    <div class="col-md-6">
                                        <div class="group-input ">
                                            <label for="username" class="registerLabel">Username *</label>
                                            <input type="text" id="username" class="defaultBorders" srequired>
                                        </div>
                                    </div>
                                    <div class="col-md-6">
                                        <div class="group-input defaultBorders">
                                            <label for="phoneNumber" class="registerLabel">PhoneNumber *</label>
                                            <input type="text" id="phoneNumber" class="defaultBorders" required>
                                        </div>
                                    </div>
                                    <div class="col-md-12">
                                        <div class="group-input ">
                                            <label for="email" class="registerLabel">Email *</label>
                                            <input type="email" id="email" class="defaultBorders" required>
                                        </div>
                                    </div>
                                    <div class="col-md-12">
                                        <div class="group-input defaultBorders">
                                            <label for="address" class="registerLabel">Address *</label>
                                            <input type="text" id="address" class="defaultBorders" required>
                                        </div>
                                    </div>

                                    
                                    <div class="col-md-12" style="text-align: center;">
                                        <button type="submit" class="site-btn register-btn defaultBorders"
                                            style="width: 30vw;">Add</button>
                                    </div>
                                </form>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
    </div>
    </section>
    </div>

    <%@ include file="footer.jsp" %>
    <%@ include file="commons-js.jsp" %>
</body>

</html>