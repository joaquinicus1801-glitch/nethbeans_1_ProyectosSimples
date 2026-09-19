package PruebasServlets.controller;

import PruebasModel.model.TablaASCIIModel;
import PruebasModel.model.juegoDeDadosModel;
import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import java.util.concurrent.ThreadLocalRandom;

@WebServlet(name = "juegoDeDadosController", urlPatterns = {"/juegoDeDadosController"})
public class juegoDeDadosController extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet juegoDeDadosController</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet juegoDeDadosController at " + request.getContextPath() + "</h1>");
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
        //processRequest(request, response);
        String jugador = request.getParameter("jugador");
        int[] dados = new int[2];
        int tiros =0;
        int dado1 = ThreadLocalRandom.current().nextInt(1, 7);
        int dado2 = ThreadLocalRandom.current().nextInt(1, 7);
        System.out.println("Se crean variables, ademas se recibe el parametro: "+jugador);
        HttpSession sesionDados = request.getSession(); //creo variables de sesion, usare el metodo para consultar informccion
        if (jugador != null || !jugador.trim().isEmpty()){
             System.out.println("El parametro no es null ni esta vacio");
             
            switch (jugador) {
                case "tu":
                  
                    tiros = 1;
                     System.out.println("Se crea numeros aleatorios entre 1 y 6");
                      System.out.println("Se esta creando el objeto");
                    juegoDeDadosModel Jugador = new juegoDeDadosModel(dado1,dado2,tiros);
                     System.out.println("Se creo el objeto");
                     sesionDados.setAttribute("dadosJugador", Jugador.resultados());
                      System.out.println("Llamamos a la funcion resultado");
                     sesionDados.setAttribute("sumaJugador", Jugador.sumaResult());
                      System.out.println("Hacemos la suma de resultados");
                    
                    break;
                case "bot":
                     tiros = 1;
                      juegoDeDadosModel Bot = new juegoDeDadosModel(dado1,dado2,tiros);
                      sesionDados.setAttribute("dadosBot", Bot.resultados());
                      sesionDados.setAttribute("sumaBot", Bot.sumaResult());
                    break;
                default:
                    request.setAttribute("sAviso", "Datos no validos ingresados");
                    request.getRequestDispatcher("JuefoDeDadosView.jsp").forward(request, response);
                    break;
            }
        }
        else{
              request.setAttribute("sAviso", "Datos no validos ingresados");
                    request.getRequestDispatcher("JuefoDeDadosView.jsp").forward(request, response);
               return;
        }
       
        response.sendRedirect("JuegoDeDadosView.jsp");

        /* sesionDados.setAttribute("dadosJugador", obj.MostrarListaAleatoria());
        /*sesion1.setAttribute("ListaGenerada", TablaASCIIModel.MostrarListaAleatoria());
       response.sendRedirect("ListaASCIIView.jsp");*/
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
