package com.mycompany.pruebaevaluableud1.depositocircular;

public class DepositoCircular {
    public double radio;
    public double altura;
    public double litrosRiegoHora;
    public double numLitrosActual;
    public double SuperficieBase;

    public double getRadio() {
        return radio;
    }

    public double getAltura() {
        return altura;
    }

    public double getLitrosRiegoHora() {
        return litrosRiegoHora;
    }

    public double getNumLitrosActual() {
        return numLitrosActual;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void setLitrosRiegoHora(double litrosRiegoHora) {
        this.litrosRiegoHora = litrosRiegoHora;
    }
    public double calculaSuperficieBase(){
        SuperficieBase=radio*radio*Math.PI;
        return SuperficieBase;
    }
    public double calculaPerimetroBase(){
        double PerimetroBase=2*radio*Math.PI;
        return PerimetroBase;
    }
    public double calculaCapacidad(){
        double Capacidad=radio*radio*Math.PI*altura;
        return Capacidad;
    }
    public void cargaDeposito(double numLitros){
        numLitrosActual+=numLitros;
    }
    public void riega(double numMinutos){
        numLitrosActual=numLitrosActual - numMinutos*(litrosRiegoHora/60);
    }
}
