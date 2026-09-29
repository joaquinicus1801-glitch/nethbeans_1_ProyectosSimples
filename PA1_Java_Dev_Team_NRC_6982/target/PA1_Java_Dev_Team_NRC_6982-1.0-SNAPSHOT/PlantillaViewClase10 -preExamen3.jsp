

<%@page contentType="text/html" pageEncoding="UTF-8"%> <!-- es para tener listo una plantilla -->
<%@include file="WEB-INF/Template/header.jsp" %>
<div class="container-fluid">
    <div class="d-flex justify-content-center">
        <div class="row">
            <form action="PlantillaController" method="GET">
                <h5>Plantilla</h5>
                <br/>
                <button class="btn btn-danger" type="submit">Enviar</button>
                <br/>
                <label class="form-label"></label>
            </form>
        </div>
    </div>
</div>
<%@include file="WEB-INF/Template/FooterView.jsp" %>