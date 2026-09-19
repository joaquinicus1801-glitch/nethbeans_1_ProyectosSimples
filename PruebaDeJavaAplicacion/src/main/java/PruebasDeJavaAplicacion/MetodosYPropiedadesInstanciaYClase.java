
package PruebasDeJavaAplicacion;


public class MetodosYPropiedadesInstanciaYClase {
    String Name;
    double precio;
    String Id;
    static String proveedor = "humano"; //atirbutos de clase
    static String categoria = "producto";
    static int Inventario = 67;
    
    public MetodosYPropiedadesInstanciaYClase(String Name, double precio, String Id){
        this.Name = Name;
        this.precio = precio;
        this.Id = Id;
    }
    
    public static void main(String[] args) {
        mostrarInventario(); //puedo lamar a un metodo de clase si necesdad de que tenga la clase por delante siemtpe y cuando
        //pertenesca a la misma clase del cual estoy llamando o si importo la clase 
        MetodosYPropiedadesInstanciaYClase.mostrarInventario();
        
        MetodosYPropiedadesInstanciaYClase obj = new MetodosYPropiedadesInstanciaYClase("sublime",25,"56");
        
        Inventario += 1; //modificando la propiedad de clase Inventario = Inventario + 1 
        MetodosYPropiedadesInstanciaYClase.mostrarInventario();
        
        
    }
    
    public void DecirNombre(){
        System.out.println("El nombre del producto es: "+Name);
    }
    
    public static void DecirNombre2(){ //un metodo estatico no puede usar o refreenciar a una propiedad no estatica o de objeto
        //solo refereneciado por metodos no estaticos
        //System.out.println("nombre en clase es "+Name);
        System.out.println("nombre en clase es "+proveedor); //aca no da error porque el atributo tambien es de clase o estatico
    }
    
    public static void mostrarInventario(){
     System.out.println("Hay este cantida de productos "+Inventario);
}
    
}
