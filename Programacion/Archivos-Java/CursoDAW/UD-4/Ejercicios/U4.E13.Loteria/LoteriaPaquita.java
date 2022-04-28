package es.tuespiral.u4.e13.loteria;

import java.util.*;

public class LoteriaPaquita {
    private Set numerosVendidos = new HashSet();
    
    public void venderNumero(int numVendido){
        numerosVendidos.add(numVendido);
    }
    
    public boolean isGordoVendido(int numGordo) {
        return numerosVendidos.contains(numGordo);
    }
}
