public class Reservas {
    private Vuelo vuelo;
    private Pasajeros pasajero;
    private String fechaReserva;
    private boolean confirmacion;
    //Tiempo constante
    public Reservas(Vuelo vuelo, Pasajeros pasajero, String fechaReserva, boolean confirmacion) {
        this.vuelo = vuelo;
        this.pasajero = pasajero;
        this.fechaReserva = fechaReserva;
        this.confirmacion = confirmacion;
    }

    public void cancelarReserva() {
        vuelo.reservarAsiento();
    }
}
