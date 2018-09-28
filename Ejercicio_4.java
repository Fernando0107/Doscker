package com.jetbrains;

import java.util.Scanner;

public class Ejercicio_4 {
    public static void main(String[] args) {


        Scanner userInput = new Scanner(System.in);
        int x;
        int y;
        System.out.println("Porfavor, ingrese un numero:");
        x = userInput.nextInt();
        System.out.println("Porfavor, ingrese otro numero:");
        y = userInput.nextInt();

        if (x > y) {
            System.out.println("El primer numero ingresado es el mayor: " + x);

        } else if (x < y) {
            System.out.println("El segundo numero ingresado es el mayor: " + y);
        } else {
            System.out.println("Los numeros son iguales");
        }
    }
}
