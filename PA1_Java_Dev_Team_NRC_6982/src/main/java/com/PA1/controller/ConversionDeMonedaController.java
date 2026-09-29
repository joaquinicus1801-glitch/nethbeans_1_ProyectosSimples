package com.PA1.controller;


import com.PA1.model.ConversionDeMonedaModel;
import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet(name = "ConversionDeMonedaController", urlPatterns = {"/ConversionDeMonedaController"})
public class ConversionDeMonedaController extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet ConversionDeMonedaController</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet ConversionDeMonedaController at " + request.getContextPath() + "</h1>");
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

        //PASO1
        String Valor1 = request.getParameter("primeraMoneda");
        String Valor2 = request.getParameter("segundaMoneda");
        double monto = Double.parseDouble(request.getParameter("cantidad"));

        //PASO2
        ConversionDeMonedaModel objCambio = new ConversionDeMonedaModel(Valor1, Valor2, monto);

        HttpSession sCambio = request.getSession();
        sCambio.setAttribute("sResponse", objCambio.mostrarCambio());

        response.sendRedirect("ConversionDeMoneda.jsp");

        //processRequest(request, response);
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
