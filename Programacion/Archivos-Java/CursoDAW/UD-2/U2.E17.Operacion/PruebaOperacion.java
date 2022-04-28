package com.mycompany.u2.e17.operacion;
import java.util.Scanner;

public class PruebaOperacion {
    public static void main(String[] args) {
        Operacion o = new Operacion();
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Dime un numero entero");
        o.setNumero1(sc.nextInt());
        
        System.out.println("Dime un segundo numero entero");
        o.setNumero2(sc.nextInt());
        
        System.out.println("Que operacion quieres realizar");
        System.out.println("+");
        System.out.println("-");
        System.out.println("*");
        System.out.println("/");
        System.out.println("Escoge una: ");
        
        sc.nextLine();
        o.setOperacion(sc.nextLine());
        
        switch(o.getOperacion()){
            case "+":
                double suma = o.getNumero1()+o.getNumero2();
                System.out.println("La suma de "+o.getNumero1()+" y "+o.getNumero2()+" es: "+suma);
                break;
            case "-":
                double resta = o.getNumero1()-o.getNumero2();
                System.out.println("La resta de "+o.getNumero1()+" y "+o.getNumero2()+" es: "+resta);
                break;
            case "*":
                double multi = o.getNumero1()*o.getNumero2();
                System.out.println("La multiplicacion de "+o.getNumero1()+" y "+o.getNumero2()+" da como resultado: "+multi);
                break;
            case "/":
                double division =o.getNumero1()/o.getNumero2();
                System.out.println("La division de "+o.getNumero1()+" entre "+o.getNumero2()+" da como resultado: "+division);
                break;
            default:
                System.out.println("Opcion incorrecta");
        }
    }
}
