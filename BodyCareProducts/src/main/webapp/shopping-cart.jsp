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

<body >
    <!-- Page Preloder -->
    <div id="preloder">
        <div class="loader"></div>
    </div>

    <%@ include file="header.jsp" %>

    <!-- Shopping Cart Section Begin -->
    <div class="container-fluid"
        style="background-image: url(img/background_img.jpg); background-repeat: no-repeat; background-size: cover;">
        <section class="shopping-cart spad">
            <div class="container">
                <div class="row px-2 py-3" style="background-color: #f5f5f5; border-radius: 15px;">
                    <div class="col-lg-12">
                        <div class="cart-table">
                            <table>
                                <thead>
                                    <tr>
                                        <th>Image</th>
                                        <th class="p-name">Product Name</th>
                                        <th>Price</th>
                                        <th>Quantity</th>
                                        <th>Total</th>
                                        <!--th><i class="ti-close"></i></th-->
                                    </tr>
                                </thead>
                                <tbody class="cart-items">
                                    <tr class="cart-row">
                                        <td class="cart-pic first-row"><img src="img/cart-page/product-1.jpg" alt=""
                                                style="border-radius: 15px;"></td>
                                        <td class="cart-title first-row">
                                            <h5>Pure Pineapple</h5>
                                        </td>
                                        <td class="p-price first-row">$65.50</td>
                                        <td class="qua-col first-row">
                                            <div class="quantity">
                                                <div class="pro-qty">
                                                    <span class="dec qtybtn">-</span>
                                                    <input class="pro-qty-input" type="text" value="1">
                                                    <span class="inc qtybtn">+</span>
                                                </div>
                                            </div>
                                        </td>
                                        <td class="total-price first-row">$65.50</td>
                                        <td class="close-td first-row"><i class="ti-close"></i></td>
                                    </tr>
                                    <tr class="cart-row">
                                        <td class="cart-pic"><img src="img/cart-page/product-2.jpg" alt=""
                                                style="border-radius: 15px;"></td>
                                        <td class="cart-title">
                                            <h5>American lobster</h5>
                                        </td>
                                        <td class="p-price">$200.00</td>
                                        <td class="qua-col">
                                            <div class="quantity">
                                                <div class="pro-qty">
                                                    <span class="dec qtybtn">-</span>
                                                    <input class="pro-qty-input" type="text" value="1">
                                                    <span class="inc qtybtn">+</span>
                                                </div>
                                            </div>
                                        </td>
                                        <td class="total-price">$200.00</td>
                                        <td class="close-td"><i class="ti-close"></i></td>
                                    </tr>
                                    <tr class="cart-row">
                                        <td class="cart-pic" ><img src="img/cart-page/product-3.jpg" alt=""
                                                style="border-radius: 15px;"></td>
                                        <td class="cart-title">
                                            <h5>Guangzhou sweater</h5>
                                        </td>
                                        <td class="p-price">$60.00</td>
                                        <td class="qua-col">
                                            <div class="quantity">
                                                <div class="pro-qty">
                                                    
                                                    <span class="dec qtybtn">-</span>
                                                    <input class="pro-qty-input" type="text" value="1">
                                                    <span class="inc qtybtn">+</span>
                                                </div>
                                            </div>
                                        </td>
                                        <td class="total-price">$60.00</td>
                                        <td class="close-td"><i class="ti-close"></i></td>
                                    </tr>
                                </tbody>
                            </table>
                        </div> 
                        
                        <div class="col-lg-4 offset-lg-8">
                                <div class="proceed-checkout">
                                    <ul style="border-radius: 15px;">
                                        <li class="subtotal">Subtotal <span>$325.00</span></li>
                                        <li class="cart-total">Total <span>$325.50</span></li>
                                    </ul>
                                    <%-- <a href="#" class="proceed-btn" style="border-radius: 0px 0px 15px 15px;"></a> --%>
                                </div>
                            </div>
                        <div class="row" style="margin-top:30px;">
                            <div class="col-lg-12 " style="display: flex;align-items: center;justify-content: center;">
                                <div class="cart-buttons">
                                    <a href="#" class="primary-btn continue-shop" style="border-radius: 15px;">UPDATE CART</a>
                                    <a href="#" class="primary-btn up-cart" style="border-radius: 15px;">PROCEED TO
                                        CHECK OUT</a>
                                </div>
                                <!--
                            <div class="discount-coupon">
                                <h6>Discount Codes</h6>
                                <form action="#" class="coupon-form">
                                    <input type="text" placeholder="Enter your codes">
                                    <button type="submit" class="site-btn coupon-btn">Apply</button>
                                </form>
                            </div>-->
                       </div>
                            </div>
                           
                        
                    </div>
                </div>
            </div>
        </section>
    </div>

    </div>
    <!-- Shopping Cart Section End -->

    <%@ include file="footer.jsp" %>
    <%@ include file="commons-js.jsp" %>
    <script src="js/shopping-cart.js" type="text/javascript"></script>
</body>

</html>