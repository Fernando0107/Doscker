package com.jetbrains;
import java.util.Scanner;

public class Ejercicio_24 {

    public static void main(String[] args){

        Scanner nn = new Scanner(System.in);
        String n;

        System.out.println("Ingrese su nombre completo: \n");
        n = nn.nextLine();

        String[] separado = n.split(" ");

        for(int i=0;i<separado.length;i++){
            String s = separado[i];
            System.out.println(s+" contiene "+s.length()+" letras.");
        }
    }
}
