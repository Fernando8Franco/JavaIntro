package javaintroexercises;

import java.util.Scanner;

public class exercise10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;

        System.out.println("Ingrese un valor límite positivo: ");
        int limit = sc.nextInt();

        while (sum <= limit) {
            System.out.println("Ingrese un numero: ");
            sum += sc.nextInt();
            System.out.println("La suma es: " + sum);
        }
        System.out.println("La suma de los numeros supero al limite " + sum + " > " + limit);
    }
}
