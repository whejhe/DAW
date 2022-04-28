package com.mycompany.poo.empleado;

public class PruebaEmpleado {
    public static void main(String[] args) {
        
        empleado empleado1=new empleado("Paco",85000,1990,12,17);
        empleado empleado2=new empleado("Ana",95000,1995,06,02);
        empleado empleado3=new empleado("Maria",105000,2002,03,15);
        
        empleado1.subeSueldo(5);
        empleado2.subeSueldo(5);
        empleado3.subeSueldo(5);
        
        System.out.println("Nombre: "+empleado1.dameNombre()+" Sueldo "+empleado1.dameSueldo()+
                " Fecha de Alta: "+empleado1.dameFechaContrato());
        System.out.println("Nombre: "+empleado2.dameNombre()+" Sueldo "+empleado2.dameSueldo()+
                " Fecha de Alta: "+empleado2.dameFechaContrato());
        System.out.println("Nombre: "+empleado3.dameNombre()+" Sueldo "+empleado3.dameSueldo()+
                " Fecha de Alta: "+empleado3.dameFechaContrato());
        
        
    }
}

