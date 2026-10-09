
package PruebasDatos.dato;

import PruebasInterface.RepuestoInterface;
import PruebasModel.model.Repuestos.ClienteModel;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class RepuestoDatos implements RepuestoInterface {
        private static final String URL = "jdbc:sqlserver://LAPTOP-FTJE5DUT\\SQL1:1433;" //el puerto 1433 es por donde sale sql
            + "databaseName=ProductoBD;"
            + "encrypt=true;"
            + "trustServerCertificate=true;";
    private static final String USER = "JaraBD_1";
    private static final String PASSWORD = "Coriris*.1213.*";
    
    
       private Connection conectar() throws SQLException {
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        } catch (ClassNotFoundException e) {
            throw new SQLException("Error: Driver de sql server ausente", e);
        }
        return (Connection) DriverManager.getConnection(URL, USER, PASSWORD);
    }

    @Override
    public void agregarCliente(ClienteModel cliente) {
        String sqlInserValores = "INSERT INTO Cliente(codCliente, nombreCliente,direccionCliente,edadCliente,telefonoCliente) VALUES(?,?,?,?,?);";
          try (Connection con = conectar(); PreparedStatement ps = con.prepareStatement(sqlInserValores)) {    //aqui el strign tiene la consulta, preparamos  
            ps.setInt(1, cliente.getCodigo());
            ps.setString(2, cliente.getNombre());
            ps.setString(3, cliente.getDireccion());
            ps.setInt(4, cliente.getEdad());
            ps.setString(5, cliente.getTelefono());
            ps.executeUpdate();

        } catch (Exception e) { //parece que e es algun tipo de varaible u objeto que almacena algo
            e.printStackTrace();
    }
          
    }

}
