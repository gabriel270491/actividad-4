package Visitante;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar y leer el nombre del visitante
        System.out.print("Ingrese el nombre del visitante: ");
        String nombre = scanner.nextLine();

        // Solicitar y leer la edad del visitante
        System.out.print("Ingrese la edad del visitante: ");
        int edad = scanner.nextInt();
        scanner.nextLine();  // Limpiar el buffer del scanner

        // Determinar si el visitante es mayor o menor de edad
        String edadCategoria = (edad >= 18) ? "Mayor de edad" : "Menor de edad";

        // Solicitar y leer las visitas realizadas durante la semana
        System.out.print("Ingrese la cantidad de visitas realizadas durante la semana: ");
        int cantidadVisitas = scanner.nextInt();
        int[] tiemposVisita = new int[cantidadVisitas];
        int tiempoTotal = 0;

        // Leer el tiempo de cada visita
        for (int i = 0; i < cantidadVisitas; i++) {
            System.out.print("Ingrese el tiempo de estadía de la visita " + (i + 1) + " (en minutos): ");
            tiemposVisita[i] = scanner.nextInt();
            tiempoTotal += tiemposVisita[i];
        }

        // Calcular el tiempo promedio de estadía
        double tiempoPromedio = (double) tiempoTotal / cantidadVisitas;

        // Cerrar el scanner
        scanner.close();

        // Imprimir resultados
        System.out.println("\nInformación del Visitante");
        System.out.println("-------------------------");
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Categoría: " + edadCategoria);
        System.out.println("Cantidad total de visitas: " + cantidadVisitas);
        System.out.println("Tiempo promedio de estadía: " + tiempoPromedio + " minutos");
    }
}
