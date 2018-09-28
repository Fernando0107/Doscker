package com.jetbrains;
import java.util.Scanner;

public class Ejercicio_16 {

    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        int x;
        int y;
        System.out.println("Porfavor, ingrese el primer numero:");
        x= userInput.nextInt();
        System.out.println("Porfavor, ingrese el segundo numero:");
        y= userInput.nextInt();

        if(x>y){
            System.out.println(x+" "+">"+" "+y);
        }else if(x==y){
            System.out.println(x+" "+"="+" "+y);
        }else{
            System.out.println(x+" "+"<"+" "+y);
        }

    }
}
