public class Pasajeros {
    private String nombre;
    private String numeroPasaporte;
    private int edad;
    private String preferenciasAlimenticias;

    public Pasajeros(String nombre, String numeroPasaporte, int edad, String preferenciasAlimenticias) {
        this.nombre = nombre;
        this.numeroPasaporte = numeroPasaporte;
        this.edad = edad;
        this.preferenciasAlimenticias = preferenciasAlimenticias;
    }

    public String obtenerInfoPasajero() {
        return "Nombre: " + nombre + ", Pasaporte: " + numeroPasaporte + ", Edad: " + edad + ", Preferencias Alimenticias: " + preferenciasAlimenticias;
    }
}
