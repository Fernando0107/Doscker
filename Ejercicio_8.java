package com.jetbrains;
import java.util.Scanner;

public class Ejercicio_8 {

    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        int x;

        System.out.println("Ingrese un numero: ");
        x = input.nextInt();

        int y=1;

        for(int i=1; i<=x;i++) {
            int z=i;
            y=y*z;
        }
        System.out.print(y);

    }
}
