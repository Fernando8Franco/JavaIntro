package javaintroexercises;

import java.util.Scanner;
import java.util.Arrays;

public class extra_ex07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cont = 0;

        System.out.println("Ingrese cuantas números va a ingresar: ");
        int num = sc.nextInt();
        int[] nums = new int[num];

        while (cont < num) {
            System.out.println("Ingrese el número no. " + (cont+1) + " :");
            nums[cont] = sc.nextInt();

            cont++;
        }

        int max = Arrays.stream(nums).max().getAsInt();
        int min = Arrays.stream(nums).min().getAsInt();
        double avg = Arrays.stream(nums).average().getAsDouble();


        System.out.println("El número maximo dentro del arreglo es: " + max);
        System.out.println("El número minimo dentro del arreglo es: " + min);
        System.out.printf("El promedio de los numeros dentro del arreglo es: %.2f", avg);
    }
}
