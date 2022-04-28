package com.mycompany.pruebaevaluableud1.depositocircular;

public class PruebaDeposito {
    public static void main(String[] args) {
        DepositoCircular dc = new DepositoCircular();
        
        dc.setRadio(45);
        dc.setAltura(5);
        dc.setLitrosRiegoHora(20);

        System.out.println("El radio del deposito es "+dc.getRadio());
        System.out.println("La altura del deposito es "+dc.getAltura());
        System.out.println("La superficie de la base es "+dc.calculaSuperficieBase());
        System.out.println("El perimetro de la base es "+dc.calculaPerimetroBase());
        System.out.println("La capacidad del depósito es "+dc.calculaCapacidad());
        System.out.println("Litros en el depósito actualmente: "+dc.getNumLitrosActual());
        System.out.println("Número de litros que se gasta en una hora"+dc.getLitrosRiegoHora());
        
        dc.cargaDeposito(40);
        dc.riega(50);
        
        System.out.println("--------------------------------------");
        System.out.println("El radio del deposito es "+dc.getRadio());
        System.out.println("La altura del deposito es "+dc.getAltura());
        System.out.println("La superficie de la base es "+dc.calculaSuperficieBase());
        System.out.println("El perimetro de la base es "+dc.calculaPerimetroBase());
        System.out.println("La capacidad del depósito es "+dc.calculaCapacidad());
        System.out.println("Litros en el depósito actualmente: "+dc.getNumLitrosActual());
        System.out.println("Número de litros que se gasta en una hora"+dc.getLitrosRiegoHora());
        
        dc.riega(30);
        dc.cargaDeposito(15);
        dc.riega(60);
        dc.riega(25);
        
        System.out.println("--------------------------------------");
        System.out.println("El radio del deposito es "+dc.getRadio());
        System.out.println("La altura del deposito es "+dc.getAltura());
        System.out.println("La superficie de la base es "+dc.calculaSuperficieBase());
        System.out.println("El perimetro de la base es "+dc.calculaPerimetroBase());
        System.out.println("La capacidad del depósito es "+dc.calculaCapacidad());
        System.out.println("Litros en el depósito actualmente: "+dc.getNumLitrosActual());
        System.out.println("Número de litros que se gasta en una hora"+dc.getLitrosRiegoHora());
        }
        
}
