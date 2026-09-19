
package PruebasServlets.controller;

import PruebasModel.model.TablaASCIIModel;
import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import java.util.ArrayList;

@WebServlet(name = "TablaASCIIController", urlPatterns = {"/TablaASCIIController"})
public class TablaASCIIController extends HttpServlet {

  
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet TablaASCIIController</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<p>adadasdasdadadasd </p>");
            out.println("<h1>Servlet TablaASCIIController at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //processRequest(request, response);
       HttpSession sesion1 = request.getSession(); //creo variables de sesion, usare el metodo para consultar informccion
       sesion1.setAttribute("ListaGenerada", TablaASCIIModel.MostrarListaAleatoria());
       response.sendRedirect("ListaASCIIView.jsp");
    }

  
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //processRequest(request, response);
        String numero1 = request.getParameter("num1");
        String numero2 = request.getParameter("num2");
        int NumeroInicio = 0, NumeroFin = 0;
        if(numero1 != null && !numero1.trim().isEmpty()){
            try{
                NumeroInicio = Math.abs(Integer.parseInt(numero1));
            }
            catch(NumberFormatException e){
            request.setAttribute("Error"," NO INGRESASTE DATOS O SON INVALIDOS,  RECUERDA SOLO NUMEROS Y RESPETANDO RANGOS ESTABLECIDOS");
            request.getRequestDispatcher("ListaASCIIView.jsp").forward(request, response);
                return;
            }
        }
          if(numero2 != null && !numero2.trim().isEmpty()){
            try{
                NumeroFin = Math.abs(Integer.parseInt(numero2));
            }
            catch(NumberFormatException e){
             request.setAttribute("Error"," NO INGRESASTE DATOS O SON INVALIDOS,  RECUERDA SOLO NUMEROS Y RESPETANDO RANGOS ESTABLECIDOS");
            request.getRequestDispatcher("ListaASCIIView.jsp").forward(request, response);
                return;
            }
        }
         if(NumeroInicio > NumeroFin){
               System.out.println("el numero inicio es mayor al fin");
            request.setAttribute("Error", " RESPETA EL ORDEN ESTABLECIDOS, EL NUMERO DE INICIO NO PUEDE SER MAYOR AL FINAL");
            request.getRequestDispatcher("ListaASCIIView.jsp").forward(request, response);  
            return;
         }
          HttpSession sesion1 = request.getSession(); //debo llamar a la sesion creada, tambien con get no set llamo al contenido que almacena ListaGenerada
         if(sesion1.getAttribute("ListaGenerada") != null){
             TablaASCIIModel obj1 = new TablaASCIIModel(NumeroInicio,NumeroFin,(ArrayList<Integer>)sesion1.getAttribute("ListaGenerada"));
              //usamos el casting para que el objeto generico que entrega el getAttibue ahora se SEA  tratado como un arrayList
              //esto hace que el compilador no de error, pero ojo si el objeto generico no almacena un arrayList entonces habra error en la copilacion 
              
              
              
              
              sesion1.setAttribute("sRespColecNueva",obj1.ListaNuevaDeObjeto());
              sesion1.setAttribute("sRespColecAsci",obj1.ListaAsciNueva());
                      response.sendRedirect("ListaASCIIView.jsp");
                      return;
         
         } 
         else{
            request.setAttribute("Error","Crea la lista aleatoria primero por favor");
            request.getRequestDispatcher("ListaASCIIView.jsp").forward(request, response);

         }
         
    }

  
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
