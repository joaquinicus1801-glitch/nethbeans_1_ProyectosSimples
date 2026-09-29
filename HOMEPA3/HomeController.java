
package com.trust.Controller;

import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


@WebServlet(name = "HomeController", urlPatterns = {"/HomeController"})
public class HomeController extends HttpServlet {


    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet HomeController</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet HomeController at " + request.getContextPath() + "</h1>");
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
        
             String Opcion = request.getParameter("btnOpcion");
        // 5.- Redirigir a la web JSP
        switch (Opcion) {
            case "00":
                response.sendRedirect("HomeView.jsp");
                break;
            case "01":
                response.sendRedirect("TrabajadorView.jsp");
                break;

            case "02":
                response.sendRedirect("AbecedarioView.jsp");
                break;
            case "03":
                 response.sendRedirect("TablaAsciView.jsp");
                break;
            case "04":
                response.sendRedirect("FiguraView.jsp");
                break;
             case "05":
                response.sendRedirect("TablaASCIIView.jsp");
             break;
        }
    
             
        
        
    }

  
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
