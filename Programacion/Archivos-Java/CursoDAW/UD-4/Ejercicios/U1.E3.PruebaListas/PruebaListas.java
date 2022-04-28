package es.tuespiral.u1.e3.pruebalistas;

import java.util.*;

public class PruebaListas {
    public static void main(String[] args) {
        List meses = new ArrayList();
        
        meses.add("Enero");
        meses.add("Febrero");
        meses.add("Marzo");
        meses.add("Abril");
        meses.add("Mayo");
        meses.add("Junio");
        meses.add("Julio");
        meses.add("Agosto");
        meses.add("Septiembre");
        meses.add("Octubre");
        meses.add("Noviembre");
        meses.add("Diciembre");
        
        System.out.println("Lista vacía: "+meses.isEmpty());
        System.out.println("Número de elementos: "+meses.size());
        System.out.println("Contiene Henero: "+meses.contains("Henero"));
        
        System.out.println("---------------");
        Iterator iter = meses.iterator();
        while(iter.hasNext()) {
            System.out.println(iter.next());
        }
        
        System.out.println("---------------");
        Collections.sort(meses);
        iter = meses.iterator();
        while(iter.hasNext()) {
            String elem = (String) iter.next();
            System.out.println(elem);
        }
        
        System.out.println("---------------");
        meses.clear();
        iter = meses.iterator();
        while(iter.hasNext()) {
            System.out.println(iter.next());
        }
    }
}
