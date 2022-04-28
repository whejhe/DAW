package com.mycompany.u2.e14.persona;
import java.util.Scanner;

public class PruebaPersona {
    public static void main(String[] args) {
        Persona p = new Persona();
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Como te llamas?");
        p.setNombre(sc.nextLine());
        
        System.out.println("Que edad tienes?");
        p.setEdad(sc.nextInt());
        
        System.out.println("Hola "+p.getNombre());
        
        if(p.getEdad()>=0 && p.getEdad()<=3){
            System.out.println("Eres un bebe");
        }
        if(p.getEdad()>=4 && p.getEdad()<=12){
            System.out.println("Eres un niño");
        }
        if(p.getEdad()>=12 && p.getEdad()<=20){
            System.out.println("Eres un Adolescente");
        }
        if(p.getEdad()>=21){
            System.out.println("Eres un adulto");
        }
    }
}
