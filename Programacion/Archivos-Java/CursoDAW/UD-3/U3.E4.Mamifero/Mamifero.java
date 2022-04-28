package com.mycompany.u3.e4.mamifero;

public class Mamifero {

    private String nombre;
    private int anioNacimiento;

    public void hacerRuido() {
        System.out.println("No sé qué ruido hago. Puedo ser muchas cosas.");
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setAnioNacimiento(int anioNacimiento) {
        this.anioNacimiento = anioNacimiento;
    }

    public String getNombre() {
        return nombre;
    }

    public int getAnioNacimiento() {
        return anioNacimiento;
    }

}
