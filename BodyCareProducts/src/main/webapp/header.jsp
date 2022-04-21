<!-- Header Section Begin -->
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

        <header class="header-section">
            <div class="container">
                <div class="inner-header">
                    <div class="row">
                        <div class="col-lg-2 col-md-2">
                            <div class="logo">
                                <a href="./home">
                                    <img src="img/5.png" alt="">
                                </a>
                            </div>
                        </div>
                        <div class="col-lg-4 col-md-4">
                            <div class="advanced-search">
                                <form action="search" class="input-group" method="post">
                                    <input type="text" placeholder="What do you need?" name="searchProduct"
                                        id="searchProduct">
                                    <button type="submit"><i class="ti-search"></i></button>
                                </form>
                            </div>
                        </div>
                        <div class="col-lg-2 text-right col-md-2">
                            <ul class="nav-right">
                                <li class="heart-icon">
                                    <a href="#">
                                        <i class="icon_heart_alt"></i>
                                        <c:if test="${empty wishlist}">
                                            <c:set var="wishlistlength" value="${0}" />
                                        </c:if>
                                        <c:if test="${fn:length(wishlist)>0}">
                                            <c:set var="wishlistlength" value="${fn:length(wishlist)}" />
                                        </c:if>
                                        <span id="wishlistNumber">${wishlistlength}</span>
                                    </a>
                                </li>
                                <li class="cart-icon">
                                    <a href="#">
                                        <i class="icon_bag_alt"></i>
                                        <c:if test="${empty cart}">
                                            <c:set var="cartlength" value="${0}" />
                                        </c:if>
                                        <c:if test="${fn:length(cart)>0}">
                                        <c:forEach items="${cart}" var="cart">
                                            <c:set var="quantityTotal"
                                                value="${quantityTotal + (cart.quantity)}" />
                                            </c:forEach>
                                          <!--  <c:set var="cartlength" value="${quantityTotal}" /> -->
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
                                                                <td class="si-pic"><img src="${cart.product.image}"
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



                        <div class="col-lg-4 col-md-4">
                            <div>
                                <c:if test="${userName != null}">
                                    <a href="userprofile" id="userNameLink">${userName}</a>
                                    <a href="logout"><button class="btn primary-btn sign-in mx-3">Sign out</button></a>
                                </c:if>

                                <c:if test="${userName == null}">
                                    <a href="login"><button class="btn primary-btn sign-in">Sign in</button></a>
                                    <a href="register"><button class="btn primary-btn sign-in">Sign up</button></a>
                                </c:if>
                            </div>
                        </div>
                    </div>
                </div>
            </div>

            <div class="nav-item text-center ">
                <div class="container text-center">
                    <nav class="nav-menu mobile-menu">
                        <ul>
                            <li><a href="home">Home</a></li>
                            <li><a href="products">Shop</a></li>
                            <li><a href="contactmessage">Contact</a></li>
                            <li><a href="shopping-cart"> Cart</a></li>
                            <li><a href="wishlist">Wishlist</a></li>
                            <li><a href="checkout">Check-out</a></li>
                            <li><a href="userorderhistory">Orders</a></li>
                        </ul>
                    </nav>
                    <div id="mobile-menu-wrap"></div>
                </div>
            </div>
        </header>
        <!-- Header End -->