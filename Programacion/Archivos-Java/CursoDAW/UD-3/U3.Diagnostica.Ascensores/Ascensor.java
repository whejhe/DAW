
package com.mycompany.u3.diagnostica.ascensores;

public class Ascensor implements AscensorInterface{
    private String marca, modelo;
    private int numMaxPlantasEdificio, plantaActual;
    //plantaActual = 0 o no inicializarlo porque por defecto ya lo hace.
    
    public Ascensor(String marca, String modelo, int numMaxPlantasEdificio){
        this.marca = marca;
        this.modelo = modelo;
        this.numMaxPlantasEdificio = numMaxPlantasEdificio;
        //plantaActual = 0;
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
    public int getNumMaxPlantasEdificio() {
        return numMaxPlantasEdificio;
    }

    @Override
    public int getPlantaActual() {
        return plantaActual;
    }

    @Override
    public void sube(int plantaDestino) {
        if(plantaDestino >=0 && plantaDestino<=numMaxPlantasEdificio){
            if(plantaDestino<plantaActual){
                System.out.println("Mejor usa el botón de bajar");
            }
            else{
                plantaActual=plantaDestino;
                System.out.println("Has llegado a la planta "+plantaActual);
            }
        }
        else{
            System.out.println("Error: La "+plantaDestino+" no está en el edificio");
        }
    }

    @Override
    public void baja(int plantaDestino) {
        if(plantaDestino >=0 && plantaDestino<=numMaxPlantasEdificio){
            if(plantaDestino>plantaActual){
                System.out.println("Mejor usa el botón de subir");
            }
            else{
                plantaActual=plantaDestino;
                System.out.println("Has llegado a la planta "+plantaActual);
            }
        }
        else{
            System.out.println("Error: La "+plantaDestino+" no está en el edificio");
        }
    }

    @Override
    public String toString() {
        return "Ascensor{" + "marca=" + marca + ", modelo=" + modelo + ", numMaxPlantasEdificio=" + numMaxPlantasEdificio + ", plantaActual=" + plantaActual + '}';
    }
    
    
}
