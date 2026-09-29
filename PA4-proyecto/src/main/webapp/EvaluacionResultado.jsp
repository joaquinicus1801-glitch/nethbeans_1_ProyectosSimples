<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%@taglib prefix="c" uri="jakarta.tags.core"%>
<%@taglib prefix="fmt" uri="jakarta.tags.fmt"%>

<jsp:include page="HeaderView.jsp"/>

<div class="container mt-4">

    <h2 class="mb-4">

        Resultado de Evaluaciones

    </h2>

    <c:if test="${empty sessionScope.sListaEvaluaciones}">

        <div class="alert alert-warning">

            No existen evaluaciones registradas.

        </div>

    </c:if>

    <c:if test="${not empty sessionScope.sListaEvaluaciones}">

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

                </tr>

            </thead>

            <tbody>

                <c:forEach var="e"
                           items="${sessionScope.sListaEvaluaciones}">

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

                    </tr>

                </c:forEach>

            </tbody>

        </table>

    </c:if>

    <a href="EvaluacionView.jsp"
       class="btn btn-secondary">

        Volver

    </a>

</div>

<jsp:include page="FooterView.jsp"/>