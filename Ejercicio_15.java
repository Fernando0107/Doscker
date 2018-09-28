package com.jetbrains;

import java.util.Scanner;

public class Ejercicio_15 {

    public static void main(String[] args) {

        int num;
        int prom=0;
        int cont=0;
        do{
            Scanner input=new Scanner(System.in);
            System.out.println("Ingrese un numero:");
            num=input.nextInt();
            prom+=num;
            cont++;
        }
        while(num!=0);

        System.out.println("El promedio de los numeros ingresados es: "+prom/(cont-1));

    }
}
