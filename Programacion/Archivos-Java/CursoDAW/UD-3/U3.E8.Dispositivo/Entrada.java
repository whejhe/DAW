package com.mycompany.u3.e8.dispositivo;

public abstract class Entrada extends Dispositivo {
   
    private String Teclado;
    private String raton;

    public String getTeclado() {
        return Teclado;
    }

    public String getRaton() {
        return raton;
    }

    public void setTeclado(String Teclado) {
        this.Teclado = Teclado;
    }

    public void setRaton(String raton) {
        this.raton = raton;
    }

    
     
}
