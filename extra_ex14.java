package javaintroexercises;

import java.util.Scanner;

public class extra_ex14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num_children, sum_age = 0, sum_children = 0;

        System.out.println("Ingresa la cantidad de familias: ");
        int num_families = sc.nextInt();

        for (int i = 0; i < num_families; i++) {
            System.out.println("Ingresa la cantidad de hijos de la familia no. " + (i + 1));
            sum_children += num_children = sc.nextInt();

            for (int j = 0; j < num_children; j++) {
                System.out.println("Ingrese la edad del hijo no. " + (j + 1) + " de la familia no. " + (i + 1) + ":");
                sum_age += sc.nextInt();
            }
        }

        System.out.println("La edad media de los hijos  de todas las familias es de: " + (sum_age / sum_children));
    }
}
