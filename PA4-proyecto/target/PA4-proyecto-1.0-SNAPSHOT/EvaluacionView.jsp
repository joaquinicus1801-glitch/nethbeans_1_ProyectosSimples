<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="jakarta.tags.core"%>
<%@taglib prefix="fmt" uri="jakarta.tags.fmt"%>

<jsp:include page="HeaderView.jsp"/>

<div class="container mt-4">
    <!-- 1. Esto es la base de la creacion del proyecto, el esqueleto html -->
    <h2 class="mb-4">Sistema de Notas Académicas</h2>
    <!-- 2.Creamos la tabla del form para enviar los parametros al servlet, en este caso es un doPost -->
    <form action="EvaluacionController" method="post" class="card p-4 mb-4">

        <div class="row">
            <!-- 2.1 Vemos que cada div alamacena inputs y select solicitados para enviar al servlet -->
            <div class="col-md-3">
                <label>Código</label>
                <input type="text"
                       name="txtCodigo"
                       class="form-control"
                       value="${empty sEditar ? '' : sEditar.codigo}"required> <!-- indica que si sEditar es vacio coloque '' sino 
                        coloque el codigo sEditar codigo al paracecer es un item copia con un objeto inserta dicha propiedads
                -->

            </div>
            <div class="col-md-3">
                <label>Curso</label>
                <!-- 2.2 vemos que el valr en los inputs esta condicionado de alguna forma 
                 podriamos leerlo como si sEditar esta vacio entonces incerta "" sino de sEditar que es una sesion
               que alverga un objeto dale el atributos curso
                
                2.3 INTUICION DE FUNCIONAMIENTO 
                 si la sesion esta vacia su valor es "" pero cunado no es asi sEditar tendra un objeto y pondra el atributo
                  en el imput cada vez qeu se redirecciones supongo
                -->

                <!-- s1. FUNCIONAMIENTO 1: AL INICIAR el proyecto no eejcuta los EL u/o al cada sesion estar vacia solo muestra
                  "", luego lo confirmo, (si ejecuta el EL al iniciar sesion por eso da esa evaluacion)llenamos los valores correspondientes y le
                  daremos submit, vamos al CONTROLLER PARA VER EL SIGUIENTE FLUJO.
                
                -->
                <input type="text"
                       name="txtCurso"
                       class="form-control"
                       value="${empty sEditar ? '' : sEditar.curso}"
                       required>
            </div>

            <div class="col-md-3">
                <label>Tipo</label>
                <!-- 3. Vemos que cada option tiene un valor value, ese es su valor, el EL condicional aqui no 
                    es que sea parte del value, cumple otra funcion, son 2 ATRIBUTOS DISTINTOS VALUE ES UNO
                     SELECTED ES OTRO, AL IGUAL QUE REQUIRED TAMBIEN EN ESTE CASO SELECTED indica cual opcion
                      es la que estara seleccionada por lo que , en lacondicional si la condicional es verdadera entonces
                       al hacer el redireccionamiento ese select tendra ese valor por defecto
                -->
                <select name="cboTipo" class="form-select">
               <!-- s15. FUNCIONAMIENTO
                  ahora que usamos editar con los links en la etiqueta tendra el valor del objeto seleccionado por las 
               condicional vista (ver en el controller metodo get)
               
               sEditar ahora no esta vacio por lo que en los inputs coloca cada atributo escirto del objeto almacenado en 
               sEditar
               
               en el caso del select, al no esta vacio y tambien comprobar que al llamar a getTipoEvaluacion de sEditar
               sea igual a los String escritos entonces ecribira selectede por lo que al cargar la pagina ese estara seleccionado
               
                -->
                    <option value="Escrito"
                            ${!empty sEditar && sEditar.tipoEvaluacion=='Examen Escrito' ? 'selected' : ''}>
                        Examen Escrito
                    </option>

                    <option value="Practico"
                            ${!empty sEditar && sEditar.tipoEvaluacion=='Trabajo Práctico' ? 'selected' : ''}>
                        Trabajo Práctico
                    </option>

                    <option value="Oral"
                            ${!empty sEditar && sEditar.tipoEvaluacion=='Examen Oral' ? 'selected' : ''}>
                        Examen Oral
                    </option>

                </select>

            </div>

            <div class="col-md-3">
                <label>Cantidad Preguntas</label>

                <input type="number"
                       name="txtCantidad"
                       class="form-control"
                       min="1"
                       max="100"
                       value="${empty sEditar ? '' : sEditar.cantidadPreguntas}"
                       required>

            </div>

        </div>

        <div class="row mt-3">

            <div class="col-md-3">

                <label>Respuestas Válidas</label>

                <input type="number"
                       name="txtValidas"
                       class="form-control"
                       min="0"
                       max="100"
                       value="${empty sEditar ? '' : sEditar.respuestasValidas}"
                       required>

            </div>

            <div class="col-md-3">

                <label>Tiempo Respuesta</label>

                <input type="number"
                       name="txtTiempo"
                       class="form-control"
                       min="1"
                       value="${empty sEditar ? '' : sEditar.tiempoRespuesta}"
                       required>

            </div>

            <div class="col-md-3 d-flex align-items-end">

                <button class="btn btn-primary w-100">
                    Guardar
                </button>

            </div>

        </div>

    </form>

    <table class="table table-bordered table-striped">

        <thead class="table-dark">

            <tr>

                <th>Código</th>
                <th>Curso</th>
                <th>Tipo</th>
                <th>Preguntas</th>
                <th>Respuestas</th>
                <th>Tiempo</th>
                <th>Nota Final</th>
                <th>Acciones</th>

            </tr>

        </thead>
        <!-- s9 FUNCIONAMIENTO: 
        REDIRIGE ACA POR EL SENDREDIRECT,
        (para los intputs y select de arriba en la primera instancia):
        evalua la sasion con un dato u otro con el nombre sEditar este aun no existe o no tiene contido
        por lo que las condicionales ejecutaran los comandos donde sEditar esta vacio
        
        
        Es un peticion get, indica al navegadore que haga una peticion, el navegador solicita
        Solicita EvaluacionView.jsp mediante GET
        Se procesa nuevamente utilizando los atributos disponibles, por lo que tendra
        
        -->

        <tbody>
            <!-- s10 FUNCIONAMIENTO: 
            
            EXISTEN diferentes lugars deonde guardamos atributos, EL permite accedera ellos mediante
            distintos ambitos scope
            
            Expresión	Dónde busca
                pageScope	Página JSP actual
               requestScope	Petición HTTP actual
                 sessionScope	Sesión del usuario
             applicationScope	Aplicación web compartida
            
            --> 
            <c:forEach var="e" items="${sessionScope.sListaEvaluaciones}">

                <tr>

                    <td>${e.codigo}</td>

                    <td>${e.curso}</td>

                    <td>${e.tipoEvaluacion}</td>

                    <td>${e.cantidadPreguntas}</td>

                    <td>${e.respuestasValidas}</td>

                    <td>${e.tiempoRespuesta}</td>

                    <td>
                        <!-- el formatNumber Su función es convertir un número en texto con un formato determinado. 
                        
                        -->
                        <fmt:formatNumber
                            value="${e.notaFinal}"
                            type="number"
                            minFractionDigits="2"
                            maxFractionDigits="2"/>

                    </td>

                    <td> 
                        <!-- hace una peticion http sin el form debido al redireccionamiento del link
                        S11. FUNCIONEMIENTO:
                        
                        el link haceuna peticion get donde en cada iteracion el link adopta parte de su
                        string el codigo de cada objeto, tambien cada link el accion envia un
                        -->

                        <a href="EvaluacionController?accion=editar&codigo=${e.codigo}"  
                           class="btn btn-warning btn-sm">
                        
                            Editar

                        </a>
                        <!-- en este y abajo esta usando el link para la paeticion http, envia un parametro con nombre accion con valor editar 
                        y codigo con el valor del objeto de la lista de objetos que tenga el atributo codigo correspondiente al que se graba en el link
                        -->
                        <a href="EvaluacionController?accion=eliminar&codigo=${e.codigo}"
                           class="btn btn-danger btn-sm">

                            Eliminar

                        </a>

                    </td>

                </tr>

            </c:forEach>

        </tbody>

    </table>

</div>
<p>${prueba}</p> <!-- no pertenece al codigo original -->
<jsp:include page="FooterView.jsp"/>                                                                                                                                                                                                                                                                                                                                                                                                                                                   