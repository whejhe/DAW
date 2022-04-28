package com.mycompany.u2.validaentrada;

public class ValidaEntrada {
    public int mayorCero;
    public int menorIgualCero;
    public double realRango;
    public String siNo;
    
    public int getMayorCero(){
        return mayorCero;
    }
    public void setMayorCero(int nuevoNumero){
        mayorCero=nuevoNumero;
    }
    public int getMenorIgualCero(){
        return menorIgualCero;
    }
    public void setMenorIgualCero(int nuevoMenor){
        menorIgualCero=nuevoMenor;
    }
    public double getRealRango(){
        return realRango;
    }
    public void setRealRango(double nuevoRealRango){
        realRango=nuevoRealRango;
    }
    public String getSiNo(){
        return siNo;
    }
    public void setSiNo(String nuevoSiNo){
        siNo=nuevoSiNo;
    }
}
