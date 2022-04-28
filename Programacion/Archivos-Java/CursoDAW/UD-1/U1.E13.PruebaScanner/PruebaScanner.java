package com.mycompany.u1.e13.pruebascanner;
import java.util.Scanner;

public class PruebaScanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nombre;
        String Apellido1;
        int numero;
        int numero2;
        
        System.out.println("Dinos tu nombre:");
        nombre = sc.nextLine();
        
        System.out.println("Dime tu primer apellido:");
        Apellido1 = sc.nextLine();
        
        System.out.println("Dime un número entero: ");
        numero = sc.nextInt();
        
        System.out.println("Dime otro número entero: ");
        numero2 = sc.nextInt();
        
        System.out.println("Tu nombre y apellido es: "+nombre+" "+Apellido1);
        
        System.out.println("Los números leídos son "+numero+" y "+numero2+".");
        System.out.println("Su suma es "+(numero+numero2)+" y su producto es "+(numero*numero2));
    }
}
