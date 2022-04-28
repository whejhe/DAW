package es.tuespiral.u4.e17.mapacliente;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;


public class PruebaMapaCliente {
    public static void main(String[] args) {
        Map clientes = new HashMap();
        
        Cliente c1 = new Cliente(1L, "Pedro", "Picapiedra");
        clientes.put(c1.getIdCliente(), c1);
        
        Cliente c2 = new Cliente(2L, "Ana", "Lopez");
        clientes.put(c2.getIdCliente(), c2);
        
        Cliente c3 = new Cliente(3L, "Inma", "Cuesta");
        clientes.put(c3.getIdCliente(), c3);
        
        Iterator iter = clientes.keySet().iterator();
        while(iter.hasNext()) {
            long idCliente = (long) iter.next();
            System.out.println(clientes.get(idCliente));
        }
        // Borramos un elemento
        clientes.remove(1L);
        
        // Recuperamos, actualizamos y guardamos
        c3 = (Cliente) clientes.get(3L);
        c3.setNombre("Manuela");
        clientes.put(c3.getIdCliente(), c3);
        
        // Lo de Jesús
        //((Cliente) clientes.get(3L)).setNombre("Manuela");
        
        iter = clientes.keySet().iterator();
        while(iter.hasNext()) {
            long idCliente = (long) iter.next();
            System.out.println(clientes.get(idCliente));
        }
        
    }
}
