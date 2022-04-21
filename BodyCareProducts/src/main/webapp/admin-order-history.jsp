<!DOCTYPE html>
<html lang="zxx">

<head>
    <meta charset="UTF-8">
    <meta name="description" content="Fashi Template">
    <meta name="keywords" content="Fashi, unica, creative, html">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Admin Order History</title>

    <%@ include file="commons-styles.jsp" %>
</head>

<body>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

    <!-- Page Preloder -->
    <div id="preloder">
        <div class="loader"></div>
    </div>

    <%@ include file="admin-header.jsp" %>

        <!-- Shopping Cart Section Begin -->
        <div class="container-fluid"
            style="background-image: url(img/background_img.jpg); background-repeat: no-repeat; background-size: cover;">
            <section class="shopping-cart spad">
                <div class="container">
                    <div class="row" style="justify-content: center;">
                        <div class="col-lg-12" style="background-color: #f5f5f5; border-radius: 15px">
                            <h2 class="text-center px-4 py-4" style="color: #2B394A;">Order History</h2>
                            <div class="order-history-table">
                                <table>
                                    <thead>
                                        <tr>
                                            <th>Order ID</th>
                                            <th>Username</th>
                                            <th>Date</th>
                                            <th>Total Price</th>
                                        </tr>
                                    </thead>
                                    <tbody>

                                        <c:if test="${!empty orders }">
                                            <c:forEach items="${orders}" var="order">
                                                <tr>
                                                    <td>${order.id}</td>
                                                    <td>${order.user.userName}</td>
                                                    <td>${order.orderTime}</td>
                                                    <td>${order.totalPrice}</td>
                                                </tr>
                                            </c:forEach>
                                        </c:if>
                                        <c:if test="${orders==null}">
                                            <tr>
                                                <td colspan="6" style="text-align: center;">
                                                    <p style="padding:50px;font-size: 30px;font-weight: bold;">NO USERS
                                                        EXIST!!</p>
                                                </td>

                                            </tr>
                                        </c:if>

                                    </tbody>
                                    <!--tbody>
                                    <tr>
                                        <td>#10001</td>
                                        <td>Christine</td>
                                        <td>01/01/2015</td>
                                        <td>$200.00</td>
                                      </tr>

                                      <tr>
                                        <td>#10001</td>
                                        <td>Christine</td>
                                        <td>01/01/2015</td>
                                        <td>$200.00</td>
                                      </tr>

                                      <tr>
                                        <td>#10001</td>
                                        <td>Christine</td>
                                        <td>01/01/2015</td>
                                        <td>$200.00</td>
                                      </tr>

                                </tbody-->
                                </table>
                            </div>
                        </div>
                    </div>
                </div>
            </section>
        </div>

        <%@ include file="admin-footer.jsp" %>
        <%@ include file="commons-js.jsp" %>
</body>

</html>