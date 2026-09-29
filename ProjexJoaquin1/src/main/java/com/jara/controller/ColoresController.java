
package com.jara.controller;

import com.jara.model.ColoresModel;
import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;


@WebServlet(name = "ColoresController", urlPatterns = {"/ColoresController"})
public class ColoresController extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet ColoresController</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet ColoresController at " + request.getContextPath() + "</h1>");
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
        processRequest(request, response);
        String Color1 = request.getParameter("ColorP1"); 
        String Color2 = request.getParameter("ColorP2"); 
        ColoresModel Color = new ColoresModel(Color1,Color2);
        HttpSession sesionColor = request.getSession();
             /*
        String[] lados2 = new String[lados.split(",").length];
        lados2 = lados.split(",");
        double[] ladosnum = new double[lados2.length];
        for(int indi = 0; indi < lados2.length; indi++){
           ladosnum[indi] = Double.parseDouble(lados2[indi]);
        }
         */
         //request.setAttribute("ResPerimetro", Perimetro);
        //request.setAttribute("ResArea", Area);
        //request.getRequestDispatcher("FIGURAS_GEOMETRICAS.jsp").forward(request, response);
       
        
    }
  
   
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
