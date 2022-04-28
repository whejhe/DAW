package com.mycompany.modulocoche;

public class coche {
    private int rueda,largo,ancho,motor,peso;
    boolean asientosCuero,climatizador;
    private String color;

    public int getRueda() {
        return rueda;
    }

    public int getLargo() {
        return largo;
    }

    public int getAncho() {
        return ancho;
    }

    public int getMotor() {
        return motor;
    }

    public int getPeso() {
        return peso;
    }

    public void setRueda(int rueda) {
        this.rueda = rueda;
    }

    public void setLargo(int largo) {
        this.largo = largo;
    }

    public void setAncho(int ancho) {
        this.ancho = ancho;
    }

    public void setMotor(int motor) {
        this.motor = motor;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }
    
    
}
