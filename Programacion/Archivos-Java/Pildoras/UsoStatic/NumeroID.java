
package com.mycompany.usostatic;

public class NumeroID {

    public static void main(String[] args) {
        
        Empleados trabajador1= new Empleados("Paco");
        Empleados trabajador2= new Empleados("Ana");
        Empleados trabajador3= new Empleados("Antonio");
        Empleados trabajador4= new Empleados("Maria");
        
        trabajador1.cambiaSeccion("RRHH");
        //trabajador1.cambiaNombre("Maria");//Al ser una constante no puede cambiar de valor
        
        System.out.println(trabajador1.devuelveDatos() 
                +"\n"+trabajador2.devuelveDatos()
                +"\n"+trabajador3.devuelveDatos()
                +"\n"+trabajador4.devuelveDatos());//Con "\n" ejecutamos un salto de linea
        
        System.out.println(Empleados.dameIdSiguiente());//Al ser un metodo static no podemos hacer
                                                        //referencia a los objetos, tenemos que llamar
                                                        //a la clase Empleados
                                                      
        
    }
}

class Empleados{
    
    private final String nombre;
    private String seccion;
    private int Id;
    private static int IdSiguiente=1;

    public Empleados(String nom) {
        nombre = nom;
        seccion = "Administracion";
        Id=IdSiguiente;
        IdSiguiente++;
    }
    
    public void cambiaSeccion(String seccion){//setter
        this.seccion=seccion;
    }
    
    /*public void cambiaNombre(String nombre){
        this.nombre=nombre;//Al ser una constante no puede cambiar de valor
    }*/
    
    public String devuelveDatos(){
        return "El nombre es: "+nombre+" y la seccion es: "+seccion+" y el Id: "+Id;
    }
    
    public static String dameIdSiguiente(){//un metodo static nunca podra acceder a una variable 
        return "El IdSiguiente es: "+IdSiguiente;//a no ser que esta tambien sea static
    }
    
}