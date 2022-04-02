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

    <%@ include file="admin-header.jsp" %>

    <!-- Register Section Begin -->
    <div class="container-fluid pageBody ">
        <div class="register-login-section spad">
            <div class="container ">
                <div class="row">
                    <div class="col-lg-8 m-auto">
                        <div class="card px-4 py-4" style="color:white;border-radius: 15px;background-color: #f5f5f5;">
                            <div class="card-body">
                                <div class="register-form">
                                    <h2>Add product</h2>

                                    <form action="addproduct" method="POST" id="myRegisterForm" name="myRegisterForm" class="row g-3" enctype="multipart/form-data">

                                        <!--  Name -->

                                        <div class="col-md-6">
                                            <div class="group-input ">
                                                <label for="productName" class="registerLabel">Name *</label>
                                                <input type="text" id="productName" name="productName"
                                                    class="defaultBorders " required>

                                                <i class="fa fa-check-circle" aria-hidden="true"></i><br>
                                                <i class="fa fa-exclamation-circle" aria-hidden="true"></i>

                                                <small style="color: rgb(238, 0, 0);font-size: 12px;"></small>

                                            </div>
                                        </div>

                                        <!-- Price -->
                                        <div class="col-md-6">
                                            <div class="group-input defaultBorders ">
                                                <label for="price" class="registerLabel">Price *</label>
                                                <input type="text" id="price" name="price" class="defaultBorders "
                                                    required>
                                                <i class="fa fa-check-circle" aria-hidden="true"></i><br>
                                                <i class="fa fa-exclamation-circle" aria-hidden="true"></i>

                                                <small style="color: rgb(238, 0, 0);font-size: 12px;"></small>

                                            </div>
                                        </div>

                                        <!-- Description-->

                                        <div class="col-md-12">
                                            <div class="group-input ">
                                                <label for="description" class="registerLabel">Description *</label>
                                                <input type="email" id="description" name="description"
                                                    class="defaultBorders" required>
                                                <i class="fa fa-check-circle" aria-hidden="true"></i><br>
                                                <i class="fa fa-exclamation-circle" aria-hidden="true"></i>

                                                <small style="color: rgb(238, 0, 0);font-size: 12px;"></small>
                                            </div>
                                        </div>

                                        <!-- Category -->

                                        <div class="col-md-6 defaultBorders">
                                            <label for="countriesLabel"
                                                class="form-label registerLabel">Categories *</label>
                                            <select id="category" name="category" class="form-select selectRegion"
                                                style="margin-top: 13px;border-radius: 15px;">
                                                <option value="bath">Bath & Shower</option>
                                                <option value="fragrance">Fragrance</option>
                                                <option value="candles">Candles</option>
                                            </select>
                                        </div>
                                        <!-- PHONENUMBER -->
                                        <div class="col-md-6">
                                            <div class="group-input defaultBorders ">
                                                <label for="quantity" class="registerLabel">Quantity *</label>
                                                <input type="number" id="quantity" name="quantity"
                                                    class="defaultBorders " required>
                                                <i class="fa fa-check-circle" aria-hidden="true"></i><br>
                                                <i class="fa fa-exclamation-circle" aria-hidden="true"></i>

                                                <small style="color: rgb(238, 0, 0);font-size: 12px;"></small>

                                            </div>
                                        </div>

                                        <!-- Image -->

                                        <div class="col-md-12 mb-3">
                                            <div class="defaultBorders">
                                                <label for="productImage" class="registerLabel">Image *</label>
                                                <input class="form-control form-control-lg product-image" type="file" id="formFileMultiple" id="productImage"  class="defaultBorders" name="productImage" required>
                                              
                                            </div>
                                        </div> 

                                        <div class="col-md-12" style="text-align: center;">
                                            <button type="submit" class="site-btn register-btn defaultBorders"
                                                style="width: 30vw;" id="register">ADD Product</button>
                                        </div>

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
</body>

</html>