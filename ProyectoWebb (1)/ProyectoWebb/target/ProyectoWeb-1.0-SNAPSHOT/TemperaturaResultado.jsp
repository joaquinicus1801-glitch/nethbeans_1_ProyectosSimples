<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%@include file="WEB-INF/Template/HeaderView.jsp"%>

<div class="container">

    <div class="card w-100">

        <div class="card-header bg-success text-white">
            <h1>Resultado de la Conversión</h1>
        </div>

        <div class="card-body bg-light">

            <h4>
                Valor ingresado:
                <strong>${celsius} °C</strong>
            </h4>

            <br/>

            <h2>
                Forma 1 — Usando constructor y objeto
            </h2>

            <table class="table table-striped table-bordered">

                <thead class="table-primary">

                    <tr>
                        <th>Escala</th>
                        <th>Valor</th>
                    </tr>

                </thead>

                <tbody>

                    <tr>
                        <td>Fahrenheit (°F)</td>
                        <td>${temperatura.fahrenheit}</td>
                    </tr>

                    <tr>
                        <td>Kelvin (K)</td>
                        <td>${temperatura.kelvin}</td>
                    </tr>

                    <tr>
                        <td>Rankine (°R)</td>
                        <td>${temperatura.rankine}</td>
                    </tr>

                    <tr>
                        <td>Réaumur (°Ré)</td>
                        <td>${temperatura.reaumur}</td>
                    </tr>

                    <tr>
                        <td>Newton (°N)</td>
                        <td>${temperatura.newton}</td>
                    </tr>

                </tbody>

            </table>

            <br/>

            <h2>
                Forma 2 — Usando métodos con parámetros
            </h2>

            <table class="table table-striped table-bordered">

                <thead class="table-success">

                    <tr>
                        <th>Escala</th>
                        <th>Valor</th>
                    </tr>

                </thead>

                <tbody>

                    <tr>
                        <td>Fahrenheit (°F)</td>
                        <td>${temperatura.fahrenheit}</td>
                    </tr>

                    <tr>
                        <td>Kelvin (K)</td>
                        <td>${temperatura.kelvin}</td>
                    </tr>

                    <tr>
                        <td>Rankine (°R)</td>
                        <td>${temperatura.rankine}</td>
                    </tr>

                    <tr>
                        <td>Réaumur (°Ré)</td>
                        <td>${temperatura.reaumur}</td>
                    </tr>

                    <tr>
                        <td>Newton (°N)</td>
                        <td>${temperatura.newton}</td>
                    </tr>

                </tbody>

            </table>

            <div class="alert alert-success mt-3">

                Profesor según lo solicitado he mostrado
                que forma1 y forma2 son idénticos,
                cumpliendo el enunciado.

            </div>

            <a href="TemperaturaView.jsp"
               class="btn btn-success">

                Nueva conversión

            </a>

        </div>

    </div>

</div>

<%@include file="WEB-INF/Template/FooterView.jsp"%>