package com.mycompany.poo.constantes;

public class Empleados {
    private final String nombre;
    private String seccion;
    private int Id;
    private static int IdSiguiente=1;

    public Empleados(String nombre) {
        this.nombre = nombre;
        seccion="Administracion";
        Id=IdSiguiente;
        IdSiguiente++;
    }
    
    public void cambiaSeccion(String seccion){//setter
        this.seccion=seccion;
    }
    public String devuelveDatos(){
        return "El nombre es: "+nombre+" y la seccion es "+seccion+" y el ID es: "+Id;
    }
    
}
