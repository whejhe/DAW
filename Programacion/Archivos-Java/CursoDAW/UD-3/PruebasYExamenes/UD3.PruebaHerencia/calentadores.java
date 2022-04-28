package com.mycompany.ud3.pruebaherencia;

public class calentadores {
    private double potenciaMax;
    private boolean encendido;
    private double calculaPotenciaActual;

    public calentadores(double potenciaMax, boolean encendido, double calculaPotenciaActual) {
        this.potenciaMax = potenciaMax;
        this.encendido = encendido;
        this.calculaPotenciaActual = calculaPotenciaActual;
    }

    public double getPotenciaMax() {
        if(encendido){
            return potenciaMax;
        }else{
            calculaPotenciaActual=0;
        }
        return potenciaMax;
    }

    public double getCalculaPotenciaActual() {
        if(!encendido){
            calculaPotenciaActual=0;
        }else{
            return potenciaMax;
        }
        return calculaPotenciaActual;
    }

    public void setPotenciaMax(double potenciaMax) {
        this.potenciaMax = potenciaMax;
    }

    public void setCalculaPotenciaActual(double calculaPotenciaActual) {
        this.calculaPotenciaActual = calculaPotenciaActual;
    }
    
    public void encender(){
        encendido=true;
    }
    public void apagar(){
        encendido=false;
    }
}
