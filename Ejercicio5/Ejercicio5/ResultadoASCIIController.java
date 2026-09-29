/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package com.trust.Controller;

import com.trust.Model.AsciiModel;
import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet(name = "ResultadoASCIIController", urlPatterns = {"/ResultadoASCIIController"})
public class ResultadoASCIIController extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet ResultadoASCIIController</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet ResultadoASCIIController at " + request.getContextPath() + "</h1>");
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

    // 1.- Recibir los parametros de la vista JSP
    String texto = request.getParameter("txtTexto");

    // 2.- Enviar los parametros al Model
    AsciiModel model = new AsciiModel();
    model.procesarTexto(texto);

    // 3.- Crear variable de sesion
    HttpSession sesion = request.getSession();

    // 4.- Recibir las respuestas del Model
    sesion.setAttribute("listaA", model.getListaA());
    sesion.setAttribute("listaB", model.getListaB());

    // 5.- Enviar respuesta a la JSP
    response.sendRedirect("AsciiResultado.jsp");
}


    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
