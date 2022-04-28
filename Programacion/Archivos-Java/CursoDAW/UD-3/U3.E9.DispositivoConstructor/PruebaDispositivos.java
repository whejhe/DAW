package com.mycompany.u3.e9.dispositivoconstructor;

public class PruebaDispositivos {
    public static void main(String[] args) {
        Procesador p = new Procesador("intel", "i7");
        Memoria m = new Memoria("Kingston", "9100");
        TarjetaVideo t = new TarjetaVideo("ati","radeon");
        
        p.encender();
        System.out.println("La suma de 2+3 es "+p.suma(2, 3));
        System.out.println("La resta de 2-3 es "+p.resta(2, 3));
        System.out.println("La multiplicación de 2*3 es "+p.multiplica(2, 3));
        System.out.println("La division de 2/3 es "+p.divide(2, 3));
       // p.apagar();
        System.out.println("");
        
        m.encender();
        System.out.println("Ponemos un 10 en la posición 50");
        m.setElemPos(50, 10);
        System.out.println("Mostramos el elemento de la posición 50: "+m.getElemPos(50));
       // m.apagar();
        System.out.println("");

        t.encender();
        System.out.println("Mostramos un entero y un texto con la tarjeta de vídeo");
        t.muestraEntero(80);
        t.muestraTexto("Texto de ejemplo");
        //t.apagar();
        
        //Inicializamos marca y modelo para los tres dispositivos
        p.setMarca("Intel");
        p.setModelo("i5");
        m.setMarca("CoreSARI");
        m.setModelo("Venganza");
        t.setMarca("Envidia");
        t.setModelo("3080");
        System.out.println("");
        System.out.println("Promamos toString del ejercicio 6");
        System.out.println("ToString de procesador: "+p.toString());
        System.out.println("ToString de memoria: "+m);//m.toString()
        System.out.println("ToString de tarjeta: "+t.toString());
    }
}
