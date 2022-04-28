package com.mycompany.modulocoche;

public class Furgoneta extends coche {
    
    private int capacidadCarga;
    private int plazasExtras;
    
    public Furgoneta(int plazasExtra,int capacidadCarga){
        super();//llama al constructor de la clase padre "coche"
        this.capacidadCarga=capacidadCarga;
        this.plazasExtras=plazasExtra;
    }
    
    public String dimeDatosFurgoneta(){
        return "La capacidad de carga es "+
                capacidadCarga+" y las plazas son: "+plazasExtras;
    }
    
}
