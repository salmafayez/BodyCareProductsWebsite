<!DOCTYPE html>
<html lang="zxx">
<head>
    <meta charset="UTF-8">
    <meta name="description" content="Fashi Template">
    <meta name="keywords" content="Fashi, unica, creative, html">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Register</title>

    <%@ include file="commons-styles.jsp" %>
</head>

<body onload="checkInputs();">
    <!-- Page Preloder -->
    <div id="preloder">
        <div class="loader"></div>
    </div>

    <%@ include file="header.jsp" %>

     <!-- Register Section Begin -->
     <div class="container-fluid pageBody ">
        <div class="register-login-section spad">
            <div class="container ">
                <div class="row">
                    <div class="col-lg-8 m-auto">
                        <div class="card px-4 py-4"
                            style="color:white;border-radius: 15px;background-color: #f5f5f5;">
                            <div class="card-body">
                                <div class="register-form">
                                    <h2>Register</h2>

                                    <form method="post" action="register" id="myRegisterForm" name="myRegisterForm" class="row g-3" >

                                        <!--     USERNAME -->

                                        <div class="col-md-6">
                                            <div class="group-input ">
                                                <label for="username" class="registerLabel">Username</label>
                                                <input type="text" id="username" name="username" class="defaultBorders " required >

                                                <i class="fa fa-check-circle" aria-hidden="true" ></i><br>
                                                <i class="fa fa-exclamation-circle" aria-hidden="true" ></i>

                                                <small  style="color: rgb(238, 0, 0);font-size: 12px;"></small>

                                            </div>
                                        </div>

                                         <!-- PHONENUMBER -->
                                        <div class="col-md-6">
                                            <div class="group-input defaultBorders ">
                                                <label for="phoneNumber" class="registerLabel">PhoneNumber</label>
                                                <input type="text" id="phoneNumber" name="phoneNumber" class="defaultBorders " required >
                                                <i class="fa fa-check-circle" aria-hidden="true" ></i><br>
                                                <i class="fa fa-exclamation-circle" aria-hidden="true" ></i>

                                                <small  style="color: rgb(238, 0, 0);font-size: 12px;"></small>
                                               
                                            </div>
                                        </div>

                                        <!-- EMAIL-->

                                        <div class="col-md-12">
                                            <div class="group-input ">
                                                <label for="email" class="registerLabel">email</label>
                                                <input type="email" id="email" name="email" class="defaultBorders" required>
                                                <i class="fa fa-check-circle" aria-hidden="true" ></i><br>
                                                <i class="fa fa-exclamation-circle" aria-hidden="true" ></i>

                                                <small  style="color: rgb(238, 0, 0);font-size: 12px;"></small>
                                            </div>
                                        </div>

                                         <!-- PASSWORD -->

                                        <div class="col-md-6">
                                            <div class="group-input defaultBorders">
                                                <label for="pass" class="registerLabel">Password *</label>
                                                <input type="password" id="password" name="password" class="defaultBorders" required>
                                                <i class="fa fa-check-circle" aria-hidden="true" ></i><br>
                                                <i class="fa fa-exclamation-circle" aria-hidden="true" ></i>

                                                <small  style="color: rgb(238, 0, 0);font-size: 12px;"></small>
                                            </div>
                                        </div>

                                         <!-- PASSWORD CONFIRMATION -->

                                        <div class="col-md-6">
                                            <div class="group-input defaultBorders">
                                                <label for="con-pass" class="registerLabel">Confirm Password *</label>
                                                <input type="password" id="confirmPassword" name="confirmPassword" class="defaultBorders" required>
                                                <i class="fa fa-check-circle" aria-hidden="true" ></i><br>
                                                <i class="fa fa-exclamation-circle" aria-hidden="true" ></i>

                                                <small  style="color: rgb(238, 0, 0);font-size: 12px;"></small>
                                            </div>
                                        </div>
                                        
                                         <!-- BIRTHDAY-->

                                        <div class="col-md-6">
                                            <div class="group-input defaultBorders">
                                                <label for="birthday" class="registerLabel">Birthday</label>
                                                <input type="date" id="birthday" name="birthday" class="defaultBorders" required>
                                               
                                                <small style="color: rgb(238, 0, 0);font-size: 12px;">birthday !!</small>
                                            </div>
                                        </div>

                                         <!-- JOB -->

                                        <div class="col-md-6">
                                            <div class="group-input defaultBorders">
                                                <label for="job" class="registerLabel">Job</label>
                                                <input type="text" id="job" name="job" class="defaultBorders" required>
                                                <i class="fa fa-check-circle" aria-hidden="true" ></i><br>
                                                <i class="fa fa-exclamation-circle" aria-hidden="true" ></i>

                                                <small  style="color: rgb(238, 0, 0);font-size: 12px;"></small>
                                            </div>
                                        </div>

                                         <!-- COUNTRY -->

                                        <div class="col-md-12 defaultBorders">
                                            <label for="countriesLabel"
                                                class="form-label registerLabel">Countries</label>
                                            <select id="country" name="country" class="form-select selectRegion"
                                                style="margin-top: 13px;border-radius: 15px;">
                                            </select>
                                        </div>
                                        
                                            <!-- STATE -->
                                        <div class="col-md-6 ">

                                            <label for="statesLabel"
                                                class="form-label registerLabel">states</label>
                                            <select id="state" name="state" class="form-select selectRegion"style="margin-top: 13px;border-radius: 15px;">

                                            </select>

                                        </div>
                                            <!-- CITY -->
                                        <div class="col-md-6 ">

                                            <label for="citiesLabel"
                                                class="form-label registerLabel">Cities</label>
                                            <select id="city" name="city" class="form-select selectRegion"style="margin-top: 13px;border-radius: 15px;">

                                            </select>

                                        </div>

                                        

                                         <!-- ADDRESS -->

                                        <div class="col-md-12">
                                            <div class="group-input defaultBorders">
                                                <label for="address" class="registerLabel">Address</label>
                                                <input type="text" id="address" name="address" class="defaultBorders" required>
                                                <i class="fa fa-check-circle" aria-hidden="true" ></i><br>
                                                <i class="fa fa-exclamation-circle" aria-hidden="true" ></i>

                                                <small  style="color: rgb(238, 0, 0);font-size: 12px;"></small>


                                            </div>
                                            
                                        </div>

                                         <!-- CREDIT LIMIT -->
                                         
                                        <div class="col-md-6">
                                            <div class="group-input defaultBorders">
                                                <label for="credit" class="registerLabel">Credit limit</label>
                                                <input type="text" id="creditLimit" name="creditLimit" class="defaultBorders" required>
                                                <i class="fa fa-check-circle" aria-hidden="true" ></i><br>
                                                <i class="fa fa-exclamation-circle" aria-hidden="true" ></i>

                                                <small  style="color: rgb(238, 0, 0);font-size: 12px;"></small>
                                            </div>
                                        </div>
                                         <!-- Gender -->
                                         
                                        <div class="col-md-6" id="genderCheck">
                                            <label for="interests" class="registerLabel" >Gender</label><br>
                                            <div class="form-check form-check-inline">
                                                <input class="form-check-input" type="radio" name="gender" id="genderMale" value="male">
                                                <label class="form-check-label registerLabel" for="flexRadioDefault1" >
                                                  Male
                                                </label>
                                              </div>
                                              <div class="form-check form-check-inline">
                                                <input class="form-check-input" type="radio" name="gender" id="genderFemale" value="female" checked>
                                                <label class="form-check-label registerLabel" for="flexRadioDefault2">
                                                  Female
                                                </label>
                                              </div>
                                             
                                        </div>


                                         <!-- INTERESTS -->

                                        <div class="col-md-12" style="padding-left:10px ;padding-bottom: 20px;">
                                            <label for="interests" class="registerLabel" >Interests</label><br>
                                            <div class="form-check form-check-inline">

                                                <input class="form-check-input" type="checkbox" value="bathAndShower"id="interest" name="interest" checked>
                                                <label class="form-check-label registerLabel" for="inlineCheckbox1">
                                                    Bath&Shower
                                                </label>
                                                
                                            </div>
                                            
                                            <div class="form-check form-check-inline">
                                                <input class="form-check-input" type="checkbox" value="fragrance" id="interest" name="interest" >
                                                <label class="form-check-label registerLabel" for="inlineCheckbox2" >
                                                    Fragrance
                                                </label>
                                            </div>
                                            <div class="form-check form-check-inline">
                                                <input class="form-check-input" type="checkbox" value="candles" id="interest" name="interest" >
                                                <label class="form-check-label registerLabel" for="inlineCheckbox3" >
                                                    Candles
                                                </label>
                                            </div>
                                        </div>


                                        <div class="col-md-12" style="text-align: center;">
                                        <button type="submit" class="site-btn register-btn defaultBorders" style="width: 30vw;" id="register">REGISTER</button>
                                    </div>

                                    </form>
                                    <div class="switch-login">
                                        <a href="./login.html" class="or-login">Or Login</a>
                                    </div>
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
    <script src="js/registerValidation.js?version=1.1" type="text/javascript"></script>
    
</body>

</html>