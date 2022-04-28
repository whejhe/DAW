package com.mycompany.constructores;

public class Jefatura extends Empleado {
    
    public Jefatura(String nom,double sue,int agno,int mes,int dia){
       
        super(nom, sue, agno, mes, dia);
    
    }
    
    private double incentivo;
    
    public void estableceIncentivo(double b){
        incentivo=b;
    }
    
    public double getSueldo(){//getter
        double sueldoJefe=super.getSueldo();
        return sueldoJefe + incentivo;
    }
    
}

