package javaintroexercises;

import java.util.Scanner;

public class exercise1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese dos numeros enteros: ");
        int num_1 = sc.nextInt();
        int num_2 = sc.nextInt();

        System.out.println("La suma de los dos numeros es: " + (num_1 + num_2));
    }
}
