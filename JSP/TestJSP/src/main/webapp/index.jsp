<!--test comment -->
<jsp:include page="header.jsp"/>
<%! int tableOf = 17;%>
Table of <%=tableOf%>

<% for(int i= 1;i<=10;i++){
    out.print("<br/>"+tableOf+" x "+i+"="+(tableOf*i));
   }%>
   <br/>
   <%=new java.util.Date()%>
