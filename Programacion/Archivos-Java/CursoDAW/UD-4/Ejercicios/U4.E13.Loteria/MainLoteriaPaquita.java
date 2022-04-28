package es.tuespiral.u4.e13.loteria;

import java.util.Scanner;

public class MainLoteriaPaquita {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numVendido, elGordo;
        LoteriaPaquita lot = new LoteriaPaquita();
        
        do {
            System.out.println("Dime qué número ha vendido la lotería Doña Paquita (-1 para terminar): ");
            numVendido = sc.nextInt();
            if (numVendido != -1) {
                lot.venderNumero(numVendido);
            }
        } while (numVendido != -1);
        
        System.out.println("Dime el número premiado con el Gordo:");
        elGordo = sc.nextInt();
        
        if (lot.isGordoVendido(elGordo)) {
            System.out.println("¡Tomá! Hemos vendido el Gordo");
        } else {
            System.out.println("¡Vaya! No hemos vendido el Gordo, el año que viene será");
        }
    }
}
