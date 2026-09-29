<%@taglib prefix="c" uri="jakarta.tags.core" %> 
<%@include file="Principal/MenuDePaginas.jsp" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<main>
    <div class="container-fluid">
        <div class="d-flex justify-content-center">
            <div class="row">
                <form action="SueldoController" method="POST"> <!-- Crearemos objetos por lo que usamos el post para ingresar parametros -->
                    <h5>Sueldo Trabajador</h5>
                    <!-- si no especificas el tipo de intput por defecto es texto -->
                    <select name="selTrabajador"  class="form-select mt-1">
                        <option>Seleccione Tipo</option>
                        <option value="1">Empleado</option>
                        <option value="2">obrero</option>
                        <option value="3">Practicante</option>
                    </select>
                    <input name="nombre"  class="form-control mt-1" placeholder="Nombres">
                    <select name="selMes"  class="form-select mt-1">
                        <option>Seleccione Tipo</option>
                        <option value="1">Enero</option>
                        <option value="2">Febrero</option>
                        <option value="3">Marzo</option>
                    </select>
                    <button class="btn btn-success" type="submit">Enviar</button>
                    <br/>
                </form>
                <p>${Sueldo}</p> 
                <table class="table table-hover table-borderer mt-2">
                    <thead class="table-primary">
                        <tr>
                            <th scope="col">Id</th>
                            <th scope="col">Tipo</th>
                            <th scope="col">nombres</th>
                            <th scope="col">Mes</th>
                            <th scope="col">Sueldo</th>
                            <th scope="col">Bonificacion</th>
                            <th scope="col">Descuento</th>
                            <th scope="col">Neto</th>
                            <th scope="col">Accion</th>
                        </tr>
                    </thead>
                    <!-- comment -->
                    <tbody>
                        <c:forEach var="item" items="${Sueldo}" varStatus="status"> 

                            <tr>
                        <form action="SueldoController" method="POST">
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
    </div>


</main>
<%@include file="Principal/Footer.jsp" %>