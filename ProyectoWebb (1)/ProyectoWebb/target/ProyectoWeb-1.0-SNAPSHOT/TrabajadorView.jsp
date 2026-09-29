<%@page contentType="text/html"
        pageEncoding="UTF-8"%>

<%@include file="WEB-INF/Template/HeaderView.jsp"%>

<form action="SueldoController"
      method="POST">

    <div class="caja">

        <h1>CALCULADORA DE SUELDO</h1>

        <div class="grupo">

            <label>Horas trabajadas</label>

            <input type="number"
                   name="txtHoras"
                   min="40"
                   max="60"
                   required>

        </div>

        <div class="grupo">

            <label>Salario por hora</label>

            <input type="number"
                   name="txtSalario"
                   min="80"
                   max="100"
                   step="0.1"
                   required>

        </div>

        <button class="btn btn-success"
                type="submit">

            Calcular Sueldo

        </button>

        <br><br>

        <label class="text-danger">

            ${error}

        </label>

    </div>

</form>

<%@include file="WEB-INF/Template/FooterView.jsp"%>