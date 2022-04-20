<!DOCTYPE html>
<html lang="zxx">
<head>
    <meta charset="UTF-8">
    <meta name="description" content="Fashi Template">
    <meta name="keywords" content="Fashi, unica, creative, html">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Order History</title>

   <%@ include file="commons-styles.jsp" %>
    
</head>

<body>
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

    <%@ include file="footer.jsp" %>
    <%@ include file="commons-js.jsp" %>
</body>

</html>