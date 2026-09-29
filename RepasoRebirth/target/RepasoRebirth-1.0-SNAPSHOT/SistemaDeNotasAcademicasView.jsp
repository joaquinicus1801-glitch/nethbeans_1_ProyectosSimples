
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="jakarta.tags.core" %>

<!DOCTYPE html>
<html>
    <head>
        <meta name="viewport" content="width=device-with, initial-scale=1.0">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.8/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-sRIl4kxILFvY47J16cr9ZwB07vP4J8+LH7qKQnuqkuIAvNWLzeN8tE5YBujZqJLB" crossorigin="anonymous">
        <title>Sitema De Notas Academicas</title>
    

    </head>
    <body class="d-flex flex-column min-vh-100">
        <main class="d-flex justify-content-center my-2 flex-grow-1">
            <div class="container-fluid">
                <div class="d-flex justify-content-center">
                    <div class="row">
                        <form action="SisNotasAcademicasController" method="post">
                            <h5>Notas Academicas</h5>
                            <select name="selCurso" class="form-select mt-1">
                                <option value="">Seleccione curso</option>
                                <option value="1">matematicas</option>
                                <option value="2">quimica</option>
                                <option value="3">historia</option>
                            </select>
                            <input name="inPreguntas" class="form-control mt-1" placeholder="Cantidad Preguntas"/>
                            <input name="inPreguntasValidas" class="form-control mt-1" placeholder="Preguntas validas"/>
                            <input name="inPreguntasTiempo" class="form-control mt-1" placeholder="tiempo Respuesta"/>
                            <select name="selTipoExamen" class="form-select mt-1">
                                <option value="">Seleccione clase</option>
                                <option value="1">Oral</option>
                                <option value="2">Practico</option>
                                <option value="3">Escrito</option>
                            </select>
                            <button class="btn btn-success mt-1" type="submit">Agregar</button>
                        </form>
                        <table class="table table-hover table-bordered mt-2">
                            <thead  class="table-primary">
                                <tr>
                                    <th scope="col" rowspan="2" >Clases</th>
                                    <th scope="col" rowspan="2" >Codigo</th>
                                    <th scope="col" rowspan="2" >Curso</th>
                                    <th scope="col" rowspan="2" >Cantidad Preguntas</th>
                                    <th scope="col" rowspan="2" >Respuestas Vaildas</th>
                                    <th scope="col" rowspan="2" >Tiempo Respuesta</th>
                                    <th scope="col" colspan="3">Puntajes por pregunta x tiempo</th>
                                    <th scope="col" colspan="3">Bonificacion por preguntas Validas</th>
                                    <th scope="col" colspan="3"> </th>
                                     <th scope="col" rowspan="2">nota final</th>
                                </tr>
                                <tr>
                                    <th scope="col" >< 30 min</th>
                                    <th scope="col">30 a 45 min</th>
                                    <th scope="col">>45 min</th>
                                    <th scope="col">30 a 50</th>
                                     <th scope="col">51 a 81</th>
                                    <th scope="col">81 a 100</th>
                                     <th scope="col" colspan="3">Boni x tipo examen</th>
                                    
                                </tr>
                               
                            <tr>
                                </thead>
                                
                                <tbody>
                                    <c:forEach var="item" items="${sSueldo}" varStatus="status">
                                    <tr>
                                        <th class="text-center" scope="row"></th>
                                        <td class="text-center">${item.tipoTrabajador}</td>
                                        <td class="text-start">${item.sueldo}</td>
                                        <td class="text-center"></td>
                                        <td class="text-end">adasd</td>
                                        <td class="text-end"></td>
                                        <td class="text-end"></td>
                                        <td class="text-end"></td>
                                        <td class="text-end">
                                            <button class="btn btn-sm btn-primary ms-1"  name="btnOpcion" value="2">Editar</button>
                                            <button class="btn btn-sm btn-danger" name="btnOpcion" value="2">Eliminar</button> 
                                        </td>
                                        <td>
                                            
                                        </td>
                                        <td>
                                            
                                        </td>
                                    </tr>
                                     </c:forEach>
                                </tbody>

                    </div>
                </div>
            </div>
        </main>
    </body>
</html>
