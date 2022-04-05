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

    <%@ include file="header.jsp" %>

    <!-- Shopping Cart Section Begin -->
    <div class="container-fluid"
        style="background-image: url(img/background_img.jpg); background-repeat: no-repeat; background-size: cover;">
        <section class="shopping-cart spad">
            <div class="container">
                <div class="row px-2 py-3" style="background-color: #f5f5f5; border-radius: 15px;">
                    <div class="col-lg-8">
                        <div class="cart-table">
                            <table>
                                <thead>
                                    <tr>
                                        <th>Image</th>
                                        <th class="p-name">Product Name</th>
                                        <th>Price</th>
                                        <th></th>
                                    </tr>
                                </thead>
                                <tbody>
                                <c:forEach items="${wishlist-product}" var="product">
                                    <tr>
                                        <td class="cart-pic first-row"><img src="img/cart-page/product-1.jpg" alt=""
                                                style="border-radius: 15px;"></td>
                                        <td class="cart-title first-row">
                                            <h5>${product.name}</h5>
                                        </td>
                                        <td class="p-price first-row">${product.price}</td>
                                        <td class="close-td first-row"><i class="ti-close"></i></td>
                                    </tr>
                                </c:forEach>
                                </tbody>
                            </table>
                        </div>
                        <div class="row">
                            <div class="col-lg-4 content-center m-auto">
                                <div class="cart-buttons">
                                    <a href="#" class="primary-btn continue-shop" style="border-radius: 15px;">Continue
                                        shopping</a>
                                    <a href="#" class="primary-btn up-cart" style="border-radius: 15px;">Update cart</a>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
    </div>
    </section>
    </div>
    <!-- Shopping Cart Section End -->

    <%@ include file="footer.jsp" %>
    <%@ include file="commons-js.jsp" %>
</body>

</html>