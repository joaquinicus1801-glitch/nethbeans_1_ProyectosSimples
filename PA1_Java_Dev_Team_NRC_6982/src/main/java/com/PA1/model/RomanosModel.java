package com.PA1.model;

public class RomanosModel {

    private String romano;
    private int numero;

    public RomanosModel(String romano, int numero) {
        this.romano = romano;
        this.numero = numero;
    }

    // DECIMAL → ROMANO
    public String decimalARomano() {
        int[] valores = {1000,900,500,400,100,90,50,40,10,9,5,4,1};
        String[] simbolos = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};

        String resultado = "";
        int num = numero;

        for (int i = 0; i < valores.length; i++) {
            while (num >= valores[i]) {
                resultado += simbolos[i];
                num -= valores[i];
            }
        }
        return resultado;
    }

    // ROMANO → DECIMAL
    public int romanoADecimal() {
        int resultado = 0;

        for (int i = 0; i < romano.length(); i++) {
            int actual = valor(romano.charAt(i));

            if (i + 1 < romano.length()) {
                int siguiente = valor(romano.charAt(i + 1));

                if (actual < siguiente) {
                    resultado -= actual;
                } else {
                    resultado += actual;
                }
            } else {
                resultado += actual;
            }
        }
        return resultado;
    }

    private int valor(char c) {
        switch (c) {
            case 'I': return 1;
            case 'V': return 5;
            case 'X': return 10;
            case 'L': return 50;
            case 'C': return 100;
            case 'D': return 500;
            case 'M': return 1000;
        }
        return 0;
    }
}

