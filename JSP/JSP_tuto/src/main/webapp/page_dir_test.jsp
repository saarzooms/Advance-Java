<%@ page
language="java"
import="java.util.Date"
contentType="text/html"
info="Page directive test for Online class"
buffer="16kb"
isThreadSafe = "true"
session="true"
errorPage="error_test.jsp"
%>
Date : <%= new Date()%>
<%= session.getAttribute("uname")%><br/>
<%= 5/0%>
