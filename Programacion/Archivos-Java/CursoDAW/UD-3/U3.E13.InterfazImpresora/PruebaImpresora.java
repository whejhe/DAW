
package com.mycompany.u3.e13.interfazimpresora;

public class PruebaImpresora {
    public static void main(String[] args) {
        InterfazDocumento doc1 = new Documento();
        InterfazDocumento doc2 = new Documento();
        InterfazImpresora imp = new Impresora("HP", "Laserjet 2000");
        
        doc1.setTitulo("Teorema de Pitágoras");
        doc1.setContenido("La hipotenusa es igual a la suma...");
        doc1.setNumPaginasImpresion(4);
        
        doc2.setTitulo("Otro teorema de Pitágoras");
        doc2.setContenido("La otra cosa importante que dijera Pitágoras...");
        doc2.setNumPaginasImpresion(3);
        
        imp.cargarBandeja(3);
        System.out.println("El estado es: "+imp.getEstado());
        imp.imprimir(doc1);
        imp.encender();
        System.out.println("El estado es: "+imp.getEstado());
        imp.imprimir(doc1);
        System.out.println("El estado es: "+imp.getEstado());
        imp.cargarBandeja(5);
        imp.imprimir(doc1);
        System.out.println("El estado es: "+imp.getEstado());
        imp.imprimir(doc2);
        System.out.println("El estado es: "+imp.getEstado());
        imp.apagar();
        System.out.println("El estado es: "+imp.getEstado());
    }
    
}
