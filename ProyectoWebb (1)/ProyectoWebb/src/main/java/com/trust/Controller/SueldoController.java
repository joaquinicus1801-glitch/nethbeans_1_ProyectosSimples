package com.trust.Controller;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import com.trust.Model.Trabajador;

@WebServlet(name = "SueldoController",
        urlPatterns = {"/SueldoController"})

public class SueldoController extends HttpServlet {

    protected void processRequest(
            HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException, IOException {

        try {

            String strHoras =
                    request.getParameter("txtHoras");

            String strSalario =
                    request.getParameter("txtSalario");

            // Validación de campos vacíos
            if (strHoras == null
                    || strHoras.trim().isEmpty()
                    || strSalario == null
                    || strSalario.trim().isEmpty()) {

                throw new IllegalArgumentException(
                        "Todos los campos son obligatorios.");
            }

            int horas =
                    Integer.parseInt(strHoras);

            double salario =
                    Double.parseDouble(strSalario);

            // Crear objeto trabajador
            Trabajador empleado =
                    new Trabajador(horas, salario);

            // Enviar objeto a la vista
            request.setAttribute(
                    "trabajadorObjeto",
                    empleado);

            // Redireccionar al resultado
            request.getRequestDispatcher(
                    "ResultadoTrabajador.jsp")
                    .forward(request, response);

        } catch (NumberFormatException e) {

            request.setAttribute(
                    "error",
                    "Por favor, ingrese únicamente valores numéricos válidos.");

            request.getRequestDispatcher(
                    "TrabajadorView.jsp")
                    .forward(request, response);

        } catch (IllegalArgumentException e) {

            request.setAttribute(
                    "error",
                    e.getMessage());

            request.getRequestDispatcher(
                    "TrabajadorView.jsp")
                    .forward(request, response);
        }
    }

    @Override
    protected void doGet(
            HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException, IOException {

        processRequest(request, response);
    }

    @Override
   protected void doPost(
            HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException, IOException {

        processRequest(request, response);
    }

    @Override
    public String getServletInfo() {

        return "Controlador de cálculo de sueldo";
    }
}
