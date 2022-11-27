from page 2
<%
    String nm = request.getParameter("uname");
    session.setAttribute("uname",nm);

%>
<a href="page_three.jsp">page 3</a>