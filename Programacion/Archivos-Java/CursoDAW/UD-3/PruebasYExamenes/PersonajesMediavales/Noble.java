package com.mycompany.personajesmediavales;

public class Noble extends Personaje{
    public void Noble(int monedas){
        this.monedas=monedas;
        estaVivo=true;
    }
    public void recaudaImpuestos(){
        monedas+=500;
        System.out.println("Noble con "+monedas+" monedas - RECAUDA");
    }

    @Override
    public void come() {
        monedas-=10;
        System.out.println("Noble con "+monedas+" monedas come");
    }

    @Override
    public void muere() {
        estaVivo=false;
        System.out.println("El Noble con "+monedas+" monedas muere");
    }

    @Override
    public void realizaAccion() {
        if(!estaVivo){
            System.out.println("Noble muerto - SIN ACCION");
        }else{
            int tirada=(int)Math.floor(Math.random()*100+1);
            switch(tirada){
                case 0 - 5:
                    System.out.println("El Noble - MUERE");
                    break;
                case 6 - 20:
                    System.out.println("El Noble - RECAUDA IMPUESTOS");
                    break;
                default:
                    System.out.println("El Noble - COME");
            }
                    
        }
    }
    
}
