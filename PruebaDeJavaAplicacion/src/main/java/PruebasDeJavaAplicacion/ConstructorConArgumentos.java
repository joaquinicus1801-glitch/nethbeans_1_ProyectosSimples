
package PruebasDeJavaAplicacion;

import static PruebasDeJavaAplicacion.MetodosYPropiedadesInstanciaYClase.mostrarInventario;
//se importa la clase para poder ejecutar el metodo sin llamar a la clase, 



public class ConstructorConArgumentos {
    String Name;
    Integer age;
    double height;
    Boolean hasSiblings;
    String DNI;
    static String especie = "humano";
    
    public ConstructorConArgumentos(String Nombre, int age, double altura, boolean tieneHermanos, String dni){ /*si quieres ingresar como 
        argumento algun valor para modificar el estatico es posible pero no es una buena practica
        */
        this.Name = Nombre;
        this.age = age;
        this.height = altura;
        this.hasSiblings = tieneHermanos;
        this.DNI = dni;
      
      }   
     /*Contructor copia*/
     public ConstructorConArgumentos(ConstructorConArgumentos otraPersona){ //eol parametro su tipo de dato es la clase y el nombre de este objeto
         this.Name = otraPersona.Name; //a la hora de crear el objeto copia, obvio debe llevar el nombre del parametro y la propiuedad, pues este argumento
         //adopta el valor total del objeto con todas sus propiedades, en este caso persona1 es el argumento , el parametro adopta esos valores
         //otraPersona = persona1
        this.age = otraPersona.age;
        this.height = otraPersona.height;
        this.hasSiblings = otraPersona.hasSiblings;
        this.DNI = otraPersona.DNI;
     }
    
            
            
    public static void main(String...args){
        
        ConstructorConArgumentos persona1 = new ConstructorConArgumentos("Joaquin",24,1.70,true,"7788996655");
        
        System.out.println("Mi nombre es: "+persona1.Name);
         System.out.println("Mi especie es: "+persona1.especie);
           ConstructorConArgumentos persona2 = new ConstructorConArgumentos(persona1);
          MetodosYPropiedadesInstanciaYClase.mostrarInventario();
          mostrarInventario();
        
        System.out.println("Mi especie es: "+ConstructorConArgumentos.especie); //puedo llamar a la propiedad tipo estatico directamente
    }
}
