package com.mycompany.u2.e7.casting;
import java.util.Scanner;

public class PruebaCasting {
    public static void main(String[] args) {
        PersonaCondicional p = new PersonaCondicional();
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Dinos tu Edad");
        p.setEdad(sc.nextInt());
        
        System.out.println("Dime tu altuta");
        p.setAltura(sc.nextInt());
        
        p.setEstaCasado(false);
        
        if(p.getEdad()>=18 && p.getEdad()<=30 && p.isEstaCasado()==false && p.getAltura()>175){
            System.out.println("Has consegido el papel");
        }
        
        
    }
}
