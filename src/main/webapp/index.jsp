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


        <c:forEach items="${applicationScope.bottomArrayList}" var="item" >

        <div class="card">
            <div class="card-body">

                <h5 class="card-title">${item.name}</h5>
                <h6 class="card-subtitle mb-2 text-muted">${item.price} kr</h6>
                <button type="button" class="btn btn-primary" data-bs-toggle="modal" data-bs-target="#exampleModalCenter">
                    Vælg!</button>
            </div>
        </div>

        </c:forEach>


            <!-- Modal -->
            <div class="modal fade" id="exampleModalCenter" tabindex="-1" role="dialog" aria-labelledby="exampleModalCenterTitle" aria-hidden="true">
                <div class="modal-dialog modal-dialog-centered" role="document">
                    <div class="modal-content">
                        <div class="modal-header">
                            <h5 class="modal-title" id="exampleModalLongTitle">${item.name}</h5>
                            <button type="button" class="close" data-bs-dismiss="modal" aria-label="Close">
                                <span aria-hidden="true">&times;</span>
                            </button>
                        </div>
                        <div class="modal-body">

                            <c:forEach items="${applicationScope.toppingArrayList}" var="item" >

                            <div class="button">
                                <button type="submit" class="btn btn-primary" id="payment">${item.name} </button>

                            </div>
                            </c:forEach>

                            </form>


                        </div>
                        <div class="modal-footer">
                            <button type="button" class="btn btn-secondary" data-bs-dismiss="modal">Luk</button>

                        </div>
                    </div>
                </div>
            </div>

        <a class="nav-item nav-link" href="${pageContext.request.contextPath}/AddToCart">Tilføj til kurv</a>


    </jsp:body>

</t:pagetemplate>