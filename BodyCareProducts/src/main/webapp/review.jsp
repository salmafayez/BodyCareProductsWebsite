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
<form action="execute_payment" method="post">
    <div>
    <input type="hidden" name="paymentId" value="${param.paymentId}" />
                    <input type="hidden" name="PayerID" value="${param.PayerID}" />
        <p>order page </p>
    </div>
    <input type="submit" value="Pay Now" />
 </form>
    <%@ include file="commons-js.jsp" %>


</body>

</html>