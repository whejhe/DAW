package com.mycompany.u3.e10.testdispositivos;

public final class TestDispositivos{
    public static void main(String[] args) {
        String Dispositivos[] = new String[5];
        
        Procesador p1 = new Procesador("intel", "i7");
        Procesador p2 = new Procesador("","");
        Memoria m1 = new Memoria("Kingston", "9100");
        Memoria m2 = new Memoria("Kingston", "8190");
        TarjetaVideo t1 = new TarjetaVideo("ati","radeon");
        
        Dispositivos[0]="Procesador 1: ";
        Dispositivos[1]="Procesador 2: ";
        Dispositivos[2]="Memoria 1: ";
        Dispositivos[3]="Memoria 2: ";
        Dispositivos[4]="Tarjeta de Video: ";
        
        int contador=0;
        
        for(int i=0;i<100;i++){
            System.out.print(Dispositivos[0]);
            p1.encender();
            System.out.print(Dispositivos[1]);
            p2.encender();
            System.out.print(Dispositivos[2]);
            m1.encender();
            System.out.print(Dispositivos[3]);
            m2.encender();
            System.out.print(Dispositivos[4]);
            t1.encender();
            System.out.print(Dispositivos[0]);
            p1.apagar();
            System.out.print(Dispositivos[1]);
            p2.apagar();
            System.out.print(Dispositivos[2]);
            m1.apagar();
            System.out.print(Dispositivos[3]);
            m2.apagar();
            System.out.print(Dispositivos[4]);
            t1.apagar();
        }
        
    }

}
