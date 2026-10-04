
package PruebasInterface;

import PruebasModel.model.ProductoProyect.ProductoModel;
import java.util.*;
/*
4
En la interfaz creamos metodos no implementados

*/

public interface ProductoInterface {
    //mostrar
      public List<ProductoModel> mostrarData(); //este es le metodo
    
    //agregar 
      public void agregarProducto(ProductoModel prod); // es void porque solo queremos agregar un producto no mostrar una alerta ni nada simplemente hace eso
      // como parametro toma un objeto, es decir accedes a todos su atributos
    //editar
      public void editarProducto(ProductoModel prod); //editas la tabla es void porque la enviar la tabla a la werb ya se ve 
      //y no necesitas algun dato resultante o return
    
    //eliminar
     public int eliminarProducto(int id); //puedes eliminar un obejto mediante su id , es irrepetible por eso es gestionable asi 
      
}
/*
5. ahora implementaremos esta interface en el javaclass de datos

*/