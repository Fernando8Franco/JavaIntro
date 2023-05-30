package javaintroexercises;

import java.util.Scanner;

public class extra_ex09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cos = 1;

        System.out.println("Ingrese un número: ");
        int num1 = sc.nextInt();
        System.out.println("Ingrese otro número: ");
        int num2 = sc.nextInt();

        System.out.println(num1 + " / " + num2);

        int res = num1 - num2;

        while (true) {
            if (res < num2) break;

            res -= num2;
            cos++;
        }


        System.out.println("El residuo es: " + res);
        System.out.println("El cosciente es: " + cos);
    }
}
