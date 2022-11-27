<%@ taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<sql:setDataSource var="db" driver="com.mysql.jdbc.Driver"
    url="jdbc:mysql://localhost:3306/test"
    user="root"
/>
<sql:query dataSource="${db}" var="rs">
    select * from students;
</sql:query>
<c:forEach var="row" items="${rs.rows}">
    <c:out value="${row.name}"/><br/>
</c:forEach>
