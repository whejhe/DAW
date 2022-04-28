package com.mycompany.u1.e14.expresiones;
import java.util.Scanner;

public class PruebaExpresiones {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a,b,c,d;
        
        System.out.println("Dame el número a");
        a = sc.nextDouble();
        System.out.println("Dame el número b");
        b = sc.nextDouble();
        System.out.println("Dame el número c");
        c = sc.nextDouble();
        System.out.println("Dame el número d");
        d = sc.nextDouble();
        
        System.out.println(((a+b)*38)/(c*d));
        System.out.println("");
        System.out.println(a+((30-b)/(c+d)));
        System.out.println("");
        System.out.println(b*a*((a+b)/(b/d)));
        System.out.println("");
        System.out.println(((a+50)/b)/(c/(4+d)));
        
        System.out.println("Segunda opcion");
        double r1 = ((a+b)*38)/(c*d);
        double r2 = a+(30-b)/(c+d);
        double r3 = b*a*((a+b)/(b/d));
        double r4 = ((a+50)/b)/(c/(4+d));
        
        System.out.println("El resultado 1 es: "+r1);
        System.out.println("El resultado 2 es: "+r2);
        System.out.println("El resultado 3 es: "+r3);
        System.out.println("El resultado 4 es: "+r4);
    }
}
