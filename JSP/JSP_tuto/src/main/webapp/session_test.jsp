<%= session.getAttribute("uname")%><br/>
<%= session.getAttribute("college_name")%><br/>
<%= application.getAttribute("college_name")%><br/>
<%
    String name = (String)pageContext.getAttribute("college_name",pageContext.APPLICATION_SCOPE);
    out.print("name "+name);
    String pageName = page.toString();
    out.println("page name "+pageName);
%>