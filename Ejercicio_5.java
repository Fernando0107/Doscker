package com.jetbrains;

import java.util.Scanner;

public class Ejercicio_5 {

    public static void main(String[] args) {


        Scanner userInput = new Scanner(System.in);
        int x;
        System.out.println("Porfavor, ingrese un numero:");
        x = userInput.nextInt();


        if (x%2==0) {
            System.out.println("El numero ingresado es par: " + x);

        } else {
            System.out.println("El numero ingresado es impar");
        }
    }
}
