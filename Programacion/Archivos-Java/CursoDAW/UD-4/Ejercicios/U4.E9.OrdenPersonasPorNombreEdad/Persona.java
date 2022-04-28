package es.tuespiral.u4.e7.ordenpersonas;

public class Persona implements Comparable{
    private String nombre;
    private String dni;
    private int edad;


    public Persona(String nombre, String dni, int edad) {
        this.nombre = nombre;
        this.dni = dni;
        this.edad = edad;
    }

    @Override
    public int compareTo(Object o) {
        // Por nombre ascendente y edad descendente
        Persona p = (Persona) o;
        int result =  nombre.compareTo(p.getNombre());
        if (result == 0) {
            result = -(edad - p.getEdad());
        }
        return result;
    }
    

    
    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", dni=" + dni + ", edad=" + edad + '}';
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
}
