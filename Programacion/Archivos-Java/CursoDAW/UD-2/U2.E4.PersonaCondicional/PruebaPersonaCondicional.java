package com.mycompany.u2.e4.personacondicional;

public class PruebaPersonaCondicional {
    public static void main(String[] args) {
        PersonaCondicional p = new PersonaCondicional();
        p.setEdad(20);
        p.setAltura(165);
        p.setEstaCasado(false);
        
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
