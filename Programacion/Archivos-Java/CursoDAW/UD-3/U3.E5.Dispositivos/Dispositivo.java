package es.tuespiral.u3.e5.dispositivos;

public class Dispositivo {
    private String marca, modelo;
    private boolean encendido;

    public void encender() {
        encendido = true;
    }
    
    public void apagar() {
        encendido = false;
    }    
    
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public boolean isEncendido() {
        return encendido;
    }
}
