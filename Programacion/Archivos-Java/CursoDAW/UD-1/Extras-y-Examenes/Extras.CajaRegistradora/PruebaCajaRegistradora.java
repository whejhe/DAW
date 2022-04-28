package com.mycompany.extras.cajaregistradora;

public class PruebaCajaRegistradora {
    public static void main(String[] args) {
        
        CajaRegistradora c = new CajaRegistradora();
        
        c.abrirCaja();
        
        c.nuevoCliente();
        
        c.registrarArticulo(12.95);
        c.registrarArticulo(2.48);
        c.registrarArticulo(20.06);
        
        c.imprimirTicketCliente();
        
        System.out.println("");
        c.nuevoCliente();
        
        c.registrarArticulo(5.95);
        c.registrarArticulo(2.48);
        c.registrarArticulo(2.48);
        c.registrarArticulo(7.88);
        
        c.imprimirTicketCliente();
    }
}
