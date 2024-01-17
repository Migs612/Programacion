package RelojdeAlarma;

import java.time.LocalDateTime;

public class RelojdeAlarma {
    LocalDateTime locaDate = LocalDateTime.now();
    private int hora;
    private int minutos;
    private String horaAlarma;
    private String horaActual;
    private boolean alarmaActiva;

    public RelojdeAlarma() {
        hora = locaDate.getHour();
        minutos = locaDate.getMinute();
        horaAlarma = hora+":"+ minutos;
        horaActual = hora+":"+ minutos;
        alarmaActiva = false;
    }

    public String getHoraAlarma() {
        return horaAlarma;
    }
    public void setHoraAlarma(int hora, int minutos) {
        this.hora = hora;
        this.minutos = minutos;
        this.horaAlarma = hora + ":" + minutos;
    }
    public String getHoraActual() {
        return horaActual;
    }
    public void setHoraActual() {
        LocalDateTime nuevaFecha = LocalDateTime.now();
        this.hora = nuevaFecha.getHour();
        this.minutos = nuevaFecha.getMinute();
        this.horaActual = hora + ":" + minutos;
    }
    public void setAlarmaActiva(boolean alarmaActiva) {
        this.alarmaActiva = alarmaActiva;
    }
}
