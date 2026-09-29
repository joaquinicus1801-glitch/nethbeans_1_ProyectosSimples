<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="WEB-INF/Template/header.jsp" %>
        <form action="ConversionDeMonedaController" method="POST">

            <h1>Conversion de Moneda</h1>

            <label>Introduce el monto a cambiar: </label>
            <input type="number" name="cantidad" />
            <br>
            <br>
            <br>
            <label for="opciones">Selecione una moneda:</label>
            <select name="primeraMoneda" id="opciones" onchange="Moneda1()">
                <option value="">--Selecciona--</option>
                <option value="soles">Soles</option>
                <option value="dolares">Dolares</option>
                <option value="euros">Euros</option>
            </select>

            <br>
            <br>
            <br>

            <label for="opciones">Elige la moneda de cambio:</label>
            <select name="segundaMoneda" id="opciones" onchange="Moneda2()">
                <option value="">--Selecciona--</option>
                <option value=soles>Soles</option>
                <option value="dolares">Dolares</option>
                <option value="euros">Euros</option>
            </select>
            <br>
            <br>
            <button type="submit" name="btnCambio">Generar cambio </button>
            <br>
            <br>
            <label> Al tipo de cambio es :${sResponse} </label>





        </form>
        <%@include file="WEB-INF/Template/FooterView.jsp" %>