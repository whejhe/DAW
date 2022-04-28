package com.mycompany.constructores;

import java.util.Date;
import java.util.GregorianCalendar;

public class Empleado {
    private String nombre;
    private double sueldo;
    private Date altaContrato;
    
    public Empleado(String nom,double sue,int agno,int mes,int dia){
        nombre=nom;
        sueldo=sue;
        GregorianCalendar calendario = new GregorianCalendar(agno,mes-1,dia);
        altaContrato=calendario.getTime();
        
    }

    public String getNombre() {
        return nombre;
    }

    public double getSueldo() {
        return sueldo;
    }
    
    public Date getAltaContrato(){
        return altaContrato;
    }

    public void subeSueldo(double porcentaje){//setter
        double aumento=sueldo*porcentaje/100;
        sueldo+=aumento;//sumamos el aumento al sueldo
    }
    
}
