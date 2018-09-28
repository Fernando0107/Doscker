package com.jetbrains;

import java.util.Scanner;

public class Ejercicio_1 {

    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        int x;
        int y;
        int res;
        System.out.println("Porfavor, ingrese un numero:");
        x= userInput.nextInt();
        System.out.println("Porfavor, ingrese otro numero:");
        y= userInput.nextInt();

        res=y+x;

        System.out.println("Resultado: "+res);

    }
}
