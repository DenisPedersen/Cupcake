<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@taglib prefix="t" tagdir="/WEB-INF/tags" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page errorPage="error.jsp" isErrorPage="false" %>

<t:pagetemplate>
    <jsp:attribute name="header">
        Velkommen hos Olsker Cupcakes!
    </jsp:attribute>

    <jsp:attribute name="footer">

     </jsp:attribute>

    <jsp:body>



        <c:forEach items="${applicationScope.eventArrayList}" var="item" >

        <div class="card">
            <div class="card-body">
                <h5 class="card-title">${item.startTime}</h5>
                <h6 class="card-subtitle mb-2 text-muted">${item.duration} time(r)</h6>
                <p class="card-text">${item.address}</p>
                <button type="button" class="btn btn-primary" data-bs-toggle="modal" data-bs-target="#exampleModalCenter">
                    Book</button>
            </div>
        </div>

    </jsp:body>

</t:pagetemplate>