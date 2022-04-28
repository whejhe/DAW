package com.mycompany.pruebaevaluableud1.hotel;

public class Hotel {
    public int numTotalHabitaciones;
    public int numHabitacionesOcupadas;
    public double precioHabitacionDiario;
    public double suplementoPrecioTemporadaAlta;
    public boolean temporadaAlta;
    
    public void estableceNumTotalHabitaciones(int numTotal){
        numTotalHabitaciones=numTotal;
    }
    public void establecePrecioHabitacionDiario(double nuevoPrecio){
        precioHabitacionDiario=nuevoPrecio;
    }
    public void estableceSuplementoPrecioTemporadaAlta(double nuevoIncremento){
        suplementoPrecioTemporadaAlta=nuevoIncremento;
    }
    public int obtieneNumHabitacionesOcupadas(){
        System.out.println("El hotel tiene "+numHabitacionesOcupadas+" Habitaciones Ocupadas");
        return numHabitacionesOcupadas;
    }
    public int obtieneNumTotalHabitaciones(){
        System.out.println("El Hotel tiene "+numTotalHabitaciones+" Habitaciones");
        return numTotalHabitaciones;
    }
    public void ocupaUnaHabitacion(){
        numHabitacionesOcupadas++;
    }
    public void liberaUnaHabitacion(){
        numHabitacionesOcupadas--;
    }
    public void comienzaTemporadaAlta(){
        temporadaAlta=true;
        precioHabitacionDiario = (precioHabitacionDiario+suplementoPrecioTemporadaAlta);
        System.out.println("Comienza la Temporada Alta");
    }
    public void finalizaTemporadaAlta(){
        temporadaAlta=false;
        precioHabitacionDiario = (precioHabitacionDiario-suplementoPrecioTemporadaAlta);
        System.out.println("Fin de la Temporada Alta");
    }
    public double calculaBeneficioDiario(){
        double beneficioDiario=precioHabitacionDiario*numHabitacionesOcupadas;
        System.out.println("Las ganancias del dia son de: "+beneficioDiario+" Euros");
        return beneficioDiario;
    }
}
