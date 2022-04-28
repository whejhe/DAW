
package com.mycompany.arraysyforeach;

import javax.swing.JOptionPane;

public class UsoArrays {
    public static void main(String[] args) {
        
        int[] miArray = new int[5];
        //int miArray[] = new int[5];
        
        miArray[0]=5;
        miArray[1]=38;
        miArray[2]=15;
        miArray[3]=92;
        miArray[4]=71;
        
        System.out.println(miArray[3]);//Imprime la posicion 3
        
        for(int i=0;i<5;i++){
            System.out.println("Valor del indice: "+miArray[i]+" en la posicion "+i);
            
        }
        /*--------------------------------------------------------------------*/
        int [] miArray2 = {7,49,40,20,30};
        
        for(int j=0;j<miArray2.length;j++){
            System.out.println("Valor del indice: "+miArray[j]+" en la posicion "+j);
        }
        
        /*----------------------------------------------------------------------*/
        String [] paises = new String[8];
        
        paises[0] = "España";
        paises[1] = "Mexico";
        paises[2] = "Colombia";
        paises[3] = "Peru";
        paises[4] = "Chile";
        paises[5] = "Argentina";
        paises[6] = "Ecuador";
        paises[7] = "Venezuela";
        
        //String[] paises={"España","Venezuela""...."};
        
        /*for(int k=0; k<paises.length;k++){
            System.out.println("Pais "+(k+1)+paises[k]);
        }*/
        for(int i=0;i<8;i++){
            paises[i]=JOptionPane.showInputDialog("Introduce pais "+(i+1));
        }
        
        for(String k:paises){
            System.out.println(k);
        }
        
        /*------------------------------------------------------------------*/
        int[] aleatorio = new int[150];
        
        for(int i=0;i<aleatorio.length;i++){
            aleatorio[i]=(int)Math.round(Math.random()*100);//numeros aleatorios entre 0 y 100
        }
        
        for(int numeros:aleatorio){
            System.out.print(numeros +" ");
        }
        
        
    }
}
