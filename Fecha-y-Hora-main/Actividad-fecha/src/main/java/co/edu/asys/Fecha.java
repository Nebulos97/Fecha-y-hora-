package co.edu.asys;

public class Fecha {

    private int dia;
    private Mes mes;
    private int anio;
    private Tiempo tiempo;

    public Fecha(int dia, Mes mes, int anio, Tiempo tiempo) {
        this.dia = dia;
        this.mes = mes;
        this.anio = anio;
        this.tiempo = tiempo;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public Mes getMes() {
        return mes;
    }

    public void setMes(Mes mes) {
        this.mes = mes;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public Tiempo getTiempo() {
        return tiempo;
    }

    public void setTiempo(Tiempo tiempo) {
        this.tiempo = tiempo;
    }

    // Nombre del mes
    public String nombreDelMes() {
        return mes.getNombre();
    }

    // Calcular diferencia de años
    public int calcularAnio(Fecha f2) {
        int resultado = this.getAnio() - f2.getAnio();
        if (this.getMes().getNumero() < f2.getMes().getNumero()) {
            return resultado - 1;
        } else {
            if (this.getMes().getNumero() == f2.getMes().getNumero()) {
                if (this.getDia() < f2.getDia()) {
                    return resultado - 1;
                }
            }
            return resultado;
        }
    }

    // Diferencia de años
    public int diferenciaAnios(Fecha f) {
        return this.anio - f.anio;
    }

    // Diferencia de meses
    public int diferenciaMeses(Fecha f) {
        int mesesPorAnio = (this.anio - f.anio) * 12;
        int mesesDelAnio = this.mes.getNumero() - f.mes.getNumero();
        return mesesPorAnio + mesesDelAnio;
    }

    // Diferencia de días
    public int diferenciaDias(Fecha f) {
        int total1 = this.anio * 365 + this.mes.getNumero() * 30 + this.dia;
        int total2 = f.anio * 365 + f.mes.getNumero() * 30 + f.dia;
        return total1 - total2;
    }

    public void sumarFecha(Fecha f2) {
        // Sumar años, meses y días directamente
        int nuevoDia = this.dia + f2.dia;
        int nuevoMes = this.mes.getNumero() + f2.mes.getNumero();
        int nuevoAnio = this.anio + f2.anio;

        // Ajustar meses que pasen de 12
        if (nuevoMes > 12) {
            nuevoAnio += (nuevoMes - 1) / 12;
            nuevoMes = ((nuevoMes - 1) % 12) + 1;
        }

        // Obtener el mes actualizado desde el enum
        Mes mesActual = Mes.obtenerPorNumero(nuevoMes);
        int diasDelMes = mesActual.getDias(nuevoAnio);

        // Ajustar días que excedan el total del mes
        if (nuevoDia > diasDelMes) {
            nuevoDia -= diasDelMes;
            nuevoMes++;
            if (nuevoMes > 12) {
                nuevoMes = 1;
                nuevoAnio++;
            }
            mesActual = Mes.obtenerPorNumero(nuevoMes);
        }

        // Asignar los nuevos valores a la fecha actual
        this.dia = nuevoDia;
        this.mes = mesActual;
        this.anio = nuevoAnio;
    }


    @Override
    public String toString() {
        return dia + " de " + mes.getNombre() + " de " + anio + " - " + tiempo;
    }
}
