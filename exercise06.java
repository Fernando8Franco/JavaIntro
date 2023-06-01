package javaintroexercises;

import java.util.Scanner;

public class exercise06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese un numero entero: ");
        int num = sc.nextInt();

        if (num == 0) {
            System.out.println("El numero es par");
        } else if ((num % 2) == 0) {
            System.out.println("El numero es par");
        } else {
            System.out.println("El numero es impar");
        }
    }
}
