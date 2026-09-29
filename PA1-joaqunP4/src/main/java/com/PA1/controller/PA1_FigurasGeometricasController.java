
package com.PA1.controller;

import com.PA1.model.PA1_FigurasGeometricasModel;
import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet(name = "PA1_FigurasGeometricasController", urlPatterns = {"/PA1_FigurasGeometricasController"})
public class PA1_FigurasGeometricasController extends HttpServlet {

 
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet PA1_FigurasGeometricasController</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet PA1_FigurasGeometricasController at " + request.getContextPath() + "</h1>");
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
               String opcion = request.getParameter("figura");
        String lados = request.getParameter("L");
        String base = request.getParameter("B");
        String altura = request.getParameter("A");
        String apotema = request.getParameter("AP");
        String radio = request.getParameter("R");
        double nlados, nbase, nAltura, nApotema, nRadio;
        if(lados != null && !lados.isEmpty()){
            try{
             nlados = Math.abs(Double.parseDouble(lados));
            }
            catch(NumberFormatException e){
                nlados = 0;
            }
        }
        else{
            nlados = 0;
        }
        
        if(base != null && !base.trim().isEmpty()){
            try{
            nbase = Math.abs(Double.parseDouble(base));
            }
            catch(NumberFormatException e){
              nbase = 0;
            }
        }
        else{
            nbase = 0;}
        
        if(altura != null && !altura.trim().isEmpty()){
            try{
            nAltura = Math.abs(Double.parseDouble(altura));
             }
            catch(NumberFormatException e){
                nAltura = 0;
            }
        }
        else{
             nAltura = 0;}
        
        if(apotema != null && !apotema.trim().isEmpty()){
             try{
             nApotema = Math.abs(Double.parseDouble(apotema));
             }
             catch(NumberFormatException e){
              nApotema = 0;   
             }
        }     
        else{
            nApotema = 0;}
        
        if(radio != null && !radio.trim().isEmpty()){
            try{
             nRadio = Math.abs(Double.parseDouble(radio));
            }
            catch(NumberFormatException e){
              nRadio = 0;  
            }
        }    
        else{
             nRadio = 0;}
        PA1_FigurasGeometricasModel CalAreaPerimetro = new PA1_FigurasGeometricasModel(opcion,nlados,nbase,nAltura,nApotema,nRadio);
        double Perimetro = CalAreaPerimetro.CalcularPerimetro();
        double Area = CalAreaPerimetro.CalcularArea();
        HttpSession RespCalculo = request.getSession();
        RespCalculo.setAttribute("ResArea", Area);
        RespCalculo.setAttribute("ResPerimetro",Perimetro);
        response.sendRedirect("FIGURAS_GEOMETRICAS_PA1_P4.jsp");
         
}
 /*PA1 Programacion orientada a objetos_NRC 6982
             pregunta 4: Proyecto “Figura geométrica”
             alumno: Rodriguez Aquino Joaquin Antonio
             correo: 70456740@mail.isil.pe
              */

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
