package es.marca.futbol;

import es.marca.futbol.jugadores.Futbolista;

public class PruebaFutbolista {

    public static void main(String[] args) {
        Futbolista f = new Futbolista("aaaa","bbbbb");
        f.marcaGol();
        f.marcaGol(6);
        f.golAnulado();
        f.golAnulado();
        f.golAnulado(3);
        System.out.println("Num goles marcados "+f.getNumGoles());
    }
}
