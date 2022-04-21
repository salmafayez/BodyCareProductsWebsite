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

<body onload="loadCategories();">
    <!-- Page Preloder -->
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


        <div id="preloder">
            <div class="loader"></div>
        </div>

        <%@ include file="header.jsp" %>

            <!-- Product Shop Section Begin -->
            <section class="product-shop spad">

                <div class="container">
                    <div class="row">
                        <div class="col-lg-3 col-md-6 col-sm-8 order-2 order-lg-1 produts-sidebar-filter">
                            <div class="filter-widget">
                                <h4 class="fw-title">Categories</h4>
                                <ul class="filter-catagories" id="list" name="list">

                                </ul>
                            </div>
                            <form action="filterbyprice" class="input-group" method="post"
                                >


                                <div class="filter-widget">
                                    <h4 class="fw-title">Price</h4>
                                    <div class="filter-range-wrap">
                                        <div class="range-slider">
                                            <div class="price-input">
                                                <input type="text" id="minamount" name="min">
                                                <input type="text" id="maxamount" name="max">

                                            </div>
                                        </div>
                                        <div class="price-range ui-slider ui-corner-all ui-slider-horizontal ui-widget ui-widget-content"
                                            data-min="<%= session.getAttribute(" minVal") %>" data-max="<%=
                                                session.getAttribute("maxVal") %>">
                                                <div class="ui-slider-range ui-corner-all ui-widget-header"></div>
                                                <span tabindex="0"
                                                    class="ui-slider-handle ui-corner-all ui-state-default"></span>
                                                <span tabindex="0"
                                                    class="ui-slider-handle ui-corner-all ui-state-default"></span>
                                        </div>
                                    </div>
                                    <%-- <a href="filterbyprice" class="filter-btn">Filter</a> --%>
                                        <button class="btn primary-btn sign-in" type="submit">FILTER</button>
                                </div>

                            </form>


                        </div>


                        <div class="col-lg-9 order-1 order-lg-2">
                            <div class="product-list">
                                <div class="row">
                                    <c:forEach items="${products}" var="product">
                                        <div class="col-lg-4 col-sm-6">
                                            <div class="product-item">
                                                <div class="pi-pic">
                                                    <a href="product?id=${product.id}">
                                                        <img src="${product.image}" alt="">
                                                    </a>
                                                    <div class="icon">
                                                        <i class="fa fa-heart" aria-hidden="true"
                                                            style="color: #d79681;"
                                                            onclick="addToWishlist(${product.id})"></i>
                                                    </div>
                                                    <ul>

                                                        <li class="w-icon active"><a href="shopping-cart.jsp">
                                                                <i class="icon_bag_alt"></i></a>
                                                        <li class="adddd" onclick="addToCart(${product.id})"
                                                            style="cursor:pointer;"><span> + ADD TO
                                                                CART</span></li>

                                                    </ul>

                                                </div>
                                                <div class="pi-text">
                                                    <div class="catagory-name">${product.categoryName}</div>
                                                    <a href="product?id=${product.id}">
                                                        <h5>${product.name}</h5>
                                                    </a>
                                                    <div class="product-price">${product.price}</div>

                                                </div>
                                         \
                                            </div>
                                        </div>
                                </c:forEach>

                                <div class="loading-more">

                                    <c:if test="${currentPage != 1}">
                                        <a href="filterbyprice?page=${currentPage-1}&max=<%= session.getAttribute("maxVal") %> &min=<%= session.getAttribute("minVal") %>" class="previous"style="text-decoration:none;display: inline-block;padding: 8px16px;background-color: #2B394A;color: black;" disabled>&laquo;
                                                Previous</a>
                                    </c:if>
                                    <c:if test="${currentPage lt noOfPages}">
                                        <a href="filterbyprice?page=${currentPage+1}&max=<%= session.getAttribute("maxVal") %> &min=<%= session.getAttribute("minVal") %>" class="next"style="text-decoration:none;display: inline-block;padding: 8px 16px;background-color:#d79681; color: white;" disabled>Next &raquo;</a>
                                    </c:if>




                                </div>
                            </div>


            </section>

            <!-- Product Shop Section End -->

            <%@ include file="footer.jsp" %>
                <%@ include file="commons-js.jsp" %>
                    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
                    <script src="https://ajax.googleapis.com/ajax/libs/jqueryui/1.12.1/jquery-ui.min.js"></script>
                    <script src="js/shop-categories.js" type="text/javascript"></script>
                    <script src="js/wishlist-ajax.js" type="text/javascript"></script>
                    <script src="js/shopping-cart.js" type="text/javascript"></script>
                    <script src="js/IncrementProduct.js" type="text/javascript"></script>

                    <%-- <script src="js/price-store.js" type="text/javascript">
                        </script> --%>


</body>

</html>