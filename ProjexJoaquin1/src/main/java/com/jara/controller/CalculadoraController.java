
package com.jara.controller; //es la ubicacion del controlador, en que pakage se encuentra

import com.jara.model.CalculadoraModel;
import java.io.IOException; 
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;  //import significa quiero usar esta herramienta, las librerias es un codigo hecho por otros ylo reutilizas
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse; //todo esto son librerias que se importan o contorlan solos
import jakarta.servlet.http.HttpSession;

@WebServlet(name = "CalculadoraController", urlPatterns = {"/CalculadoraController"}) // indica que es un servelet, @.. indica que es un webservelet, entre parentesis su nombre y su url osea con que barra
// ingresamos  osea la /servelet , lo de urlr es lo que conecta el form con el jsp

public class CalculadoraController extends HttpServlet { //la calse calculadora, estamos creando un molde para objetos, pero no es una normal es para crear servlets
//clase publica llamada CalculadoraController, extend (indica que una heredada de otra) htpServlet, significa "mi clase hereda el comportamiento de un servlet" eso lo hace diferenete, htpsrevlñet ya sabe recibir so get y do post y tu personalizas lo que necesitas
 // public indica que la clase es accesible  desde otrros lados

    protected void processRequest(HttpServletRequest request, HttpServletResponse response) // es un metodo auciliar para reuzar codigo, se usa mas el do get y do psot
    //protected es el modificador de acceso, al igual que public, private... estes es de acceso limitado no totlamente publico solo clases relacionadas (como herencia)
    //void: indica el tipo de retorno, que vouid es vacio osea no devuelve nada por eso en la funcioon no vemos return
    //procesResquest es oslo el n0ombre por defecto del metodo o funcion asi que puedes cambiarlo si quieres, los parametros son lo queenvia el usuario resquest y lo que responde response
            throws ServletException, IOException { //throws... indica que se pueden generar errores servletEsception error de servlet y IOExeption--> error de entrada y salida
        response.setContentType("text/html;charset=UTF-8"); //dentro de la funcion dice response (responde)  setconten osea te voy a enviar html
        try (PrintWriter out = response.getWriter()) {  //funcion dentro de funcion? crea una eherraamienta para resibir la respuesta
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");  //el outprint genera cosas, en este caso por como esta escrito genera codigo html desde el java
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet CalculadoraController</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet CalculadoraController at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }
//se trabaja con alguno de los 2 , no los 2 a la vez?
    @Override //metodo do get, usa la sobreescritura en este caso 
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       // processRequest(request, response); consultas y respuesta
    }

   
    @Override //metodo do post, 
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
      //  processRequest(request, response); consultas y respuesta
      //5 pasos para 
      //1. recibir los parametros del formulario web jsp
        String valor1 = request.getParameter("inValor1"); //las lineas amarillas de error solo son adevertecia, pero esta bien
        String valor2 = request.getParameter("inValor2"); //crear variable que adquieren el valor, como el getelement del js, aqui se inserta de los inputs
        String opcion = request.getParameter("btnOption"); //aca se inserta el valor del boton
      //2. Envi ar los parametros al model (objeto, constructor,metodo, recuerda que el metodo es una funcion en un clase)
       CalculadoraModel objCalculadora = new CalculadoraModel(Double.parseDouble(valor1), Double.parseDouble(valor2), opcion);
       //para crear una instancia de clase u obetjor se referencia la clase, luego new y el constructor con los parametros
      //3. Crear la variable de session (almacenar las respuestas del model)
  HttpSession sCalculadora = request.getSession();
      //4. Recibo las respuestas del model (metodo)
         sCalculadora.setAttribute("sResponse", objCalculadora.CalcularOperacion()); //trae la respuesta del metodo y o guarda en la variable o atributo sresponse
      //5. Envio respuesta (response a la web al jsp)
      response.sendRedirect("CALCULADORAVIEW.jsp");
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }

}
