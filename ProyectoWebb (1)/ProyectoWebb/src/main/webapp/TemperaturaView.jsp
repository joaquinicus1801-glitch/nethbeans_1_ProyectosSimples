<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%@include file="WEB-INF/Template/HeaderView.jsp"%>

<div class="container">

    <div class="card w-50">

        <div class="card-header bg-success text-white">
            <h2>CONVERSIÓN DE TEMPERATURA</h2>
        </div>

        <div class="card-body bg-light">

            <form action="TemperaturaController"
                  method="POST">

                <label>
                    Ingrese grados Celsius (°C)
                </label>

                <input type="number"
                       step="any"
                       name="celsius"
                       class="form-control"
                       required/>

                <br/>

                <button class="btn btn-success"
                        type="submit">

                    Convertir

                </button>

            </form>

            <br/>

            <label class="text-danger">
                ${error}
            </label>

        </div>

    </div>

</div>

<%@include file="WEB-INF/Template/FooterView.jsp"%>
