<%@ page import="dao.UserDao"%>
<jsp:useBean id="u" class="bean.User"/>
<jsp:setProperty property = "*" name="u"/>

<%
boolean validate = UserDao.validate(u);
if(validate){
    out.print("Welcome ");
}else{
out.print("Wrong credentials");
}
%>
