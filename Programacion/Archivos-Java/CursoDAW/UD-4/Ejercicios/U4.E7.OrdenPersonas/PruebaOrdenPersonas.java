package es.tuespiral.u4.e7.ordenpersonas;

import java.util.*;

public class PruebaOrdenPersonas {
    public static void main(String[] args) {
        List lista = new ArrayList();
        lista.add(new Persona("Pedro", "34123874R", 23));
        lista.add(new Persona("Lucía", "52343874R", 44));
        lista.add(new Persona("Juan",  "34197374R", 30));
        lista.add(new Persona("Arturo","21543874R", 13));
        
        System.out.println(lista);
        Collections.sort(lista);
        System.out.println(lista);
    }
}
