package Exercicio02;

public class Time {
    private int hora;
    private int minutos;
    private int segundos;

    public void setHora(int hora){
        if(hora>=0 && hora <24){
            this.hora = hora;
        }
    }

    public int getHora() {
        return hora;
    }
    public void setMinutos(int minutos){
        if(minutos>=0 && minutos <60){
            this.minutos = minutos;
        }
    }

    public int getMinutos() {
        return minutos;
    }
    public void setSegundos(int segundos){
        if(segundos >= 0 && segundos < 60){
            this.segundos = segundos;
        }
    }

    public int getSegundos() {
        return segundos;
    }

    public void visualizarHoraUniversal() {
        System.out.println(hora + ":" + minutos + ":" + segundos);
    }
    public void visualizarHoraAmPm() {
        if(hora > 12){
            System.out.println((hora - 12) + ":" + minutos + ":" + segundos + " PM");
        } else {
            System.out.println((hora) + ":" + minutos + ":" + segundos + " AM");
        }
    }
}
