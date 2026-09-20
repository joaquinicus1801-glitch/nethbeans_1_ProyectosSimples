<%@include file="Principal/MenuDePaginas.jsp" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<main class="d-flex justify-content-center" >
    <div class="abecedario ">
        <div class="container-sm bg-secondary p-3">
            <h2 class="fw-bold text-light text-center">Abecedario</h2>
            <form action="AbecedarioController" method="GET"class="text-center">
                <p class="text-danger">${Abecedario}</p>
                <button class="btn btn-primary btn-lg rounded-pill">Mostrar Abecedario</button>
            </form>

        </div>
    </div>


</main>
<%@include file="Principal/Footer.jsp" %>