package javaintroexercises;

import java.util.Scanner;

public class exercise13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el numero de lados del cuadrado: ");
        int size = sc.nextInt();

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print((j == 0 || i == 0 || i == (size - 1) || j == (size - 1)) ? "*" : " ");
            }
            System.out.println();
        }
    }
}
