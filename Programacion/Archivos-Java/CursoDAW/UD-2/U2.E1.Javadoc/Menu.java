package com.mycompany.u2.e1.javadoc;
/**
 * A modo de apunte
 * 
 * @author Carlos Fernandez
 * @version 1.0
 */

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
    
    
}
