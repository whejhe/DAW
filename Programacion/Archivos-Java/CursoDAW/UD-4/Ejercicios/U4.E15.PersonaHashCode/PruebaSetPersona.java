package es.tuespiral.u4.e15.personahashcode;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class PruebaSetPersona {
    public static void main(String[] args) {
        Persona p1 = new Persona("A", "José", "Bejines", "Calle Sol", 40, 956123544, true, true);
        Persona p2 = new Persona("A", "Pepe", "Bejines", "Calle Sol", 40, 956123544, true, true);
        Persona p3 = new Persona("B", "Ana", "Garrido", "Calle Luna", 38, 956125545, true, true);
        
        System.out.println(p1.hashCode());
        System.out.println(p2.hashCode());
        System.out.println(p3.hashCode());
        
        Set conjunto = new HashSet();
        conjunto.add(p1);
        conjunto.add(p2);
        conjunto.add(p3);
        
        Iterator iter = conjunto.iterator();
        while(iter.hasNext()) {
            System.out.println(iter.next());
        }
    }
}
