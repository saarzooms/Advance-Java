<jsp:include page="header.jsp"/>
<%

    String button = request.getParameter("go");
    if(button!=null && button.equals("Login")){
        String name = request.getParameter("uname");
        String pwd = request.getParameter("pwd");
        if(name.equals(pwd)){
            out.print("Welcome,"+name);
        }else{
            out.print("Wrong uname/pwd");
        }
    }


%>

<form>
    <input type="text" name="uname"/>
    <input type="password" name="pwd"/>
    <input type="submit" name="go" value="Login"/>
</form>