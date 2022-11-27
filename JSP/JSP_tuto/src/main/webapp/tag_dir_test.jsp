<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="x" uri="http://java.sun.com/jsp/jstl/xml"%>

<c:forEach var="i" begin="1" end="5">
    <h1><%="test"%></h1>
</c:forEach>
<c:import var="bookInfo" url="test.xml"/>
<x:parse xml="${bookInfo}" var="output"/>
<x:out select="$output/books/book[1]/name"/>