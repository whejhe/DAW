package com.mycompany.pruebaevaluableud1.hotel;

public class PruebaHotel {
    public static void main(String[] args) {
        Hotel h = new Hotel();
        
        h.estableceNumTotalHabitaciones(20);
        h.obtieneNumTotalHabitaciones();
        h.establecePrecioHabitacionDiario(50);
        
        h.comienzaTemporadaAlta();
        
        h.estableceSuplementoPrecioTemporadaAlta(25);
        h.ocupaUnaHabitacion();
        h.ocupaUnaHabitacion();
        h.ocupaUnaHabitacion();
        h.ocupaUnaHabitacion();
        h.obtieneNumHabitacionesOcupadas();
        h.calculaBeneficioDiario();
        
        h.finalizaTemporadaAlta();
        h.liberaUnaHabitacion();
        h.liberaUnaHabitacion();
        h.obtieneNumHabitacionesOcupadas();
        
        h.calculaBeneficioDiario();
        
    }
}
