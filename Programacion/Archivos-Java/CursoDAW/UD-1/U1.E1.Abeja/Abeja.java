package com.mycompany.u1.e1.abeja;

public class Abeja {
    int posicionX;
    int posicionY;
    int NumeroCargas;
    boolean volando;
    double peso;

public void cambiaPosicionX(int nuevaPosX){
    posicionX = nuevaPosX;
}
public void cambiaPosicionY(int nuevaPosY){
    posicionY = nuevaPosY;
}
public void cambiaCargaNectar(int nuevaCarga){
    NumeroCargas = nuevaCarga;
}
public void cambiaPeso(double nuevoPeso){
    peso = nuevoPeso;
}
public void imprimePosicionX(){
    System.out.println("PosicionX = "+posicionX);
}
public void imprimePosicionY(){
    System.out.println("PosicioY = "+posicionY);
}
public void imprimeNumCargasNectar(){
    System.out.println("Numero de cargas Nectar = "+ NumeroCargas);
}
public void imprimePeso(){
    System.out.println("Peso = "+peso);
}
public void vuela(){
    volando = true;
}
public void sePosa(){
    volando = false;
}
public void imprimeEstadoVuelo(){
    System.out.println("La abeja esta volando = "+volando);
}

}

