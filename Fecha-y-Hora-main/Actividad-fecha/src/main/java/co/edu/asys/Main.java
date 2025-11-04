package co.edu.asys;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        System.out.println("Mi primer programa con fecha");

        Tiempo t = new Tiempo(10,5,50,"AM");
        Tiempo t2 = new Tiempo(1,5,50,"PM");
        Tiempo t3 = new Tiempo(4, 6, 53,"AM");
        Tiempo t4 = new Tiempo(6, 8, 42,"AM");

        Fecha f = new Fecha(13,Mes.DICIEMBRE, 2025,t);
        Fecha f2 = new Fecha(13,Mes.ENERO,4,t2);  // suma de fecha

        Fecha f3 = new Fecha(13, Mes.SEPTIEMBRE, 2025,t3);
        Fecha f4 = new Fecha(13,Mes.AGOSTO, 2027,t4);

        String resultado = t2.getHoraMilitar();

        String resultado2 = f.nombreDelMes();

        int resultadoEdad = f.calcularAnio(f2);

        f.sumarFecha(f2);

        t2.sumarHoras(2, 15, 35);

        t.restarHoras(2, 45, 30);

        System.out.println(resultado); // Hora militar
        System.out.println(resultado2); // Nombre del mes
        System.out.println(resultadoEdad); // Calcular anio
        System.out.println(f.getDia() + "/" + f.getMes() + "/" + f.getAnio());
        System.out.println("Diferencia en Días: " + f4.diferenciaDias(f3));
        System.out.println("Diferencia en Meses: " + f4.diferenciaMeses(f3));
        System.out.println("Diferencia en Anios: " + f4.diferenciaAnios(f3));
        System.out.println("Sumar horas " + t2);
        System.out.println("Después de restar: " + t);

    }
}
