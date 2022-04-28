package com.mycompany.u2.e33.buscatriomagico;

public class BuscaTrioMagico {
    public static void main(String[] args) {
        
        for(int x=0;x<=9;x++){
            for(int y=0;y<=9;y++){
                for(int z=0;z<=9;z++){
                    if(x%2==0 && y%2!=0 && z%2==0 && (x+y+z)>10 && (x*y*z)<90){
                        System.out.println(x+""+y+""+z);
                    }
                }
            }
        }
    }
}
