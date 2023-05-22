package javaintroexercises;

import java.util.Scanner;

public class exercise4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Float fahrenheit;

        System.out.println("Ingrese la temperatura en grados centígrados: ");
        Float celsius = sc.nextFloat();

        fahrenheit = 32 + (9 * celsius / 5);

        System.out.println(celsius + "°C son: " + fahrenheit + "°F");
    }
}
