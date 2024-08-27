import java.util.Scanner; // Importa la clase Scanner del paquete java.util para leer la entrada del usuario

public class Distribuidora { // Declaración de la clase Distribuidora
    public static void main(String[] args) { // Método principal que se ejecuta al iniciar el programa
        Scanner scanner = new Scanner(System.in); // Crea un objeto Scanner para leer la entrada desde la consola
        
        // Solicitar nombre y edad del usuario
        System.out.print("Ingrese su nombre: "); // Muestra un mensaje pidiendo al usuario que ingrese su nombre
        String nombre = scanner.nextLine(); // Lee la entrada del usuario y la almacena en la variable 'nombre'
        
        System.out.print("Ingrese su edad: "); // Muestra un mensaje pidiendo al usuario que ingrese su edad
        int edad = scanner.nextInt(); // Lee la entrada del usuario y la almacena en la variable 'edad' como un número entero
        scanner.nextLine(); // Limpia el buffer después de leer un número entero para evitar problemas con la lectura de la siguiente línea de texto
        
        // Mostrar los datos personales ingresados
        System.out.println("\nLos datos personales ingresados son:"); // Imprime un mensaje para indicar el inicio de los datos ingresados
        System.out.println("Nombre: " + nombre); // Imprime el nombre ingresado por el usuario
        System.out.println("Edad: " + edad + " años"); // Imprime la edad ingresada por el usuario

        // Solicitar datos del vehículo
        System.out.print("\nIngrese la marca del vehículo: "); // Muestra un mensaje pidiendo al usuario que ingrese la marca del vehículo
        String marca = scanner.nextLine(); // Lee la entrada del usuario y la almacena en la variable 'marca'
        
        System.out.print("Ingrese el modelo del vehículo: "); // Muestra un mensaje pidiendo al usuario que ingrese el modelo del vehículo
        String modelo = scanner.nextLine(); // Lee la entrada del usuario y la almacena en la variable 'modelo'
        
        System.out.print("Ingrese la cilindrada del vehículo: "); // Muestra un mensaje pidiendo al usuario que ingrese la cilindrada del vehículo
        String cilindrada = scanner.nextLine(); // Lee la entrada del usuario y la almacena en la variable 'cilindrada'
        
        System.out.print("Ingrese el tipo de combustible: "); // Muestra un mensaje pidiendo al usuario que ingrese el tipo de combustible del vehículo
        String combustible = scanner.nextLine(); // Lee la entrada del usuario y la almacena en la variable 'combustible'
        
        System.out.print("Ingrese la capacidad en pasajeros: "); // Muestra un mensaje pidiendo al usuario que ingrese la capacidad del vehículo en términos de pasajeros
        int capacidad = scanner.nextInt(); // Lee la entrada del usuario y la almacena en la variable 'capacidad' como un número entero

        // Mostrar los datos del vehículo ingresados
        System.out.println("\nLos datos del vehículo ingresados son:"); // Imprime un mensaje para indicar el inicio de los datos ingresados
        System.out.println("Marca: " + marca); // Imprime la marca ingresada por el usuario
        System.out.println("Modelo: " + modelo); // Imprime el modelo ingresado por el usuario
        System.out.println("Cilindrada: " + cilindrada); // Imprime la cilindrada ingresada por el usuario
        System.out.println("Tipo de combustible: " + combustible); // Imprime el tipo de combustible ingresado por el usuario
        System.out.println("Capacidad de pasajeros: " + capacidad + " pasajeros."); // Imprime la capacidad de pasajeros ingresada por el usuario
    }
}
