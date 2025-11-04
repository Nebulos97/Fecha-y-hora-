package co.edu.asys;

public enum Mes {
        ENERO("Enero", 1, 31),
        FEBRERO("Febrero", 2, 28),
        MARZO("Marzo", 3, 31),
        ABRIL("Abril", 4, 30),
        MAYO("Mayo", 5, 31),
        JUNIO("Junio", 6, 30),
        JULIO("Julio", 7, 31),
        AGOSTO("Agosto", 8, 31),
        SEPTIEMBRE("Septiembre", 9, 30),
        OCTUBRE("Octubre", 10, 31),
        NOVIEMBRE("Noviembre", 11, 30),
        DICIEMBRE("Diciembre", 12, 31);

        private final String nombre;
        private final int numero;
        private final int dias;

        Mes(String nombre, int numero, int dias) {
            this.nombre = nombre;
            this.numero = numero;
            this.dias = dias;
        }

        public String getNombre() {
            return nombre;
        }

        public int getNumero() {
            return numero;
        }

        public int getDias(int nuevoAnio) {
            return dias;
        }

        // Obtener por numero
    public static Mes obtenerPorNumero(int numero) {
        for (Mes m : Mes.values()) {
            if (m.numero == numero) {
                return m;
            }
        }
        throw new IllegalArgumentException("Número de mes inválido: " + numero);
    }
}

