
package PruebasServlets.controller;

import PruebasModel.model.NotasAcademicas.ExamenEscritoModel;
import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import PruebasModel.model.NotasAcademicas.SistemaDeNotasAcademicasModel;
import PruebasModel.model.NotasAcademicas.ExamenPracticoModel;
import java.util.*;
@WebServlet(name = "SistemaDeNotasAcademicasController", urlPatterns = {"/SistemaDeNotasAcademicasController"})
public class SistemaDeNotasAcademicasController extends HttpServlet {

  
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
           
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet SistemaDeNotasAcademicasController</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet SistemaDeNotasAcademicasController at " + request.getContextPath() + "</h1>");
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
        
        String TipoExamen = request.getParameter("selTExamen");
        String Curso = request.getParameter("Curso");
        Integer CantidadPreguntas = SistemaDeNotasAcademicasModel.TransformacionDeDatos(request.getParameter("nPreguntas"));
        Integer RespuestasValidas = SistemaDeNotasAcademicasModel.TransformacionDeDatos(request.getParameter("RespValidas"));
        Integer TiempoRespuesta = SistemaDeNotasAcademicasModel.TransformacionDeDatos(request.getParameter("TiempoRespuesta"));
        System.out.println("adadadasdasdasasd");
        if(CantidadPreguntas == null || RespuestasValidas == null || TiempoRespuesta == null || TipoExamen != "0"){
              request.setAttribute("Error"," NO INGRESASTE DATOS O SON INVALIDOS");
            request.getRequestDispatcher("SistemaDeNotasAcademicas.jsp").forward(request, response);
             System.out.println("hola como estas");
            return;
           
        }
          List<ExamenEscritoModel> escrito = new ArrayList<ExamenEscritoModel>();
        switch(TipoExamen){
            case "1":
               
             break;
            case "2":
                break;
            case "3":
                 
                break;
            
        }
        System.out.println("no hubo errores");
        
   
        
    }

   
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
