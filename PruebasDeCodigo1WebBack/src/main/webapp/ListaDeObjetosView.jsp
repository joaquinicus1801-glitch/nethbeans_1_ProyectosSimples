<%@include file="Principal/MenuDePaginas.jsp" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="jakarta.tags.core" %> <!--copiamos la libreria en el pom, actualizamos la vista jsp donde aparecera la lista ordenada -->
<main>
    <div class="container-fluid">
        <div class="d-flex justify-content-center">
            <div class="row">
                <form action="ListaDeObjetosController" method="POST"> <!-- Crearemos objetos por lo que usamos el post para ingresar parametros -->
                    <h5>Lista de Objetos</h5>
                    <input name="documento" value="${reinsercion.dni}" class="form-control mt-1" placeholder="Documento"> <!-- si no especificas el tipo de intput por defecto es texto -->
                    <input name="nombre" value="${reinsercion.nombre}" class="form-control mt-1" placeholder="Nombres">
                    <select name="selOpcion" value="${reinsercion.curso}" class="form-select mt-1">
                        <option value="${reinsercion.curso}">Seleccione curso</option>
                        <option value="2">java</option>
                        <option value="3">SQL server</option>
                        <option value="4">Android Studio</option>
                    </select>
                    <input name="Precio" value="${reinsercion.precio}" class="form-control mt-1" placeholder="Precio">
                    <button class="btn btn-success" type="submit">Enviar</button>
                    <br/>
                </form>
                <p>${listaObj}</p> <!-- al mostrar con El se aplica el metodo toString() al igual que en el system.out.. 
                osea convierte el objeto a texto, asi que porque en la clase del objeto sobrescribiste tostring() se muestra
                 el return personalizado, termina utilizando el toString() de los objetos quecontiene la lista
                       
                 la lista se convierte a texto. Una ArrayList tiene su propio toString(), que internamente recorre sus 
                  elementos  y llama al toString() de cada uno.
                
                -->
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
                    <c:forEach var="item" items="${listaObj}" varStatus="status"> <!-- creamos una variable con cualquier nombre ne este caso item y luego otra donde iran los items de la lista item -->
                        <!--varStaturs es para saber el id, la posicion 
                        como tal var status es un objeto especial que contiene la informacionsobre la iteracion
                        existen varias propiedades como .index, .count, .first, .last
                        como diej alamcena info de la interacion en este caso estamos guardadando lo que es index es decir que cada quer itera 
                        cuenta su poscicion, la primera vuelta vale 0, la segunda 1, etc, usamo indez mas uno para mostrar un lista correcta porque que inicie de 0 
                        no queda bien
                        
                        -->

                        <tbody>
                            <tr>
                               <form action="ListaDeObjetosController" method="POST">
                                   <th scope="row">${status.index + 1}</th> <!--Cambio la numeracion por Status. index que muesta la posicion y mas 1 porue todas las listas comienzan en 0-->
                                   <input type="hidden" name="dni" value="${item.dni}" style="input[hidden]{display:none}">
                                   <td>${item.dni}</td> <!--Muestra e item para dar respuesta la lista que declaramos-->
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
</main>
<%@include file="Principal/Footer.jsp" %>