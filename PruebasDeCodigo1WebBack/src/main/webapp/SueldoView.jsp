<%@taglib prefix="c" uri="jakarta.tags.core" %> 
<%@include file="Principal/MenuDePaginas.jsp" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<main>
    <div class="container-fluid">
        <div class="d-flex justify-content-center">
            <div class="row">
                <form action="ListaDeObjetosController" method="POST"> <!-- Crearemos objetos por lo que usamos el post para ingresar parametros -->
                    <h5>Sueldo Trabajador</h5>
                    <input name="documento" class="form-control mt-1" placeholder="Documento"> <!-- si no especificas el tipo de intput por defecto es texto -->
                    <input name="nombre"  class="form-control mt-1" placeholder="Nombres">
                    <select name="selOpcion"  class="form-select mt-1">
                        <option>Trabajador</option>
                        <option value="2">java</option>
                        <option value="3">SQL server</option>
                        <option value="4">Android Studio</option>
                    </select>
                    <input name="mes" class="form-control mt-1" placeholder="Mes">
                    <button class="btn btn-success" type="submit">Enviar</button>
                    <br/>
                </form>
                <p>${listaObj}</p> 
                <table class="table table-hover table-borderer mt-2">
                    <thead class="table-primary">
                        <tr>
                            <th scope="col">Id</th>
                            <th scope="col">Documento</th>
                            <th scope="col">nombres</th>
                            <th scope="col">Curso</th>
                            <th scope="col">Precio</th>
                            <th scope="col">Modificacion</th>
                        </tr>
                    </thead>
                    <c:forEach var="item" items="${listaObj}" varStatus="status"> 
                        <tbody>
                            <tr>
                               <form action="ListaDeObjetosController" method="POST">
                                   <th scope="row">${status.index + 1}</th> 
                                   <input type="hidden" name="dni" value="${item.dni}" style="input[hidden]{display:none}">
                                   <td>${item.dni}</td> 
                                   <td>${item.nombre}</td>
                                   <td>${item.curso}</td>
                                   <td>${item.precio}</td>
                                    <td>
                                          <button class="btn btn-sm btn-danger" name="accion" value="Eliminar">Eliminar</button>
                                          <button class="btn btn-sm btn-primary" name="accion" value="Editar">Editar</button>

                                    </td>
                               </form>
                        </tr>
                        </tbody>
                    </c:forEach>              
                </table>
            </div>
        </div>
    </div>
    
    
</main>
<%@include file="Principal/Footer.jsp" %>