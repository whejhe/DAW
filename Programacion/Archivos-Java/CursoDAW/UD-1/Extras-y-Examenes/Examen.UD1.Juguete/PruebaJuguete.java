package mi.tienda;
import mi.tienda.juguetes.Juguetes;
import java.util.Scanner;

public class PruebaJuguete {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Juguetes j = new Juguetes();
        
        System.out.println("Nombre del juguete:");
        j.estableceNombreJuguete(sc.nextLine());
        
        System.out.println("Edad recomendada:");
        j.estableceEdadJuguete(sc.next());
        
        System.out.println("Precio del juguete:");
        j.establecePrecioJuguete(sc.nextDouble());
        
        System.out.println("Stock actual:");
        j.estableceStock(sc.nextInt());
        
        j.compra(0);
        j.compra(2);
        j.compra(3);
        j.compra(4);
        
        j.devuelve(3);
        
        j.obtieneNombreJuguete();
        j.obtienePrecioJuguete();
        j.obtieneEdadJuguete();
        j.obtieneStock();
    }
}
