package es.tuespiral.u4.e16.biblioteca;

import java.util.ArrayList;
import java.util.List;

public class Recurso {
    private final long isbn;
    private String titulo;
    private List autores;
    private int numEjemplares;

    public Recurso(long isbn, String titulo, List autores, int numEjemplares) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.autores = new ArrayList(autores);
        this.numEjemplares = numEjemplares;
    }
    
    // No lo pide el enunciado pero nos ayudaría a escribir el main
    public Recurso(long isbn, String titulo, Autor autor, int numEjemplares) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.autores = new ArrayList();
        autores.add(autor);
        this.numEjemplares = numEjemplares;
    }

    @Override
    public String toString() {
        return "Recurso{" + "isbn=" + isbn + ", titulo=" + titulo + ", autores=" + autores + ", numEjemplares=" + numEjemplares + '}';
    }

    public long getIsbn() {
        return isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public List getAutores() {
        return autores;
    }

    public void setAutores(List autores) {
        this.autores = autores;
    }

    public int getNumEjemplares() {
        return numEjemplares;
    }

    public void setNumEjemplares(int numEjemplares) {
        this.numEjemplares = numEjemplares;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 79 * hash + (int) (this.isbn ^ (this.isbn >>> 32));
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Recurso other = (Recurso) obj;
        if (this.isbn != other.isbn) {
            return false;
        }
        return true;
    }

    
    
}
