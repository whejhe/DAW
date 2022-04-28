package com.mycompany.extras.cajaregistradora;

public class CajaRegistradora {
    public double importeCliente;
    public int numArticulosCliente;
    
    public void abrirCaja(){
        importeCliente=0;
        numArticulosCliente=0;
    }
    public void nuevoCliente(){
        importeCliente=0;
        numArticulosCliente=0;
    }
    public void registrarArticulo(double precio){
        numArticulosCliente++;
        importeCliente=precio+importeCliente;
    }
    public void imprimirTicketCliente(){
        System.out.println("El cliente ha comprado "+numArticulosCliente+" artículos por un precio total de "+importeCliente+" euros");
    }
}
