package es.tuespiral.u3.e5.dispositivos;

public class TarjetaVideo extends Dispositivo {
    private int numOperTexto, numOperEntero;

    public void muestraEntero(int elem) {
        if (isEncendido()) {
            numOperEntero++;
            System.out.println(elem);
        }
        else 
            System.out.println("Error: dispositivo apagado");
    }
    
    public void muestraTexto(String texto) {
        if (isEncendido()) {
            numOperTexto++;
            System.out.println(texto);
        }
        else 
            System.out.println("Error: dispositivo apagado");
    }
    
    @Override
    public void apagar() {
        super.apagar();
        numOperTexto = 0;
        numOperEntero = 0;
    }
}
