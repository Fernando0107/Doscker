package com.jetbrains;
import java.util.Scanner;

public class Ejercicio_20 {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int x;
        int y;
        System.out.println("Ingrese el dividendo:");
        x = input.nextInt();

        System.out.println("Ingrese el divisor:");
        y = input.nextInt();

        System.out.print(div(x,y));

    }

    public static long div(long x,long y) {
        int signo= ((x<0)^(y<0))? -1:1;
        long resultado=0;
        x = Math.abs(x);
        y = Math.abs(y);
        while(x>=y) {
            x-=y;
            ++resultado;
        }
        return (signo*resultado);
    }


}
