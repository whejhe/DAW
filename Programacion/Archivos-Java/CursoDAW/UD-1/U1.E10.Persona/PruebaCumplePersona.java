package com.mycompany.u1.e10.persona;

public class PruebaCumplePersona {
    public static void main(String[] args) {
        Persona p1 = new Persona();
        Persona p2 = new Persona();
        
        p1.cambiaNombre("Carmen");
        p1.cambiaEdad(15);
        
        p2.cambiaNombre("Alberto");
        p2.cambiaEdad(16);
        
        p1.imprimeNombre();
        p1.imprimeEdad();
        p1.imprimeEstadoTrabajo();
        p1.imprimeEstadoCivil();
        
        p2.imprimeNombre();
        p2.imprimeEdad();
        p2.imprimeEstadoTrabajo();
        p2.imprimeEstadoCivil();
        
        p1.cumpleaños();
        p1.cumpleaños();
        p1.cumpleaños();
        p1.cumpleaños();
        
        p2.cumpleaños();
        p2.cumpleaños();
        p2.cumpleaños();
        
        System.out.println("Carmen tiene "+p1.obtieneNumAnios());
        System.out.println("");
        System.out.println("Alberto tiene "+p2.obtieneNumAnios());
        
    }
}
