

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="Principal/MenuDePaginas.jsp" %>
<main>
    <h2>Calculo De Figura</h2>
    <form action="CalcularFiguraController" method="POST">
        <div class="container p-2 mb-2" style="border: 1px solid black; border-radius: 8px;">
            <p class="text-center">Observa la imagen</p>
            <div style="display:flex; justify-content: center;">
                <img src="CalculoFiguraImagen/figura_calcular.png" alt="imagen de un triangulo"/>
            </div>
            <hr>
            <label><b>Ingresa el cateto Opuesto</b></label> <br>
            <input style="width: 100%" type="number" min="0" placeholder="ejm.15" name="CatOpuesto" step="1">
            <label><b>Ingresa el cateto Adyacente</b></label> <br>
            <input style="width: 100%" type="number" min="0" placeholder="ejm.15" name="CatAdyacente" step="1">
            <button class="btn btn-primary m-2" style="width: 99%" type="submit">Calcular</button>
        <p>${sAviso}</p> 
        <div class="CalcFiguraRespuestas" style="display: flex; flex-wrap: wrap;">
            <label><b>Hipotenusa</b></label> 
            <input class="ms-2 me-2" type="text" readonly value="${RespHipotenusa}">
            <br>
            <label><b>area del triangulo</b></label>             
            <input class="ms-2 me-2"  type="text" readonly value="${RespArea}">
            <br>
            <label><b>Angulo A</b></label> 
            <input class="ms-2 me-2"  type="text" readonly value="${RespAnguloA}">
            <br>
            <label><b>Angulo B</b></label> 
            <input class="ms-2 me-2"  type="text" readonly value="${RespAnguloB}">

        </div>
        </div>
    </form>
            <% String saludar = "que tal"; %>
            <p>hola : <%=saludar %></p>
          
</main>
<%@include file="Principal/Footer.jsp" %>