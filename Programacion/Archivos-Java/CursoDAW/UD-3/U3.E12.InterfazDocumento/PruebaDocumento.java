
package com.mycompany.u3.e12.interfazdocumento;

public class PruebaDocumento {
    public static void main(String[] args) {
        Documento doc1 = new Documento();
        doc1.setTitulo("Teorema de Pitágoras");
        doc1.setContenido("La hipotenusa es igual a la suma...");
        doc1.setNumPaginasImpresion(4);
        
        System.out.println("El título es: "+doc1.getTitulo());
        System.out.println("El contenido es: "+doc1.getContenido());
        System.out.println("El número de páginas de impresión es: "+doc1.getNumPaginasImpresion());
    }
    
}
