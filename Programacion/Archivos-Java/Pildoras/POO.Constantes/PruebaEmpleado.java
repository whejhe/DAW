package com.mycompany.poo.constantes;

public class PruebaEmpleado {
    public static void main(String[] args) {
        Empleados e1=new Empleados("Paco");
        Empleados e2=new Empleados("Ana");
        Empleados e3=new Empleados("Antonio");
        Empleados e4=new Empleados("Maria");
        
        e1.cambiaSeccion("RRHH");
        
        System.out.println(e1.devuelveDatos());
        System.out.println(e2.devuelveDatos());
        System.out.println(e3.devuelveDatos());
        System.out.println(e4.devuelveDatos());
        
    }
}
