
package com.mycompany.u3.diagnostica.calentadores;

public class Radiador extends Calentador {
    private double porcentaje;

    public double getPorcentaje() {
        return porcentaje;
    }

    public void setPorcentaje(double porcentaje) {
        this.porcentaje = porcentaje;
    }
    
    @Override
    public double calculaPotenciaActual(){
        if(isEncendido()){
            return potencia*porcentaje/100;
        }
        else
            return 0;
        //alternativa
        /*return super.calculaPotenciaActual()*porcentaje/100;*/
     
    }
}
