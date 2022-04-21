<!DOCTYPE html>
<html lang="zxx">
<head>
    <meta charset="UTF-8">
    <meta name="description" content="Fashi Template">
    <meta name="keywords" content="Fashi, unica, creative, html">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Admin User History</title>

   
    <%@ include file="commons-styles.jsp" %>
</head>

<body>
    <!-- Page Preloder -->
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
                        <h2 class="text-center px-4 py-4" style="color: #2B394A;">Users</h2>
                        <div class="order-history-table">
                            <table>
                                <thead>
                                    <tr>
                                        <th>User ID</th>
                                        <th>User Name</th>
                                        <th>Email</th>
                                        <th>Phone number</th>
                                        <th>City</th>
                                    </tr>
                                </thead>
                                <tbody>
                                
                                <c:if test="${!empty users }">
                                 <c:forEach items="${users}" var="user">
                                    <tr>
                                       <td>${user.id}</td>
                                        <td>${user.userName}</td>
                                        <td>${user.email}</td>
                                        <td>${user.phoneNumber}</td>
                                        <td>${user.city}</td>
                                    </tr>
                                </c:forEach>
                                </c:if>
                                <c:if test="${users==null}">
                                <tr>
                                <td colspan="6" style="text-align: center;">
                                <p style="padding:50px;font-size: 30px;font-weight: bold;">NO USERS EXIST!!</p>
                                </td>
                                
                                </tr>
                                   </c:if>

                                </tbody>
                            </table>
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