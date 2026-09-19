
package PruebasServlets.controller; //es la ubicacion del controlador, en que pakage se encuentra

import PruebasModel.model.CalculadoraViewModel;
import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;//import significa quiero usar esta herramienta, las librerias es un codigo
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;//todo esto son librerias que se importan o contorlan solos
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

/**
 *
 * @author joaqu
 */
@WebServlet(name = "CalculadoraView2Controller", urlPatterns = {"/CalculadoraView2Controller"}) // indica que es un servelet, @.. indica que es un webservelet, entre parentesis su nombre y su url osea con que barra
// ingresamos  osea la /servelet , lo de urlr es lo que conecta el form con el jsp

public class CalculadoraView2Controller extends HttpServlet {//la calse calculadora, estamos creando un molde para objetos, pero no es una normal es para crear servlets
//clase publica llamada CalculadoraController, extend (indica que una heredada de otra) htpServlet, significa "mi clase hereda el comportamiento de un servlet" eso lo hace diferenete, htpsrevlñet ya sabe recibir so get y do post y tu personalizas lo que necesitas
 // public indica que la clase es accesible  desde otrros lados

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)// es un metodo auciliar para reuzar codigo, se usa mas el do get y do psot
    //protected es el modificador de acceso, al igual que public, private... estes es de acceso limitado no totlamente publico solo clases relacionadas (como herencia)
    //void: indica el tipo de retorno, que vouid es vacio osea no devuelve nada por eso en la funcioon no vemos return
    //procesResquest es oslo el n0ombre por defecto del metodo o funcion asi que puedes cambiarlo si quieres, los parametros son lo queenvia el usuario resquest y lo que responde response
            throws ServletException, IOException {//throws... indica que se pueden generar errores servletEsception error de servlet y IOExeption--> error de entrada y salida
        response.setContentType("text/html;charset=UTF-8"); //dentro de la funcion dice response (responde)  setconten osea te voy a enviar html
        try (PrintWriter out = response.getWriter()) {//funcion dentro de funcion? crea una eherraamienta para resibir la respuesta
            /* TODO output your page here. You may use following sample code. */
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>"); //el outprint genera cosas, en este caso por como esta escrito genera codigo html desde el java
            out.println("<head>");
            out.println("<title>Servlet CalculadoraView2Controller</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet CalculadoraView2Controller at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }
     /*NUESTRA CLASE QUE ACTUA COMO SERVLET CON SU EXTENCION DE LA CLASE PADRE, no tienee propiedades al menos por ahora pero tiene metodos el cual es doPost, do Get,etc*/
    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override //override ver despues BIEN QUE HACE LPTM
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //processRequest(request, response); este metodo llama al processRequest de arriba
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override //esta sobrescriviendo un metodo de la clase padre, lo que hace es no quiero usar  el do post de la clase padre sino mi propia version
    protected void doPost(HttpServletRequest request, HttpServletResponse response) //esto es una accion de tomcat, investigar bien despues
            throws ServletException, IOException {
        //processRequest(request, response); este metodo llama al processRequest, como en este caso no lo usamos al comentar no pasas
        //nada ya que nosotros consturimos la porpia logica tanto en el doget como dopost (acciones HTTP distintas)
        
          //5 pasos para 
      //1. recibir los parametros del formulario web jsp
        String valor1 = request.getParameter("inValor1"); //las lineas amarillas de error solo son adevertecia, pero esta bien
        String valor2 = request.getParameter("inValor2"); //crear variable que adquieren el valor, como el getelement del js, aqui se inserta de los inputs
        String opcion = request.getParameter("btnOption"); //aca se inserta el valor del boton
      //2. Envi ar los parametros al model (objeto, constructor,metodo, recuerda que el metodo es una funcion en un clase)
       CalculadoraViewModel objCalculadora = new CalculadoraViewModel(Double.parseDouble(valor1), Double.parseDouble(valor2), opcion);
       //para crear una instancia de clase u obetjor se referencia la clase, luego new y el constructor con los parametros
      //3. Crear la variable de session (almacenar las respuestas del model)
    HttpSession sCalculadora = request.getSession();
      //4. Recibo las respuestas del model (metodo)
       sCalculadora.setAttribute("sResponse", objCalculadora.CalcularOperacion()); //trae la respuesta del metodo y o guarda en la variable o atributo sresponse
      //5. Envio respuesta (response a la web al jsp)
      response.sendRedirect("CALCULADORAVIEW2.jsp");
    
    
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
