    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%

 String errorMessage = (String) request.getAttribute("errorMessage");
 System.out.println("inside errormeaage");
 if(errorMessage != null){
%>
     <p class="text-danger"><%= errorMessage %> </p>
<%
 }
%>