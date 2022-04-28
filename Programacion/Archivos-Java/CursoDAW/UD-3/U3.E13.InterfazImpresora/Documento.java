
package com.mycompany.u3.e13.interfazimpresora;

public class Documento implements InterfazDocumento{
    private String titulo;
    private String contenido;
    private int numPaginas;
    @Override
    public String getTitulo() {
        return titulo;
    }

    @Override
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    @Override
    public String getContenido() {
        return contenido;
    }

    @Override
    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    @Override
    public int getNumPaginasImpresion() {
        return numPaginas;
    }

    @Override
    public void setNumPaginasImpresion(int numPaginas) {
        this.numPaginas = numPaginas;
    }
    
}
