package com.mycompany.constructores;

import java.util.*;

public class UsoEmpleado {
    public static void main(String[] args) {
        
        /*Empleado empleado1=new Empleado("Carlos",85000,1990,12,17);
        Empleado empleado2=new Empleado("Maria",95000,1995,06,02);
        Empleado empleado3=new Empleado("Ana",105000,2002,03,15);
        
        empleado1.subeSueldo(5);
        empleado2.subeSueldo(5);
        empleado3.subeSueldo(5);
        
        System.out.println("Nombre: "+empleado1.getNombre()+" Sueldo "+empleado1.getSueldo()
                            +" Fecha de Alta: "+empleado1.getAltaContrato());
        System.out.println("Nombre: "+empleado2.getNombre()+" Sueldo "+empleado2.getSueldo()
                            +" Fecha de Alta: "+empleado2.getAltaContrato());
        System.out.println("Nombre: "+empleado3.getNombre()+" Sueldo "+empleado3.getSueldo()
                            +" Fecha de Alta: "+empleado3.getAltaContrato());*/
        
        Empleado[] misEmpleados = new Empleado[3];
        
        misEmpleados[0]=new Empleado("Paco",85000,1990,12,17);
        misEmpleados[1]=new Empleado("Maria",95000,1995,06,02);
        misEmpleados[2]=new Empleado("Ana",105000,2002,03,15);
        
        /*for(int i=0;i<3;i++){//sube el sueldo a los tres empleados
            misEmpleados[i].subeSueldo(5);
        }*/
        for(Empleado e: misEmpleados){
            e.subeSueldo(5);
        }
        
        /*for(int i=0;i<3;i++){
            System.out.println("Nombre: "+misEmpleados[i].getNombre()
                            +" Sueldo: "+misEmpleados[i].getSueldo()
                            +" Fecha de Alta: "+misEmpleados[i].getAltaContrato());
        }*/
        for(Empleado e: misEmpleados){
            System.out.println("Nombre: "+e.getNombre()
                            +" Sueldo: "+e.getSueldo()
                            +" Fecha de Alta: "+e.getAltaContrato());
        }
        
    }
}

