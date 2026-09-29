
package com.PA1.controller;

import com.PA1.model.claseStringModel;
import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet(name = "claseStringController", urlPatterns = {"/claseStringController"})
public class claseStringController extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet claseStringController</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet claseStringController at " + request.getContextPath() + "</h1>");
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
        String textArea = request.getParameter("TaContenido");
        String input1 = request.getParameter("inText");
        String opcion = request.getParameter("btnOpcion");
        if(textArea == null){
            textArea = ""; //el place holder ya hace que la caja tenga un texto por lo que no seria "" 
        }
         if(input1 == null){
            input1 = ""; //el place holder ya hace que la caja tenga un texto por lo que no seria "" 
        }
          if(opcion == null){
            opcion = ""; //el place holder ya hace que la caja tenga un texto por lo que no seria "" 
        }
            claseStringModel obj = new claseStringModel(textArea, input1, opcion);
        HttpSession Respuesta = request.getSession();
        Respuesta.setAttribute("sResponse", obj.Resultado());
        response.sendRedirect("clase sstring.jsp");
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
