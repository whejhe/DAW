package com.mycompany.u2.e11.personacondicionaldoble;

public class PruebaPersonaCondicionalDoble {
    public static void main(String[] args) {
        PersonaCondicionalDoble p = new PersonaCondicionalDoble();
        
        p.setEdad(20);
        p.setAltura(165);
        p.setEstaCasado(true);
        p.setTieneTrabajo(true);
        
        if(p.getEdad()<18){
            System.out.println("Eres menor de edad");
        }else{
            System.out.println("Eres mayor de edad");
        }
        if(p.getAltura()>=185){
            System.out.println("Eres alto");
        }else{
            System.out.println("No eres alto");
        }
        if(p.isEstaCasado()==true){
            if(p.isTieneTrabajo()==true){
                System.out.println("Casado y con trabajo");
            }else{
                System.out.println("Casado y sin trabajo");
            }
        }else{
            System.out.println("No esta casado");
        }
    }
}
