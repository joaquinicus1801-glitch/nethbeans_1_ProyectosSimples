package PruebasServlets.controller;

import PruebasModel.model.ColeccionesModel1;
import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet(name = "ColeccionesController1", urlPatterns = {"/ColeccionesController1"})
public class ColeccionesController1 extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet ColeccionesController1</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet ColeccionesController1 at " + request.getContextPath() + "</h1>");
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
      sColecciones.setAttribute("sColeccion",ColeccionesModel1.mostrarColeccion());
      sColecciones.setAttribute("sLista1",ColeccionesModel1.mostrarLista());
      sColecciones.setAttribute("sSet",ColeccionesModel1.mostrarSet());
      sColecciones.setAttribute("sMap",ColeccionesModel1.mostrarMap());
      //envio respuesta a la web jsp
      response.sendRedirect("ColeccionesView1.jsp");
      //usar el metrodo get no se envia parametros normalmente sirve para consultar
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       // processRequest(request, response);
       
       String Texto = request.getParameter("inTexto");
         String Opcion = request.getParameter("btnOption");
         System.out.println("el texto es: "+Texto+" la opcion es: "+Opcion);
         ColeccionesModel1 objModel = new ColeccionesModel1(Texto,Opcion);
         HttpSession sColecciones = request.getSession();
      //recibo las respiestas del model
        sColecciones.setAttribute("sLista",ColeccionesModel1.mostrarLista());
        sColecciones.setAttribute("sLista2",objModel.mostrarLista2()); //los metodos de instancia no pueden ser llamados por la clase
        //los objetos pueden accedr a los metodos  y atributos de instancia y de clase
        //la clase solo accede a los metodos ya tributos de clase
        sColecciones.setAttribute("sLista3",objModel.mostrarSerie());
        response.sendRedirect("ColeccionesView1.jsp");
    }
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
