package com.jetbrains;
import java.util.Scanner;

public class Ejercicio_11 {

    public static void main(String[] args) {
        Scanner Input1 = new Scanner(System.in);
        Scanner Input2 = new Scanner(System.in);
        int x;
        int y;

        System.out.println("Ingrese el primer numero a multiplicar: ");
        x = Input1.nextInt();
        System.out.println("Ingrese el segundo numero a multiplicar: ");
        y = Input2.nextInt();

        System.out.print(x+" x "+y+" = ");

        for(int i=1; i<=y; i++) {
            System.out.print(x);
            if(i < y) {
                System.out.print(" + ");
            }else {
                System.out.print(" = ");
            }
        }
        System.out.print(x*y);
    }
}
