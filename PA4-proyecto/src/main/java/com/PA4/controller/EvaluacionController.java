package com.PA4.controller;

import com.PA4.model.EvaluacionModel;
import com.PA4.model.ExamenEscritoModel;
import com.PA4.model.TrabajoPracticoModel;
import com.PA4.model.ExamenOralModel;

import java.io.IOException;
import java.util.ArrayList;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet(name = "EvaluacionController", urlPatterns = {"/EvaluacionController"})
public class EvaluacionController extends HttpServlet {

    //4. en la clase servlet creamos una lista static, al ser de clase tambien acumula valores por asi decirlo
    private static ArrayList<EvaluacionModel> listaEvaluaciones = new ArrayList<>();

    //no corresponde al codigo original
    private String palabraMaestra; //puedo hacer eso porque es una propiedad de esta clase, al ser static al modificar su valor
    //en una funcion se modifica adquirira ese valor? creo que si

    /*
     s2.1 FUNCIONAMIENTO:
      al enviar los datos con el boton submit para acceder al servlet se ejcuta el metodo init 
    esta funcion solo se ejcuta una vez llamado al servlet , solo se hace una vez
    cuando el servlet se pone en servicio, justo después de ser instanciado.
    Sirve para inicializar recursos que el servlet necesitará durante su ciclo de vida, 
    como conexiones a bases de datos, lectura de parámetros de configuración, inicialización de variables, etc.
     */
    @Override
    public void init() throws ServletException {

        if (listaEvaluaciones.isEmpty()) {
            listaEvaluaciones.add(new ExamenEscritoModel("E001", "POO", 100, 85, 28));
            listaEvaluaciones.add(new TrabajoPracticoModel("T001", "Base de Datos", 100, 70, 40));
            listaEvaluaciones.add(new ExamenOralModel("O001", "Desarrollo Web", 100, 90, 25));
            System.out.println("esto se ejecuta primero?");
            System.out.println("quizas");
            // response.sendRedirect(); //no funciona el response sendreiderect
            palabraMaestra = "Hola papo";

        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        /*
        s12. FUNIONAMIENTO:
        una vez que la tabla ya fue creada, y presionamos los links enviara los parametros
         vermos que la sesion es creada o en todo caso llamada si es que ya existe
        
        las variables accion y codigo registran un valor con el nombre de accion o codigo
        */
          
        HttpSession sesion = request.getSession();

        String accion = request.getParameter("accion");
        String codigo = request.getParameter("codigo");
        System.out.println("al accionar editar o eliminar");
        
           /*
        s13. FUNIONAMIENTO:
       ahora haceun if, compara la accion con el texto eliminar o editar
        si es eliminar ejecuta el metodo remove if donde  elimina los objetos que su codigo sea similar 
        al codigo registrado en la variable codigo, remueve el contenido de sEditar, no importa si esta vacio o aun no exista
        
        
        el otro en editar, hace la comparacion y si es verdad usa un for each donde e toma el valor de cada objeto de coleccio
        y hace otro if compara el codigo de dicho objeto con el codigo ingresado en la varaible codigo si coincide
        entonces sEditar adquiere el valor del objeto que coincide,
        
        */
        
        if ("eliminar".equals(accion)) {
            listaEvaluaciones.removeIf(e -> e.getCodigo().equals(codigo));
            sesion.removeAttribute("sEditar");
        }

        if ("editar".equals(accion)) {
            System.out.println("Se ejecuta el editar");
            for (EvaluacionModel e : listaEvaluaciones) {
                if (e.getCodigo().equals(codigo)) {
                    sesion.setAttribute("sEditar", e);
                    break;
                }
            }
        }
        
      /*
        s14. FUNIONAMIENTO:
         terminando cualquier accion sListaEvaluaciones tiene el valor de la lista ya sea que se elimino o no algun
//        objeto, y hace redireccionamiento
        
        */
        sesion.setAttribute("sListaEvaluaciones", listaEvaluaciones);
        response.sendRedirect("EvaluacionView.jsp");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        /*
     s2.2 FUNCIONAMIENTO:
      al enviar los datos con el boton submit para acceder al servlet se ejcuta el metodo do post posterior al init
       se insertan los datos en cada variabe con su respectivo tipo de dato 
         */
        System.out.println("esto se ejecuta primero?");
        String codigo = request.getParameter("txtCodigo");
        String curso = request.getParameter("txtCurso");
        String tipo = request.getParameter("cboTipo");
        int cantidadPreguntas = Integer.parseInt(request.getParameter("txtCantidad"));
        int respuestasValidas = Integer.parseInt(request.getParameter("txtValidas"));
        int tiempoRespuesta = Integer.parseInt(request.getParameter("txtTiempo"));
        //no pertenece al codigo original
        String[] grupo = new String[]{palabraMaestra};
        //
        System.out.println("Se igresan los datos: " + codigo + " " + curso + " " + tipo + " " + cantidadPreguntas + " " + respuestasValidas + " " + tiempoRespuesta);

        if (cantidadPreguntas > 100) {
            cantidadPreguntas = 100;
        }

        if (respuestasValidas > cantidadPreguntas) {
            respuestasValidas = cantidadPreguntas;
        }
        /*
        s3. FUNCIONAMIENTO
          crea una variable, objeto tipo Evaluacion Model es decir tipo padre, el cual si puede
          su referencia es EvaluacionModel:
           Tipo de referencia: determina qué métodos puedes invocar directamente.
        
           Luego evalua la variable tipo comparando valores
        dependiendo que valor crea el objeto con su tipo real digamos
        Tipo real del objeto: determina qué implementación de un método sobrescrito se ejecuta.
        eso es POLIMORFISMO, sin embargo como dije los metodos que puede ejecutar en este caso 
        corresponden unicamente al padre y a los metodos sobrescritos del padre que esten en el model de hijo
        pero un metodo propio de hijo no sera posible ejecutarlo
        */
        EvaluacionModel evaluacion;

        if (tipo.equals("Escrito")) {
             /*
                 s4 . FUNCIONAMIENTO:  una vez entendido eso, imaginemos que el valor de tipo es igual a Escrito por loque
                ahora evaluacion que referencia la clase padre adopta el tipo de objeto hijo escrito model, envia sus parametros
                como sabemmos en primera instancia el objeto por mas que sea hijo no podra usar metodos propios del hijo solo             
               los del padre u override de padre en el hijo , al menos  QUE CASTEES ALGO ASI (cosas mas avanzadas)
                 
                esta objeto se crea llamando al model por lo que vamos al model padre para revisar metodos y model hijo escrito 
            */
            evaluacion = new ExamenEscritoModel(codigo, curso, cantidadPreguntas, respuestasValidas, tiempoRespuesta);
        } else if (tipo.equals("Practico")) {
            evaluacion = new TrabajoPracticoModel(codigo, curso, cantidadPreguntas, respuestasValidas, tiempoRespuesta);
        } else {
            evaluacion = new ExamenOralModel(codigo, curso, cantidadPreguntas, respuestasValidas, tiempoRespuesta);
        }
        
        /*
        s8 FUNCIONAMIENTO:
        REGRESAMOS DE LA CREACION DEL OBJETO el codigo prosigue
        vemos que el ArrayList : listaEvaluaciones aplica un metodo
        INTERPRETACION:
         e toma el valor cada elemento del arraylist, return 
         remueve los elementos con codigo que sea igual a codigo
         ademas este devuleve un boolean, ya sea true o false en caso se cumpla la condicion o no, 
         puedes alamacenar eso en una variale
        
        ejemplo:
        boolean cambio1 = nombres.removeIf(n -> n.startsWith("C"));
        System.out.println("¿Se modificó la lista? " + cambio1); // Imprime: true
        System.out.println("Lista actual: " + nombres);
        */

        listaEvaluaciones.removeIf(e -> e.getCodigo().equals(codigo));
        listaEvaluaciones.add(evaluacion);

        HttpSession sesion = request.getSession();
        sesion.setAttribute("sListaEvaluaciones", listaEvaluaciones);
        /*
        en primera instancia sEditar todavía no existe, removeAttribute() simplemente no hace nada. 
        No produce ningún error por ese motivo. esto se conecta con ${empty sEditar ? '' : sEditar.codigo}
        revisa en el Evaluaciones View
        
        */
        
        
        sesion.removeAttribute("sEditar");
      
        response.sendRedirect("EvaluacionView.jsp");
    }

    @Override
    public String getServletInfo() {
        return "Controller del Sistema de Notas Academicas";
    }
}
