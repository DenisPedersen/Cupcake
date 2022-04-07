<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@taglib prefix="t" tagdir="/WEB-INF/tags" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<t:pagetemplate>
    <jsp:attribute name="header">
        Her er så kurven
    </jsp:attribute>

    <jsp:attribute name="footer">

     </jsp:attribute>

    <jsp:body>

            ${requestScope.cupcakeOrder}

        <c:forEach items="${applicationScope.orderlineArrayList}" var="item" >

            <%--Her forestiller jeg mig at vi skal køre et array med orderlines som så
            vises for den gældende ordre ... --%>

        </c:forEach>





    </jsp:body>

</t:pagetemplate>