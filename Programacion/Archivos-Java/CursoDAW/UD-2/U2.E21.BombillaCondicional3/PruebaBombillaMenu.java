package com.mycompany.u2.e21.bombillacondicional3;
import java.util.Scanner;

public class PruebaBombillaMenu {
    public static void main(String[] args) {
        BombillaCondicional b = new BombillaCondicional();
        Scanner sc = new Scanner(System.in);
        int opcion;
        
        do{
            System.out.println("MENU DE OPCIONES:");
            System.out.println("0 - SALIR");
            System.out.println("1 - Enciende");
            System.out.println("2 – Apaga");
            System.out.println("3 – Imprime estado");
            System.out.println("4 – Crea una nueva bombilla");
            System.out.println("Escoge una opción:");
        
            opcion=sc.nextInt(); 
            
            switch(opcion){
                case 0:
                    System.out.println("Hasta Pronto");
                    break;
                case 1:
                    b.encender();
                    System.out.println("Encendida");
                    break;
                case 2:
                    b.apagar();
                    System.out.println("Apagada");
                    break;
                case 3:
                    b.imprimeEstado();
                    break;
                case 4:
                    b.nuevaBombilla();
                    System.out.println("As cambiado la bombilla");
                    break;
                default:
                    System.out.println("La opcion no es correcta");
            }
        }while(opcion!=0);
        
    }
}
