package com.mycompany.personajesmediavales;

public class Soldado extends Personaje {
    
    public void Soldado(int monedas){
        this.monedas=monedas;
        estaVivo=true;
    } 
    public void luchaEnBatalla(){
        monedas+=50;
        System.out.println("Soldado con "+monedas+" monedas - LUCHA");
    }

    @Override
    public void come() {
        monedas-=5;
        System.out.println("El Soldado con "+monedas+" monedas - COME");
    }

    @Override
    public void muere() {
        estaVivo=false;
        System.out.println("El Soldado con "+monedas+" monedas - MUERE");
    }

    @Override
    public void realizaAccion() {
        if(!estaVivo){
            System.out.println("Soldado muerto - SIN ACCION");
        }else{
            int tirada=(int)Math.floor(Math.random()*100+1);
            switch(tirada){
                case 0 - 20:
                    System.out.println("El soldado - MUERE");
                    break;
                case 21 - 60:
                    System.out.println("El soldado - LUCHA");
                    break;
                default:
                    System.out.println("El soldado - COME");
            }
                    
        }
    }
    
}
