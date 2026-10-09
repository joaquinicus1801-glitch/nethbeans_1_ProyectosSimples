<%@taglib prefix="c" uri="jakarta.tags.core" %> 
<!-- el jsp:include, son mejores para diseños modernos
<@include file="Principal/MenuDePaginas.jsp"> -->
<jsp:include page="Principal/MenuDePaginas.jsp"/>
<%@taglib prefix="fmt" uri="jakarta.tags.fmt"%>
<%@taglib prefix="fmt" uri="jakarta.tags.fmt"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<main>
    <!-- logo de la pagina -->
    <section class="container">
        <h2 class="mb-4">Facturacion</h2>
        <form action="RepuestosController" method="post" class="card">
            <h3 class="text-center bg-black text-white card">Registro</h3>
            <div class="p-3 d-flex gap-4 justify-content-center">
                <div class="ingresoCliente">
                    <label>DNI/RUC</label> <br>
                    <input  type="number" required minlength="7" maxlength="11" name="idCliente"> <br>
                    <label>Nombre</label> <br>
                    <input type="text" required name="nombreCliente">
                </div>
                <div class="ingresoCliente">
                    <label>edad</label> <br>
                    <input type="number" required min="18" name="edadCliente" > <br>
                    <label>direccion</label> <br>
                    <input type="text" required name="direccion" >
                </div>
                <div class="ingresoCliente">
                    <label>Repuesto</label> <br>
                    <select name="repuesto">
                        <option value="">-Seleccione Repuesto</option>
                        <option value="">bujia</option>
                        <option value="">motor</option>
                        <option value="">suspencion</option>
                        <option value="">freno</option>
                        <option value="">caja de cambio</option>

                    </select> <br>
                    <label>cantidad</label> <br>
                    <input type="number" required name="cantidad" min="1">
                </div>

            </div>

            <button type="submit" class="btn btn-secondary">Enviar</button>
             
        </form>

        <!-- formulario de ingreso de datos -->

    </section>
    <section class="tabla container mt-2">
        <c:if test="${empty sessionScope.RegistroPedido}">
            <div class="alert alert-warning">
                Aun no hay pedidos registrados.
            </div>

        </c:if>
        <c:if test="${!empty sessionScope.RegistroPedido}">

 
        </c:if>

    </section>



</main>
<jsp:include page="Principal/Footer.jsp"/>