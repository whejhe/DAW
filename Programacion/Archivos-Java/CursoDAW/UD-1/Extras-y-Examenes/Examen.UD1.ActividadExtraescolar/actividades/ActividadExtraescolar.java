package ese.colegio.actividades;

public class ActividadExtraescolar {
    public String nombreActividad;
    public int nivelActividad;
    public int numPlazasOfertadas;
    public int numPlazasOcupadas;
    public double cuotaMensual;
    
    public void estableceNombreActividad(String nuevaActividad){
        nombreActividad=nuevaActividad;
    }
    public void estableceNivelActividad(int nuevoNivel){
        nivelActividad=nuevoNivel;
    }
    public void estableceNumPlazasOfertadas(int numTotal){
        numPlazasOfertadas=numTotal;
    }
    public void estableceCuotaMensual(double nuevaCuota){
        cuotaMensual=nuevaCuota;
    }
    public String obtieneNombreActividad(){
        return nombreActividad;
    }
    public int obtieneNivelActividad(){
        return nivelActividad;
    }
    public int obtieneNumPlazasOfertadas(){
        System.out.println("El numero de plazas ofertadas es de "+numPlazasOfertadas);
        return numPlazasOfertadas;
    }
    public int obtieneNumPlazasOcupadas(){
        System.out.println("Actualmente tenemos "+numPlazasOcupadas+" plazas ocupadas");
        return numPlazasOcupadas;
    }
    public double obtieneCuotaMensual(){
        return cuotaMensual;
    }
    public void daAlta(){
        numPlazasOcupadas++;
        numPlazasOfertadas--;
    }
    public void daBaja(){
        numPlazasOcupadas--;
        numPlazasOfertadas++;
    }
    public double calculaCuotaBonificada20(){
        final double Bonificacion20=cuotaMensual-(cuotaMensual/100)*20;
        return Bonificacion20;
    }
    public double calculaCuotaBonificada80(){
        final double Bonificacion80=cuotaMensual-(cuotaMensual/100)*80;
        return Bonificacion80;
    }
}
