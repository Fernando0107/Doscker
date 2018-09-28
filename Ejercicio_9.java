package com.jetbrains;
import java.util.Scanner;

public class Ejercicio_9 {

    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);
        int x;
        System.out.println("Porfavor, ingrese un numero:");
        x= userInput.nextInt();


        for(int i=1; i<=10; i++){
            int y=x*i;
            System.out.println(x+" x "+i+": "+y);
        }



    }

}
