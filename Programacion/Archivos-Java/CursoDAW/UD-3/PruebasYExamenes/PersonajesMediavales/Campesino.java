package com.mycompany.personajesmediavales;

public class Campesino extends Personaje{
    
    public void Campesino(int monedas){
        this.monedas=monedas;
        estaVivo=true;
    }
    public void vendeCosecha(){
        monedas+=50;
        System.out.println("El Campesino con "+monedas+" monedas - VENDE COSECHA");
    }
    public void cultiva(){
        System.out.println("El Campesino con "+monedas+" monedas - CULTIVA");
    }

    @Override
    public void come() {
        monedas-=3;
        System.out.println("El Campesino con "+monedas+" monedas come");
    }

    @Override
    public void muere() {
        estaVivo=false;
        System.out.println("El Campesino con "+monedas+" monedas muere");
    }

    @Override
    public void realizaAccion() {
        if(!estaVivo){
            System.out.println("Campesino muerto - SIN ACCION");
        }else{
            int tirada=(int)Math.floor(Math.random()*100+1);
            switch(tirada){
                case 0 - 10:
                    System.out.println("El Campesino - MUERE");
                    break;
                case 11 - 60:
                    System.out.println("El Campesino - CULTIVA");
                    break;
                case 61 - 70:
                    System.out.println("El Campesino - VENDE SU COSECHA");
                    break;
                default:
                    System.out.println("El Campesino - COME");
            }
                    
        }
    }
    
}
