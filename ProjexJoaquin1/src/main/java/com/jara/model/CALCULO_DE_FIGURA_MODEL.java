
package com.jara.model;

public class CALCULO_DE_FIGURA_MODEL {
    double CatAdyacente;
    double CatOpuesto;
     
    public CALCULO_DE_FIGURA_MODEL(double catetoA,double catetoO){
    
        this.CatAdyacente = catetoA;
        this.CatOpuesto = catetoO;
    
    }
    public double Hipotenusa(){
        double hipotenusa;
        hipotenusa = Math.sqrt(Math.pow(CatAdyacente,2)+Math.pow(CatOpuesto, 2));
      return hipotenusa;  
    }
    public double Area(){
        double area;
        area = CatOpuesto * CatAdyacente / 2;
      return area;
    }
    public double Angulo_A(){ 
        double angulo_a;
        angulo_a = Math.round(Math.toDegrees(Math.atan(CatOpuesto/CatAdyacente)*100));
      return angulo_a / 100;
    }
    public double Angulo_B(){
        double angulo_b;
        angulo_b = Math.round((90 - Angulo_A())*100);
        return angulo_b  / 100;
    }
    
    
}

