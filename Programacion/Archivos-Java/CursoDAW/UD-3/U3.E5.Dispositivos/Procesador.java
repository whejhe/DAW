package es.tuespiral.u3.e5.dispositivos;

public class Procesador extends Dispositivo {
    private int numOperaciones;
    
    public int suma (int a, int b) {
        if (isEncendido()) {
            numOperaciones++;
            return a+b;
        }
        else {
            System.out.println("Error: dispositivo apagado");
            return -1;
        }        
    }
    
    public int resta (int a, int b) {
        if (isEncendido()) {
            numOperaciones++;
            return a-b;
        }
        else {
            System.out.println("Error: dispositivo apagado");
            return -1;
        }        
    }
    
    public int multiplica (int a, int b) {
        if (isEncendido()) {
            numOperaciones++;
            return a*b;
        }
        else {
            System.out.println("Error: dispositivo apagado");
            return -1;
        }        
    }
    
    public int divide (int a, int b) {
        if (isEncendido()) {
            numOperaciones++;
            return a/b;
        }
        else {
            System.out.println("Error: dispositivo apagado");
            return -1;
        }        
    }
    
    @Override
    public void apagar() {
        super.apagar();
        numOperaciones = 0;
    }
    
}
