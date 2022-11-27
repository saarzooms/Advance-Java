<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql"%>
<%@ page  isELIgnored="false"%>

<c:out value="Hello1"/>

<c:catch var="myException">
    <%
        int age = 16;
        if(age<17)
        {
            throw new RuntimeException("Under Age");
        }else{
            out.print("<br/>Welcome<br/>");
        }
    %>
</c:catch>
<br/>
<c:if test="${myException !=null}">

Exception is ${myException}<br/>
</c:if>


<c:set value="${4*4}" var="num" scope="session"/>
<c:out value="${num}"/>
<br/>
<c:forEach var="i" begin="5" end="7">
    <c:out value="${i*i}"/><br/>
</c:forEach>
<c:remove var="myException"/>
Val<c:out value = "${myException}"/> done
<c:import var ="data" url="http://google.com"/>
<c:url value="test.html" var="myUrl">
    <c:param name="p1" value="a"/>
    <c:param name="p2" value="b"/>
</c:url>
<br/>
<a href="${myUrl}">test</a>
<c:out value="${fn:length('Shamsaagazarzoo')}"/>
<c:out value="${fn:toLowerCase('Shamsaagazarzoo')}"/>
<c:out value="${fn:replace('I am here','here','there')}"/>
<c:out value="${fn:substring('I am here',2,7)}"/>
<br/>
<fmt:parseDate value="03/01/2002" var="bDate" pattern="dd/MM/yyyy"/>
<c:out value="${bDate}"/>
<br/>
<c:set var="amt" value="450.68475"/><br/>
<fmt:formatNumber value="${amt}" type="currency"/><br/>
<fmt:formatNumber value="${amt}" type="percent" maxIntegerDigits="4" maxFractionDigits="5"/><br/>
<fmt:formatNumber value="${amt}" type="number" pattern="####.#######&"/><br/>

