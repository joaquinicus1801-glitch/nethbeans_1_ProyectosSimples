
package com.jara.repasocontroller;

import com.jara.repasoModel.ColeccionesModel;
import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import java.util.*;


@WebServlet(name = "ColeccionesController", urlPatterns = {"/ColeccionesController"})
public class ColeccionesController extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet ColeccionesController</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet ColeccionesController at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //processRequest(request, response);
     //1.En get no se recibe parametros del jsp (correccion el get si puede recbirero el formulario no envia parametros en este caso)
     //2.tampoco enviaremos parametro al model por lo primero
     //3.Creo mi variable de session
     HttpSession sColecciones = request.getSession();
      //recibo las respiestas del model
      sColecciones.setAttribute("sColeccion",ColeccionesModel.mostrarColeccion());
        sColecciones.setAttribute("sLista",ColeccionesModel.mostrarLista());
         sColecciones.setAttribute("sSet",ColeccionesModel.mostrarSet());
         sColecciones.setAttribute("sMap",ColeccionesModel.mostrarMap());
      //envio respuesta a la web jsp
      response.sendRedirect("ColeccionesView.jsp");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String Texto = request.getParameter("inTexto");
         String Opcion = request.getParameter("btnOption");
         ColeccionesModel objModel = new ColeccionesModel(Texto,Opcion);
         HttpSession sColecciones = request.getSession();
      //recibo las respiestas del model
        sColecciones.setAttribute("sLista",ColeccionesModel.mostrarLista());
        sColecciones.setAttribute("sLista2",objModel.mostrarLista2()); //los metodos de instancia no pueden ser llamados por la clase
        //los objetos pueden accedr a los metodos  y atributos de instancia y de clase
        //la clase solo accede a los metodos ya tributos de clase
        sColecciones.setAttribute("sLista3",objModel.mostrarSerie());
       /* Queue<String> colecciondaasd = new LinkedList<String>();
        Set<Integer> kisdja = new HashSet<Integer>();
        Collection<Double> a = new HashSet<Double>();
        
        /*
        sColecciones.setAttribute("sColeccion",ColeccionesModel.mostrarColeccion());
        sColecciones.setAttribute("sLista",ColeccionesModel.mostrarLista());
         sColecciones.setAttribute("sSet",ColeccionesModel.mostrarSet());
         sColecciones.setAttribute("sMap",ColeccionesModel.mostrarMap());
         */
      //envio respuesta a la web jsp
      response.sendRedirect("ColeccionesView.jsp");
    }
    
 
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
