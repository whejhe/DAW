package com.mycompany.extras.relojdespertador;

public class RelojDespertador {
    public int Hora;
    public int HoraAlarma;
    public int HoraActual;
    public int MinutoActual;
    public int MinutoAlarma;
    public boolean Alarma;

    public void setHora(int nuevaHora,int nuevominutos) {
        HoraActual = nuevaHora;
        MinutoActual = nuevominutos;
        
    }

    public void setHoraAlarma(int HoraAlarma, int minutoAlarma) {
        this.HoraAlarma = HoraAlarma;
        this.MinutoAlarma = minutoAlarma;
    }

    public int getHoraAlarma() {
        return HoraAlarma;
    }

    public int getHoraActual() {
        return HoraActual;
    }

    public int getMinutoActual() {
        return MinutoActual;
    }

    public int getMinutoAlarma() {
        return MinutoAlarma;
    }
    
    public void activarAlarma(){
        Alarma=true;
    }
    public void desactivarAlarma(){
        Alarma=false;
    }
    public void sonarAlarma(){
        System.out.println("PI PPI PIII PIIIII PIIIIIIIII.....");
    }
    public void imprimirHoraActual(){
        System.out.println("Son las "+getHoraActual()+" con "+getMinutoActual()+" minutos");
    }
    public void imprimirHoraAlarma(){
        System.out.println("La alarma esta prevista para las "+getHoraAlarma()+" y "+getMinutoAlarma()+" minutos");
    }
    public void imprimirEstadoAlarma(){
        System.out.println("La alarma se encuentra "+Alarma);
    }
}
