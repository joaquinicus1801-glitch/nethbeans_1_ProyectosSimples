<%@page contentType="text/html"
        pageEncoding="UTF-8"%>

<%@include file="WEB-INF/Template/HeaderView.jsp"%>

<div class="container">

    <div class="card w-75">

        <div class="card-header bg-success text-white">
            <h2>TRIÁNGULO RECTÁNGULO</h2>
        </div>

        <div class="card-body bg-light">

            <form action="FiguraController"
                  method="POST">

                <label>
                    Cateto Opuesto
                </label>

                <input type="number"
                       step="any"
                       name="CatOpuesto"
                       class="form-control"
                       required/>

                <br/>

                <label>
                    Cateto Adyacente
                </label>

                <input type="number"
                       step="any"
                       name="CatAdyacente"
                       class="form-control"
                       required/>

                <br/>

                <button class="btn btn-success"
                        type="submit">

                    Calcular

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