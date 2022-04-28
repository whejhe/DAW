package com.mycompany.ud3.pruebainterface;

public interface AscensorInterface {
    String getMarca();
    String getModelo();
    int getNumMaxPlantasEdificio();
    int getPlantaActual();
    boolean sube(int plantaDestino);
    boolean baja(int plantaDestino);
    String toString();
    
}
