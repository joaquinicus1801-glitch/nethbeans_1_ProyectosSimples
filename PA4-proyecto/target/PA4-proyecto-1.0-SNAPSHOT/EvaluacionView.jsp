<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="jakarta.tags.core"%>
<%@taglib prefix="fmt" uri="jakarta.tags.fmt"%>

<jsp:include page="HeaderView.jsp"/>

<div class="container mt-4">

    <h2 class="mb-4">Sistema de Notas Académicas</h2>

    <form action="EvaluacionController" method="post" class="card p-4 mb-4">

        <div class="row">

            <div class="col-md-3">
                <label>Código</label>
                <input type="text"
                       name="txtCodigo"
                       class="form-control"
                       value="${empty sEditar ? '' : sEditar.codigo}"
                       required>
            </div>

            <div class="col-md-3">
                <label>Curso</label>
                <input type="text"
                       name="txtCurso"
                       class="form-control"
                       value="${empty sEditar ? '' : sEditar.curso}"
                       required>
            </div>

            <div class="col-md-3">
                <label>Tipo</label>

                <select name="cboTipo" class="form-select">

                    <option value="Escrito"
                        ${!empty sEditar && sEditar.tipoEvaluacion=='Examen Escrito' ? 'selected' : ''}>
                        Examen Escrito
                    </option>

                    <option value="Practico"
                        ${!empty sEditar && sEditar.tipoEvaluacion=='Trabajo Práctico' ? 'selected' : ''}>
                        Trabajo Práctico
                    </option>

                    <option value="Oral"
                        ${!empty sEditar && sEditar.tipoEvaluacion=='Examen Oral' ? 'selected' : ''}>
                        Examen Oral
                    </option>

                </select>

            </div>

            <div class="col-md-3">
                <label>Cantidad Preguntas</label>

                <input type="number"
                       name="txtCantidad"
                       class="form-control"
                       min="1"
                       max="100"
                       value="${empty sEditar ? '' : sEditar.cantidadPreguntas}"
                       required>

            </div>

        </div>

        <div class="row mt-3">

            <div class="col-md-3">

                <label>Respuestas Válidas</label>

                <input type="number"
                       name="txtValidas"
                       class="form-control"
                       min="0"
                       max="100"
                       value="${empty sEditar ? '' : sEditar.respuestasValidas}"
                       required>

            </div>

            <div class="col-md-3">

                <label>Tiempo Respuesta</label>

                <input type="number"
                       name="txtTiempo"
                       class="form-control"
                       min="1"
                       value="${empty sEditar ? '' : sEditar.tiempoRespuesta}"
                       required>

            </div>

            <div class="col-md-3 d-flex align-items-end">

                <button class="btn btn-primary w-100">
                    Guardar
                </button>

            </div>

        </div>

    </form>

    <table class="table table-bordered table-striped">

        <thead class="table-dark">

            <tr>

                <th>Código</th>
                <th>Curso</th>
                <th>Tipo</th>
                <th>Preguntas</th>
                <th>Respuestas</th>
                <th>Tiempo</th>
                <th>Nota Final</th>
                <th>Acciones</th>

            </tr>

        </thead>

        <tbody>

            <c:forEach var="e" items="${sessionScope.sListaEvaluaciones}">

                <tr>

                    <td>${e.codigo}</td>

                    <td>${e.curso}</td>

                    <td>${e.tipoEvaluacion}</td>

                    <td>${e.cantidadPreguntas}</td>

                    <td>${e.respuestasValidas}</td>

                    <td>${e.tiempoRespuesta}</td>

                    <td>

                        <fmt:formatNumber
                            value="${e.notaFinal}"
                            type="number"
                            minFractionDigits="2"
                            maxFractionDigits="2"/>

                    </td>

                    <td>

                        <a href="EvaluacionController?accion=editar&codigo=${e.codigo}"
                           class="btn btn-warning btn-sm">

                            Editar

                        </a>

                        <a href="EvaluacionController?accion=eliminar&codigo=${e.codigo}"
                           class="btn btn-danger btn-sm">

                            Eliminar

                        </a>

                    </td>

                </tr>

            </c:forEach>

        </tbody>

    </table>

</div>

<jsp:include page="FooterView.jsp"/>                                                                                                                                                                                                                                                                                                                                                                                                                                                   