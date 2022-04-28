package com.mycompany.u2.e32.buscaparejamagica;

public class BuscaParejaMagica {
    public static void main(String[] args) {
        
        for(int x=0;x<=9;x++){
            for(int y=0;y<=9;y++){
             if(x%2==0 && y%2 !=0 && (x+y)>6 && (x*y)<60){
                 System.out.println(x+""+y);
             }
            }
        }
        System.out.println("-----------------------");
    }
}
