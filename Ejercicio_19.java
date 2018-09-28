package com.jetbrains;
import java.util.Scanner;

public class Ejercicio_19 {

    public static void main(String[] args){

        Scanner userInput = new Scanner(System.in);
        int x;

        System.out.println("Ingrese un numero porfavor: ");
        x = userInput.nextInt();

        for(int i=1; i < x; i++){
            if(i%2 != 0) {
                System.out.print(i+" ");
            }
        }
    }
}
