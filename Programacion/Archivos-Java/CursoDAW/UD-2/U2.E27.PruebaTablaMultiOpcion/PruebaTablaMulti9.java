package com.mycompany.u2.e27.pruebatablamultiopcion;
import java.util.Scanner;

public class PruebaTablaMulti9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("¿Que tabla te gustaria ver?");
        int num=sc.nextInt();
        int variable=0;
         
        while(variable<=10){
            int resultado=num*variable;
            System.out.println(variable+"x"+num+" = "+resultado);
            variable++;
        }
    }
}
