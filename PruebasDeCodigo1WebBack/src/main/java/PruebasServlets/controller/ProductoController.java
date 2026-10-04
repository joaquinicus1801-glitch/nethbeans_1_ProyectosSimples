
package PruebasServlets.controller;

import PruebasDatos.dato.ProductoDatos;
import PruebasModel.model.ProductoProyect.ProductoModel;
import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet(name = "ProductoController", urlPatterns = {"/ProductoController"})
public class ProductoController extends HttpServlet {


    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet ProductoController</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet ProductoController at " + request.getContextPath() + "</h1>");
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
        
        //1. creacion de variable de sesion, esto se debe a que
        HttpSession LaSesion = request.getSession();
        //2.Recibiremos los parametros de la web, en este caso dependiendo a la accion del boton ejecutaremos acciones distintas
        // la primera opcion es mostrar y para mostrar en este caso debemos ir a la base de datos para acceder y mostrar
        //por lo que en la primera opcion vamos ProductoDatos
        String opcion = request.getParameter("opcion"); 
        
        //.13 CREAMOS EL OBJETO de la capa datos PARA CONECTARNOS A LA CAPA DATOS
           ProductoDatos objDatos = new ProductoDatos(); //creamos el objeto datos sin parametros porque no hay parametros ni constructor
           
        switch(opcion){
            case "mostrar":
                        //12. RECIBIMOS LOS RESULTADOS DEL METODO CONECTANDONOS A DATOS
                       // alamcenara la lista y la guardara en la sesion 
                        LaSesion.setAttribute("Producto",objDatos.mostrarData());
                        
            break;
            
            case "agregar":
                  //+15 Ahora del jsp se envian los parametros para agregar en la base de datos
                  int id = 0;
                  String Producto = request.getParameter("selProducto");
                  int Cantidad =Integer.parseInt(request.getParameter("Cantidad"));
                  double Precio = Double.parseDouble(request.getParameter("Precio"));
                  double Descuento = Double.parseDouble(request.getParameter("Descuento"));
                  double total = Precio *Cantidad;
                  ProductoModel objModel = new ProductoModel(id,Producto,Cantidad,Precio,Descuento,total);
                  objDatos.agregarProducto(objModel); //como creamos el objeto que tiene el metodo por eso debemos usar ese objeto de datos y enviar
                  //el parametro el objeto que se usara para ingresar datos en la lista
                  LaSesion.setAttribute("Producto",objDatos.mostrarData());
                
            break;
            
            case "Editar":
            break;
            
            case "Eliminar":
            break;
            
            
        }
        response.sendRedirect("ProductoViewS15.jsp");
        
    }

  
    @Override
    public String getServletInfo() {
        return "Short description";
    }

}
