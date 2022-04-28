package es.tuespiral.u4.pe.cursos;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class Curso {
    private String nombre;
    private int numPlazas;
    private boolean admiteSolicitudes;
    private List solicitantes;
    private Set admitidos, excluidos;

    public Curso(String nombre, int numPlazas) {
        this.nombre = nombre;
        this.numPlazas = numPlazas;
        admiteSolicitudes = true;
        solicitantes = new ArrayList();
        admitidos = new HashSet();
        excluidos = new HashSet();
    }
    
    public void agregaSolicitud(Alumno a) {
        if (admiteSolicitudes) {
            if(!solicitantes.contains(a)) {
                solicitantes.add(a);
            } else {
                System.out.println("Error: solicitud duplicada");
            }
        } else {
            System.out.println("El plazo de solicitud está cerrado");
        }
    }
    
    public void adjudicaPlazas() {
        admiteSolicitudes = false;
        Collections.sort(solicitantes);
        Iterator iter = solicitantes.iterator();
        int numPlazasAsignadas = 0;
        while(iter.hasNext()) {
            Alumno a = (Alumno) iter.next();
            if (numPlazasAsignadas < numPlazas) {
                admitidos.add(a);
            } else {
                excluidos.add(a);
            }
            numPlazasAsignadas++;
        }
    }
    
    public Set getAdmitidos() {
        return new HashSet(admitidos);
    }
    
    public Set getExcluidos() {
        return new HashSet(excluidos);
    }

    public String getNombre() {
        return nombre;
    }

    public int getNumPlazas() {
        return numPlazas;
    }
    
        
    
}
