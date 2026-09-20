<%@taglib prefix="c" uri="jakarta.tags.core" %> 
<%@include file="Principal/MenuDePaginas.jsp" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<main class="d-flex justify-content-center" >
    <div class="abecedario">
        <div class="container-sm bg-body p-3 abecedario-1">
            <h2 class="fw-bold text-secondary text-center">Abecedario</h2>
            <hr>
            <form action="AbecedarioController" method="GET"class="text-center">
                <div class="fs-3 cuadro-letras d-flex flex-wrap gap-3 justify-content-center ">
                    <c:forEach var="letra" items="${Abecedario}" varStatus="status">
                        <div>
                            <p class="d-inline-block text-danger">${String.valueOf(letra).toUpperCase()}</p>
                            <p class="d-inline-block text-primary">${letra}</p>
                        </div>
                    </c:forEach>
                </div>
                <button class="btn btn-primary btn-lg rounded-pill">Mostrar Abecedario</button>
            </form>

        </div>
    </div>


</main>
<%@include file="Principal/Footer.jsp" %>