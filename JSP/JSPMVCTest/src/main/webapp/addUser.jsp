<%@ page import="dao.UserDao" %>
<jsp:useBean id="u" class="bean.User"/>
<jsp:setProperty property="*" name="u"/>

<%
    int i = UserDao.save(u);
    if(i>0){
    out.print("User Added");
    }else{
    out.print("Problem");
    }
%>