<head>
    <title>JSP test</title>
</head>
<%! int b= 20;%>
<%=new java.util.Date()%>
<br/>
<%
    int a = 10;
//    String name = request.getParameter("uname");
   // out.print("Welcome to jsp "+(a+b)+"<br/>"+name);
//    response.sendRedirect("https://google.com");
%>
<%
    String uname = config.getInitParameter("uname");
    out.print("<br/>"+uname);
    String dbname = application.getInitParameter("dbname");
    out.print("<br/>"+dbname);
    session.setAttribute("uname","Arzoo Alam");
    pageContext.setAttribute("college_name","marwadi",pageContext.APPLICATION_SCOPE);
    pageContext.setAttribute("college_name","marwadi uni",pageContext.SESSION_SCOPE);
%>
