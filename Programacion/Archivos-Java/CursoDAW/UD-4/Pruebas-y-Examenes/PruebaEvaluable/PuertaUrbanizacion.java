package com.mycompany.pruebaevaluable;


import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class PuertaUrbanizacion extends Tarjeta{
   
    
    Map <Integer,Tarjeta> tarjetasPermitidas = new HashMap<Integer,Tarjeta>();  
    Set<Tarjeta> tarjetasDentro = new HashSet<>();
    
    

    public PuertaUrbanizacion(int identificador, String nombrePropietario) {
        super(identificador, nombrePropietario);
    }
    
    
    
    public void agregarTarjetaPermitida(Tarjeta t){
        
    }
    public void eliminaTarjetaPermitida (int identificador){
        
    }
    public void imprimeTarjetasPermitidas(){
        
    }
    public void intentoDeEntrada (int identificador){
        
    }
    public void intentoDeSalida (int identificador){
        
    }
    
    
}

