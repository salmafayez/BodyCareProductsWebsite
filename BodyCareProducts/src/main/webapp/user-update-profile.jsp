<!DOCTYPE html>
<html lang="zxx">

<head>
    <meta charset="UTF-8">
    <meta name="description" content="Fashi Template">
    <meta name="keywords" content="Fashi, unica, creative, html">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <meta http-equiv="Cache-Control" content="no-cache, no-store, must-revalidate" />
    <meta http-equiv="Pragma" content="no-cache" />
    <meta http-equiv="Expires" content="0" />
    <title>Fashi | Template</title>

    <%@ include file="commons-styles.jsp" %>
</head>

<body onload="checkInputs();getCityName('${user.city}')">
    <!-- Page Preloder -->
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

        <div id="preloder">
            <div class="loader"></div>
        </div>

        <%@ include file="header.jsp" %>
            


                    <%-- <div class="col-lg-3 col-md-12  order-2 order-lg-1 produts-sidebar-filter"
                        style="background-color: #f5f5f5;padding-top: 100px;padding-left: 80px;">
                        <div class="filter-widget">
                            <h4 class="fw-title">Categories</h4>
                            <ul class="filter-catagories" id="list" name="list">

                            </ul>
                        </div>
                </div> --%>
            <div class="contaner-fluid"
                style="background-image: url(img/background_img.jpg); background-repeat: no-repeat; background-size: cover;">
                
                    
                        <div class="register-login-section spad">
                            <div class="container ">
                                <div class="row">
                                    <div class="col-lg-12 m-auto">
                                        <div class="card px-4 py-4"
                                            style="color:white;border-radius: 15px;background-color: #f5f5f5;">
                                            <div class="card-body">
                                                <div class="register-form">
                                                    <h2>EDIT PROFILE</h2>

                                                    <form method="post" action="userupdateprofile" id="myRegisterForm"
                                                        name="myRegisterForm" class="row g-3">

                                                        <!--     USERNAME -->

                                                        <div class="col-md-6">
                                                            <div class="group-input ">
                                                                <label for="username"
                                                                    class="registerLabel">Username</label>
                                                                <input type="text" id="username" name="username"
                                                                    class="defaultBorders " value="${user.userName}"
                                                                    style="border-color:rgb(0, 112, 47);" required>

                                                                <i class="fa fa-check-circle"
                                                                    aria-hidden="true"></i><br>
                                                                <i class="fa fa-exclamation-circle"
                                                                    aria-hidden="true"></i>

                                                                <small
                                                                    style="color: rgb(238, 0, 0);font-size: 12px;"></small>

                                                            </div>
                                                        </div>

                                                        <!-- PHONENUMBER -->
                                                        <div class="col-md-6">
                                                            <div class="group-input  defaultBorders ">
                                                                <label for="phoneNumber"
                                                                    class="registerLabel">PhoneNumber</label>
                                                                <input style="border-color:rgb(0, 112, 47);" type="text"
                                                                    id="phoneNumber" name="phoneNumber"
                                                                    class="defaultBorders " value="${user.phoneNumber}"
                                                                    required>
                                                                <i class="fa fa-check-circle"
                                                                    aria-hidden="true"></i><br>
                                                                <i class="fa fa-exclamation-circle"
                                                                    aria-hidden="true"></i>

                                                                <small
                                                                    style="color: rgb(238, 0, 0);font-size: 12px;"></small>

                                                            </div>
                                                        </div>

                                                        <!-- EMAIL-->

                                                        <div class="col-md-12">
                                                            <div class="group-input ">
                                                                <label for="email" class="registerLabel">email</label>
                                                                <input style="border-color:rgb(0, 112, 47);"
                                                                    type="email" id="email" name="email"
                                                                    class="defaultBorders" value="${user.email}"
                                                                    required>
                                                                <i class="fa fa-check-circle"
                                                                    aria-hidden="true"></i><br>
                                                                <i class="fa fa-exclamation-circle"
                                                                    aria-hidden="true"></i>

                                                                <small
                                                                    style="color: rgb(238, 0, 0);font-size: 12px;"></small>
                                                            </div>
                                                        </div>

                                                        <!-- PASSWORD -->

                                                        <div class="col-md-6">
                                                            <div class="group-input defaultBorders">
                                                                <label for="pass" class="registerLabel">Password
                                                                    *</label>
                                                                <input type="password" id="password" name="password"
                                                                    class="defaultBorders" required>
                                                                <i class="fa fa-check-circle"
                                                                    aria-hidden="true"></i><br>
                                                                <i class="fa fa-exclamation-circle"
                                                                    aria-hidden="true"></i>

                                                                <small
                                                                    style="color: rgb(238, 0, 0);font-size: 12px;"></small>
                                                            </div>
                                                        </div>

                                                        <!-- PASSWORD CONFIRMATION -->

                                                        <div class="col-md-6">
                                                            <div class="group-input  defaultBorders">
                                                                <label for="con-pass" class="registerLabel">Confirm
                                                                    Password *</label>
                                                                <input type="password" id="confirmPassword"
                                                                    name="confirmPassword" class="defaultBorders"
                                                                    required>
                                                                <i class="fa fa-check-circle"
                                                                    aria-hidden="true"></i><br>
                                                                <i class="fa fa-exclamation-circle"
                                                                    aria-hidden="true"></i>

                                                                <small
                                                                    style="color: rgb(238, 0, 0);font-size: 12px;"></small>
                                                            </div>
                                                        </div>







                                                        <!-- STATE -->
                                                        <div class="col-md-6 ">
                                                            <!-- COUNTRY -->
                                                            <label for="countriesLabel"
                                                                class="form-label registerLabel">Countries</label>
                                                            <select id="country" name="country"
                                                                class="form-select selectRegion" value="${user.country}"
                                                                style="margin-top: 13px;border-radius: 15px;">
                                                                <option value="${user.country}" selected>${user.country}
                                                                </option>
                                                            </select>


                                                            <label for="statesLabel" class="form-label registerLabel"
                                                                style="visibility: hidden;">states</label>
                                                            <select id="state" name="state"
                                                                class="form-select selectRegion"
                                                                style="margin-top: 13px;border-radius: 15px;visibility: hidden;">

                                                            </select>

                                                        </div>
                                                        <!-- CITY -->
                                                        <div class="col-md-6 ">

                                                            <label for="citiesLabel"
                                                                class="form-label registerLabel">Cities</label>
                                                            <select id="city" name="city"
                                                                class="form-select selectRegion"
                                                                style="margin-top: 13px;border-radius: 15px;">

                                                            </select>

                                                        </div>



                                                        <!-- ADDRESS -->

                                                        <div class="col-md-12">
                                                            <div class="group-input  defaultBorders">
                                                                <label for="address"
                                                                    class="registerLabel">Address</label>
                                                                <input style="border-color:rgb(0, 112, 47);" type="text"
                                                                    id="userAddress" name="address"
                                                                    class="defaultBorders"
                                                                    value="${user.detailedAddress}" required>
                                                                <i class="fa fa-check-circle"
                                                                    aria-hidden="true"></i><br>
                                                                <i class="fa fa-exclamation-circle"
                                                                    aria-hidden="true"></i>

                                                                <small
                                                                    style="color: rgb(238, 0, 0);font-size: 12px;"></small>


                                                            </div>

                                                        </div>

                                                        <!-- CREDIT LIMIT -->

                                                        <div class="col-md-6">
                                                            <div class="group-input  defaultBorders">
                                                                <label for="credit" class="registerLabel">Credit
                                                                    limit</label>
                                                                <input style="border-color:rgb(0, 112, 47);" type="text"
                                                                    id="userCreditLimit" name="creditLimit"
                                                                    class="defaultBorders" value="${user.wallet}"
                                                                    required>
                                                                <i class="fa fa-check-circle"
                                                                    aria-hidden="true"></i><br>
                                                                <i class="fa fa-exclamation-circle"
                                                                    aria-hidden="true"></i>

                                                                <small
                                                                    style="color: rgb(238, 0, 0);font-size: 12px;"></small>
                                                            </div>
                                                        </div>

                                                        <div class="col-md-12" style="text-align: center;">
                                                            <button type="submit"
                                                                class="site-btn register-btn defaultBorders"
                                                                style="width: 30vw;" id="updateButton">Update
                                                                profile</button>
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



            <%@ include file="footer.jsp" %>
                <%@ include file="commons-js.jsp" %>
                    <%-- <script src="js/shop-categories.js" type="text/javascript">
                        </script> --%>
                        <script src="js/wishlist.js" type="text/javascript"></script>
                        <script src="js/user-update-profile.js" type="text/javascript"></script>


</body>

</html>