package com.mycompany.u2.e18.lavadora;
import java.util.Scanner;

public class PruebaLavadora {
    public static void main(String[] args) {
        Lavadora l = new Lavadora();
        Scanner sc = new Scanner(System.in);
        
        System.out.println("PROGRAMA LAVADORA");
        System.out.println("LAVADO CORTO");
        System.out.println("1-Prelavado");
        System.out.println("2-Lavado");
        System.out.println("3-Centrifugado");
        System.out.println("4-Fin");
        System.out.println("");
        System.out.println("LAVADO LARGO");
        System.out.println("5-Prelavado");
        System.out.println("6-Lavado en caliente");
        System.out.println("7-Centrifugado 1");
        System.out.println("8-Lavado en frio");
        System.out.println("9-Suavizante");
        System.out.println("10-Centrifugado 2");
        System.out.println("11-Secado");
        System.out.println("12-Fin");
        System.out.println("");
        System.out.println("¿En que numero deseas empezar");
        
        l.setOpcion(sc.nextInt());
        
        switch(l.getOpcion()){
            case 1:
                System.out.println("1-Prelavado");
            case 2:
                System.out.println("2-Lavado");
            case 3:
                System.out.println("3-Centrifugado");
            case 4:
                System.out.println("4-Fin");
                break;
            case 5:
                System.out.println("5-Prelavado");
            case 6:
                System.out.println("6-Lavado en caliente");
            case 7:
                System.out.println("7-Centrifugado 1");
            case 8:
                System.out.println("8-Lavado en frio");
            case 9:
                System.out.println("9-Suavizante");
            case 10:
                System.out.println("10-Centrifugado 2");
            case 11:
                System.out.println("11-Secado");
            case 12:
                System.out.println("12-Fin");
                break;
            default:
                System.out.println("Opcion Incorrecta");
        }
   }
}
