package com.mycompany.u2.e30.dadotripleseis;
import java.util.Scanner;

public class PruebaDado {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Dado d = new Dado();
        int numTiradas;
        int numeroDeseado;
        int cont = 0;
        
        System.out.println("¿Que numero entre 1 y 6 te gustaria que saliera?");
        numeroDeseado=sc.nextInt();
        System.out.println("");
        
        while(numeroDeseado<1 || numeroDeseado>6){
            System.out.println("El numero debe estar comprendido entre 1 y 6");
            System.out.println("Prueba otra vez");
            numeroDeseado=sc.nextInt();
        }
        do{
            numTiradas = d.tirada();
            System.out.println("Ha salido el "+numTiradas);
            if(numTiradas==6){
                cont++;
            }
        }while(cont!=3);
    }
}
