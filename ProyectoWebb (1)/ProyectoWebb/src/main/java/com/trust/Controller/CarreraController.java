/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package com.trust.Controller;

import com.trust.Model.CarreraModel;

import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet(name = "CarreraController", urlPatterns = {"/CarreraController"})
public class CarreraController extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet CarreraController</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet CarreraController at " + request.getContextPath() + "</h1>");
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
        //1.- Recibir los parametros de la vista JSP
        String Valor1 = request.getParameter("inValor1");

        //2.- Enviar los parametros al Model (objeto, constructor, metodo)
        CarreraModel objCarrera
                = new CarreraModel(Integer.parseInt(Valor1));

        //3.- Crear variable de sesion (almacenar las respuestas del model)
        HttpSession sCarrera = request.getSession();

        //4.- Recibo las respuestas del Model (metodo)
        sCarrera.setAttribute("velocidadA",
                objCarrera.velocidadA());

        sCarrera.setAttribute("velocidadB",
                objCarrera.velocidadB());

        sCarrera.setAttribute("diferencia",
                objCarrera.diferenciaTiempo());

        sCarrera.setAttribute("ganador",
                objCarrera.ganador());

        //5.- Envio respuesta (response) a la web JSP
        response.sendRedirect("CarreraView.jsp");
    }

    @Override

    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
