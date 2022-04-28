package com.mycompany.u1.e9.circunferencia;

public class Circunferencia {
    public double radio;
    
    public void estableceRadio(double nuevoRadio){
        radio=nuevoRadio;
    }
    public double calculaPerimetro(){
        double perimetro = 2*Math.PI*radio;
        return perimetro;
    }
    public double calculaSuperficie(){
        double Superficie = Math.PI*radio*radio;
        return Superficie;
    }
    public void imprimePerimetro(){
        System.out.println("El perimetro es de: "+calculaPerimetro());
    }
    public void imprimeSuperficie(){
        System.out.println("La superficie es de: "+calculaSuperficie());
    }
}
