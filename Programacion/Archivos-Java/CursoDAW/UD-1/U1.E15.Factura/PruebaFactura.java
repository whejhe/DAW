package com.mycompany.u1.e15.factura;
import java.util.Scanner;

public class PruebaFactura {
    public static void main(String[] args) {
        final int IVA = 21;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Dime el precio de un pen-drive");
        double precio = sc.nextDouble();
        
        System.out.println("Dime el número de pen-drives que quieres comprar");
        int numPen = sc.nextInt();
        
        double resultadoSinIva=precio*numPen;
        double resultadoConIva=(resultadoSinIva)+((resultadoSinIva)/100)*IVA;
        
        System.out.println("FACTURA JAMAZON");
        System.out.println("Precio unitario: "+precio+"€");
        System.out.println("Número artículos: "+numPen);
        System.out.println("Subtotal: "+resultadoSinIva);
        System.out.println("---------------------------");
        System.out.println("Total(IVA incluido): "+resultadoConIva);
    }
}
