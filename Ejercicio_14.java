package com.jetbrains;
import java.util.Scanner;

public class Ejercicio_14 {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        int x;
        int i=1;
        int y=1;

        System.out.println("Ingrese un numero:");
        x = input.nextInt();

        while (i<=x) {
            System.out.print(" " +y+",");
            y+=2;
            i++;
        }

    }
}
