package com.mycompany.u2.e2.menu;

public class Menu {
    public String primerPlato;
    public String segundoPlato;
    public int calorias;
    public double precio;

    public String getPrimerPlato() {
        return primerPlato;
    }

    public String getSegundoPlato() {
        return segundoPlato;
    }

    public int getCalorias() {
        return calorias;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrimerPlato(String plato1) {
        primerPlato = plato1;
    }

    public void setSegundoPlato(String plato2) {
        segundoPlato = plato2;
    }

    public void setCalorias(int cal) {
        calorias = cal;
    }

    public void setPrecio(double real) {
        precio = real;
    }
    public void imprimeMenu(){
        System.out.printf("%-25s%25s","PRIMER PLATO","SEGUNDO PLATO");
        System.out.println("");
        System.out.printf("%-25s%25s","Ensalada de la casa","Solomillo al whisky");
        System.out.println("");
        System.out.println("---------------------------------------------------");
        System.out.printf("%-25s%25s","CALORIAS","PRECIO");
        System.out.println("");
        System.out.printf("%-25s%25s","798","11,95");
    } 
    
}
