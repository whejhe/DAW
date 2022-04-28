package es.tuespiral.u4.e15.personahashcode;

import java.util.Objects;

public class Persona {
    private String dni, nombre, apellidos, direccion;
    private int edad, telefono;
    private boolean casada, tieneTrabajo;

    public Persona(String dni, String nombre, String apellidos, String direccion, int edad, int telefono, boolean casada, boolean tieneTrabajo) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.direccion = direccion;
        this.edad = edad;
        this.telefono = telefono;
        this.casada = casada;
        this.tieneTrabajo = tieneTrabajo;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 17 * hash + Objects.hashCode(this.dni);
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
        final Persona other = (Persona) obj;
        if (!Objects.equals(this.dni, other.dni)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Persona{" + "dni=" + dni + ", nombre=" + nombre + ", apellidos=" + apellidos + ", direccion=" + direccion + ", edad=" + edad + ", telefono=" + telefono + ", casada=" + casada + ", tieneTrabajo=" + tieneTrabajo + '}';
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public boolean isCasada() {
        return casada;
    }

    public void setCasada(boolean casada) {
        this.casada = casada;
    }

    public boolean isTieneTrabajo() {
        return tieneTrabajo;
    }

    public void setTieneTrabajo(boolean tieneTrabajo) {
        this.tieneTrabajo = tieneTrabajo;
    }
    
    
}
