
package PruebasServlets.controller;

import PruebasModel.model.Repuestos.ClienteModel;
import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import java.util.concurrent.ThreadLocalRandom;


@WebServlet(name = "RepuestosController", urlPatterns = {"/RepuestosController"})
public class RepuestosController extends HttpServlet {


    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet RepuestosController</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet RepuestosController at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

   
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       // processRequest(request, response);
    }

  
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //processRequest(request, response);
        HttpSession LaSesion = request.getSession();
        LaSesion.setAttribute("RegistroPedido",2);
         
        String DNI = request.getParameter("idCLiente");
        String nombre = request.getParameter("nombreCliente");
         Integer edad = Integer.parseInt(request.getParameter("edadCliente"));
        String repuesto = request.getParameter("repuesto");
        String direccion = request.getParameter("direccion");
        Integer cantidad= Integer.parseInt(request.getParameter("cantidad"));
        
        //creando cliente:
        int numeroAleatorio = ThreadLocalRandom.current().nextInt(1, 521);
        //debe fijarse si es que el id es repetido;
        
        ClienteModel Cliente = new ClienteModel(numeroAleatorio, nombre, direccion, edad, "99999999999") ;
        
        //ejn caso sea asi ejecute el metodo setter para alterar el valor del id con un numero nuevo, posible while hasta encontrar la solucion
        
        response.sendRedirect("SistemaDeFacturacion_Repuestos.jsp");
        
        
        
    }

    @Override
    protected void doDelete(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException{
        
    }
    
    
  
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
