package com.PA1.controller;


import com.PA1.negocio.RomanosNegocio;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

@WebServlet("/RomanosController")
public class RomanosController extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String numero = request.getParameter("txtNumero");
        String romano = request.getParameter("txtRomano");
        String opcion = request.getParameter("btnOpcion");

        RomanosNegocio obj = new RomanosNegocio();
        HttpSession sesion = request.getSession();

        if ("1".equals(opcion)) {

            if (numero != null && !numero.isEmpty()) {
                try {
                    int num = Integer.parseInt(numero);
                    String resultado = obj.decimalARomano(num);
                    sesion.setAttribute("resultado", resultado);
                } catch (NumberFormatException e) {
                    sesion.setAttribute("resultado", "Número inválido");
                }
            } else {
                sesion.setAttribute("resultado", "Ingrese un número");
            }

        } else if ("2".equals(opcion)) {

            if (romano != null && !romano.isEmpty()) {
                int resultado = obj.romanoADecimal(romano.toUpperCase());
                sesion.setAttribute("resultado", resultado);
            } else {
                sesion.setAttribute("resultado", "Ingrese un número romano");
            }
        }

        response.sendRedirect("romanos.jsp");
    }
}