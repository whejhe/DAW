package ese.colegio;
import ese.colegio.actividades.ActividadExtraescolar;
import java.util.Scanner;

public class PruebaActividadExtraescolar {
    public static void main(String[] args) {
        ActividadExtraescolar a = new ActividadExtraescolar();
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Nombre de la actividad:");
        a.estableceNombreActividad(sc.nextLine());
        
        System.out.println("Nivel de la actividad");
        a.estableceNivelActividad(sc.nextInt());
        
        System.out.println("Cuota mensual");
        a.estableceCuotaMensual(sc.nextDouble());
        
        System.out.println("Plazas ofertadas");
        a.estableceNumPlazasOfertadas(sc.nextInt());
        
        a.daAlta();
        a.daAlta();
        a.daAlta();
        a.daAlta();
        a.daAlta();
        a.daBaja();
        
        a.obtieneNombreActividad();
        a.obtieneCuotaMensual();
        a.obtieneNivelActividad();
        a.obtieneNumPlazasOcupadas();
        a.obtieneNumPlazasOfertadas();
        
        a.calculaCuotaBonificada20();
        a.calculaCuotaBonificada80();
       
    }
}
