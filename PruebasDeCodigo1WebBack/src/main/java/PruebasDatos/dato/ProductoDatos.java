package PruebasDatos.dato;

import PruebasInterface.ProductoInterface;
import PruebasModel.model.ProductoProyect.ProductoModel;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.*;
import java.util.List;

/*
6. despues de crear la interface y varios metodos ahora estamos aqui para implementarlo
 */
public class ProductoDatos implements ProductoInterface {

    /*
    3
    Conectaremos a la base de datos, es necesario para tener la tabla,
    debemos traer el driver sql para conectar a la base de datos
    eso se hace en el POM.XML, ahi  hacemos las coneccion a la base de datos
    
     */

 /*Cadena de coneccio*/
    private static final String URL = "jdbc:sqlserver://LAPTOP-FTJE5DUT\\SQL1:1433;" //el puerto 1433 es por donde sale sql
            + "databaseName=ProductoBD;"
            + "encrypt=true;"
            + "trustServerCertificate=true;";
    private static final String USER = "JaraBD_1";
    private static final String PASSWORD = "Coriris*.1213.*";

    /*Con lo de arriba estamos aperturando sql 
    
    con lo de abajo validaremos la coneccion con un metodo
    BUSCAR EXPLICACION DE LA SINTAXIS PARA ENTENDERLO MEJOR
    como tal entiendo que intenta conectarese a la base ded datos y si ocurre ese error entonces mostrara ese mensaje
     */
    private Connection conectar() throws SQLException {
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        } catch (ClassNotFoundException e) {
            throw new SQLException("Error: Driver de sql server ausente", e);
        }
        return (Connection) DriverManager.getConnection(URL, USER, PASSWORD);
    }
    // los metodos ya no se hacen en el model sino en la capa datos?
    //el model nada ,as va a tener los atributos
    //ir a interface porque...

    /*
    7 METODOS  implementados todo con override
    
     */
    @Override
    public List<ProductoModel> mostrarData() {
        List<ProductoModel> listaData = new ArrayList<ProductoModel>();
        /*
        8. listaData da la lista pero de donde viene la lista, viene del sql
        aun esta vacio pero debemos crear instancias de sql que representa cada objeto
         */
        String sql = "SELECT id,producto,cantidad,precio,descuento,total FROM Producto;"; //traigo la consula de select qui
        /*
        Con lo siguiente verificaremos que los datos que llegan son correctos si es bueno ejecutara el try si da error hara los
        del catch
         */

 /*
         9. EL TRY -> creamos una variable tipo coneccion sql llamada con que llama al metodo
           conectar que creamos, verifica si da error o no SI SE MANTEINE BIEN
        
          PROCEDE A PREPARAR EL AMBIENTE  mantiene la consistencia de los datos que vienen de sql
           prepareStatment... si la consistencia esta bien aplicara
           ResultSet... almacena temporalemnte la data , ejecutara la consulta dey luego ya lo baja a la lista
        
         */
        try (Connection con = conectar(); PreparedStatement ps = con.prepareStatement(sql); //ese sql es la variable con el string que vez arriba
                 ResultSet rs = ps.executeQuery(); //ejecuta la consulta contenida en esa variable sql
                ) {
            /*
            10. ahora insertaremos en la lista los datos del resulset a la lisra listaData 
            
            como ves el data add agrega un objeto tipo producto model new, es como hacer tipo obj = new tipo(parametros)
            pero de forma directa?
            
            debo recorrer la list provicional, mientras rx.next sea verdadero empezara agregando los datos en cada iteracion
             */
            while (rs.next()) {
                listaData.add(new ProductoModel(
                        rs.getInt("id"),
                        rs.getString("producto"),
                        rs.getInt("cantidad"),
                        rs.getDouble("precio"),
                        rs.getDouble("descuento"),
                        rs.getDouble("total")));
            }
        } catch (Exception e) { //parece que e es algun tipo de varaible u objeto que almacena algo
            e.printStackTrace(); //con esto muestra el error y me sañala linea por linea?

            /*11. VOLVEMOS AL CONTROLLER PARA VER LO QUE HICIMOS AQUI*/
        }
        return listaData;
    }

    @Override
    public void agregarProducto(ProductoModel prod) {
        /*haremos la consulta sql directamente desde aqui, agregaremos datos correspondientes ?*/
        String sqlInserValores = "INSERT INTO Producto(producto,cantidad,precio,descuento,total) VALUES(?,?,?,?,?);";
        try (Connection con = conectar(); PreparedStatement ps = con.prepareStatement(sqlInserValores)) {    //aqui el strign tiene la consulta, preparamos  
            ps.setString(1, prod.getProducto());
            ps.setInt(2, prod.getCantidad());
            ps.setDouble(3, prod.getPrecio());
            ps.setDouble(4, prod.getDescuento());
            ps.setDouble(5, prod.getTotal());
            ps.executeUpdate();

        } catch (Exception e) { //parece que e es algun tipo de varaible u objeto que almacena algo
            e.printStackTrace(); //con esto muestra el error y me sañala linea por linea?

            /*11. VOLVEMOS AL CONTROLLER PARA VER LO QUE HICIMOS AQUI*/
        }
    }

    @Override
    public void editarProducto(ProductoModel prod) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public int eliminarProducto(int id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
