package com.jetbrains;

public class Ejercicio_18 {

    public static void main(String[] args) {

        double x = 85.3;
        double  m=80.0;
        int s=4;
        double res;
        double desv;

        res=(x-m);
        desv=res/s;
        String numberAsString = String.format ("%.2f", desv);

        System.out.println("Desviación estándar: "+numberAsString);




    }
}
