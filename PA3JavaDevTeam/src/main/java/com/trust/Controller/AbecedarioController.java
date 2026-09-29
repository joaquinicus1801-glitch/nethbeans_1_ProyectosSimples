package com.trust.Controller;

import com.trust.Model.AbecedarioModel;
import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet(name = "AbecedarioController", urlPatterns = {"/AbecedarioController"})
public class AbecedarioController extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html;charset=UTF-8");

        try (PrintWriter out = response.getWriter()) {

            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet AbecedarioController</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet AbecedarioController</h1>");
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

        String frase = request.getParameter("txtFrase");

        AbecedarioModel objAbecedario = new AbecedarioModel(frase);

        HttpSession sesion = request.getSession();

        sesion.setAttribute("sFrase", frase);
        sesion.setAttribute("sAbecedario", objAbecedario.obtenerAbecedario());
        sesion.setAttribute("sPosiciones", objAbecedario.obtenerPosiciones());
        sesion.setAttribute("sPosicionesDesc", objAbecedario.obtenerPosicionesDesc());

        response.sendRedirect("AbecedarioResultado.jsp");
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }
}