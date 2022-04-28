package com.mycompany.u4.e12.operacionesconjuntos;

import java.util.*;

public class OperacionesConjuntos {

    public static void main(String[] args) {
        Set buscaPolicia = new HashSet();
        Set buscaGuardia = new HashSet();
        //Introducimos datos en buscaPolicia
        buscaPolicia.add("12345678A");
        buscaPolicia.add("12345678B");
        buscaPolicia.add("12345678C");
        buscaPolicia.add("12345678D");
        //Introducimos datos en buscaGuardia
        buscaGuardia.add("12345678E");
        buscaGuardia.add("12345678F");
        buscaGuardia.add("12345678G");
        buscaGuardia.add("12345678D");
        
        System.out.println("Buscados por la Policía");
        Iterator iter = buscaPolicia.iterator();
        while (iter.hasNext()) {
            String elem = (String) iter.next(); 
            System.out.println("Elemento: "+elem);
        }
        System.out.println("Buscados por la Guardia Civil");
        iter = buscaGuardia.iterator();
        while (iter.hasNext()) {
            String elem = (String) iter.next(); 
            System.out.println("Elemento: "+elem);
        }
        //Todos los dnis buscados por la Policía o por la Guardia Civil
        System.out.println("Creamos un nuevo conjunto con los buscados por la Policía y la Guardia Civil (unión)");
        Set buscaAlgo = new HashSet(buscaPolicia);
        buscaAlgo.addAll(buscaGuardia);
        System.out.println(buscaAlgo);
        //Todos los dnis buscados por la Policía y por la Guardia Civil
        System.out.println("Ahora creamos un nuevo conjunto con los buscados por la Policía y la Guardia Civil (intersección)");
        Set buscaAmbos = new HashSet(buscaPolicia);
        buscaAmbos.retainAll(buscaGuardia);
        System.out.println(buscaAmbos);
        
        //Todos los dnis buscados por la Policía, pero no por la Guardia Civil
        System.out.println("Ahora creamos un nuevo conjunto con los que busca la Policía pero no la Guardia Civil (diferencia)");
        Set buscaPoliNoGuardia = new HashSet(buscaPolicia);
        buscaPoliNoGuardia.removeAll(buscaGuardia);
        System.out.println(buscaPoliNoGuardia);
        
        //Todos los dnis buscados por la Guardia Civil, pero no por la Policía
        System.out.println("Ahora creamos un nuevo conjunto con los que busca la Guardia Civil pero no la Policía (diferencia)");
        Set buscaGuardiaNoPoli = new HashSet(buscaGuardia);
        buscaGuardiaNoPoli.removeAll(buscaPolicia);
        System.out.println(buscaGuardiaNoPoli);


    }
}
