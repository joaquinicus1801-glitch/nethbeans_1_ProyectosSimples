package com.trust.Controller;

import com.trust.Model.FiguraModel;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(name = "FiguraController",
            urlPatterns = {"/FiguraController"})

public class FiguraController extends HttpServlet {

    protected void processRequest(HttpServletRequest request,
                                  HttpServletResponse response)
            throws ServletException, IOException {

        try {

            double catetoOpuesto =
                    Double.parseDouble(
                            request.getParameter(
                                    "CatOpuesto"));

            double catetoAdyacente =
                    Double.parseDouble(
                            request.getParameter(
                                    "CatAdyacente"));

            if (catetoOpuesto <= 0
                    ||
                catetoAdyacente <= 0) {

                throw new Exception();
            }

            FiguraModel figura =
                    new FiguraModel(
                            catetoAdyacente,
                            catetoOpuesto);

            request.setAttribute(
                    "figura",
                    figura);

            request.getRequestDispatcher(
                    "FiguraResultado.jsp")
                    .forward(request, response);

        } catch (Exception e) {

            request.setAttribute(
                    "error",
                    "Ingrese valores válidos");

            request.getRequestDispatcher(
                    "FiguraView.jsp")
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

        return "Controlador de Figura";
    }
}
