package com.mycompany.u2.e16.menudepotencias;
import java.util.Scanner;

public class pruebaMenuPotencias {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        numero n = new numero();
        
        System.out.println("Dime un numero cualquiera");
        n.setNumero(sc.nextDouble());
        
        System.out.println("MENU DE POTENCIAS");
        System.out.println("1-Calcula el cuadrado");
        System.out.println("2-Calcula el cubo");
        System.out.println("3-Calcula la raiz cuadrada");
        System.out.println("Escoja una opcion");
        
        n.setOpcion(sc.nextInt());
        
        switch(n.getOpcion()){
            case 1:
                double cuadrado = Math.pow(n.getNumero(), 2);
                System.out.println("El cuadrado de "+n.getNumero()+" es "+cuadrado);
                break;
            case 2:
                double cubo = Math.pow(n.getNumero(),3);
                System.out.println("El cubo de "+n.getNumero()+" es "+cubo);
                break;
            case 3:
                double raiz = Math.pow(n.getNumero(),1/2);
                System.out.println("La Raiz cuadrada de "+n.getNumero()+" es "+raiz);
                break;
            default:
                System.out.println("Opcion incorrecta");
        }
    }
}
