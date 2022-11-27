<%@ page import="models.Users"%>
welcome <%
Users u = (Users)request.getAttribute("user");
out.println(u.getUserName());
%>