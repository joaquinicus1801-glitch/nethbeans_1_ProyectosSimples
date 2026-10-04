
package PruebasModel.model.ProductoProyect;


public class ProductoModel  { //los atributos representan los atributos de una tabla?, donde la entidad sera producto supongo
 private int id, cantidad; //al ser private en el try catch de datos no lo puede leer por eso usamos los getter
 private String producto;
 private double precio, descuento, total;

    public ProductoModel(int id,String producto, int cantidad , double precio, double descuento, double total) {
        this.id = id;
        this.cantidad = cantidad;
        this.producto = producto;
        this.precio = precio;
        this.descuento = descuento;
        this.total = total;
    }

    public int getId() {
        return id;
    }

    public int getCantidad() {
        return cantidad;
    }

    public String getProducto() {
        return producto;
    }

    public double getPrecio() {
        return precio;
    }

    public double getDescuento() {
        return descuento;
    }

    public double getTotal() {
        return total;
    }
    
    
    
}
