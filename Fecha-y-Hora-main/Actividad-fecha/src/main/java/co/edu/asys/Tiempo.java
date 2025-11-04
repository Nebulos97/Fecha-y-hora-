package co.edu.asys;

import javax.swing.*;

public class Tiempo {
    private int hora;
    private int minuto;
    private int segundo;
    private String meridiano;

    public Tiempo(int hora, int minuto, int segundo, String meridiano) {
        this.hora = hora;
        this.minuto = minuto;
        this.segundo = segundo;
        this.meridiano = meridiano;
    }

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    public int getMinuto() {
        return minuto;
    }

    public void setMinuto(int minuto) {
        this.minuto = minuto;
    }

    public int getSegundo() {
        return segundo;
    }

    public void setSegundo(int segundo) {
        this.segundo = segundo;
    }

    public String getMeridiano() {
        return meridiano;
    }

    public void setMeridiano(String meridiano) {
        this.meridiano = meridiano;
    }

    public String getHoraMilitar () {
        if (this.meridiano.equals("AM")) return ( this.hora + ":" + this.minuto + ":" + this.segundo + this.meridiano );
        else {return ( this.hora + 12 + ":" + this.minuto + ":" + this.segundo); }
    }

    public void sumarHoras(int hora, int minuto, int segundo) {
        // Sumar segundos
        this.segundo += segundo;
        this.minuto += this.segundo / 60;
        this.segundo %= 60;

        // Sumar minutos
        this.minuto += minuto;
        this.hora += this.minuto / 60;
        this.minuto %= 60;

        // Sumar horas
        this.hora += hora;
        this.hora %= 24; // Mantener ciclo de 24 horas (0–23)
    }


    public void restarHoras(int hora, int minuto, int segundo) {
        // Restar segundos
        this.segundo -= segundo;
        if (this.segundo < 0) {
            this.segundo += 60;
            this.minuto--;
        }

        // Restar minutos
        this.minuto -= minuto;
        if (this.minuto < 0) {
            this.minuto += 60;
            this.hora--;
        }

        // Restar horas
        this.hora -= hora;
        if (this.hora < 0) {
            this.hora += 24; // Ciclo de 24 horas
        }
    }

    @Override
    public String toString() {
        return String.format("%02d:%02d:%02d", hora, minuto, segundo);
    }
}

