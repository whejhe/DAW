package com.mycompany.extras.cajacompleja;

public class CajaRegistradora {
    public double importeCliente;
    public int numArticulosCliente;
    public int numClientesAtendidos;
    public double importeTotalCaja;
    public int numArticulosVendidos;
    
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
    public void anularArticulo(double precio){
        numArticulosCliente--;
        importeCliente=precio+importeCliente;
    }
    public void imprimirTicketCliente(){
        System.out.println("El cliente ha comprado "+numArticulosCliente+" artículos por un precio total de "+importeCliente+" euros");
    }
    public void imprimeCierreCaja(){
        System.out.println("Se han vendido un total de "+numArticulosVendidos+" artículos por un importe total de "+importeTotalCaja+ " euros ");
    }
    public double calculaPrecioMedioArticulosVendidos(){
        double precioMedio = importeTotalCaja/numArticulosVendidos;
        return precioMedio;
    }
    public double calculaImporteMedioPorCliente(){
        double MedioPorCliente = importeCliente/numArticulosCliente;
        return MedioPorCliente;
    }
}
