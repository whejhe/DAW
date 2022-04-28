package com.mycompany.u2.e28.paresdescendientes;
import java.util.Scanner;

public class ParesDescendientes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Introduce un numero entre 0 y 100");
        int num = sc.nextInt();
        
        while(num<0 || num>100){
            System.out.println("Vuelve a intentarlo");
            num = sc.nextInt();
        }
        while(num>=0){
            if(num%2==0){
                System.out.println(num);
            }
            num--;
        }
    }
}
