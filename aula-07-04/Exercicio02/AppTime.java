package Exercicio02;

public class AppTime {
    public static void main(String[] args) {
        Time t = new Time();

        t.setHora(11);
        t.setMinutos(15);
        t.setSegundos(39);

        t.visualizarHoraUniversal();
        t.visualizarHoraAmPm();
    }
}
