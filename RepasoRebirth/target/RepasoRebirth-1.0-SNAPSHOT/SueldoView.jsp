<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="jakarta.tags.core" %>
<%@include file="Template/HeaderView.jsp" %>

<div class="container-fluid">
    <div class="d-flex justify-content-center">
        <div class="row">
            <form action="SueldoController" method="post">
                <h5>Planilla de sueldo</h5>
                <select name="selTipo" class="form-select mt-1">
                    <option value="">Seleccione tipo</option>
                    <option value="1">Empleado</option>
                    <option value="2">Obrero</option>
                    <option value="3">Practicante</option>
                </select>
                <input name="inNombres" class="form-control mt-1" placeholder="Nombres"/>
                <select name="selMes" class="form-select mt-1">
                    <option value="">Seleccione mes</option>
                    <option value="1">Enero</option>
                    <option value="2">Febrero</option>
                    <option value="3">Marzo</option>
                </select>
                <button class="btn btn-success mt-1" type="submit">Agregar</button>
            </form>
            <table class="table table-hover table-bordered mt-2">
                <thead  class="table-primary">
                    <tr>
                        <th scope="col">Id</th>
                        <th scope="col">Tipo</th>
                        <th scope="col">Nombres</th>
                        <th scope="col">Mes</th>
                        <th scope="col">Sueldo</th>
                        <th scope="col">Bonificacion</th>
                        <th scope="col">Descuento</th>
                        <th scope="col">Neto</th>
                        <th scope="col">Accion</th>   <!--Para que quede bien lo de las tablas es obvio y fundem,antea que la cantidad de columnas del th sera igual al de tr-->
                    </tr>
                </thead>
                <c:forEach var="item" items="${sSueldo}" varStatus="status">
                    <tbody>
                        <tr>
                            <th class="text-center" scope="row">${status.index + 1}</th>
                            <td class="text-center">${item.tipoTrabajador}</td>
                            <td class="text-start">${item.nombres}</td>
                            <td class="text-center">${item.mes}</td>
                            <td class="text-end">${item.bonificacion}</td>
                            <td class="text-end">${item.descuento}</td>
                            <td class="text-end">${item.neto}</td>
                            
                            <td class="text-end">
                                <button class="btn btn-sm btn-primary ms-1"  name="btnOpcion" value="2">Editar</button>
                                <button class="btn btn-sm btn-danger" name="btnOpcion" value="2">Eliminar</button> 
                            </td>
                        </tr>
                    </tbody>
                </c:forEach>
           </div>
    </div>
</div>
    </table>
        </div>
    </div>
</div>

<%@include file="Template/FooterView.jsp" %>