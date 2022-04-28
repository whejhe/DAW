package com.mycompany.u2.e38.traducciones;

public class PruebaTraduccion {
    public static void main(String[] args) {
        Traduccion[] t = new Traduccion[5];
        
        t[0]=new Traduccion();
        t[0].setIngles("to break down");
        t[0].setEspañol("Averiar");
        
        t[1]=new Traduccion();
        t[1].setIngles("to fix");
        t[1].setEspañol("Arreglar");
        
        t[2]=new Traduccion();
        t[2].setIngles("to reboot");
        t[2].setEspañol("Reiniciar");
        
        t[3]=new Traduccion();
        t[3].setIngles("to work");
        t[3].setEspañol("Funcionar");
        
        t[4]=new Traduccion();
        t[4].setIngles("to type");
        t[4].setEspañol("Teclear");
        
        for(Traduccion elem:t){
            System.out.println(elem.getIngles()+" en español se traduce por "+elem.getEspañol());
        }
    }
}
