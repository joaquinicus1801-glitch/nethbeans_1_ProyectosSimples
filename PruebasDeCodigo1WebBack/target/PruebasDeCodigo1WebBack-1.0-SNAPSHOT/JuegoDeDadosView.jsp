<%@include file="Principal/MenuDePaginas.jsp" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<main id="JuegoDeDados" class="d-flex justify-content-center align-items-center">
    <div class="p-3">
        <h2 class="text-center " >Juegos de Dados</h2>
        <hr>
        <form action="juegoDeDadosController" method="POST">
            <div>
                <div>
                    <p class="text-center">Tu</p>
                    <button class="btn btn-success" name="jugador" value="tu">Lancen los dados!!!</button>
                </div>
                <div>
                    <p>VS</p>
                </div>
                <div>
                    <p class="text-center">Bot</p>
                    <button class="btn btn-success" name="jugador" value="bot">Lancen los dados!!!</button>
                </div>
            </div>
        </form>
        <p class="ms-2">resultados:</p>
        <p>${sAviso}</p>
        <div>
            <input type="checkbox" id="desplegar">
            <p>tu:${dadosJugador}</p>
            <input type="text" readonly value="${sumaJugador}">
            <p>Bot:${dadosBot}</p>
            <input type="text" readonly value="${sumaBot}">
        </div>
        <p></p>
    </div>
</main>
<%@include file="Principal/Footer.jsp" %>

