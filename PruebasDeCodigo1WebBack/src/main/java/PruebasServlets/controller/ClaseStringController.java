
package PruebasServlets.controller;

import PruebasModel.model.ClaseStringModel;
import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet(name = "ClaseStringController", urlPatterns = {"/ClaseStringController"})
public class ClaseStringController extends HttpServlet {


    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet ClaseStringController</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet ClaseStringController at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

  
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       // processRequest(request, response);
    }

   
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //processRequest(request, response);
        String contenido = request.getParameter("TaContenido");
        String texto = request.getParameter("inText");
        String opcion = request.getParameter("btnOpcion");
        
        ClaseStringModel obj1 = new ClaseStringModel(contenido,texto,opcion);
        HttpSession Respuestas =  request.getSession();
        Respuestas.setAttribute("sResponse", obj1.metodos());
         response.sendRedirect("ClaseString.jsp");
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
