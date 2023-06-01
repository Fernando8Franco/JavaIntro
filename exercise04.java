package javaintroexercises;

import java.util.Scanner;

public class exercise04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float fahrenheit;

        System.out.println("Ingrese la temperatura en grados centígrados: ");
        float celsius = sc.nextFloat();

        fahrenheit = 32 + (9 * celsius / 5);

        System.out.println(celsius + "°C son: " + fahrenheit + "°F");
    }
}
