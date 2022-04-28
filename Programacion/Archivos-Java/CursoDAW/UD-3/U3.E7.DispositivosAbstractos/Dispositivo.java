package com.mycompany.u3.e7.dispositivosabstractos;

public abstract class Dispositivo {
    private String marca, modelo;
    private boolean encendido;
    public abstract void resetContadores();

    public void encender() {
        encendido = true;
    }
    
    public void apagar() {
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
        return "Dispositivo{" + "marca=" + marca + ", modelo=" + modelo + ", encendido=" + encendido + '}';
    }
    
}
