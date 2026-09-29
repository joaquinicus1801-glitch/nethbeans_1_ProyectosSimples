package com.jara.repasocontroller;

import com.jara.repasoModel.ListaObjetosModel;
import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.*;

@WebServlet(name = "ListaObjetosController", urlPatterns = {"/ListaObjetosController"})
public class ListaObjetosController extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet ListaObjetosController</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet ListaObjetosController at " + request.getContextPath() + "</h1>");
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
        int Documento = Integer.parseInt(request.getParameter("documento"));
        String Nombre = request.getParameter("nombre");
        String Opcion = request.getParameter("selOpcion");
        double Precio = Double.parseDouble(request.getParameter("Precio"));
        ListaObjetosModel Instancia = new ListaObjetosModel(Documento, Nombre, Opcion, Precio);
        ListaObjetosModel Instancia1 = new ListaObjetosModel(9999999, "Samanta", "1", 80.55); //si son datos directos no es necesario definir
        ListaObjetosModel Instancia2 = new ListaObjetosModel(7777777, "Michael", "2", 58.3);
        ListaObjetosModel Instancia3 = new ListaObjetosModel(6666666, "9999999Patricia", "1", 120.8);
        ListaObjetosModel Instancia4 = new ListaObjetosModel(55555555, "Johana", "4", 204.9);
        HttpSession Registro = request.getSession();
        //java para poder mostra un objeto necesita volverlo texto
        //cuando imprime un objeto ejecuta el .toString automaticamnet, ya que el print llama automaticamente al metodo to String del objeto este es un metodo especial
        //esto oucrre con el pruintin y cuando el jsp necestia mostrar el objeto
        //como vamos a alamcenar una lista de objetos, necesitamos crear una coleccion para los objetos ps xddd
        List<ListaObjetosModel> Data = new ArrayList<ListaObjetosModel>(); //porque ponemos la clase del objeto?
        //recuerda que entre los <> va el tipo de dato ya sea string, int,  double, sin embargo al almacenar un objeto
        //ponemos eso porque debe alamacenar los tipos de dato de los atributos de dicha clase
        
        /*
        Dependecias para :
        
        
        */
        
        
        
        //insertamos los objetos en la lista
        Data.add(Instancia);
        Data.add(Instancia1);
        Data.add(Instancia2);
        Data.add(Instancia3);
        Data.add(Instancia4);
     
        Registro.setAttribute("sColeccion",Data); //alamacenamos la coleccion data
        response.sendRedirect("ListaObjetosView.jsp");
        
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
