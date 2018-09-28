package com.jetbrains;
import java.util.Scanner;

public class Ejercicio_6 {

    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        int x;
        System.out.println("Porfavor, ingrese un numero:");
        x= userInput.nextInt();

        if (x>=20  && x<=100){

            System.out.println("El numero se encuentra en el rango de 20-100");

        }else{

            System.out.println("El numero ingresado no se encunetra en el rango de 20-100");
        }

    }
}
