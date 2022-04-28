
package com.mycompany.u3.e1.ordenador;

public class PruebaOrdenador {
    public static void main(String[] args) {
        Ordenador o1=new Ordenador();
        Ordenador o2=new Ordenador("HP", "Pavilion");
        Ordenador o3=new Ordenador("Asus", "3423F", 2010);
        System.out.println("Constructor 1");
        o1.imprimeEstado();
        System.out.println("Constructor 2");
        o2.imprimeEstado();
        System.out.println("Constructor 3");
        o3.imprimeEstado();
    }
    
}
