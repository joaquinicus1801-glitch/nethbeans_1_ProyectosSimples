package com.jara.repasocontroller;

import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet(name = "SisNotasAcademicasController", urlPatterns = {"/SisNotasAcademicasController"})
public class SisNotasAcademicasController extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet SisNotasAcademicasController</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet SisNotasAcademicasController at " + request.getContextPath() + "</h1>");
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
        String curso = request.getParameter("selCurso");
        int cantPregunt = Integer.parseInt(request.getParameter("inPreguntas"));
        int PreguntasValidas = Integer.parseInt(request.getParameter("inPreguntasValidas"));
        int TiempoRespuesta = Integer.parseInt(request.getParameter("inPreguntasTiempo"));
        String tipoExamen = request.getParameter("selTipoExamen");
   /*     
    HttpSession sSession = request.getSession();
     switch (tipoExamen) { //dependienfdo el ttabajador crearemos un objeto dependiendo la clase correspondiente, usamo herencia
            case "1":
                ExamenEscritoModel objEscrito = new ExamenEscritoModel(TipoTrabajador, Nombres, Mes);
                List<ExamenEscritoModel> Escrito  = new ArrayList<ExamenEscritoModel>();
                Escrito.add(objEscrito);
                sSession.setAttribute("sSueldo", empleados); //lammamos la metodo no especial
                break;
            case "2":
                SueldoObreroModel objObrero = new SueldoObreroModel(TipoTrabajador, Nombres, Mes);
                 List<SueldoObreroModel> obreros = new ArrayList<SueldoObreroModel>();
                  obreros.add(objObrero);
                sSession.setAttribute("sSueldo", obreros);
                break;
            case "3":
                SueldoPracticanteModel objPracticante = new SueldoPracticanteModel(TipoTrabajador, Nombres, Mes);
                List<SueldoPracticanteModel > Practicantes = new ArrayList<SueldoPracticanteModel >();
                Practicantes.add(objPracticante);
                sSession.setAttribute("sSueldo", Practicantes);
                break;
        }
        */
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
