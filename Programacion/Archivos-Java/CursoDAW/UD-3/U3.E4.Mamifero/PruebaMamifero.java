package com.mycompany.u3.e4.mamifero;

public class PruebaMamifero {

    public static void main(String[] args) {
        Mamifero m = new Mamifero();
        Felino f = new Felino();
        Canido c = new Canido();
        Gato g = new Gato();
        Tigre t = new Tigre();
        Perro p = new Perro();
        
        m.hacerRuido();
        f.hacerRuido();
        c.hacerRuido();
        g.hacerRuido();
        t.hacerRuido();
        p.hacerRuido();
    }

}
