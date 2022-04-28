package com.mycompany.arraysanidadas;

public class ArrayAnidada {
    public static void main(String[] args) {
        
        int [][] miArray = new int[4][5];//4 elementos en la primera posicion y 5 en la segunda
        
        miArray[0][0]=15;
        miArray[0][1]=25;
        miArray[0][2]=35;
        miArray[0][3]=45;
        miArray[0][4]=55;
        
        miArray[1][0]=65;
        miArray[1][1]=75;
        miArray[1][2]=85;
        miArray[1][3]=95;
        miArray[1][4]=05;
        
        miArray[2][0]=01;
        miArray[2][1]=02;
        miArray[2][2]=03;
        miArray[2][3]=04;
        miArray[2][4]=05;
        
        miArray[3][0]=21;
        miArray[3][1]=22;
        miArray[3][2]=23;
        miArray[3][3]=24;
        miArray[3][4]=25;
        
        System.out.println("Valor almacenado en posicion 2:3 "+miArray[2][3]);
        
        for(int i=0;i<4;i++){//primera posicion
            System.out.println();
            for(int j=0;j<5;j++){//segunda posicion
                System.out.print(miArray[i][j]+"-");
            }
        }
    }
}
