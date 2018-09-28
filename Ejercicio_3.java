package com.jetbrains;

import java.util.Scanner;

public class Ejercicio_3 {

    public static void main(String[] args) {


        Scanner userInput = new Scanner(System.in);
        int x;
        int y;
        System.out.println("Porfavor, ingrese un numero:");
        x = userInput.nextInt();
        System.out.println("Porfavor, ingrese otro numero:");
        y = userInput.nextInt();



        while(x!=y){
            System.out.println("Porfavor, ingrese un numero:");
            x = userInput.nextInt();
            System.out.println("Porfavor, ingrese otro numero:");
            y = userInput.nextInt();
        }
        System.out.println("Estos numeros son iguales: "+" "+x+" "+y);
    }
}
