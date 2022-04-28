package com.mycompany.u2.e31.candadonumerico;

public class CandadoNumerico {
    public int numSecreto;
    
    public void setNumSecreto(int nuevoNumSecreto){
        numSecreto=nuevoNumSecreto;
    }
    
    public boolean intentaAbrir(int numero){
        if(numSecreto==numero){
            return true;
        }else{
            
        }return false;
    }
}
