
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="jakarta.tags.core" %> <!--copiamos la libreria en el pom, actualizamos la vista jsp donde aparecera la lista ordenada -->
<!DOCTYPE html>
<html>
    <head>
        <meta name="viewport" content="width=device-with, initial-scale=1.0" >
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.8/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-sRIl4kxILFvY47J16cr9ZwB07vP4J8+LH7qKQnuqkuIAvNWLzeN8tE5YBujZqJLB" crossorigin="anonymous">
        <title>Lista De Objetos</title>
    </head>
    <div class="container-fluid">
        <div class="d-flex justify-content-center">
            <div class="row">
                <form action="ListaObjetosController" method="POST"> <!-- Crearemos objetos por lo que usamos el post para ingresar parametros -->
                    <h5>Lista de Objetos</h5>
                    <input name="documento" class="form-control mt-1" placeholder="Documento"> <!-- si no especificas el tipo de intput por defecto es texto -->
                    <input name="nombre" class="form-control mt-1" placeholder="Nombres">
                    <select name="selOpcion" class="form-select mt-1">
                        <option value="1">Seleccione curso</option>
                        <option value="2">java</option>
                        <option value="3">SQL server</option>
                        <option value="4">Android Studio</option>
                    </select>
                    <input name="Precio" class="form-control mt-1" placeholder="Precio">
                    <button class="btn btn-success" type="submit">Enviar</button>
                    <br/>
                </form>
                <!--fuera del form-->
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
                    <!--for(var item: sColeccion){
                        System.out.println(item)
                    el for each solo se usa en colecciones o matrices
                    }
                    -->
                    <c:forEach var="item" items="${sColeccion}" varStatus="status"> <!-- creamos una variable con cualquier nombre ne este caso item y luego otra donde iran los items de la lista item -->
                        <!--varStaturs es para saber el id, la posicion 
                        como tal var status es un objeto especial que contiene la informacionsobre la iteracion
                        existen varias propiedades como .index, .count, .first, .last
                        como diej alamcena info de la interacion en este caso estamos guardadando lo que es index es decir que cada quer itera 
                        cuenta su poscicion, la primera vuelta vale 0, la segunda 1, etc, usamo indez mas uno para mostrar un lista correcta porque que inicie de 0 
                        no queda bien
                        
                        -->
                        
                        <tbody>
                            <tr>
                                <th scope="row">${status.index + 1}</th> <!--Cambio la numeracion por Status. index que muesta la posicion y mas 1 porue todas las listas comienzan en 0-->
                                <td>${item.documento}</td> <!--Muestra e item para dar respuesta la lista que declaramos-->
                                <td>${item.nombre}</td>
                                <td>${item.opcion}</td>
                                <td>${item.precio}</td>
                                <td>
                                    <button class="btn btn-sm btn-danger">Eliminar</button>
                                    <button class="btn btn-sm btn-primary">Editar</button>
                                </td>
                               
                            </tr>
                        </tbody>
                    </c:forEach> <!--aplica al body que es donde queremos aplicar-->
                    
                    <!--
                         <tbody>
                            <tr>
                                <th scope="row">${status.index + 1}</th> <!--Cambio la numeracion por Status. index que muesta la posicion y mas 1 porue todas las listas comienzan en 0-->
                               <!-- <td>${item}</td> <!--Muestra e item para dar respuesta la lista que declaramos--
                                <td>${sColeccion}</td> primera fase cuando se veia todo raro y con el metodo si se podia ver
                                <td></td>
                                <td></td>
                                <td></td>
                            </tr>
                        </tbody>
             
                    -->
                </table>
            </div>
        </div>
    </div>
</html>