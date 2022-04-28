
package com.mycompany.constantes;

public class UsoEmpleado {

    public static void main(String[] args) {
        
        Empleados trabajador1= new Empleados("Paco");
        Empleados trabajador2= new Empleados("Ana");
        
        trabajador1.cambiaSeccion("RRHH");
        //trabajador1.cambiaNombre("Maria");//Al ser una constante no puede cambiar de valor
        
        System.out.println(trabajador1.devuelveDatos());
        System.out.println(trabajador2.devuelveDatos());
        
    }
}

