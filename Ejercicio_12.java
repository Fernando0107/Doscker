package com.jetbrains;
import java.util.Scanner;

public class Ejercicio_12 {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.println("Ingrese un numero");
        int x=Integer.parseInt(input.next());
        System.out.print(primo(x));
    }

    public static boolean primo(int n) {

        if (n<=1)
            return false;
        else if (n<=3)
            return true;
        else if (n%2==0 || n%3==0)
            return false;
        long sqrtN = (long)Math.sqrt(n)+1;
        for(long i = 6L; i <= sqrtN; i += 6) {
            if(n%(i-1) == 0 || n%(i+1) == 0)
                return false;
        }
        return true;
    }
}
