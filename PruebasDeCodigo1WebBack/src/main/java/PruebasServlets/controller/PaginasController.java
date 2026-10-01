package PruebasServlets.controller;

import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(name = "PaginasController", urlPatterns = {"/PaginasController"})
public class PaginasController extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet PaginasController</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet PaginasController at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       // processRequest(request, response);
          String opcionPagina = request.getParameter("opcion");
        switch (opcionPagina) {
            case "1":
                response.sendRedirect("CALCULADORAVIEW2.jsp");
                break;
            case "2":
                response.sendRedirect("FigurasGeometricasView.jsp");

                break;
            case "3":
                response.sendRedirect("CalculoFiguraCOyCA.jsp");
                break;
            case "4":
                response.sendRedirect("index.html");
                break;
            case "5":
                response.sendRedirect("ClaseString.jsp");
                break;
            case "6":
                response.sendRedirect("ColeccionesView1.jsp");
                break;
            case "7":
                response.sendRedirect("ListaASCIIView.jsp");
                break;
              case "8":
                response.sendRedirect("ListaDeObjetosView.jsp");
                break;
              case "9":
                  response.sendRedirect("JuegoDeDadosView.jsp");
                  break;
                case "10":
                  response.sendRedirect("AbecedarioView.jsp");
                  break;
                    case "11":
                  response.sendRedirect("SueldoView.jsp");
                  break;
                   case "12":
                  response.sendRedirect("SistemaDeNotasAcademicas.jsp");
                  break;
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //processRequest(request, response);
     
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
