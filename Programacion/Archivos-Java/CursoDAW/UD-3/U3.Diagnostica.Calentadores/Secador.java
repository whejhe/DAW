
package com.mycompany.u3.diagnostica.calentadores;

public class Secador extends Calentador {
    private boolean resistencia1, resistencia2;

    public boolean isResistencia1() {
        return resistencia1;
    }

    public boolean isResistencia2() {
        return resistencia2;
    }
    public void encenderRes1(){
        resistencia1=true;
    }
    
    public void encenderRes2(){
        resistencia2=true;
    }
    public void apagarRes1(){
        resistencia1=false;
    }
     public void apagarRes2(){
        resistencia2=false;
    }
     @Override
    public double calculaPotenciaActual(){
        if(isEncendido()){
           if(!resistencia1 && !resistencia2){
               return 0;
           }
           else{
               if(resistencia1 && resistencia2)
                   return potencia;
               else
                   return potencia/2;
           
           }
        }
        else
            return 0;
    }
}
