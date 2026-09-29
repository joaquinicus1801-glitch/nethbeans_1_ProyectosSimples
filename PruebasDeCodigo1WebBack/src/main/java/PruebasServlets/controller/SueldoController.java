package PruebasServlets.controller;

import PruebasModel.model.SueldoProyect.SueldoEmpleadoModel;
import PruebasModel.model.SueldoProyect.SueldoObreroModel;
import PruebasModel.model.SueldoProyect.SueldoPracticanteModel;
import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import java.util.*;

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
        // processRequest(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //  processRequest(request, response);
        HttpSession sesion11 = request.getSession();
        String nombre = request.getParameter("nombre");
        String TipoTrabajador = request.getParameter("selTrabajador");
        String mes = request.getParameter("selMes");
        
        switch(TipoTrabajador){
            case "1": //empleado
                SueldoEmpleadoModel objEmpleado = new SueldoEmpleadoModel(TipoTrabajador,nombre,mes);
                List<SueldoEmpleadoModel> empleado = new ArrayList<SueldoEmpleadoModel>();
                empleado.add(objEmpleado);
                sesion11.setAttribute("Sueldo", empleado); 
            break;
            case "2": //obrero
                SueldoObreroModel objObrero = new SueldoObreroModel(TipoTrabajador,nombre,mes);
                List<SueldoObreroModel> obrero = new ArrayList<SueldoObreroModel>();
                obrero.add(objObrero);
                sesion11.setAttribute("Sueldo", obrero); 
            break;
            case "3": //practicante
                SueldoPracticanteModel objPracticante = new SueldoPracticanteModel(TipoTrabajador,nombre,mes);
                sesion11.setAttribute("Sueldo", objPracticante.mostrarSueldo()); 
            break;
        }
       response.sendRedirect("SueldoView.jsp");
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
