import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        ManejadorReservas manejador = new ManejadorReservas(); // Supongamos que ya hay vuelos en el manejador

        Scanner scanner = new Scanner(System.in);
        System.out.println("Bienvenido al sistema de reservas de vuelos.");
        System.out.println("¿Qué acción desea realizar?");
        System.out.println("1. Revisar su vuelo por número de vuelo");
        System.out.println("2. Reservar un vuelo");

        int opcion = scanner.nextInt();

        if (opcion == 1) {
            // Acción de revisar un vuelo por número de vuelo
            System.out.println("Ingrese el número de vuelo para revisar:");
            scanner.nextLine(); // Limpiar el buffer del scanner
            String numVuelo = scanner.nextLine();

            // Aquí puedes buscar el vuelo por el número ingresado y mostrar la información correspondiente
            Vuelo vueloEncontrado = buscarVueloPorNumero(manejador, numVuelo);

            if (vueloEncontrado != null) {
                System.out.println("Mostrando información del vuelo con número: " + numVuelo);
                // Aquí puedes mostrar la información del vuelo encontrado (ejemplo: imprimir atributos del vuelo)
                System.out.println("Origen: " + vueloEncontrado.getOrigen());
                System.out.println("Destino: " + vueloEncontrado.getDestino());
                // Mostrar más atributos según lo deseado
            } else {
                System.out.println("No se encontró ningún vuelo con el número ingresado.");
            }
        } else if(opcion == 2) {
            System.out.println("Opción no válida.");
        }
        else{

            System.out.println("Opción no válida.");
        }
    }

    
}
