package com.mycompany.modulocoche;

public class UsoVehiculo {
    public static void main(String[] args) {
        /*coche Renault = new coche();
        
        Renault.setAncho(300);
        Renault.setRueda(4);
        Renault.setLargo(2000);
        Renault.setMotor(1600);
        Renault.setPeso(500);
        Renault.setColor("Azul");
        
        System.out.println("El coche tiene "+Renault.getRueda()+" ruedas");
        System.out.println("El coche es "+Renault.getColor());*/
        
        coche miCoche1=new coche();
        
        miCoche1.setColor("Rojo");
        
        Furgoneta miFurgoneta1=new Furgoneta(7,580);//7 plazas y capacidad de carga 580
        
        miFurgoneta1.setColor("Azul");
        
        System.out.println("La Furgoneta es: "+miFurgoneta1.getColor());
    }
}
