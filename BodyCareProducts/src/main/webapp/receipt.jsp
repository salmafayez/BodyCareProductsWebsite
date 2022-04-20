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
<%@ include file="header.jsp" %>

          <div class="container-fluid" style="background-image: url(img/background_img.jpg); background-repeat: no-repeat; background-size: cover;">
             <section class="checkout-section spad">
                 <div class="container">
                    <div class="row" style="justify-content: center;">
                         <div class="col-lg-6 px-5 py-5" style="background-color: #f5f5f5; border-radius: 15px;">
                             <div class="place-order">
                                 <div style="display: flex;justify-content: center;">
                                 <h4> Thank you for purchasing our products</h4>
                             </div>
                             <div>
                             <a href="home"><button class="site-btn place-btn">Home</button></a>
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