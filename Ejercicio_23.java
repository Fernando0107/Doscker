package com.jetbrains;
import java.util.Scanner;

public class Ejercicio_23 {

    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);
        int x;
        int y;
        int z;
        int w;
        double c = 0.5;
        double v =0.25;
        double d = 0.1;
        double u = 0.01;
        double total;
        System.out.println("Porfavor, ingrese cuantas monedas de 50 centavos tiene:");
        x= userInput.nextInt();
        System.out.println("Porfavor, ingrese cuantas monedas de 25 centavos tiene:");
        y= userInput.nextInt();
        System.out.println("Porfavor, ingrese cuantas monedas de 10 centavos tiene:");
        z= userInput.nextInt();
        System.out.println("Porfavor, ingrese cuantas monedas de 1 centavos tiene:");
        w= userInput.nextInt();

        total= (c*x)+(v*y)+(d*z)+(u*w);

        String numberAsString = String.format ("%.2f", total);

        System.out.println("Total de dinero en Quetzales: Q."+numberAsString);


    }
}
