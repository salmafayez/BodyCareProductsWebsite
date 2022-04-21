<!DOCTYPE html>
<html lang="zxx">
    <head>
        <meta charset="UTF-8">
        <meta name="description" content="Fashi Template">
        <meta name="keywords" content="Fashi, unica, creative, html">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <meta http-equiv="X-UA-Compatible" content="ie=edge">
        <title>Review Order</title>
        <%@ include file="commons-styles.jsp" %>
    </head>`

    <body>
        <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

        <!-- Page Preloder -->
        <div id="preloder">
            <div class="loader"></div>
        </div>
         <%@ include file="header.jsp" %>

          <div class="container-fluid" style="background-image: url(img/background_img.jpg); background-repeat: no-repeat; background-size: cover;">
             <section class="checkout-section spad">
                 <div class="container">
                     <form action="execute_payment" class="checkout-form" method="POST">
                         <div class="row" style="justify-content: center;">

                             <div class="col-lg-6 px-5 py-5" style="background-color: #f5f5f5; border-radius: 15px;">

                                 <div class="place-order">
                                     <div style="display: flex;justify-content: center;">
                                     <h4> Please review before paying </h4>
                                 </div>
                                     <div class="order-total">
                                         <ul class="order-table">
                                             <li>Transaction details </li>
                                             <li>Total price <span>${transaction.amount.total} USD</span></li>

                                             <li>Payment Information </li>
                                             <li>Username <span>${payer.firstName}</span></li>
                                             <li>Email <span>${payer.email}</span></li>

                                             <li>Shipping address </li>
                                             <li>country <span>${currentUser.country}</span></li>
                                             <li>city <span>${currentUser.city}</span></li>
                                             <li>Detailed address <span>${currentUser.detailedAddress}</span></li>
                                         </ul>
                                        <input type="hidden" name="paymentId" value="${param.paymentId}" />
                                         <input type="hidden" name="PayerID" value="${param.PayerID}" />
                                         <button class="site-btn place-btn">Pay Now</button>

                                     </div>
                                 </div>
                             </div>
                         </div>
                     </form>
                 </div>
             </section>
         </div>
        <%@ include file="commons-js.jsp" %>


    </body>

</html>