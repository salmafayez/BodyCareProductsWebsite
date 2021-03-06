<!DOCTYPE html>
<html lang="zxx">
<head>
    <meta charset="UTF-8">
    <meta name="description" content="Fashi Template">
    <meta name="keywords" content="Fashi, unica, creative, html">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Admin Categories</title>

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
                    <div class="col-lg-6" style="background-color: #f5f5f5; border-radius: 15px">
                        <h2 class="text-center px-4 py-4" style="color: #2B394A;">Categories</h2>
                        <div class="order-history-table">
                             
                            <table>
                                <thead>
                                    <tr>
                                        <th>Category ID</th>
                                        <th>Category Name</th>
                                    </tr>
                                </thead>
                                <tbody>
                                <c:forEach items="${categories}" var="category">
                                    <tr>
                                        <td><a href="#">${category.id}</a></td>
                                        <td>${category.name}</td>
                                      </tr>

                                     </c:forEach>  
                                </tbody>
                            </table>
                            
                            <div class="m-auton text-center">
                                <a href="addcategory"><button class="site-btn login-btn defaultBorders">Add Category</button></a>
                            </div>
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