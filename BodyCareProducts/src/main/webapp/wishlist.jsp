<!DOCTYPE html>
<html lang="zxx">
<head>
    <meta charset="UTF-8">
    <meta name="description" content="Fashi Template">
    <meta name="keywords" content="Fashi, unica, creative, html">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>WishList</title>

   
    <%@ include file="commons-styles.jsp" %>
</head>

<body>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

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
            <c:if test="${empty wishlist}">
                <section class="shopping-cart spad">
                    <div class="container">
                        <div class="row px-2 py-3"
                            style="background-color: #f5f5f5; border-radius: 15px; width: 1200px; height: 400px;">
                            <div class="col-lg-12">
                                <div class="cart-table">
                                    <center>
                                        <tbody class="cart-items">
                                            <h3 style="margin-top: 225;">
                                                <center>Empty Wishlist</center>
                                            </h3>
                                        </tbody>

                                    </center>
                                </div>
                            </div>
                        </div>
                    </div>
                </section>
            </c:if>

            <c:if test="${wishlist != null}">
               <c:if test="${!empty wishlist}">
                <div class="col-lg-10 row px-2 py-3 m-auto " style="background-color: #f5f5f5; border-radius: 15px; width: 1200px; height: 400px;">
                    <div class="">
                        <div class="cart-table" id="tableParent">
                            <table id="tableChild">
                                <thead>
                                    <tr >
                                        <th class="px-4">Image</th>
                                        <th class="p-name ">Product Name</th>
                                        <th class="p-name">Category</th>
                                        <th>Price</th>
                                        <th></th>
                                    </tr>
                                </thead>
                                <tbody>

                                        <c:forEach items="${wishlist}" var="product">
                                            <tr class="wichListRow">
                                                <td class="cart-pic first-row px-4"><img src="img/cart-page/product-1.jpg" alt=""
                                                     style="border-radius: 15px;">
                                                </td>
                                                <td class="cart-title first-row">
                                                    <h5>${product.name}</h5>
                                                </td>
                                                <td class="cart-title first-row">
                                                    <h5>${product.categoryName}</h5>
                                                </td>
                                                <td class="p-price first-row">${product.price}</td>
                                                <td class="close-td first-row">
                                                <i class="ti-close" onclick="removeFromWishlist(${product.id})">
                                                </i>
                                                </td>
                                            </tr> 
                                        </c:forEach>  

                                </tbody>
                            </table>
                        </div>
                        <div class="row m-auto" id="emptyMessage" >
                            <div class="col-lg-4 content-center m-auto">
                                <div class="cart-buttons">
                                    <a href="products" class="primary-btn continue-shop" style="border-radius: 15px;">Continue shopping</a>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
           </c:if>
       </c:if>
    </div>
    </section>
    </div>
    <!-- Shopping Cart Section End -->

    <%@ include file="footer.jsp" %>
    <%@ include file="commons-js.jsp" %>
    <script src="js/wishlist-ajax.js?ver=1." type="text/javascript"></script>
</body>

</html>