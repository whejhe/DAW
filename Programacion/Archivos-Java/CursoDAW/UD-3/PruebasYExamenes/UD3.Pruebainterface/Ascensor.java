package com.mycompany.ud3.pruebainterface;

public abstract class Ascensor implements AscensorInterface{
    
    private String Marca;
    private String Modelo;
    private int NumMaxPlantasEdificio;
    private int PlantaActual;
    private boolean sube;
    private boolean baja;

    public Ascensor(String Marca, String Modelo, int NumMaxPlantasEdificio) {
        this.Marca = Marca;
        this.Modelo = Modelo;
        this.NumMaxPlantasEdificio = NumMaxPlantasEdificio=10;
    }
    
    public String getMarca(){
        PlantaActual=0;
        return Marca;
    }

    public void setMarca(String Marca) {
        this.Marca = Marca;
    }

    public void setModelo(String Modelo) {
        this.Modelo = Modelo;
    }
    public String getModelo(){
        return Modelo;
    }
    public int getNumMaxPlantasEdificio(){
        return NumMaxPlantasEdificio;
    }
    public int getPlantaActual(){
        if(PlantaActual>=0 || PlantaActual<=10){
            System.out.println("Estamos en la planta "+PlantaActual);
        }else{
            System.out.println("La planta no existe");
        }
        return PlantaActual;
    }

    public void setPlantaActual(int PlantaActual) {
        this.PlantaActual = PlantaActual;
    }
   
    public boolean isSube(int plataDestino) {
        return sube;
    }

    public boolean isBaja(int plantaDestino) {
        return baja;
    }

    @Override
    public String toString() {
        return "Ascensor{" + "Marca=" + Marca + ", Modelo=" + Modelo + ", NumMaxPlantasEdificio=" + NumMaxPlantasEdificio + ", PlantaActual=" + PlantaActual + ", sube=" + sube + ", baja=" + baja + '}';
    }
    
}
