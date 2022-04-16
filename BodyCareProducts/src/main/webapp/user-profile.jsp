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

<body >
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
                <div class="container-fluid" style="background-image: url(img/background_img.jpg); background-repeat: no-repeat; background-size: cover;">
            <div class="row">
                <div class="col-lg-12 order-1 order-lg-2">
                    <div class="product-list">
                        <div class="row">


                            <div class="container">



                                <section class="checkout-section spad">
                                    <div class="container">

                                        <form action="userupdateprofile" class="profile-form">
                                            <div class="row" style="justify-content: center;">

                                                <div class="col-lg-12 px-5 py-5"
                                                    style="background-color: #f5f5f5; border-radius: 15px;">

                                                    <div class="place-order">
                                                        <div >
                                                            <h4 style="color: #2B394A;font-weight: 700;text-align: center;margin-bottom: 35px;">ACCOUNT DETAILS</h4>

                                                        </div>
                                                        <div class="order-total" style="margin-top: 20px;">
                                                            <table class="table table-bordered"
                                                                style="border-color: #d79681;font-size: 20px;">
                                                    
                                                                <tbody style="text-align: center;">
                                                                    <tr>

                                                                        <td colspan="3" style="font-weight: bold;">
                                                                            UserName:
                                                                        </td>
                                                                        <td colspan="4">${user.userName}</td>

                                                                    </tr>
                                                                    <tr>

                                                                        <td colspan="3" style="font-weight: bold;">
                                                                            Email:
                                                                        </td>
                                                                        <td colspan="4">${user.email}</td>
                                                                    </tr>
                                                                    <tr>

                                                                        <td colspan="3" style="font-weight: bold;">
                                                                            PhoneNumber:</td>
                                                                        <td colspan="4">${user.phoneNumber}</td>
                                                                    </tr>
                                                                    <tr>

                                                                        <td colspan="3" style="font-weight: bold;">
                                                                            User Country:</td>
                                                                        <td colspan="4">${user.country}</td>
                                                                    </tr>
                                                                    <tr>

                                                                        <td colspan="3" style="font-weight: bold;">
                                                                            User City:</td>
                                                                        <td colspan="4">${user.city}</td>
                                                                    </tr>
                                                               
                                                                    <tr>

                                                                        <td colspan="3" style="font-weight: bold;">
                                                                            Wallet:
                                                                        </td>
                                                                        <td colspan="4">${user.wallet}</td>
                                                                    </tr>
                                                                </tbody>
                                                            </table>

                                                            <div class="order-btn"
                                                                style="margin-top: 20px;text-align: center;">
                                                                <button type="submit"
                                                                    class="site-btn place-btn defaultBorders">Edit
                                                                    Profile</button>
                                                            </div>
                                                        </div>
                                                    </div>
                                                </div>
                                            </div>
                                        </form>
                                    </div>
                                </section>


                            </div>


                        </div>
                    </div>



                </div>


            </div>

</div>

            <%@ include file="footer.jsp" %>
                <%@ include file="commons-js.jsp" %>
                    <%-- <script src="js/shop-categories.js" type="text/javascript"></script> --%>
                    <script src="js/wishlist.js" type="text/javascript"></script>
</body>

</html>