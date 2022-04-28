package mi.tienda.juguetes;

public class Juguetes {
    public String nombreJuguetes;
    public String edadJuguete;
    public double precioJuguete;
    public int stock;
    
    public void estableceNombreJuguete(String nuevoJuguete){
        nombreJuguetes=nuevoJuguete;
    }
    public void estableceEdadJuguete(String nuevaEdad){
        edadJuguete=nuevaEdad;
    }
    public void establecePrecioJuguete(double nuevaCuota){
        precioJuguete=nuevaCuota;
    }
    public void estableceStock(int numTotal){
        stock=numTotal;
    }
    public String obtieneNombreJuguete(){
        System.out.println("El nombre del juguete es: "+nombreJuguetes);
        return nombreJuguetes;
    }
    public String obtieneEdadJuguete(){
        System.out.println("La edad recomendada es "+edadJuguete);
        return edadJuguete;
    }
    public double obtienePrecioJuguete(){
        System.out.println("El juguete cuesta "+precioJuguete);
        return precioJuguete;
    }
    public int obtieneStock(){
        System.out.println("En stock tenemos "+stock+" juguetes");
        return stock;
    }
    public double compra(int cantidad){
        stock--;
        return precioJuguete;
    }
    public double devuelve(int cantidad){
        stock++;
        return precioJuguete;
    }
    public double calculaPrecioRebajado25(){
        /*final int rebaja=precioJuguete-(precioJuguete*25)/100;*/
        final double rebaja25=precioJuguete-(precioJuguete*25)/100;
        return rebaja25;
    }
    public double calculaPrecioRebajado40(){
        /*final int rebaja=precioJuguete-(precioJuguete*40)/100;*/
        final double rebaja40=precioJuguete-(precioJuguete*40)/100;
        return rebaja40;
    }
}
