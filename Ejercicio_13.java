package com.jetbrains;
import java.util.Scanner;


public class Ejercicio_13 {

    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);
        int x;
        int y=0;

        System.out.println("Ingrese un numero a porfavor: ");
        x = userInput.nextInt();

        for(int i = 1; i <= x; i++) {
            y = y + i;
            System.out.print(i);
            if(i < x) {
                System.out.print(" + ");
            } else{
                System.out.println(" = "+y);
            }
        }
    }
}
