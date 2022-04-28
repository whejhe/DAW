package com.mycompany.u2.e15.rima;
import java.util.Scanner;

public class PruebaRima {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Rima r = new Rima();
        
        System.out.println("Dime un numero entre 1 y 5");
        r.setNumero(sc.nextInt());
        
        switch(r.getNumero()){
            case 1:
                System.out.println("Algo que rime con 1");
                break;
            case 2:
                System.out.println("Algo que rime con 2");
                break;
            case 3:
                System.out.println("Algo que rime con 3");
                break;
            case 4:
                System.out.println("Algo que rime con 4");
                break;
            case 5:
                System.out.println("Algo que rime con 5");
                break;
            default:
                System.out.println("No conozco ninguna rimacon ese numero");
        }         
    }
}
