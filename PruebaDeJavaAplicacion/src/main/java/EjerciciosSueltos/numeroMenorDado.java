package EjerciciosSueltos;

import java.util.*;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.stream.Collectors;

public class numeroMenorDado {

    public static void main(String[] args) {
        //indicar cual es el numero es menor de los  dados

        Scanner escanerUWU = new Scanner(System.in);
        System.out.println("Ingresa la cantida de numeros que ingresaras");
        int totalnum = 0;
        int j = 1;
        int nummenor = 0;
        int num = 0;
        try {
            totalnum = Math.abs(escanerUWU.nextInt());
        } catch (InputMismatchException e) {
            System.out.println("Error, ingresa un numero porfas");
            return;
        }
        if (totalnum == 0) {
            System.out.println("bien, cerramos");
            return;
        }
        while (j <= totalnum) {
            System.out.println("ingresa un numero");

            try {
                num = Math.abs(escanerUWU.nextInt());
            } catch (InputMismatchException e) {
                System.out.println("Error, ingresa un numero porfas, pero si quieres abortar el escribe 1, si deseas continuar coloca otra cosa");
                escanerUWU.nextLine();
                boolean resp = escanerUWU.next().equals("1");
                if (resp) {
                    j = 8000;
                }
            }
            switch (j) {
                case 1:
                    nummenor = num;
                    break;
                default:
                    if (num < nummenor) {
                        nummenor = num;
                    }
                    break;
            }
            System.out.println("el valor de j es: " + j);
            j++;
        }
        System.out.println("El numero menor es " + nummenor);

        System.out.println("Version 2");

        System.out.println("ingresa los numeros a comparar");
        boolean resp2 = true;
        Set<Double> numeros = new HashSet<Double>();
        do {
            try {
                numeros.add(escanerUWU.nextDouble());
            } catch (InputMismatchException e) {
                System.out.println("Error, ingresa un numero porfas, pero si quieres abortar el escribe 1, si deseas continuar coloca otra cosa");
                escanerUWU.nextLine();
                resp2 = escanerUWU.next().equals("0");
            }
        } while(resp2);
        //set no existe el get no tiene posiciones, mejor conierte el set en list
       Double nummenor2 = numeros.stream().sorted().collect(Collectors.toList()).get(0);
       System.out.println("El numero menor es: "+nummenor2);
    }

}
