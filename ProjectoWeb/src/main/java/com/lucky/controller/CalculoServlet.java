/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.lucky.controller;

/**
 *
 * @author PC - OS
 */
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


import java.io.IOException;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/CalculoServlet")
public class CalculoServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String perfil = request.getParameter("perfil");
        int cantidad = Integer.parseInt(request.getParameter("cantidad"));
        String dia = request.getParameter("dia");

        double precio = 0;
        double descuento = 0;
        String rango = "";

        switch (perfil) {
            case "Niño":
                precio = 150;
                rango = "Menor de 8 años";
                descuento = dia.equals("semana") ? 0.35 : 0.20;
                break;

            case "Adolescente":
                precio = 180;
                rango = "8 a 12 años";
                descuento = dia.equals("semana") ? 0.25 : 0.15;
                break;

            case "Adulto":
                precio = 220;
                rango = "13 a 59 años";
                descuento = dia.equals("semana") ? 0.15 : 0.05;
                break;

            case "Adulto Mayor":
                precio = 200;
                rango = "60+ años";
                descuento = dia.equals("semana") ? 0.50 : 0.30;
                break;
        }

        double subtotal = precio * cantidad;
        double total = subtotal - (subtotal * descuento);

        request.setAttribute("rango", rango);
        request.setAttribute("cantidad", cantidad);
        request.setAttribute("precio", precio);
        request.setAttribute("descuento", descuento * 100);
        request.setAttribute("total", total);

        request.getRequestDispatcher("CalculadoraView.jsp")
               .forward(request, response);
    }
}