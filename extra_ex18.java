package javaintroexercises;

import java.util.Scanner;
import java.util.Arrays;

public class extra_ex18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("¿Cuantos números desea ingresar?");
        int[] numbers = new int[sc.nextInt()];

        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Ingrese el número no. " + (i + 1) + ":");
            numbers[i] = sc.nextInt();
        }

        System.out.println("La suma de todos los numeros es: " + Arrays.stream(numbers).sum());
    }
}
