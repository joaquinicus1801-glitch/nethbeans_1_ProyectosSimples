
package PruebasDeJavaAplicacion;


public class ClaseSinConstructor {
    
    String nombre;
    double edad;
    String presentacion;
      public static void main(String[] args) {
          ClaseSinConstructor obj1 = new ClaseSinConstructor(); 
          /*Si no se establece explicimente un constructor, java establece uno por defecto e inicializa los atributos 
          con valores predeterminados como puede verse
          */
          
          System.out.println("nombre: "+obj1.edad);
          System.out.println("edad: "+obj1.nombre);
          System.out.println("presentacion: "+obj1.presentacion);
          
          obj1.edad = 23;
            System.out.println("nombre: "+obj1.edad);
            System.out.println("objeto creado con la clase: "+obj1); //mostrar asi en la consola te muestra datos raros luego ver porque
      }
}
