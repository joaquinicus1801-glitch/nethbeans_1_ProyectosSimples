<%@taglib prefix="c" uri="jakarta.tags.core" %> 
<%@include file="Principal/MenuDePaginas.jsp" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<main>
    <div class="container-fluid">
        <div class="d-flex justify-content-center">
            <div class="row">
                <form action="ProductoController" method="POST"> <!-- Crearemos objetos por lo que usamos el post para ingresar parametros -->
                    <h5>Venta De producto</h5>
                    <!-- si no especificas el tipo de intput por defecto es texto -->
                    <select name="selProducto"  class="form-select mt-1">
                        <option value="0">Seleccione Producto</option>
                        <option value="jean">jean</option>
                        <option value="polo">polo</option>
                        <option value="casaca">casaca</option>
                    </select>
                    <input name="Cantidad"  class="form-control mt-1" placeholder="ngrese una cantidad">
                    <input name="Precio"  class="form-control mt-1" placeholder="ngrese un precio">
                    <input name="Descuento"  class="form-control mt-1" placeholder="Ingrese el descuento">
                    <input name="Total"  class="form-control mt-1" placeholder="ingrese el total">
                    <button class="btn btn-success" type="submit" name="opcion" value="mostrar">Mostrar</button>
                    <!-- mostrar nos debe mostar los productos que se encuentren en la base de datos -->
                    <button class="btn btn-success" type="submit" name="opcion" value="agregar">agregar</button>
                    <!-- agregara datos a las vase de datos que se alacenara en la tabla con una lista -->
                    <br/>
                </form>
                <p>${Sueldo}</p> 
                <table class="table table-hover table-borderer mt-2">
                    <thead class="table-primary">
                        <tr>
                            <th scope="col">Item</th>
                            <th scope="col">Id</th>
                            <th scope="col">Producto</th>
                            <th scope="col">Cantidad</th>
                            <th scope="col">Precio</th>
                            <th scope="col">Descuento</th>
                            <th scope="col">Total</th>
                            <th scope="col">Accion</th>
                        </tr>
                    </thead>
                    <!-- comment -->
                    <tbody>
                        <c:forEach var="item" items="${Producto}" varStatus="status"> 

                            <tr>
                        <form action="SueldoController" method="POST"> 
                            <th scope="row">${status.index + 1}</th> 
                            <td>${item.id}</td> 
                            <td>${item.producto}</td>
                            <td>${item.cantidad}</td>
                            <td>${item.precio}</td>
                            <td>${item.descuento}</td>
                            <td>${item.total}</td>
                            <td>
                                <button class="btn btn-sm btn-danger" name="opcion" value="Eliminar">Eliminar</button>
                                <button class="btn btn-sm btn-primary" name="opcion" value="Editar">Editar</button>

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