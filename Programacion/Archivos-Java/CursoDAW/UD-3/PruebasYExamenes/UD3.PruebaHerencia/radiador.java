package com.mycompany.ud3.pruebaherencia;

public class radiador extends calentadores {
    private int porcentaje;
    private double calculaPotenciaActual;
    
    calentadores c = new calentadores(1000,false,0);

    public radiador(double potenciaMax, boolean encendido, double calculaPotenciaActual) {
        super(potenciaMax, encendido, calculaPotenciaActual);
    }
    
    public int getPorcentaje() {
        if(porcentaje<1 || porcentaje>100){
            c.apagar();
        }else{
            c.encender();
            System.out.println("Porcentaje actual al: "+porcentaje);
        }
        return porcentaje;
    }

    public void setPorcentaje(int porcentaje) {
        this.porcentaje = porcentaje;
    }

    public double getCalculaPotenciaActual() {
        calculaPotenciaActual=c.getPotenciaMax()*porcentaje/100;
        if(calculaPotenciaActual<=0){
            System.out.println("Radiador apagado");
        }else{
            System.out.println(calculaPotenciaActual);
        }
        return calculaPotenciaActual;
    }

    public void setCalculaPotenciaActual(double calculaPotenciaActual) {
        this.calculaPotenciaActual = calculaPotenciaActual;
    }
    
    
}
