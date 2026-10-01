<%@taglib prefix="c" uri="jakarta.tags.core" %> 
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="Principal/MenuDePaginas.jsp" %>
<main>

    <section class="Notas">

        <div class="container d-flex justify-content-center ">
            <div class="Tabla1 p-4">
                <h2 class="text-primary ">Registro de notas <span class="text-success">USC</span></h2>
                <hr>
                <form action="SistemaDeNotasAcademicasController" method="POST">
                    <label>TipoExamen</label>
                    <select name="selTExamen"  class="form-select mt-1">
                        <option value = "0">Seleccione Tipo de Examen</option>
                        <option value="1">Escrito</option>
                        <option value="2">Oral</option>
                        <option value="3">Practico</option>
                    </select>
                    <label>curso</label>
                    <input name="Curso" class="form-control mt-1" placeholder="ingresa un numero" required >
                    <label>Cantidad Preguntas</label>
                    <input name="nPreguntas" type="number"  class="form-control mt-1" placeholder="ingresa el Nro. de preguntas" required max="100" min="1">
                    <label>Respuestas Validas</label> 
                    <input name="RespValidas" type="number"   class="form-control mt-1" placeholder="ingresa un numero" required max="100" min="0">
                    <label>Tiempo De respuesta  </label>  
                    <input name="TiempoRespuesta" type="number" class="form-control mt-1" placeholder="ingresa el tiempo de resolucion" required min="1">
                    <button class="btn btn-success" type="submit">Enviar</button>
                    <p>${Error}</p>
                    <br/>
                </form>
                <caption>Registro</caption>
                <table class="table table-hover table-borderer mt-2">
                    <thead class="table-success">
                        <tr>
                            <th scope="col">TIPO EXAMEN</th>
                            <th scope="col">Codigo</th>
                            <th scope="col">CURSO</th>
                            <th scope="col">Nro DE PREGUNTAS</th>
                            <th scope="col">RESPUESTAS VALIDAS</th>
                            <th scope="col">TIEMPO DE RESPUESTA</th>
                            <th scope="col">PUNTAJE POR PREGUNTA</th>
                            <th scope="col">BONIFICACION POR PREG. VALIDAS</th>
                            <th scope="col">BONIFICACION TIEMPO EXAMEN</th>
                            <th scope="col">NOTA FINAL</th>

                        </tr>
                    </thead>
                    <tbody>

                        <c:forEach var="item" items="${Sueldo}" varStatus="status"> 
                            <tr>
                        <form action="action"></form>
                                <th scope="row">${status.index + 1}</th> 
                                <td>${item.tipo}</td> 
                                <td>${item.nombres}</td>
                                <td>${item.mes}</td>
                                <td>${item.sueldo}</td>
                                <td>${item.bonificacion}</td>
                                <td>${item.descuento}</td>
                                <td>${item.neto}</td>
                                <td>
                                    <button class="btn btn-sm btn-danger" name="accion" value="Eliminar">Eliminar</button>
                                    <button class="btn btn-sm btn-primary" name="accion" value="Editar">Editar</button>

                                </td>
                           </form>
                            </tr>
                        </c:forEach>  
                    </tbody>
                </table>
            </div>
        </div>
    </section>


</main>
<%@include file="Principal/Footer.jsp" %>