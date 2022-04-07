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



        <table class="table table-striped">
            <thead>
            <tr>
                <th scope="col">#</th>
                <th scope="col">Antal</th>
                <th scope="col">Bund</th>
                <th scope="col">Topping</th>
                <th scope="col">Pris</th>

            </tr>
            </thead>
            <tbody>
        <c:set var="index" value="0"></c:set>
        <c:forEach items="${sessionScope.cupcakeOrderArrayList}" var="item" varStatus="loop">
            <tr>
                <th scope="row">${index = index +1}</th>
                <td>${item.amount}</td>
                <td>${item.bottom.name}</td>
                <td>${item.topping.name}</td>
                <td>${item.total}kr.</td>
            </tr>
            </tbody>
        </c:forEach>
        </table>

      <%--  <c:forEach items="${sessionScope.cupcakeOrderArrayList}" var="item">
            ${item}
            <br>
        </c:forEach>--%>




    </jsp:body>
</t:pagetemplate>