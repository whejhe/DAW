
package com.mycompany.u4.e11.pruebaconjuntos;
import java.util.*;
public class PruebaConjuntos {
    public static void main(String[] args) {
        // CREACIÓN DE UN CONJUNTO
        Set candidatos = new HashSet();
        // AÑADIMOS ELEMENTOS AL CONJUNTO
        candidatos.add("Juan");
        candidatos.add("Ana");
        candidatos.add("Pedro");
        candidatos.add("Rosa");
        candidatos.add("María");
        
        // Imprimir conjunto
        System.out.println("El conjunto no conserva el orden de inserción de los elementos: ");
        System.out.println(candidatos);
        
        // CONSULTAMOS EL CONJUNTO PARA AVERIGUAR CIERTA INFORMACIÓN
        System.out.println("\nAHORA LE HACEMOS PREGUNTAS AL CONJUNTO");
        System.out.println("¿El conjunto está vacío?: "+candidatos.isEmpty());
        System.out.println("¿Cuántos elementos hay en el conjunto?: "+candidatos.size()+" elementos");
        System.out.print("Nos preguntamos si el conjunto contiene el elemento 'Pedro': ");
        if (candidatos.contains("Pedro")) 
            System.out.println("Sí, lo contiene");
        else
            System.out.println("No, no lo contiene");
        
        // RECORRIDO DE UN CONJUNTO HACIENDO USO DE UN ITERADOR
        System.out.println("\nTAMBIÉN PODEMOS RECORRER UN CONJUNTO CON UN ITERADOR");
        Iterator iter = candidatos.iterator();
        while (iter.hasNext()) {
            String elem = (String) iter.next(); 
            System.out.println("Elemento: "+elem);
        }
        //REALIZAMOS LA SELECCIÓN
        System.out.println("Seleccionamos los que contengan la a");
        Set seleccionados = new HashSet();
        iter = candidatos.iterator();
        while (iter.hasNext()) {
            String elem = (String) iter.next(); 
            if(elem.contains("a"))
                seleccionados.add(elem);
        }
        
        //MOSTRAMOS LOS SELCCIONADOS
        System.out.println("Mostramos los seleccionados");
        
        iter = seleccionados.iterator();
        while (iter.hasNext()) {
            String elem = (String) iter.next(); 
            System.out.println("Elemento: "+elem);
        }
    }
    
}
