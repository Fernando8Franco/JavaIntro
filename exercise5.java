package javaintroexercises;

import java.util.Scanner;

public class exercise5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese un numero entero: ");
        int num = sc.nextInt();

        System.out.println(num + " su doble es: " + num * 2);
        System.out.println(num + " su tripe es: " + num * 3);
        System.out.println(num + " su raíz cuadrada es: " + Math.sqrt(num));
    }
}
