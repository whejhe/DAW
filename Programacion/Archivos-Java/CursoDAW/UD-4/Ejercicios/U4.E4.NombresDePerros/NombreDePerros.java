package es.tuespiral.u4.e4.nombresdeperros;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

public class NombreDePerros {
    public static void main(String[] args) {

//• A continuación, escribiremos en pantalla: “Actualmente conozco X nombres para perros.
//Te los digo: ” y se imprimirán los nombres de la lista, uno debajo de otro, recorriéndola
//mediante un iterador.
        Scanner sc = new Scanner(System.in);
        String nombreNuevo;
        List nombres = new ArrayList();
        nombres.add("Toby");
        nombres.add("Rocky");
        nombres.add("Max");
        nombres.add("Pancho");
        nombres.add("Coco");
        nombres.add("Chispa");
        
        System.out.println("Actualmente conozco "+nombres.size()+" nombres para perros. Te los digo:");
        imprimeNombres(nombres);
        System.out.println("-----------");
        System.out.println("También te los puedo decir en orden alfabético:");
        
        Collections.sort(nombres);
        imprimeNombres(nombres);
        
        System.out.println("Dime más nombres de perros y escribe FIN para acabar");
        
        do {
            System.out.println("Dime un nombre: ");
            nombreNuevo = sc.nextLine();
            
            if (nombreNuevo.equalsIgnoreCase("FIN") == false) {
                nombres.add(nombreNuevo);
            }
        } while(!nombreNuevo.equalsIgnoreCase("FIN"));
        
        System.out.println("Gracias. Ahora conozco "+nombres.size()+" nombres de perros. Te los digo en orden");
        Collections.sort(nombres);
        imprimeNombres(nombres);
    }

    private static void imprimeNombres(List nombres) {
        Iterator iter = nombres.iterator();
        int i = 1;
        while(iter.hasNext()) {
            String elem = (String) iter.next();
            System.out.println(i+"-"+elem);
            i++;
        }
    }
}
