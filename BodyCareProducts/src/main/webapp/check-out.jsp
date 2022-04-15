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
    <%@ page import="java.util.List" %>
    <%@ page import="gov.iti.jets.presentation.dtos.CartItemDto" %>
</head>

<body>
    <!-- Page Preloder -->
    <div id="preloder">
        <div class="loader"></div>
    </div>

<%@ include file="header.jsp" %>

    <!-- Shopping Cart Section Begin -->
    <div class="container-fluid" style="background-image: url(img/background_img.jpg); background-repeat: no-repeat; background-size: cover;">
    <section class="checkout-section spad">
        <div class="container">
            <form action="order" class="checkout-form" method="POST">
                <div class="row" style="justify-content: center;">

                    <div class="col-lg-6 px-5 py-5" style="background-color: #f5f5f5; border-radius: 15px;">
                        <!---
                            <div class="checkout-content">
                                <input type="text" placeholder="Enter Your Coupon Code">
                            </div>
                        -->
                        <c:if test="${empty cart}">  
                            <div class="cart-table">
                               <p> There is no products to order</p>
                            </div>
                            <div class="order-btn">
                                    <button type="submit" class="site-btn place-btn" disabled>Place Order</button>
                            </div>
                        </c:if>

                        <c:if test="${!empty cart}">  
                            <div class="place-order">
                                <div style="display: flex;justify-content: center;">
                                <h4> Your Order</h4>
                            </div>
                                <div class="order-total">
                                    <ul class="order-table">
                                        <li>Product <span>Total</span></li>
                                        <c:forEach  items="${cart}" var="cartItem">
                                            <c:set var="total" value="${cartItem.product.price * cartItem.quantity}"/>
                                            <li class="fw-normal">${cartItem.product.name} x ${cartItem.quantity} <span> ${cartItem.product.price * cartItem.quantity} </span></li>
                                        </c:forEach>
                                        <% List<CartItemDto> cartItems = (List<CartItemDto>) session.getAttribute("cart");
                                        
                                            double totalPrice = 0;
                                            for (int i= 0 ;i <cartItems.size() ; i++){
                                                totalPrice += cartItems.get(i).getProduct().getPrice()*cartItems.get(i).getQuantity();
                                            } 
                                         %>
                                        <li class="total-price">Total <span><%= totalPrice %></span></li>
                                    </ul>
                                   
                                    <a href="order"><button class="site-btn place-btn">Place Order</button></a>
                                    
                                </div>
                            </div>
                        </c:if>
                    </div>
                </div>
            </form>
        </div>
    </section>
</div>
    <!-- Shopping Cart Section End -->

    <%@ include file="footer.jsp" %>
    <%@ include file="commons-js.jsp" %>
</body>

</html>