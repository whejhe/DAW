package com.mycompany.arraysanidadas;

public class ArrayAnidada2 {
    public static void main(String[] args) {
        int [][] miArray={
            {10,15,18,19,21},
            {22,25,28,29,31},
            {30,35,38,39,41},
            {40,45,48,49,51}
        };
        
        for(int[]fila:miArray){
            System.out.println();
            for(int z:fila){
                System.out.println(z+" ");
            }
        }
    }
}
