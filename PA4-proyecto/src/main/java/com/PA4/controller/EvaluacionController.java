package com.PA4.controller;

import com.PA4.model.EvaluacionModel;
import com.PA4.model.ExamenEscritoModel;
import com.PA4.model.TrabajoPracticoModel;
import com.PA4.model.ExamenOralModel;

import java.io.IOException;
import java.util.ArrayList;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet(name = "EvaluacionController", urlPatterns = {"/EvaluacionController"})
public class EvaluacionController extends HttpServlet {

    private static ArrayList<EvaluacionModel> listaEvaluaciones = new ArrayList<>();

    @Override
    public void init() throws ServletException {
        if (listaEvaluaciones.isEmpty()) {
            listaEvaluaciones.add(new ExamenEscritoModel("E001", "POO", 100, 85, 28));
            listaEvaluaciones.add(new TrabajoPracticoModel("T001", "Base de Datos", 100, 70, 40));
            listaEvaluaciones.add(new ExamenOralModel("O001", "Desarrollo Web", 100, 90, 25));
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        HttpSession sesion = request.getSession();

        String accion = request.getParameter("accion");
        String codigo = request.getParameter("codigo");

        if ("eliminar".equals(accion)) {
            listaEvaluaciones.removeIf(e -> e.getCodigo().equals(codigo));
            sesion.removeAttribute("sEditar");
        }

        if ("editar".equals(accion)) {
            for (EvaluacionModel e : listaEvaluaciones) {
                if (e.getCodigo().equals(codigo)) {
                    sesion.setAttribute("sEditar", e);
                    break;
                }
            }
        }

        sesion.setAttribute("sListaEvaluaciones", listaEvaluaciones);
        response.sendRedirect("EvaluacionView.jsp");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String codigo = request.getParameter("txtCodigo");
        String curso = request.getParameter("txtCurso");
        String tipo = request.getParameter("cboTipo");

        int cantidadPreguntas = Integer.parseInt(request.getParameter("txtCantidad"));
        int respuestasValidas = Integer.parseInt(request.getParameter("txtValidas"));
        int tiempoRespuesta = Integer.parseInt(request.getParameter("txtTiempo"));

        if (cantidadPreguntas > 100) {
            cantidadPreguntas = 100;
        }

        if (respuestasValidas > cantidadPreguntas) {
            respuestasValidas = cantidadPreguntas;
        }

        EvaluacionModel evaluacion;

        if (tipo.equals("Escrito")) {
            evaluacion = new ExamenEscritoModel(codigo, curso, cantidadPreguntas, respuestasValidas, tiempoRespuesta);
        } else if (tipo.equals("Practico")) {
            evaluacion = new TrabajoPracticoModel(codigo, curso, cantidadPreguntas, respuestasValidas, tiempoRespuesta);
        } else {
            evaluacion = new ExamenOralModel(codigo, curso, cantidadPreguntas, respuestasValidas, tiempoRespuesta);
        }

        listaEvaluaciones.removeIf(e -> e.getCodigo().equals(codigo));
        listaEvaluaciones.add(evaluacion);

        HttpSession sesion = request.getSession();
        sesion.setAttribute("sListaEvaluaciones", listaEvaluaciones);
        sesion.removeAttribute("sEditar");

        response.sendRedirect("EvaluacionView.jsp");
    }

    @Override
    public String getServletInfo() {
        return "Controller del Sistema de Notas Academicas";
    }
}                 