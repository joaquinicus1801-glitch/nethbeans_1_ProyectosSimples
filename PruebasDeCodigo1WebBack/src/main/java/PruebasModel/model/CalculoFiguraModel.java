
package PruebasModel.model;

public class CalculoFiguraModel {
       
     double CatetoOp;
     double CatetoAd;
     
     public CalculoFiguraModel(double CatOP, double CatAd){
         this.CatetoOp = CatOP;
         this.CatetoAd = CatAd;
     }
     
     
     public double hipotenusa(){
             double Hipotenusa = 0;
             Hipotenusa = Math.sqrt((Math.pow(CatetoOp,2)+Math.pow(CatetoAd,2)));
         return Hipotenusa;
     }
     public double area(){
            double area = 0;
            area = (CatetoOp*CatetoAd)/2;
         return area;
     }
     public double anguloA(){
         double anguloA = Math.round(Math.toDegrees(Math.atan(CatetoOp / CatetoAd)));
       return anguloA;   
     }
     public double AnguloB(){
           double anguloB = 90 - anguloA();
         return anguloB;
     }
     
     
     
    
    
    
}
