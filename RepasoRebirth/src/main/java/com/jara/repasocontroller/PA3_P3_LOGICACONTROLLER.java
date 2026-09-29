/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package com.jara.repasocontroller;

import com.jara.repasoModel.PA3_P3_LOGICAMODEL;
import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;

/**
 *
 * @author joaqu
 */
@WebServlet(name = "PA3_P3_LOGICACONTROLLER", urlPatterns = {"/PA3_P3_LOGICACONTROLLER"})
public class PA3_P3_LOGICACONTROLLER extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet PA3_P3_LOGICACONTROLLER</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet PA3_P3_LOGICACONTROLLER at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

 
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //processRequest(request, response);
        System.out.println("Paso 1: Ingrese al GET");
        System.out.println("Cree una variable de sesion");
        HttpSession sResolucion = request.getSession();
        System.out.println("Agregue");
        sResolucion.setAttribute("sRespColecAleatorio",PA3_P3_LOGICAMODEL.mostrarColeccion());
        response.sendRedirect("PA3_P3_LOGICA.jsp");
    }


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //processRequest(request, response);
         String d1 = request.getParameter("numInicio");
         String d2 = request.getParameter("numFin");
         System.out.println("se agrego los parametros a las variables");
         int numeroInicio = 0 , numeroFin = 0 ;
         //aunque con las restricciones que puse en los input igual me recomeindan validar
         if(d1 != null && !d1.trim().isEmpty()){
             try{
                 numeroInicio = Math.abs(Integer.parseInt(d1));
                 System.out.println("INTENTO LA TRANSFORMACION");
             }
             catch(NumberFormatException e){
                
             }
         }
         if(d2 != null && !d2.trim().isEmpty()){
             try{
                 numeroFin = Math.abs(Integer.parseInt(d2));
             }
             catch(NumberFormatException e){
              
             }
         }
         if(numeroInicio == 0 || numeroFin == 0){
             System.out.println("alguno de los numeros es 0");
             request.setAttribute("Error"," NO INGRESASTE DATOS O SON INVALIDOS,  RECUERDA SOLO NUMEROS Y RESPETANDO RANGOS ESTABLECIDOS");
            request.getRequestDispatcher("PA3_P3_LOGICA.jsp").forward(request, response);
         }
         else{
             if(numeroInicio > numeroFin){
                 System.out.println("el nnumero inicio es mayor al fin");
            request.setAttribute("Error", " RESPETA EL ORDEN ESTABLECIDOS, EL NUMERO DE INICIO NO PUEDE SER MAYOR AL FINAL");
            request.getRequestDispatcher("PA3_P3_LOGICA.jsp").forward(request, response);  
              
             }
             else{
                /* if( Math.abs(numeroInicio - numeroFin) <= 1){
                      request.setAttribute("Error", "SE NECESITA QUE HALLA NUMEROS ENTEROS EENTRE LOS 2 NUMEROS");
                     request.getRequestDispatcher("PA3_P3_LOGICA.jsp").forward(request, response);  
                 NO NECESITO ESTO PORQUE SE INCLUYEN ESTOS NUMEROS
                 }
                 else{
                      HttpSession sResolucion = request.getSession();
                      ArrayList<Integer> listaNueva = (ArrayList<Integer>) sResolucion.getAttribute("sRespColecAleatorio");
                      if(listaNueva != null){
                      PA3_P3_LOGICAMODEL NuevaColeccion = new PA3_P3_LOGICAMODEL(numeroInicio,numeroFin,listaNueva);
                      sResolucion.setAttribute("sRespColecNueva",NuevaColeccion.nuevaColeccion());
                      response.sendRedirect("PA3_P3_LOGICA.jsp");
                      }
                      else{
                          request.setAttribute("sRespColecNueva", "SIN DATOS");
                          request.getRequestDispatcher("PA3_P3_LOGICA.jsp").forward(request, response);  
                      }
                 } */
                 HttpSession sResolucion = request.getSession();
                 ArrayList<Integer> listaNueva = (ArrayList<Integer>) sResolucion.getAttribute("sRespColecAleatorio");
                  if(listaNueva != null){
                      PA3_P3_LOGICAMODEL NuevaColeccion = new PA3_P3_LOGICAMODEL(numeroInicio,numeroFin,listaNueva);
                      sResolucion.setAttribute("sRespColecNueva",NuevaColeccion.nuevaColeccion());
                       sResolucion.setAttribute("sRespColecAsci",NuevaColeccion.nuevaColeccionAsci());
                      response.sendRedirect("PA3_P3_LOGICA.jsp");
                      }
                      else{
                          request.setAttribute("sRespColecNueva", "SIN DATOS");
                          request.getRequestDispatcher("PA3_P3_LOGICA.jsp").forward(request, response);  
                      }
             }  
         }
         
    }

 
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
