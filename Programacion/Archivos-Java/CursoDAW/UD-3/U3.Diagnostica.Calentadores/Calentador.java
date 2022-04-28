
package com.mycompany.u3.diagnostica.calentadores;

public abstract class Calentador {
    protected double potencia;
    protected boolean encendido;

    public double getPotencia() {
        return potencia;
    }

    public boolean isEncendido() {
        return encendido;
    }

    public void setPotencia(double potencia) {
        this.potencia = potencia;
    }
    
    public void encender(){
        encendido = true;
    }
    
    public void apagar(){
        encendido = false;
    }
    
    public double calculaPotenciaActual(){
        double consumo = 0;
        if (encendido){
            consumo = potencia;
        }
        return consumo;
        
        //alternativa
       /* if(encendido)
            return potencia;
        else
            return 0;*/
            
    }

    
    
    
}
