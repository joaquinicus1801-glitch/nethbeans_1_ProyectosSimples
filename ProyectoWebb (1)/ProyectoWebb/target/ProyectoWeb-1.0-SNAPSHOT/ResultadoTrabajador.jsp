<%@page contentType="text/html"
        pageEncoding="UTF-8"%>

<%@page import="com.trust.Model.Trabajador"%>

<%@include file="WEB-INF/Template/HeaderView.jsp"%>

<%
    Trabajador emp =
            (Trabajador)
            request.getAttribute(
                    "trabajadorObjeto");
%>

<div class="caja">

    <h1>RESUMEN DE PAGO</h1>

    <div class="resultado">

        <p>

            <strong>
                Horas trabajadas:
            </strong>

            <%= emp.getHorasTrabajadas() %>

        </p>

        <p>

            <strong>
                Salario por hora:
            </strong>

            S/.

            <%= String.format(
                    "%.2f",
                    emp.getSalarioPorHora()) %>

        </p>

        <p>

            <strong>
                Bonificación:
            </strong>

            <%= (emp.calcularPorcentajeBono()
                    * 100) %> %

        </p>

        <hr>

        <h2>

            Sueldo Total:

            S/.

            <%= String.format(
                    "%.2f",
                    emp.calcularSueldoTotal()) %>

        </h2>

    </div>

    <br>

    <a href="TrabajadorView.jsp"
       class="btn btn-primary">

        Calcular Otro Trabajador

    </a>

</div>

<%@include file="WEB-INF/Template/FooterView.jsp"%>