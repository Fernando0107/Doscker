package com.jetbrains;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class RS {

    public static void main(String[]args) throws IOException {
        try {
            Scanner in = new Scanner(new FileReader("notas.txt"));          // Lectura del archivo
            int nota1=Integer.parseInt(in.nextLine());
            int nota2=Integer.parseInt(in.nextLine());
            int nota3=Integer.parseInt(in.nextLine());
            int nota4=Integer.parseInt(in.nextLine());
            int nota5=Integer.parseInt(in.nextLine());
            int nota6=Integer.parseInt(in.nextLine());
            int nota7=Integer.parseInt(in.nextLine());
            int nota8=Integer.parseInt(in.nextLine());
            int nota9=Integer.parseInt(in.nextLine());
            int nota10=Integer.parseInt(in.nextLine());
            int nota11=Integer.parseInt(in.nextLine());
            int promedio=((nota1+nota2+nota3+nota4+nota5+nota6+nota7+nota8+nota9+nota10)/10);
            System.out.println("Promedio = "+ promedio);

            int num[]={nota1,nota2,nota3,nota4, nota5,nota6,nota7, nota8,nota9,nota10,nota11}; // Guardo las notas en un array

            int max = Arrays.stream(num).max().getAsInt();                                      //Meto los valores de max y min
            int min = Arrays.stream(num).min().getAsInt();
            System.out.println("Maximo = " + max);
            System.out.println("Minimo = " + min);

            double sd = 0;                                                                      //Desv. Estandar
            for (int i=0; i<num.length;i++)
            {
                {
                    sd += ((num[i] - promedio)*(num[i] - promedio)) / (num.length - 1);
                }
            }
            double standardDeviation = Math.sqrt(sd);

            System.out.println("La desviación estandar es : " + standardDeviation);

        } catch (FileNotFoundException e) {
            System.out.println("File error");
        }




    }
}

