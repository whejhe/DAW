package com.mycompany.u3.e10.testdispositivos;

public abstract class Dispositivo {
    private String marca, modelo;
    private boolean encendido;
    public abstract void resetContadores();
    
    
    public Dispositivo(String marca, String modelo){
        this.marca = marca;
        this.modelo = modelo;
    }
    public void encender() {
        System.out.println("Encendido");
        encendido = true;
    }
    
    public void apagar() {
        System.out.println("Apagado");
        encendido = false;
    }    
    
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public boolean isEncendido() {
        return encendido;
    }

    @Override
    public String toString() {
        return "Dispositivo{" + "encendido=" + encendido + '}';
    }
    
}
