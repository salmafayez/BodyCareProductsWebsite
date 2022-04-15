<!-- Header Section Begin -->
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

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
                                <form action="search" class="input-group" method="post">
                                    <input type="text" placeholder="What do you need?" name="searchProduct"
                                        id="searchProduct">
                                    <button type="submit"><i class="ti-search"></i></button>
                                </form>
                            </div>
                        </div>
                        <div class="col-lg-2 text-right col-md-2">
                            <ul class="nav-right">
                                <li class="heart-icon"><a href="#">
                                        <i class="icon_heart_alt"></i>
                                        <c:if test="${empty wishlist}">
                                            <c:set var="wishlistlength" value="${0}" />
                                        </c:if>
                                        <c:if test="${fn:length(wishlist)>0}">
                                            <c:set var="wishlistlength" value="${fn:length(wishlist)}" />
                                        </c:if>
                                        <!--span id="wishlistNumber">0</span-->
                                        <span id="wishlistNumber">${wishlistlength}</span>

                                    </a>
                                </li>
                                <li class="cart-icon"><a href="#">
                                        <i class="icon_bag_alt"></i>
                                        <c:if test="${empty cart}">
                                            <c:set var="cartlength" value="${0}" />
                                        </c:if>
                                        <c:if test="${fn:length(cart)>0}">
                                            <c:set var="cartlength" value="${fn:length(cart)}" />
                                        </c:if>
                                        <span id="cartNumber">${cartlength}</span>
                                    </a>
                                    <div class="cart-hover">
                                        <c:if test="${fn:length(cart)>0}">
                                            <div class="select-items">
                                                <table>
                                                    <tbody>
                                                        <c:forEach items="${cart}" var="cart">

                                                            <tr>
                                                                <td class="si-pic"><img src="img/select-product-1.jpg"
                                                                        alt=""></td>
                                                                <td class="si-text">
                                                                    <div class="product-selected">
                                                                        <p>${cart.product.price} x ${cart.quantity}</p>
                                                                        <h6>${cart.product.name}</h6>
                                                                    </div>
                                                                </td>
                                                                <td class="si-close">
                                                                    <i class="ti-close"></i>
                                                                </td>
                                                            </tr>
                                                        </c:forEach>
                                                        <!-- <tr>
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
                                                                           </tr> -->
                                                    </tbody>
                                                </table>
                                            </div>
                                        </c:if>
                                        <c:if test="${fn:length(cart)>0}">

                                            <c:forEach items="${cart}" var="cart">
                                                <c:set var="priceTotal"
                                                    value="${priceTotal + (cart.quantity*cart.product.price)}" />
                                            </c:forEach>

                                            <div class="select-total">
                                                <span>total:</span>
                                                <h5>${priceTotal}</h5>
                                            </div>
                                            <div class="select-button">
                                                <a href="shopping-cart.jsp" class="primary-btn view-card">VIEW CARD</a>
                                                <a href="check-out.jsp" class="primary-btn checkout-btn">CHECK OUT</a>
                                            </div>
                                        </c:if>

                                    </div>
                                </li>
                                <c:if test="${empty cart}">
                                    <c:set var="price" value="${0}" />
                                </c:if>
                                <c:if test="${fn:length(cart)>0}">
                                    <c:forEach items="${cart}" var="cart">
                                        <c:set var="price" value="${price + (cart.quantity*cart.product.price)}" />
                                    </c:forEach>
                                </c:if>
                                <li class="cart-price">$ ${price}</li>

                            </ul>
                        </div>


                        <div class="col-lg-3 col-md-3">
                            <div>
                                <% String userAuth=(String) session.getAttribute("AuthToken"); if(userAuth !=null){ %>

                                    <span class="account-name">
                                        <%= (String)session.getAttribute("userName") %>
                                    </span>
                                    <a href="logout"><button class="btn primary-btn sign-in mx-3">Sign out</button></a>

                                    <% } else{ %>
                                        <a href="login"><button class="btn primary-btn sign-in">Sign in</button></a>
                                        <a href="register"><button class="btn primary-btn sign-in">Sign up</button></a>

                                        <% } %>

                            </div>
                        </div>
                    </div>
                </div>
            </div>

        </div>
        <div class="nav-item ">
            <div class="container text-center">
                <nav class="nav-menu mobile-menu">
                    <ul>
                        <li><a href="home">Home</a></li>
                        <li><a href="products">Shop</a></li>
                     
                        <li><a href="contact.jsp">Contact</a></li>
                        <li><a href="shopping-cart.jsp"> Cart</a></li>
                        <li><a href="wishlist-list">Wishlist</a></li>
                        <li><a href="checkout">Check-out</a></li>
                        <li><a href="checkout">Orders</a></li>
                   

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