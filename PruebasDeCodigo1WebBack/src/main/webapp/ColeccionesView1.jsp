
<%@include file="Principal/MenuDePaginas.jsp" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<main>
    <div class="container-fluid">
            <div class="d-flex justify-content-center">
                <div class="row">
                    <form class="card" id="formPost" action="ColeccionesController1" method="POST"> <!--estamos cambiando de get a post porque vamos a enviar parametros -->
                        <h5>Colecciones (peticion post)</h5>
                        <br/>
                        <input name="inTexto" class="from-controll"/>
                       
                        <button class="btn btn-danger" type="submit" name="btnOption" value="1">Mostrar</button>
                        <button class="btn btn-danger" type="submit" name="btnOption" value="2">Agregar</button>
                        <button class="btn btn-danger" type="submit" name="btnOption" value="3">Editar</button>
                        <button class="btn btn-danger" type="submit" name="btnOption" value="4">Eliminar</button>
                        <br/>
                        <label class="form-label">Lista: ${sLista}</label> <br>
                        <label class="form-label">Lista2: ${sLista2}</label> <br>
                         <label class="form-label">Lista3: ${sLista3}</label> <br>
                </form>
                <!-- Botón fuera del form, pero vinculado por el atributo 'form' -->
                <!--<button class="btn btn-success mb-2" type="submit" form="formPost">enviasPosts</button> produce error 500
                   este button envia parametros nulos especialmetne en el boton, el cual el sitch del metodo llamado en el dopost 
                   no puede aplicar el metodo string.has.. usado por los switch apra determinar case, al se null su condicion entonces rompe codigo
                --> 
                 <form class="card" action="ColeccionesController1" method="GET">   
                     <h5>Colecciones (peticion get)</h5>
                       <button class="btn btn-danger" type="submit">Enviar</button> 
                      <label class="form-label">Coleccion: ${sColeccion}</label> <br>
                      <label class="form-label">Lista: ${sLista1}</label> <br>
                      <label class="form-label">Set: ${sSet}</label> <br>
                      <label class="form-label">Map: ${sMap}</label> -
                    </form>
                </div>
            </div>
        </div> 
</main>
 <%@include file="Principal/Footer.jsp" %>