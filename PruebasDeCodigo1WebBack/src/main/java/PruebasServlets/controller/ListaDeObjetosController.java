package PruebasServlets.controller;

import PruebasModel.model.ListaDeObjetoModel;
import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import java.util.*;

@WebServlet(name = "ListaDeObjetosController", urlPatterns = {"/ListaDeObjetosController"})
public class ListaDeObjetosController extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet ListaDeObjetosController</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet ListaDeObjetosController at " + request.getContextPath() + "</h1>");
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
        HttpSession sesion11 = request.getSession();
        String accion = request.getParameter("accion");
        String dni = request.getParameter("dni");
        if (accion == null || accion.trim().isEmpty()) {
            String nombre = request.getParameter("nombre");
            System.out.println("Se registro el nombre: " + nombre);
            String DNI = request.getParameter("documento");
            System.out.println("Se registro el documento: " + DNI);
            String opcion = request.getParameter("selOpcion");
            System.out.println("Se registro la opcion: " + DNI);
            Double precio = Double.parseDouble(request.getParameter("Precio"));
            System.out.println("Se registro la precio: " + precio);
            //creo variables de sesion, usare el metodo para consultar informccion
            /*sesion1.setAttribute("ListaGenerada", TablaASCIIModel.MostrarListaAleatoria());
              response.sendRedirect("ListaASCIIView.jsp");*/
            //Enviamos los datos al model
            ListaDeObjetoModel objmodel0 = new ListaDeObjetoModel(nombre, DNI, opcion, precio);
            ListaDeObjetoModel objmodel1 = new ListaDeObjetoModel("sukuna", "95874323", "java", precio);
            ListaDeObjetoModel objmodel2 = new ListaDeObjetoModel("minato", "5687166436", "sql", precio);
            ListaDeObjetoModel objmodel3 = new ListaDeObjetoModel("momo", "78952251", "sap", precio);
            ListaDeObjetoModel objmodel4 = new ListaDeObjetoModel("histoshi", "8745", "power bi", precio);

            //Creacion de lista de objetos:
            List<ListaDeObjetoModel> Lista = new ArrayList<ListaDeObjetoModel>();
            Lista.add(objmodel0);
            Lista.add(objmodel1);
            Lista.add(objmodel2);
            Lista.add(objmodel3);
            Lista.add(objmodel4);
            sesion11.setAttribute("listaObj", Lista); //al guardar lo gurada tal como es una lista de tipo esa clase, 
            //al mostrar en el jsp lo vuelve texto pero aqui no
            response.sendRedirect("ListaDeObjetosView.jsp");
        }
        else{
            List <ListaDeObjetoModel> modificado = (ArrayList)sesion11.getAttribute("listaObj");
            System.out.println("la lista es: "+modificado);
            if(modificado != null){
                System.out.println("no es null la lista por lo que ingresa ");
                switch(accion){
                    case "Eliminar": 
                         System.out.println("la opcion fue eliminar");
                        for(int indi = 0; indi < modificado.size(); indi++){
                            System.out.println("ingresa al bucle");
                            if(modificado.get(indi).getDni().equals(dni)){ //cunado vemos la posicion, al ser un obejto ahora si podemos comparar
                                //las propiedades por lo que se compara su propieda dni si es igual que el parametro ingresado
                                 System.out.println("contiene el dni: "+dni);
                                modificado.remove(indi);
                                System.out.println("se remueve la posicion que contiene el dni xd");
                                System.out.println("La lista ahora es: "+modificado);
                                sesion11.setAttribute("listaObj", modificado);
                            }
                        }
                         
                         /*
                             System.out.println("contiene el dni: "+dni);
                            int posicion = modificado.indexOf(dni); 
                             System.out.println("la poscision en el arreglo del dni es: "+posicion);
                            modificado.remove(posicion);
                             System.out.println("se remueve la posicion que contiene el dni xd");
                              System.out.println("La lista ahora es: "+modificado);
                             return;
                        }
                         System.out.println("huevadas ");*/
                        response.sendRedirect("ListaDeObjetosView.jsp");
                    break;
                    case "Editar": 
                          for(int indi = 0; indi < modificado.size(); indi++){
                            System.out.println("ingresa al bucle");
                            if(modificado.get(indi).getDni().equals(dni)){
                                 ListaDeObjetoModel obj = modificado.get(indi);
                                  sesion11.setAttribute("reinsercion",obj);
                            }
                        }
                         response.sendRedirect("ListaDeObjetosView.jsp");
                    break;
                      
                }
            }
        }

    }

    @Override
    public String getServletInfo() {

        return "Short description";
    }// </editor-fold>

}
