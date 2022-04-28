package com.mycompany.u3.diagnostica.ascensores;


public interface AscensorInterface {

    String getMarca();

    String getModelo();

    int getNumMaxPlantasEdificio();

    int getPlantaActual();

    void sube(int plantaDestino);

    void baja(int plantaDestino);

    String toString();
}
