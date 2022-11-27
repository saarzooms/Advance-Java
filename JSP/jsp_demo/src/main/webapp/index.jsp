<html>
<body>
 <%response.setIntHeader("Refresh", 1);%>
<h2><%
out.println("Your IP address is "+request.getRemoteAddr());
%>
</h2>
<%=(new java.util.Date()).toLocaleString()%>
</body>
</html>
