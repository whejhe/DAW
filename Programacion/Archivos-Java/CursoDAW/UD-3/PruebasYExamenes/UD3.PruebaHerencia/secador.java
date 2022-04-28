package com.mycompany.ud3.pruebaherencia;

public class secador extends calentadores{
    private boolean resistencia1;
    private boolean resistencia2;
    private double calculaPotenciaActual;
    private String estadoSecador;
    
    calentadores c = new calentadores(1000,false,0);

    public secador(double potenciaMax, boolean encendido, double calculaPotenciaActual) {
        super(potenciaMax, encendido, calculaPotenciaActual);
    }
    public void encenderResistencia1(){
        resistencia1=true;
    }
    public void encenderResistencia2(){
        resistencia2=true;
    }
    public void apagarResistencia1(){
        resistencia1=false;
    }
    public void apagarResistencia2(){
        resistencia2=false;
    }

    public String getEstadoSecador() {
        if(resistencia1){
            System.out.println("El secador esta a media potencia con la resistencia1");
            if(resistencia2){
                System.out.println("El secador esta a media potencia con la resistencia2");
                if(resistencia1 && resistencia2){
                    System.out.println("El secador esta a maxima potencia con ambas resistencias");
                }
            }
        }else{
            System.out.println("Secador apagado");
    }
        return estadoSecador;
    }

    public double getCalculaPotenciaActual() {
        if(resistencia1 || resistencia2){
            System.out.println(calculaPotenciaActual=c.getPotenciaMax()/2);
            if(resistencia1 && resistencia2){
                System.out.println(c.getPotenciaMax());
            }
        }else{
            System.out.println(calculaPotenciaActual=0);
        }
        return calculaPotenciaActual;
    }
    
    
    
}
