<!DOCTYPE html>
<html lang="zxx">
<head>
    <meta charset="UTF-8">
    <meta name="description" content="Fashi Template">
    <meta name="keywords" content="Fashi, unica, creative, html">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Fashi | Template</title>

    <%@ include file="commons.jsp" %>
    </head>

<body>
    <!-- Page Preloder -->
    <div id="preloder">
        <div class="loader"></div>
    </div>

   <%@ include file="header.jsp" %>

    <!-- Register Section Begin -->
    <div class="container-fluid pageBody ">
        <div class="register-login-section spad">
            <div class="container">
                <div class="row">
                    <div class="col-lg-6 offset-lg-3">
                        <div class="card px-4 py-4"
                            style="color:white;width: 35rem;border-radius: 15px;background-color: #f5f5f5;">
                            <div class="card-body">
                                <div class="login-form">
                                    <h2>Login</h2>
                                    <%@ include file="error.jsp" %>
                                    <form action="login" method="post" id="loginform">
                                        <div class="group-input">
                                            <label for="email">Email *</label>
                                            <input type="email" id="email" name="email" class="defaultBorders">
                                            <i class="fa fa-check-circle" aria-hidden="true" ></i><br>
                                            <i class="fa fa-exclamation-circle" aria-hidden="true" ></i>
                                            <small  style="color: rgb(238, 0, 0);font-size: 12px;"></small>
                                             
                                        </div>
                                        <div class="group-input">
                                            <label for="password">Password *</label>
                                            <input type="password" id="password" name="password" class="defaultBorders">
                                        </div>
                                        <div class="group-input gi-check">
                                            <div class="gi-more">
                                                <label for="save-pass">
                                                    Save Password
                                                    <input type="checkbox" name="remember" id="save-pass">
                                                    <span class="checkmark"></span>
                                                </label>
                                                <a href="#" class="forget-pass">Forget your Password</a>
                                            </div>
                                        </div>
                                        <button type="submit" class="site-btn login-btn defaultBorders">Sign In</button>
                                    </form>
                                    <div class="switch-login">
                                        <a href="./register.html" class="or-login">Or Create An Account</a>
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

</body>

</html>