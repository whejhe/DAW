package es.tuespiral.u4.e6.filtrandolistas;

import java.util.*;

public class FiltrandoListas {
    public static void main(String[] args) {
        List lista = new ArrayList();
        
        lista.add("Vertical");
        lista.add("Horizontal");
        lista.add("Izquierda");
        lista.add("Derecha");
        lista.add("Adelante");
        lista.add("Atrás");
        lista.add("Curvo");
        lista.add("Recto");
        lista.add("Arriba");
        lista.add("Abajo");
        
        Collections.sort(lista);
        System.out.println(lista);
        
        System.out.println("Quitamos las palabras con 'o'");
        Iterator iter = lista.iterator();
        while(iter.hasNext()) {
            String elem = (String) iter.next();
            if (elem.contains("o")) {
                iter.remove();
            }
        }
        System.out.println(lista);
        
        System.out.println("Quitamos las palabras con 't'");
        iter = lista.iterator();
        while(iter.hasNext()) {
            String elem = (String) iter.next();
            if (elem.contains("t")) {
                iter.remove();
            }
        }
        System.out.println(lista);
        
        System.out.println("Quitamos las palabras con 'a' y más de 5 letras");
        iter = lista.iterator();
        while(iter.hasNext()) {
            String elem = (String) iter.next();
            if (elem.contains("a") && elem.length() > 5) {
                iter.remove();
            }
        }
        System.out.println(lista);
    }
}
