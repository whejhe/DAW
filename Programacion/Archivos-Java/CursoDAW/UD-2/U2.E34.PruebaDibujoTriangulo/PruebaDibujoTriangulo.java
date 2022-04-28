package com.mycompany.u2.e34.pruebadibujotriangulo;
import java.util.Scanner;

public class PruebaDibujoTriangulo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tamanio,contador,n;
        
        System.out.println("Dime el tamaño del triángulo (5-30):");
        tamanio=sc.nextInt();
        
        while(tamanio<5 || tamanio>30){
            System.out.println("El numero debe ser un entero entre 5 y 30");
            System.out.println("Prueba otra vez");
            tamanio=sc.nextInt();
        }
        for (n=1; n <= tamanio; n++){
            for (contador = 1; contador <= n; contador ++){
                System.out.print("*");
            }
            System.out.println("");
        }
        /*String piramide = "";
        for(int i = tamanio; i > 0; i--){
            piramide += "*";
            System.out.println(piramide);
        }*/
        
    }
}
