package com.jetbrains;
import java.util.Scanner;

public class Ejercicio_17 {

    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        double x;
        double y;

        System.out.println("Porfavor, ingrese el precio de las pelotas de Foot ball:");
        x= input.nextDouble();
        System.out.println("Porfavor, ingrese el precio de las pelotas de Base ball:");
        y= input.nextDouble();

        String soccer = String.format ("%.2f", x*0.75);
        String base = String.format ("%.2f", y*0.75);

        System.out.println("\n El precio de la pelota de Foot ball es de: Q."+x +"\n"+"Su precio con descuento es: Q."+soccer+"\n\n");
        System.out.println("El precio de la pelota de Base ball es de: Q."+y +"\n"+"Su precio con descuento es: Q."+base);

    }
}
