package PruebasServlets.controller;

import PruebasModel.model.AbecedarioModel;
import PruebasModel.model.TablaASCIIModel;
import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import java.util.stream.Collectors;

@WebServlet(name = "AbecedarioController", urlPatterns = {"/AbecedarioController"})
public class AbecedarioController extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet AbecedarioController</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet AbecedarioController at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //  processRequest(request, response);
        HttpSession sesion1 = request.getSession(); //creo variables de sesion, usare el metodo para consultar informccion
        //para evitar que salgan los corechetes en la coleccion lo mejor es volverlo un texto directamente usando el join
        //sString ListaNueva = String.join(",", AbecedarioModel.Abecedario.stream().map(n -> String.valueOf(n)).collect(Collectors.toList()));
        sesion1.setAttribute("Abecedario", AbecedarioModel.Abecedario);
        response.sendRedirect("AbecedarioView.jsp");

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //  processRequest(request, response);
        String frase = request.getParameter("cajaFrase");
        String opcion = request.getParameter("op");
        if (frase != null && !frase.trim().isEmpty()) {
            AbecedarioModel fraseobj = new AbecedarioModel(frase);
            HttpSession sesion1 = request.getSession();
            switch (opcion) {
                case "1":
                    sesion1.setAttribute("posiciones", fraseobj.posicionAbecedario());
                    break;
                case "2":
                     sesion1.setAttribute("invertido", fraseobj.CaracterDecendente());
                    break;
            }
           
            response.sendRedirect("AbecedarioView.jsp");
        } else {
            
        }
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
