package javaintroexercises;

import java.util.Scanner;

public class extra_ex16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean mostrarPersonas = true;

        while (mostrarPersonas) {
            System.out.println("Ingrese el nombre de la persona:");
            String name = scanner.nextLine();

            System.out.println("Ingrese la edad de la persona:");
            int age = Integer.parseInt(scanner.nextLine());

            if (age >= 18) {
                System.out.println(name + " es mayor de edad.");
            } else {
                System.out.println(name + " es menor de edad.");
            }

            System.out.println("¿Desea seguir mostrando personas? (Ingrese 'No' para detener):");
            String respuesta = scanner.nextLine();

            if (respuesta.equalsIgnoreCase("No")) {
                mostrarPersonas = false;
            }
        }
    }
}
