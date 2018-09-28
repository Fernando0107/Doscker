package com.jetbrains;
import java.util.Scanner;

public class Ejercicio_7 {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int x;
        System.out.println("Ingrese un año: ");
        x = input.nextInt();

        if(x%4==0){
            System.out.println("El año ingresado es bisiesto");
        }else{
            System.out.println("El año ingresado no es bisiesto");
        }

    }
}
