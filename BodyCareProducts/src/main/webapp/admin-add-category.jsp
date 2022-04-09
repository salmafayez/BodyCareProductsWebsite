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

<body onload="checkInput();">
    <!-- Page Preloder -->
    <div id="preloder">
        <div class="loader"></div>
    </div>

   <%@ include file="admin-header.jsp" %>

    <!-- Register Section Begin -->
    <div class="container-fluid pageBody ">
        <div class="register-login-section spad">
            <div class="container">
                <div class="row">
                    <div class="col-lg-6 offset-lg-3">
                        <div class="card px-4 py-4"
                            style="color:white;width: 35rem;border-radius: 15px;background-color: #f5f5f5;">
                            <div class="card-body">
                                <div class="register-form">
                                    <h2>Add Category</h2>
                                    <form action="addcategory" method="post" id="category-form">
                                        <div class="group-input">
                                            <label for="category-name">Category Name *</label>
                                            <input type="text" id="category-name" name="category-name"  class="defaultBorders"  required>
                                            <i class="fa fa-check-circle" aria-hidden="true" style="top: 173px;right: 55px;"></i><br>
                                            <i class="fa fa-exclamation-circle" aria-hidden="true" style="top: 173px;right: 55px;" ></i>
                                            <small  style="color: rgb(238, 0, 0);font-size: 12px;"></small>
                                        </div>
                                        <button type="submit" class="site-btn login-btn defaultBorders" id="addButton" >Add</button>
                                    </form>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
    <!-- Register Form Section End -->

    <%@ include file="footer.jsp" %>
    <%@ include file="commons-js.jsp" %>
    <script src="js/js-admin-addCategory.js" type="text/javascript"></script>

</body>

</html>