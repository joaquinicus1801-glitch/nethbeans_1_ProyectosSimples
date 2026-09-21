
package PruebasDeJavaAplicacion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class joinYsplit {

    public static void main(String[] args) {
      String frase = " Tengo mucho frio mi kion uwu ";
      /*String sa = " add amin ";
      String[] e = new String[]{"a","d","g"};
      System.out.println("asi "+String.join("", e));*/
    // List<String>ListaPosiciones = new ArrayList<String>(List.of(String.join("",frase.toLowerCase().trim().split(""))));
    //  System.out.println("es: "+Arrays.toString(String.join("",frase.toLowerCase().trim().split(" ")).split("")));
      List<String>ListaPosiciones = new ArrayList<String>(List.of(String.join("",frase.toLowerCase().trim().split(" ")).split("")));
     System.out.println("asd "+ListaPosiciones);
     List <Integer> o = new ArrayList<Integer>(List.of(2,3,4,5));
     System.out.println("lista: "+String.join(",",o.stream().map(n -> String.valueOf(n)).collect(Collectors.toList())));
     
    }
    
}
