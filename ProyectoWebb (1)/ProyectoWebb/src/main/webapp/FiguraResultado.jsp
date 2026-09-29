<%@page contentType="text/html"
        pageEncoding="UTF-8"%>

<%@include file="WEB-INF/Template/HeaderView.jsp"%>

<div class="container">

    <div class="card w-75">

        <div class="card-header bg-success text-white">
            <h2>RESULTADOS</h2>
        </div>

        <div class="card-body bg-light">

            <table class="table table-bordered">

                <thead class="table-success">

                    <tr>
                        <th>Operación</th>
                        <th>Resultado</th>
                    </tr>

                </thead>

                <tbody>

                    <tr>
                        <td>Área</td>
                        <td>${figura.area}</td>
                    </tr>

                    <tr>
                        <td>Hipotenusa</td>
                        <td>${figura.hipotenusa}</td>
                    </tr>

                    <tr>
                        <td>Ángulo A</td>
                        <td>${figura.anguloA}</td>
                    </tr>

                    <tr>
                        <td>Ángulo B</td>
                        <td>${figura.anguloB}</td>
                    </tr>

                </tbody>

            </table>

            <a href="FiguraView.jsp"
               class="btn btn-success">

                Nuevo Cálculo

            </a>

        </div>

    </div>

</div>

<%@include file="WEB-INF/Template/FooterView.jsp"%>