import java.util.Scanner; // Importa la clase Scanner del paquete java.util para poder leer la entrada del usuario

public class Distribuidora { // Declaración de la clase Distribuidora
    public static void main(String[] args) { // Método principal que se ejecuta al iniciar el programa
        Scanner scanner = new Scanner(System.in); // Crea un objeto Scanner para leer la entrada desde la consola
        
        // Solicitar datos al usuario
        System.out.print("Ingrese la marca del vehículo: "); // Muestra un mensaje pidiendo al usuario que ingrese la marca del vehículo
        String marca = scanner.nextLine(); // Lee la entrada del usuario y la almacena en la variable 'marca'
        
        System.out.print("Ingrese el modelo del vehículo: "); // Muestra un mensaje pidiendo al usuario que ingrese el modelo del vehículo
        String modelo = scanner.nextLine(); // Lee la entrada del usuario y la almacena en la variable 'modelo'
        
        System.out.print("Ingrese la cilindrada del vehículo: "); // Muestra un mensaje pidiendo al usuario que ingrese la cilindrada del vehículo
        String cilindrada = scanner.nextLine(); // Lee la entrada del usuario y la almacena en la variable 'cilindrada'
        
        System.out.print("Ingrese el tipo de combustible: "); // Muestra un mensaje pidiendo al usuario que ingrese el tipo de combustible del vehículo
        String combustible = scanner.nextLine(); // Lee la entrada del usuario y la almacena en la variable 'combustible'
        
        System.out.print("Ingrese la capacidad en pasajeros: "); // Muestra un mensaje pidiendo al usuario que ingrese la capacidad del vehículo en términos de pasajeros
        int capacidad = scanner.nextInt(); // Lee la entrada del usuario y la almacena en la variable 'capacidad' como un número entero

        // Mostrar los datos ingresados
        System.out.println("\nLa marca que ha ingresado es: " + marca); // Imprime la marca ingresada por el usuario
        System.out.println("El modelo que ha ingresado es: " + modelo); // Imprime el modelo ingresado por el usuario
        System.out.println("La cilindrada que ha ingresado es: " + cilindrada); // Imprime la cilindrada ingresada por el usuario
        System.out.println("El tipo de combustible es: " + combustible); // Imprime el tipo de combustible ingresado por el usuario
        System.out.println("Tiene una capacidad de " + capacidad + " pasajeros."); // Imprime la capacidad de pasajeros ingresada por el usuario
    }
}
