
<%

 String errorMessage = (String) request.getAttribute("error");
 if(errorMessage != null){
%>
     <p class="text-danger"><%= errorMessage %> </p>
<%
 }
%>