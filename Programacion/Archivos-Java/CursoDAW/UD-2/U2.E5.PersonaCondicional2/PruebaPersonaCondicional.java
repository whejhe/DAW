package com.mycompany.u2.e5.personacondicional2;

public class PruebaPersonaCondicional {
    public static void main(String[] args) {
        PersonaCondicional p = new PersonaCondicional();
        p.setEdad(15);
        p.setAltura(195);
        p.setEstaCasado(true);
        
        if(p.getEdad()>=18){
            System.out.println("Ya eres un señor");
        }
        if(p.getAltura()>=185){
            System.out.println("Eres alto");
        }else{
            System.out.println("No eres alto");
        }
        if(p.isEstaCasado()==false){
            System.out.println("No esta casado");
        }
    }
}
