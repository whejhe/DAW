package com.mycompany.u2.e37.num_tiradas;

public class numTiradas {
    public static void main(String[] args) {
        final int NumTiradas = 50;
        int tiradas[]=new int[NumTiradas];
        
        for(int i=0;i<tiradas.length;i++){
            tiradas[i] = (int)(Math.random()*6+1);    
        }
        
        int uno,dos,tres,cuatro,cinco,seis;
        uno=dos=tres=cuatro=cinco=seis=0;
        
        for(int i=0;i<tiradas.length;i++){
            switch(tiradas[i]){
                case 1:
                    uno++;
                    break;
                case 2:
                    dos++;
                    break;
                case 3:
                    tres++;
                    break;
                case 4:
                    cuatro++;
                    break;
                case 5:
                    cinco++;
                    break;
                case 6:
                    seis++;
                    break;
            }
        }
        System.out.println("El numero 1 ha salido "+uno+" veces");
        System.out.println("El numero 2 ha salido "+dos+" veces");
        System.out.println("El numero 3 ha salido "+tres+" veces");
        System.out.println("El numero 4 ha salido "+cuatro+" veces");
        System.out.println("El numero 5 ha salido "+cinco+" veces");
        System.out.println("El numero 6 ha salido "+seis+" veces");
    }
    
}
