package com.jara.repasocontroller;

import com.jara.repasoModel.SueldoEmpleadoModel;
import com.jara.repasoModel.SueldoObreroModel;
import com.jara.repasoModel.SueldoPracticanteModel;
import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import java.util.*; //importamos toda las colecciones

@WebServlet(name = "SueldoController", urlPatterns = {"/SueldoController"})
public class SueldoController extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet SueldoController</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet SueldoController at " + request.getContextPath() + "</h1>");
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
        //processRequest(request, response);
        //1.- Recibimos los parametros
        String TipoTrabajador = request.getParameter("selTipo");
        String Nombres = request.getParameter("inNombres");
        String Mes = request.getParameter("selMes");

        //3.- Crear la variable de session
        HttpSession sSession = request.getSession();

        //2.- Enviar los parametros al model
        switch (TipoTrabajador) { //dependienfdo el ttabajador crearemos un objeto dependiendo la clase correspondiente, usamo herencia
            case "1":
                SueldoEmpleadoModel objEmpleado = new SueldoEmpleadoModel(TipoTrabajador, Nombres, Mes);
                List<SueldoEmpleadoModel> empleados = new ArrayList<SueldoEmpleadoModel>();
                empleados.add(objEmpleado);
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

        //5.- Enviar los resultados a la web
        response.sendRedirect("SueldoView.jsp");
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
