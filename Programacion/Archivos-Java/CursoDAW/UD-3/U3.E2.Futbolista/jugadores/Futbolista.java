package es.marca.futbol.jugadores;

public class Futbolista {

    private String nombre, apellidos;
    private int numGoles;
    private double salario;
    private boolean lesionado;
    
    public Futbolista(String nombre, String apellidos){
        this.nombre=nombre;
        this.apellidos=apellidos;
    
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

    public int getNumGoles() {
        return numGoles;
    }

    public void setNumGoles(int numGoles) {
        this.numGoles = numGoles;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public boolean isLesionado() {
        return lesionado;
    }
    public void marcaGol(){
        numGoles++;
    }
    public void marcaGol(int numGolesMarcados) {
        numGoles += numGolesMarcados;
    }

    public void golAnulado() {
        if(numGoles==0){
            System.out.println("Error: no se puede anular el gol");
        }
        else{
            numGoles--;
        }
    }
    public void golAnulado(int numGoles){
        if(this.numGoles - numGoles < 0)
            System.out.println("Error: no se pueden anular numGoles goles");
        else
            this.numGoles -=numGoles;
    
    }

    public void seLesiona() {
        lesionado = true;
    }

    public void seRecupera() {
        lesionado = false;
    }

}
