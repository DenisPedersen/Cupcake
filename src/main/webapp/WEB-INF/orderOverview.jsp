<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@taglib prefix="t" tagdir="/WEB-INF/tags" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<t:pagetemplate>
    <jsp:attribute name="header">
        Velkommen hos Olsker Cupcakes!
    </jsp:attribute>

    <jsp:attribute name="footer">

     </jsp:attribute>

    <jsp:body>



        <c:forEach items="${requestScope.orderArrayList}" var="item" >
            Her er ordreid: ${item.order_id}
            Her er den totale pris: ${item.timestamp}
        </c:forEach>




    </jsp:body>

</t:pagetemplate>
