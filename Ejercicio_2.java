package com.jetbrains;

import java.util.Scanner;

public class Ejercicio_2 {



    public static void main(String[] args) {


        Scanner userInput = new Scanner(System.in);
        int x;
        System.out.println("Porfavor, ingrese un numero:");
        x= userInput.nextInt();

        while(x!=7){
            System.out.println("Porfavor, ingrese un numero:");
            x= userInput.nextInt();

        }
        System.out.println("Numero de la suerte!");
    }
}
