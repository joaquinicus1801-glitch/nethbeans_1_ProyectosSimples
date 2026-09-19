
package PruebasDeJavaAplicacion;


public class DatosPrimitivosY {
     public static void main(String[] args) {
         //Datos Primitivos y datos de clases
         
        //Datos Primitivos
        int enteroPrimitivo = 20;
        double decimalPrimitivo = 12.6;
        char caracter = 'a';
        short enteroPrimitivo2= 34;
        long enteroPrimiGrande = 41455533454133L; //si no pones la L al final lo detecta como un int de 32 bits, con L lo vuelves loong
        //para que tenga un numero mucho mas grande
        float decimalPrimitivo2 = 45.3f; //se pone un f al final? si porque identifica que es de 32 bits, sino lo ve 
        //como double de 64 bits
        boolean esVerdad = false;
        byte enteroPrimiPequeño = 12;
        
        //Datos objetos
        /*
        Las clases Integer, Boolean, etc son llamados clases envoltorio o Wrapper clases, 
        recuerda que los objetos son las variables que tiene la clase 
        Integer : clase
        Integer numero : objeto de la clase Integer
        al ser clases podemo usar 
        
        NULL:
        Una de las diferencias mas importantes
        los primitivos deben tener un valor, ejemplo
        int edad = 0; pero no puedes hace int edad = null; da error
        pero 
        Integer edad = null; si funciona
        es util porque puedes usar eso en caso no ingreses un dato, a diferencia de 0 que no puede
        evidenciar del todo que esa variable lleava ese valor por no ingrear datos o por decision
        */
        
        //Clase Byte y metodos
        Byte intObjPequeño = Byte.parseByte("12");
        
        //Clase Integer y sus metodos
        Integer enteroObj = Integer.parseInt("452");
        
        
        /*Clase String y metodos*/
        String cadena = enteroObj.toString().toUpperCase(); //este metodo de string solo sirve en otros objetos, no puedes transformar int a String directametne
        int tamañoCadena = cadena.length(); //metodo
        String SinEspacios = "hola     ".trim(); //ahora este es un "hola" sin espacios, trim() solo elimina los espacios laterales
        
        /*Clase Long y metodos*/
        Long enteroObjGrande = Long.parseLong("5425664848");
            
        //Clase Double y sus metodos
        
        
        //Clase booleam, transformacion de string a boolean solo los string pueden ser aplicados, cualquier valor diferente
        //a "true" sin importar mayusculas sera falso
        // 1. Funciona correctamente con "true" (en cualquier combinación de mayúsculas/minúsculas)
        boolean b1 = Boolean.parseBoolean("true");   // true
        boolean b2 = Boolean.parseBoolean("TRUE");   // true
        boolean b3 = Boolean.parseBoolean("tRuE");   // true

        // 2. Números o palabras como "1" y "0" dan false
        boolean b4 = Boolean.parseBoolean("1");      // false
        boolean b5 = Boolean.parseBoolean("0");      // false
        boolean b6 = Boolean.parseBoolean("hola");   // false

        // 3. ¿Cómo evaluar 1 y 0 si los tienes como números o texto?
        // Si tienes un número entero y quieres tratar 1 como true y 0 como false, 
        // debes hacerlo manualmente con una condición:
        int numero = 1;
        boolean esVerdadero = (numero == 1); // true
        
        // O si viene en un String "1":
        String textoNumero = "1";
        boolean esVerdaderoTexto = textoNumero.equals("1"); // true
     }
     
}
