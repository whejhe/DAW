package com.mycompany.u3.e1.ordenador;

public class Ordenador {

    private String marca;
    private String modelo;
    private int anioFabricacion;
    private boolean encendido;

    public Ordenador() {
    }

    public Ordenador(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    public Ordenador(String marca, String modelo, int anioFabricacion) {
        this.marca = marca;
        this.modelo = modelo;
        this.anioFabricacion = anioFabricacion;
    }
    public void imprimeEstado(){
        System.out.println("Marca="+marca+", Modelo="+modelo+", año fabricación="
        +anioFabricacion+", encendido="+encendido);
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setAnioFabricacion(int anioFabricacion) {
        this.anioFabricacion = anioFabricacion;
    }

    public void setEncendido(boolean encendido) {
        this.encendido = encendido;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getAnioFabricacion() {
        return anioFabricacion;
    }

    public boolean isEncendido() {
        return encendido;
    }
    
}
