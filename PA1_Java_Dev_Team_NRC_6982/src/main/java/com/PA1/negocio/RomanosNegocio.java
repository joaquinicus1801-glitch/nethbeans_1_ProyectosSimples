package com.PA1.negocio;

import com.PA1.model.RomanosModel;

public class RomanosNegocio {

    public String decimalARomano(int numero) {
        RomanosModel obj = new RomanosModel("", numero);
        return obj.decimalARomano();
    }

    public int romanoADecimal(String romano) {
        RomanosModel obj = new RomanosModel(romano, 0);
        return obj.romanoADecimal();
    }
}