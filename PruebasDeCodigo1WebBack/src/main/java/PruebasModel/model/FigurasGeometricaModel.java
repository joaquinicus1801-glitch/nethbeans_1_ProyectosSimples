
package PruebasModel.model;
import java.util.ArrayList; //libreria de colecciones tipo arreglos


public class FigurasGeometricaModel {
    ArrayList<Double> Lados = new ArrayList<Double>();
    double base, apotema, altura, radio;
    String figura;

   public FigurasGeometricaModel(ArrayList<Double> lados, double base, double apotema, double altura, double radio, String figura){
       this.Lados = lados;
       this.base = base;
       this.apotema= apotema;
       this.altura = altura;
       this.radio = radio;
       this.figura = figura;
   }
   public double Perimetro(){
     double perimetro = 0;
      System.out.println("se ejecuto la funcion con el perimetro 0");
    switch(figura){
        case "1": //triangulo
             System.out.println("entro al calculo de triangulo");
             //Lados.stream().filter(n -> n == 0).count() != 0
           if (!Lados.contains(0)) { //ESTUDIAR EL USO DE STREAMS, es mejor usar count que size al usar filter?
              System.out.println("cumple la condicion, continua");
             switch(Lados.size()){
               case 3:
                       System.out.println("el arreglo mide 3");
                 if(Lados.get(0)+Lados.get(1)>Lados.get(2) && Lados.get(1)+Lados.get(2)>Lados.get(0) && Lados.get(0)+Lados.get(2)>Lados.get(1)){
                      System.out.println("cumple el criterio de lados");
                     for(int indi = 0; indi < Lados.size(); indi++){
                          System.out.println("primera iteracion");
                         perimetro = perimetro + Lados.get(indi);
                          System.out.println("suma de perimetro "+perimetro);
                     }
                 }
               break;
               default:
                       System.out.println("Datos incompletos para los lados en triangulos, se mantiene le perimetro en 0");
               break;
           }
          }
           else{
                System.out.println("Ni cumple la condicion inicial, se mantiene le perimetro en 0");
           }
            break;
        case "2":
            
            break;
        case "3":
            break;
        case "4":
            break;
        case "5":
            break;
        default:
            break;
      
     }
      
    return perimetro;
    }

    
    public double Area(){
     switch(figura){
        case "1":
            break;
        case "2":
            break;
        case "3":
            break;
        case "4":
            break;
        case "5":
            break;
        default:
            break;
    }     
    return 0.0;
    }
    
   
   
}


