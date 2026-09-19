package PruebasServlets.controller;

import PruebasModel.model.FigurasGeometricaModel;
import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import java.util.ArrayList;

@WebServlet(name = "FigurasGeometricasController", urlPatterns = {"/FigurasGeometricasController"})
public class FigurasGeometricasController extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet FigurasGeometricasController</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet FigurasGeometricasController at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    /*sobreescribe el metodo del padre*/
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //processRequest(request, response); das tu propia logica  a la peticion http o metodo de la clase servlet
        String figura = request.getParameter("Figuras");
        System.out.println("el valor es: "+figura);
        String ladoTexto = request.getParameter("L");
        String baseTexto = request.getParameter("B");
        String alturaTexto = request.getParameter("A");
        String apotemaTexto = request.getParameter("AP");
        String radioTexto = request.getParameter("R");
        System.out.println("se registraron los datos de cada input del formulario");
        double base, altura, apotema, radio;
        if (figura.equals("0") ){ //usar equals en vez de == por raozn de string, cambia (revisar a fondo)
            System.out.println("no escogio una figura valida");
            request.setAttribute("sAviso", " NO elegiste tu figura");
            request.getRequestDispatcher("FigurasGeometricasView.jsp").forward(request, response);
        } else {
            System.out.println("creacion de variables decimales exitosa");
            ArrayList<Double> lados = new ArrayList<Double>();
            System.out.println("creacion de arreglo dinamico");
            String[] lados2 = ladoTexto.split(",");
            System.out.println("creacion de arreglo estatico donde se aplica el metodo split"); //al agregar diectamente el arreglo osea algo asi [2,4,4] ya define su tamaño
            HttpSession Respuesta = request.getSession(); //creacion de una variable de sesion
            if (ladoTexto != null && !ladoTexto.trim().isEmpty()) {
                /*Si lado texto no es nulo y lado texto con espacios laterales borrados no esta vacio
            entonces...
                 */
 /*
              String [] hola = {"sd","34"}; asi se crea un arreglo estatico tanto con fijo como no
                  String[] hola2 = new String[2];
             System.out.println("hola tamaño: "+hola.length+" hola2: "+hola2.length);
  }
                 */
                System.out.println("Dato Lado no nulo , ni vacio"); //ningun dato se guardara en el arreglo si es que alguna posicion es incorrectoas
                try { //este comando dice intenta lo siguiente
                    //convertiremos la cadena de datos en un arreglo para alamacenar
                    /* for(int indi = 0; indi < ladoTexto.split(",").length; indi++){ MALA PRACTICA, AFECTA LA MEMORIA por creacion de 
                    System.out.println("recorrido numero: "+(indi+1));
                }*/
                    for (int indi = 0; indi < lados2.length; indi++) {
                        System.out.println("iteracion numero: " + (indi + 1));
                        lados.add(Math.abs(Double.parseDouble(lados2[indi]))); //arreglo estatico sus posiciones se expresan como en js
                    }
                } catch (NumberFormatException e) { //captura este error y ahass lo siguiente
                    System.out.println("Error en la transformacion, por dato invalido");
                    lados.add(0.0);
                }
            } else {
                lados.add(0.0);
                System.out.println("al input no cumplir la condicion le damos un valor de 0 a lado");
            }
            if (baseTexto != null && !baseTexto.trim().isEmpty()) {
                System.out.println("Dato base no nulo , ni vacio");
                try {

                    base = Math.abs(Double.parseDouble(baseTexto));
                    System.out.println("base ahora se transformo en double");
                } catch (NumberFormatException e) {
                    base = 0;
                    System.out.println("Error en la transformacion, por dato invalido");
                }
            } else {
                base = 0;
                System.out.println("al input no cumplir la condicion le damos un valor de 0 a base");
            }

            if (alturaTexto != null && !alturaTexto.trim().isEmpty()) {
                System.out.println("Dato altura no nulo , ni vacio");
                try {

                    altura = Math.abs(Double.parseDouble(alturaTexto));
                    System.out.println("altura ahora se transformo en double");
                } catch (NumberFormatException e) {
                    altura = 0;
                    System.out.println("Error en la transformacion, por dato invalido");
                }
            } else {
                altura = 0;
                System.out.println("al input no cumplir la condicion le damos un valor de 0 a altura");
            }

            if (apotemaTexto != null && !apotemaTexto.trim().isEmpty()) {
                System.out.println("Dato apotema no nulo , ni vacio");
                try {

                    apotema = Math.abs(Double.parseDouble(apotemaTexto));
                    System.out.println("apotema ahora se transformo en double");
                } catch (NumberFormatException e) {
                    apotema = 0;
                    System.out.println("Error en la transformacion, por dato invalido");
                }
            } else {
                apotema = 0;
                System.out.println("al input no cumplir la condicion le damos un valor de 0 a apotema");
            }

            if (radioTexto != null && !radioTexto.trim().isEmpty()) {
                System.out.println("Dato radio no nulo , ni vacio");
                try {

                    radio = Math.abs(Double.parseDouble(alturaTexto));
                    System.out.println("radio ahora se transformo en double");
                } catch (NumberFormatException e) {
                    radio = 0;
                    System.out.println("Error en la transformacion, por dato invalido");
                }
            } else {
                radio = 0;
                System.out.println("al input no cumplir la condicion le damos un valor de 0 a radio");
            }
            System.out.println("se intenta crear el objeto");
            FigurasGeometricaModel Calculo = new FigurasGeometricaModel(lados, base, apotema, altura, radio, figura);
            System.out.println("Se creo el objeto");
            Respuesta.setAttribute("Perimetro", Calculo.Perimetro());
            Respuesta.setAttribute("Area", Calculo.Area());
            response.sendRedirect("FigurasGeometricasView.jsp");


            /*CREACION DE METODOS QUE PUEDE LLAMAR EN EL MISMO PROGRAMA ASI COMO ES JS? POR EJEMPLO COMPROBAR SI UN DATO ES 
        BOOLEAN esNumero(num){
          if(num == false)
           retun false...
        }
        if(esNumero(34)){ llamamos a la funcion para evaluar
        
             */
        }
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
