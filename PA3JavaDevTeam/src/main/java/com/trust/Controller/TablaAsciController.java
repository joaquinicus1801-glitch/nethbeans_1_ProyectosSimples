
package com.trust.controller;

import com.trust.Model.TablaAsciModel;
import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import java.util.ArrayList;


@WebServlet(name = "TablaAsciController", urlPatterns = {"/TablaAsciController"})
public class TablaAsciController extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet TablaAsciController</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet TablaAsciController at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

  
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //processRequest(request, response);
        HttpSession sResolucion = request.getSession();
        sResolucion.setAttribute("sRespColecAleatorio",TablaAsciModel.mostrarColeccion());
        response.sendRedirect("TablaAsciView.jsp");
                
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
            request.getRequestDispatcher("TablaAsciView.jsp").forward(request, response);
         }
         else{
             if(numeroInicio > numeroFin){
                 System.out.println("el nnumero inicio es mayor al fin");
            request.setAttribute("Error", " RESPETA EL ORDEN ESTABLECIDOS, EL NUMERO DE INICIO NO PUEDE SER MAYOR AL FINAL");
            request.getRequestDispatcher("TablaAsciView.jsp").forward(request, response);  
              
             }
             else{
                 HttpSession sResolucion = request.getSession();
                 ArrayList<Integer> listaNueva = (ArrayList<Integer>) sResolucion.getAttribute("sRespColecAleatorio");
                  if(listaNueva != null){
                      TablaAsciModel NuevaColeccion = new TablaAsciModel(numeroInicio,numeroFin,listaNueva);
                      sResolucion.setAttribute("sRespColecNueva",NuevaColeccion.nuevaColeccion());
                       sResolucion.setAttribute("sRespColecAsci",NuevaColeccion.nuevaColeccionAsci());
                      response.sendRedirect("TablaAsciView.jsp");
                      }
                      else{
                          request.setAttribute("sRespColecNueva", "SIN DATOS");
                          request.getRequestDispatcher("TablaAsciView.jsp").forward(request, response);  
                      }
             }  
         }
        
        
        
        
    }

   
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
