package com.mycompany.u2.validaentrada;
import java.util.Scanner;

public class PruebaValidaEntrada {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ValidaEntrada v = new ValidaEntrada();
        
        System.out.println("Introduce un numero entero mayor que 0");
        v.setMayorCero(sc.nextInt());
        
        while(v.getMayorCero()<=0){
            System.out.println("El número debe ser mayor que cero");
            System.out.println("Intentalo otra vez:");
            v.setMayorCero(sc.nextInt());
        }
        
        System.out.println("Ahora dime un numero entero menor o igual a Cero");
        v.setMenorIgualCero(sc.nextInt());
        
        while(v.getMenorIgualCero()>0){
            System.out.println("El número debe ser menor o igual a cero");
            System.out.println("Intentalo otra vez:");
            v.setMenorIgualCero(sc.nextInt());
        }
        
        System.out.println("Ahora introduce un numero real entre 1.3 y 19.8");
        v.setRealRango(sc.nextDouble());
        
        while(v.getRealRango()<1.3 || v.getRealRango()>19.8){
            System.out.println("El número debe ser estar comprendido entre 1.3 y 19.8");
            System.out.println("Intentalo otra vez");
            v.setRealRango(sc.nextDouble());
        }
        
        System.out.println("Por ultimo dime con S o N si te gusto este programa");
        v.setSiNo(sc.nextLine());
        String respuesta = sc.nextLine();
        while(!(respuesta.equals("S") || respuesta.equals("N"))){
            System.out.println("El carácter solo puede ser S o N");
            System.out.println("Intentalo otra vez");
            v.setSiNo(sc.nextLine());
        }
        
        System.out.println("Tus respuestas han sido: "+v.getMayorCero()+" , "+v.getMenorIgualCero()+" , "+v.getRealRango()+" , "+respuesta+".");
    }
}
