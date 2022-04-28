package es.tuespiral.u4.e13.loteria;

import java.util.*;

public class ConjuntosLoteria {
    public static void main(String[] args) {
        Set numeros = new HashSet();
        int numVendido, elGordo;
        Scanner sc = new Scanner(System.in);
        
        do {
            System.out.println("Dime qué número ha vendido la lotería Doña Paquita (-1 para terminar): ");
            numVendido = sc.nextInt();
            if (numVendido != -1) {
                numeros.add(numVendido);
            }
            
        } while (numVendido != -1);
        
        System.out.println("Dime el número premiado con el Gordo: ");
        elGordo = sc.nextInt();
        
        if (numeros.contains(elGordo)) {
            System.out.println("¡Tomá! Hemos vendido el Gordo");
        } else {
            System.out.println("¡Vaya! No hemos vendido el Gordo, el año que viene será");
        }
        
    }
}
