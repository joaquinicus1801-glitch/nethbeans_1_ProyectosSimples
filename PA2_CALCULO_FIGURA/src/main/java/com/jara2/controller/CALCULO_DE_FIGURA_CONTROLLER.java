
package com.jara2.controller;

import com.jara2.model.CALCULO_DE_FIGURA_MODEL;
import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;


@WebServlet(name = "CALCULO_DE_FIGURA_CONTROLLER", urlPatterns = {"/CALCULO_DE_FIGURA_CONTROLLER"})
public class CALCULO_DE_FIGURA_CONTROLLER extends HttpServlet {

   
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet CALCULO_DE_FIGURA_CONTROLLER</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet CALCULO_DE_FIGURA_CONTROLLER at " + request.getContextPath() + "</h1>");
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
        String Lado1 = request.getParameter("CatOpuesto");
        String Lado2 = request.getParameter("CatAdyacente");
        double CatOpuesto = 0;
        double CatAdyacente = 0;
        if( Lado1 != null && !Lado1.trim().isEmpty()){
            try{
                CatOpuesto = Math.abs(Double.parseDouble(Lado1));
            }
            catch(NumberFormatException e){
                
            }
        }
        if(Lado2 != null  && !Lado2.trim().isEmpty()){
          try{
             CatAdyacente = Math.abs(Double.parseDouble(Lado2));
          }
          catch(NumberFormatException e){
                 
          }    
        }
        if(CatAdyacente == 0 || CatOpuesto == 0){
            request.setAttribute("Rsultado"," NO INGRESASTE DATOS O SON INVALIDOS,  RECUERDA SOLO NUMEROS Y DIFERENTES A 0 ");
            request.getRequestDispatcher("CALCULO_DE_FIGURA.jsp").forward(request, response);
        }
        else{
           CALCULO_DE_FIGURA_MODEL CalculoFinal = new CALCULO_DE_FIGURA_MODEL(CatAdyacente,CatOpuesto);
           HttpSession Respuestas =  request.getSession();
           Respuestas.setAttribute("RespArea", CalculoFinal.Area());
           Respuestas.setAttribute("RespHipotenusa",CalculoFinal.Hipotenusa());
           Respuestas.setAttribute("RespAnguloA",CalculoFinal.Angulo_A());
           Respuestas.setAttribute("RespAnguloB",CalculoFinal.Angulo_B());
           response.sendRedirect("CALCULO_DE_FIGURA.jsp");
        }
  
        
    }

   
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
