package com.mycompany.u2.e31.candadonumerico;
import java.util.Scanner;

public class RevientaCandado {
    public static void main(String[] args) {
        CandadoNumerico c = new CandadoNumerico();
        Scanner sc = new Scanner(System.in);
        
        System.out.println("¿Cual sera tu numero secreto?");
        System.out.println("Debe estar entre 0 y 9999");
        int numero=(sc.nextInt());
        
        while(numero<0 || numero>9999){
            System.out.println("El numero debe estar entre 0 y 9999");
            System.out.println("Prueba otra vez");
            numero = sc.nextInt();
        }
        int adivina =0;
        boolean prueba=false;
        
        do{
            prueba=c.intentaAbrir(adivina);
            adivina++;
            if(prueba==false){
                System.out.println("Probando con el numero "+adivina+" :No se abre");
            }else{
                System.out.println("Probando con el numero "+adivina+" :Se abrió");
            }
        }while(prueba==false);
    }
}
