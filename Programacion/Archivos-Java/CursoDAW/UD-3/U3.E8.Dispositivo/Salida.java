package com.mycompany.u3.e8.dispositivo;

public abstract class Salida extends Dispositivo {
    private String altavoces;
    private String pantalla;
    
    public String getAltavoces(){
        return altavoces;
    }
    public void setAltavoces(String nuevaAltavoces){
        altavoces=nuevaAltavoces;
    }

    public String getPantalla() {
        return pantalla;
    }

    public void setPantalla(String pantalla) {
        this.pantalla = pantalla;
    }
    
}
