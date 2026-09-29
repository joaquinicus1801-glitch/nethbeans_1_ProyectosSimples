

package com.PA1.controller;

import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(name = "MenurRedireccionador", urlPatterns = {"/MenurRedireccionador"})
public class MenurRedireccionador extends HttpServlet {


    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet MenurRedireccionador</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet MenurRedireccionador at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //processRequest(request, response);
    }

   
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //processRequest(request, response);
        String opcion = request.getParameter("opcion");
        switch(opcion){
            case "1":
                response.sendRedirect("CalculadoraView.jsp");
            break;
            case "2":
                   response.sendRedirect("ConversionDeMoneda.jsp");
            break;
            case "3":
                response.sendRedirect("FIGURAS_GEOMETRICAS_PA1_P4.jsp");
            break;
            case "4":
                response.sendRedirect("romanos.jsp");
            break;
            case "5":
                response.sendRedirect("clase sstring.jsp");
        }
            
    }

  
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
