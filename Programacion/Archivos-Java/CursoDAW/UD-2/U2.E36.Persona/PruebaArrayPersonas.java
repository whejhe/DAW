package com.mycompany.u2.e36.persona;

public class PruebaArrayPersonas {
    public static void main(String[] args) {
        Persona p[] = new Persona[4];
        
        p[0]= new Persona();
        p[0].setRol("Padre");
        p[0].setEdad(43);
        
        p[1]=new Persona();
        p[1].setRol("Madre");
        p[1].setEdad(40);
        
        p[2]=new Persona();
        p[2].setRol("Hijo");
        p[2].setEdad(24);
        
        p[3]=new Persona();
        p[3].setRol("Hija");
        p[3].setEdad(14);
        
        System.out.println("La posición "+0+" la ocupa el "+p[0].getRol()+" con "+p[0].getEdad()+" años");
        System.out.println("La posición "+1+" la ocupa la "+p[1].getRol()+" con "+p[1].getEdad()+" años");
        System.out.println("La posición "+2+" la ocupa el "+p[2].getRol()+" con "+p[2].getEdad()+" años");
        System.out.println("La posición "+3+" la ocupa la "+p[3].getRol()+" con "+p[3].getEdad()+" años");
        
        System.out.println("El hijo de va de casa");
        p[2].setRol("nadie");
        p[2].setEdad(0);
        
        System.out.println("LLega el abuelo");
        p[2].setRol("Abuelo");
        p[2].setEdad(80);
        System.out.println("La posición "+2+" la ocupa la "+p[2].getRol()+" con "+p[2].getEdad()+" años");
        
    }
}
