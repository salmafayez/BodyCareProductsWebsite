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
                    
                    
                </div>
        
               
                     <div class="col-lg-9 order-1 order-lg-2">
                    <div class="product-list">
                        <div class="row">
                            <c:forEach items="${products}" var="product">
                                    <div class="col-lg-4 col-sm-6">
                                        <div class="product-item">
                                            <div class="pi-pic">
                                                <img src="${product.image}" alt="productImage" style="width: 270px;height: 303px;">
                                                <div class="icon">
                                                    <i class="icon_heart_alt" onclick="addToWishlist(${product.id})"></i>
                                                </div>
                                                 <ul>
                                                    <li class="w-icon active"><a href="shopping-cart.jsp"><i
                                                                class="icon_bag_alt"></i></a></li>
                                                    <li class="quick-view" onclick="addToCart(${product.id})"> <a href="#"> + ADD TO
                                                        CART</a></li>
                                                </ul>
                                            </div>
                                            <div class="pi-text">
                                                <div class="catagory-name">${product.categoryName}</div>
                                                <a href="#">
                                                    <h5>${product.name}</h5>
                                                </a>
                                                <div class="product-price">${product.price}</div>
                                            </div>
                                        </div>
                                    </div>

                            </c:forEach>

                    <div class="loading-more">

                        <c:if test="${currentPage != 1}">
                            <a href="products?page=${currentPage-1}" class="previous" style="text-decoration:none;display: inline-block;padding: 8px 16px;background-color: #2B394A;color: black;" disabled>&laquo; Previous</a>
                        </c:if>
                        <c:if test="${currentPage lt noOfPages}">
                            <a href="products?page=${currentPage+1}" class="next" style="text-decoration:none;display: inline-block;padding: 8px 16px; background-color:#d79681; color: white;" disabled>Next &raquo;</a>
                        </c:if>
                    </div>
                </div>
            </div>
        </div>
  
          
    </section>

            <!-- Product Shop Section End -->

            <%@ include file="footer.jsp" %>
                <%@ include file="commons-js.jsp" %>
                    <script src="js/shop-categories.js" type="text/javascript"></script>
                    <script src="js/wishlist-ajax.js" type="text/javascript"></script>

</body>

</html>