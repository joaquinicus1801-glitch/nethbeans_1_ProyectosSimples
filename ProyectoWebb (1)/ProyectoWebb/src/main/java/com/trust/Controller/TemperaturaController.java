package com.trust.Controller;

import com.trust.Model.TemperaturaModel;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(name = "TemperaturaController",
            urlPatterns = {"/TemperaturaController"})

public class TemperaturaController extends HttpServlet {

    protected void processRequest(HttpServletRequest request,
                                  HttpServletResponse response)
            throws ServletException, IOException {

        try {

            double celsius =
                    Double.parseDouble(
                            request.getParameter("celsius"));

            TemperaturaModel temperatura =
                    new TemperaturaModel(celsius);

            request.setAttribute("celsius",
                                 celsius);

            request.setAttribute("temperatura",
                                 temperatura);

            request.getRequestDispatcher(
                    "TemperaturaResultado.jsp")
                    .forward(request, response);

        } catch (Exception e) {

            request.setAttribute("error",
                    "Ingrese un número válido");

            request.getRequestDispatcher(
                    "TemperaturaView.jsp")
                    .forward(request, response);
        }
    }

    @Override
    protected void doGet(HttpServletRequest request,
                         HttpServletResponse response)
            throws ServletException, IOException {

        processRequest(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request,
                          HttpServletResponse response)
            throws ServletException, IOException {

        processRequest(request, response);
    }

    @Override
    public String getServletInfo() {

        return "Controlador de Temperatura";
    }
}