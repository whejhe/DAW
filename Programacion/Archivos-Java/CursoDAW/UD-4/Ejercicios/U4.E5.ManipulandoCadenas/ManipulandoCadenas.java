package es.tuespiral.u4.e5.manipulandocadenas;

import java.util.*;

public class ManipulandoCadenas {

    public static void main(String[] args) {
        List cadenas = new ArrayList();
        cadenas.add("Vertical");
        cadenas.add("Horizontal");
        cadenas.add("Izquierda");
        cadenas.add("Derecha");
        cadenas.add("Adelante");
        cadenas.add("Atrás");
        cadenas.add("Curvo");
        cadenas.add("Recto");
        cadenas.add("Arriba");
        cadenas.add("Abajo");

        Iterator iter = cadenas.iterator();
        while (iter.hasNext()) {
            String elem = (String) iter.next();
            System.out.println(elem.toUpperCase());
        }

        System.out.println("--------------");
        Collections.sort(cadenas);
        iter = cadenas.iterator();
        while (iter.hasNext()) {
            String elem = (String) iter.next();
            System.out.println(elem);
        }

        System.out.println("--------------");
        iter = cadenas.iterator();
        while (iter.hasNext()) {
            String elem = (String) iter.next();
            if (elem.startsWith("A")) {
                System.out.println(elem);
            }
        }

        System.out.println("--------------");
        iter = cadenas.iterator();
        while (iter.hasNext()) {
            String elem = (String) iter.next();
            if (elem.endsWith("o")) {
                System.out.println(elem);
            }
        }

        System.out.println("--------------");
        iter = cadenas.iterator();
        while (iter.hasNext()) {
            String elem = (String) iter.next();
            if (elem.contains("e")) {
                System.out.println(elem);
            }
        }

        System.out.println("--------------");
        iter = cadenas.iterator();
        while (iter.hasNext()) {
            String elem = (String) iter.next();
            if (elem.length() == 5) {
                System.out.println(elem);
            }
        }

        System.out.println("--------------");
        iter = cadenas.iterator();
        while (iter.hasNext()) {
            String elem = (String) iter.next();
            if (elem.length() > 5 && elem.startsWith("A")) {
                System.out.println(elem);
            }
        }
    }

}

