
package PruebasServlets.controller;

import PruebasModel.model.CalculoFiguraModel;
import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;


@WebServlet(name = "CalcularFiguraController", urlPatterns = {"/CalcularFiguraController"})
public class CalcularFiguraController extends HttpServlet {


    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet CalcularFiguraController</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet CalcularFiguraController at " + request.getContextPath() + "</h1>");
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
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //processRequest(request, response);
        String CatOpuesto = request.getParameter("CatOpuesto");
        String CatAdyacente = request.getParameter("CatAdyacente");
        double CatOpuestoN, CatAdyacenteN;
        System.out.println("si llego al controller");
        
       if(CatOpuesto == null || CatOpuesto.trim().isEmpty()){
             request.setAttribute("sAviso", "Datos no validos ingresados, no se puede realizar los calculos");
                   System.out.println("dasas");
             request.getRequestDispatcher("CalculoFiguraCOyCA.jsp").forward(request, response);
             return; // <-- Esto detiene la ejecución del resto del código en este método
            // Cualquier código escrito aquí abajo ya NO se ejecutará
       }
          if(CatAdyacente == null || CatAdyacente.trim().isEmpty()){
             request.setAttribute("sAviso", "Datos no validos ingresados, no se puede realizar los calculos");
                   System.out.println("no cumple");
             request.getRequestDispatcher("CalculoFiguraCOyCA.jsp").forward(request, response);
               return; //no devuelve nada porque el metodo doPost es void
       }
          try{
              CatOpuestoN = Math.abs(Double.parseDouble(CatOpuesto));
              CatAdyacenteN = Math.abs(Double.parseDouble(CatAdyacente));
          }catch(NumberFormatException e){
              request.setAttribute("sAviso", "Datos no validos ingresados, no se puede realizar los calculos");
               request.getRequestDispatcher("CalculoFiguraCOyCA.jsp").forward(request, response);
               return; //no devuelve nada porque el metodo doPost es void
          }
        System.out.println("si fueron correctos los ingresos");
        HttpSession Respuestas =  request.getSession();
        CalculoFiguraModel obj = new CalculoFiguraModel(CatOpuestoN, CatAdyacenteN);
         Respuestas.setAttribute("RespArea", obj.area());
         Respuestas.setAttribute("sAviso","");
           Respuestas.setAttribute("RespHipotenusa",obj.hipotenusa());
           Respuestas.setAttribute("RespAnguloA",obj.anguloA());
           Respuestas.setAttribute("RespAnguloB",obj.AnguloB());
           response.sendRedirect("CalculoFiguraCOyCA.jsp");  
       
        
        
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
