package com.mycompany.u3.e13.interfazimpresora;

public interface InterfazDocumento {

    String getTitulo();

    void setTitulo(String titulo);

    String getContenido();

    void setContenido(String contenido);

    int getNumPaginasImpresion();

    void setNumPaginasImpresion(int numPaginas);
}
