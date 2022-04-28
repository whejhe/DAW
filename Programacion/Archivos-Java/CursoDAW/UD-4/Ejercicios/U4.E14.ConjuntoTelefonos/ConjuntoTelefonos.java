package es.tuespiral.u4.e14.conjuntotelefonos;

import java.util.*;

public class ConjuntoTelefonos {
    
    public static void main(String[] args) {
        Set prohibidos = new HashSet();
        Set permitidos = new HashSet();
        Scanner sc = new Scanner(System.in);
        int telefonoLeido;

        do {
            System.out.println("Dame un teléfono de los permitidos (0 o menor que cero para terminar): ");
            telefonoLeido = sc.nextInt();
            if (telefonoLeido > 0) {
                permitidos.add(telefonoLeido);
            }
        } while (telefonoLeido > 0);

        do {
            System.out.println("Dame un teléfono de los prohibidos (0 o menor que cero para terminar): ");
            telefonoLeido = sc.nextInt();
            if (telefonoLeido > 0) {
                prohibidos.add(telefonoLeido);
            }
        } while (telefonoLeido > 0);

        for(int i=1; i<=3;i++) {
            atiendeLlamada(permitidos, prohibidos);
        }

    }

    private static void atiendeLlamada(Set permitidos, Set prohibidos) {
        Scanner sc = new Scanner(System.in);
        int telefonoLeido;
        
        
        System.out.println("Dime el teléfono desde el que te llaman: ");
        telefonoLeido = sc.nextInt();
        if (permitidos.contains(telefonoLeido)) {
            System.out.println("El teléfono " + telefonoLeido + " está PERMITIDO y puedes atender la llamada");
        } else if (prohibidos.contains(telefonoLeido)) {
            System.out.println("El teléfono " + telefonoLeido + " está PROHIBIDO, cuelga");
        } else {
            System.out.println("El teléfono " + telefonoLeido + " no es un número conocido, haz lo que creas");
        }
    }
}
