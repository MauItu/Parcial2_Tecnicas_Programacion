public class Vuelo {
    //Complejidad constante
    private String numeroVuelo;
    private String origen;
    private String destino;
    private String fechaSalida;
    private String horaSalida;
    private int capacidadMaxima;
    private int asientosOcupados;

    public Vuelo(String numeroVuelo, String origen, String destino, String fechaSalida, String horaSalida, int capacidadMaxima) {
        this.numeroVuelo = numeroVuelo;
        this.origen = origen;
        this.destino = destino;
        this.fechaSalida = fechaSalida;
        this.horaSalida = horaSalida;
        this.capacidadMaxima = capacidadMaxima;
        this.asientosOcupados = 0;
    }

    public int obtenerAsientosDisponibles() {
        return capacidadMaxima - asientosOcupados;
    }

    public boolean reservarAsiento() {
        if (obtenerAsientosDisponibles() > 0) {
            asientosOcupados++;
            return true;
        } else {
            return false;
        }
    }

    public Object getOrigen() {
        return origen;
    }

    public Object getDestino() {
        return destino;
    }

    public Object getFechaSalida() {
        return fechaSalida;
    }

    public Object getnumVuelo() {
        return numeroVuelo;
    }
}
