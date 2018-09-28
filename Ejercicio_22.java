package com.jetbrains;

public class Ejercicio_22 {

    public static void main(String[] args){
        int res=0;
        int x=0;
        for(int i=1; i<=3;i++) {
            res=(int)Math.ceil(Math.random() * 6);
            x+=res;
            System.out.println("Lanzamiento No. "+ i+":"+res);
        }
        System.out.println("Total: "+x);
    }
}
