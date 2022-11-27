<%@ page import="dao.UserDao,java.util.*,bean.User" isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html lang="en">
<head>
  <title>Bootstrap Example</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
</head>
<body>

<div class="container">
  <h2>Basic Table</h2>
  <p>The .table class adds basic styling (light padding and only horizontal dividers) to a table:</p>
  <%
  List<User> list = UserDao.getAllUsers();
    request.setAttribute("list",list);
  %>
  <table class="table">
    <thead>
      <tr>
        <th>Id</th>
        <th>Username</th>
        <th>City</th>
        <th>Country</th>
        <th>Mobile</th>
        <th>Email</th>
      </tr>
    </thead>
    <tbody>
    <c:forEach items="${list}" var="user">
      <tr>
        <td>${user.getId()}</td>
        <td>${user.getUsername()}</td>
        <td>${user.getCity()}</td>
        <td>${user.getCountry()}</td>
        <td>${user.getMobileNo()}</td>
        <td>${user.getEmailId()}</td>
      </tr>
     </c:forEach>
    </tbody>
  </table>
</div>

</body>
</html>
