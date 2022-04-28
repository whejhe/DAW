package es.tuespiral.u4.pe.cursos;

import java.util.Objects;

public class Alumno implements Comparable{
    private String dni;
    private int edad;
    private int notaAcceso;

    public Alumno(String dni, int edad, int notaAcceso) {
        this.dni = dni;
        this.edad = edad;
        this.notaAcceso = notaAcceso;
    }

    public String getDni() {
        return dni;
    }

    public int getEdad() {
        return edad;
    }

    public int getNotaAcceso() {
        return notaAcceso;
    }

    @Override
    public int compareTo(Object o) {
        Alumno alum = (Alumno) o;
        int result = -(notaAcceso - alum.notaAcceso);
        if (result == 0) {
            result = edad - alum.edad;
        }
        return result;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 23 * hash + Objects.hashCode(this.dni);
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
        final Alumno other = (Alumno) obj;
        if (!Objects.equals(this.dni, other.dni)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Alumno{" + "dni=" + dni + ", edad=" + edad + ", notaAcceso=" + notaAcceso + '}';
    }
    
    
}
