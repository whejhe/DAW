package com.mycompany.pruebaevaluable;

import java.util.HashMap;
import java.util.Map;

public class Tarjeta {
    private int identificador;
    private String nombrePropietario;

    public Tarjeta(int identificador, String nombrePropietario) {
        this.identificador = identificador;
        this.nombrePropietario = nombrePropietario;
    }


    public int getIdentificador() {
        return identificador;
    }

    public String getNombrePropietario() {
        return nombrePropietario;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 71 * hash + this.identificador;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Tarjeta other = (Tarjeta) obj;
        return this.identificador == other.identificador;
    }
    
    
}
