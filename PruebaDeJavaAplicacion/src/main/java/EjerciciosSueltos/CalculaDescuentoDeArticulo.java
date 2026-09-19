
package EjerciciosSueltos;

import java.util.Scanner;


public class CalculaDescuentoDeArticulo {
       public static void main(String[] args) {
                // Un articulo determinado sigue una politica de descuentos:
	//-15% si se compran mas de 1000 unidades
	//-10% si se compran entre 500 y 999 unidades	
	//-5% si se compran ente 200 y 499
	//...Calcule el coste final de un pedido dado el coste del articulo y las unidades de compra
        System.out.println("Ingresa en numero de unidades de compra");
        Scanner registro = new Scanner(System.in);
        int numProductos = Math.abs(Integer.parseInt(registro.next()));
        System.out.println("Ingresa el precio del articulo");
        int numPrecio = Math.abs(Integer.parseInt(registro.next()));
         double costeFinal = numProductos*numPrecio;
        if(numProductos >= 1000){
            costeFinal = (numProductos*numPrecio)*0.85;
        }
        else{
            if(numProductos <= 999 && numProductos >= 500){
                costeFinal = (numProductos*numPrecio)*0.90;
                
            }
            else{
                if(numProductos <= 499 && numProductos >= 200){
                 costeFinal = (numProductos*numPrecio)*0.95;
                }
                else{
                  
                }
            }
        }
        System.out.println("El coste total del pedido es "+costeFinal);   
           
           
       }
}
