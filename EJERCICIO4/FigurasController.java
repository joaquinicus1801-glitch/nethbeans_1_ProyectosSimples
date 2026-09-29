package controller;

import java.io.IOException;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.Collections;
import model.FigurasModel;

@WebServlet("/FigurasController")
public class FigurasController extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        // Crear el objeto del model
        FigurasModel figura = new FigurasModel();

        // Obtener la lista y ordenarla alfabéticamente inversa
        ArrayList<String> listaOrdenada = figura.getListaFiguras();
        Collections.sort(listaOrdenada, Collections.reverseOrder());

        // Enviar datos a la vista
        request.setAttribute("listaFiguras", listaOrdenada);
        request.setAttribute("numeroAleatorio", figura.getNumeroAleatorio());
        request.setAttribute("figuraSeleccionada", figura.getFiguraSeleccionada());
        request.setAttribute("area", figura.getArea());
        request.setAttribute("perimetro", figura.getPerimetro());

        // Redirigir a la vista
        request.getRequestDispatcher("/FigurasView.jsp").forward(request, response);
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }
}