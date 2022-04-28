
package com.mycompany.u3.e13.interfazimpresora;

public class Impresora implements InterfazImpresora{
    private String marca;
    private String modelo;
    private boolean encendida;
    private int numFoliosBandeja;
    private String estado;

    public Impresora(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }
    
    
    
    @Override
    public String getMarca() {
        return marca;
    }

    @Override
    public String getModelo() {
        return modelo;
        
    }

    @Override
    public void encender() {
        if(!encendida){
            encendida = true;
            estado = "OK";
        }
    }

    @Override
    public void apagar() {
        if(encendida){
            encendida = false;
            estado = "Fuera de servicio";
        }
    }

    @Override
    public void cargarBandeja(int numFolios) {
        numFoliosBandeja = numFoliosBandeja + numFolios;
        
    }

    @Override
    public void imprimir(InterfazDocumento documento) {
        int foliosNecesarios = documento.getNumPaginasImpresion();
        String titulo = documento.getTitulo();
        if(encendida){
            if(numFoliosBandeja >= foliosNecesarios){//Podemos imprimir
                System.out.println("Se está imprimiendo el documento " +titulo+" que ocupa "+foliosNecesarios+ " páginas");
                numFoliosBandeja -=foliosNecesarios;
                estado = "OK";
                
            }
            else{
                System.out.println("Error: no hay suficiente papel para imprimir el documento "+titulo);
                estado = "Falta papel";
            }
        }else{
            System.out.println("Error: Impresora fuera de servicio");
        }
        
       
    }

    @Override
    public String getEstado() {
        return estado;
    }
    
}
