package es.tuespiral.u4.pe.cursos;

import java.util.HashSet;
import java.util.Set;

public class PruebaCursos {
    public static void main(String[] args) {
        Curso c1 = new Curso("Curso 1", 3);
        Curso c2 = new Curso("Curso 2", 4);
        
        Alumno a = new Alumno("A", 23, 10);
        c1.agregaSolicitud(a);
        
        a = new Alumno("B", 26, 8);
        c1.agregaSolicitud(a);

        a = new Alumno("C", 23, 5);
        c1.agregaSolicitud(a);
        c2.agregaSolicitud(a);
        
        a = new Alumno("D", 19, 6);
        c1.agregaSolicitud(a);
        c2.agregaSolicitud(a);
        
        a = new Alumno("E", 21, 6);
        c1.agregaSolicitud(a);
        
        a = new Alumno("F", 31, 6);
        c1.agregaSolicitud(a);
        c2.agregaSolicitud(a);
        
        a = new Alumno("G", 24, 5);
        c2.agregaSolicitud(a);
        c2.agregaSolicitud(a);
        
        a = new Alumno("H", 35, 9);
        c2.agregaSolicitud(a);
        c2.agregaSolicitud(a);
        
        c1.adjudicaPlazas();
        c2.adjudicaPlazas();
        
        Set admitidosC1 = c1.getAdmitidos();
        Set admitidosC2 = c2.getAdmitidos();
        
        System.out.println("Admitidos en el curso "+c1.getNombre());
        System.out.println(admitidosC1);
        System.out.println("Admitidos en el curso "+c2.getNombre());
        System.out.println(admitidosC2);
        
        System.out.println("Admitidos en ambos cursos simultaneamente");
        Set admitidosEnAmbos = new HashSet(admitidosC1);
        admitidosEnAmbos.retainAll(admitidosC2);
        System.out.println(admitidosEnAmbos);
        
        
    }
}
