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
                <div class="row" style="justify-content: center;">
                    <div class="col-lg-3 px-4 py-4" style="background-color: #f5f5f5; border-radius: 15px 0px 0px 15px;">
                        
                        <h4>My Account</h4>
                        <br>
                        <ul class="my-account">
                            <li>
                                <a href="order-history.jsp">Orders</a>
                            </li>
                            <li>
                                <a href="contact-details.jsp"class="active" >Contact Details</a>
                            </li>
                        </ul>
                
                    </div>

                    <div class="col-lg-8 px-4 py-4" style="background-color: #f5f5f5; border-radius: 0px 15px 15px 0px;">
                        <div class="card-body">
                            <div class="register-form">
                                <h4 style="color: #2B394A; margin-bottom: 30px;">Contact Details</h4>
                                <form action="#" class="row g-3">
                                    <div class="col-md-6">
                                        <div class="group-input ">
                                            <label for="username" class="registerLabel">Username *</label>
                                            <input type="text" id="username" class="defaultBorders" srequired>
                                        </div>
                                    </div>
                                    <div class="col-md-6">
                                        <div class="group-input defaultBorders">
                                            <label for="phoneNumber" class="registerLabel">PhoneNumber *</label>
                                            <input type="text" id="phoneNumber" class="defaultBorders" required>
                                        </div>
                                    </div>
                                    <div class="col-md-12">
                                        <div class="group-input ">
                                            <label for="email" class="registerLabel">Email *</label>
                                            <input type="email" id="email" class="defaultBorders" required>
                                        </div>
                                    </div>
                                    <div class="col-md-12">
                                        <div class="group-input defaultBorders">
                                            <label for="address" class="registerLabel">Address *</label>
                                            <input type="text" id="address" class="defaultBorders" required>
                                        </div>
                                    </div>

                                    
                                    <div class="col-md-12" style="text-align: center;">
                                        <button type="submit" class="site-btn register-btn defaultBorders"
                                            style="width: 30vw;">Save</button>
                                    </div>
                                </form>
                            </div>
                        </div>
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