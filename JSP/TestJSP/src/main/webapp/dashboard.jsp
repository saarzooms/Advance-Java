<jsp:include page="header.jsp"/>

<br/>
Welcome <%
String name =(String)session.getAttribute("uname");
    out.print(name);
%>
