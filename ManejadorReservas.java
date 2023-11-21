import java.util.ArrayList;
import java.util.List;

public class ManejadorReservas {

    private List<Vuelo> listaVuelos;

    public ManejadorReservas() {
        listaVuelos = new ArrayList<>();
    }
    //Tiempo lineal
    public List<Vuelo> buscarVuelosDisponibles(int numVuelo, String origen, String destino, String fecha) {
        List<Vuelo> vuelosDisponibles = new ArrayList<>();
        for (Vuelo vuelo : listaVuelos) {
            if (vuelo.getnumVuelo().equals(numVuelo) && vuelo.getOrigen().equals(origen) && vuelo.getDestino().equals(destino) && vuelo.getFechaSalida().equals(fecha)) {
                if (vuelo.obtenerAsientosDisponibles() > 0) {
                    vuelosDisponibles.add(vuelo);
                }
            }
        }
        return vuelosDisponibles;
    }
    //Tiempo constante
    public boolean realizarReserva(Vuelo vuelo, Pasajeros pasajero, String fechaReserva) {
        if (vuelo.reservarAsiento()) {
            Reservas nuevaReserva = new Reservas(vuelo, pasajero, fechaReserva, true);
            return true;
        } else {
            return false;
        }
    }

}
