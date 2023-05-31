package javaintroexercises;

import java.util.Scanner;

public class extra_ex15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int option = -1;

        System.out.println("Ingrese un número: ");
        float num1 = sc.nextFloat();
        System.out.println("Ingrese otro número: ");
        float num2 = sc.nextFloat();

        while (option != 0) {
            option = menu();

            switch (option) {
                case 0:
                    System.out.println("Gracias!");
                    break;
                case 1:
                    System.out.printf("%.2f + %.2f = %.2f\n", num1, num2, (num1 + num2));
                    break;
                case 2:
                    System.out.printf("%.2f - %.2f = %.2f\n", num1, num2, (num1 - num2));
                    break;
                case 3:
                    System.out.printf("%.2f * %.2f = %.2f\n", num1, num2, (num1 * num2));
                    break;
                case 4:
                    if (num2 != 0)
                        System.out.printf("%.2f / %.2f = %.2f\n", num1, num2, (num1 / num2));
                    else
                        System.out.println("No se puede dividir entre 0");
                    break;
                default:
                    System.out.println("Opción no válida. Vuelva a escoger.");
            }
        }

    }

    public static int menu() {
        Scanner sc = new Scanner(System.in);
        int op;

        System.out.println("¿Qué desea hacer?");
        System.out.println("Sumar [1]");
        System.out.println("Restar [2]");
        System.out.println("Multiplicar [3]");
        System.out.println("Dividir [4]");
        System.out.println("Salir [0]");
        System.out.println("Escoga una opción: ");

        return op = sc.nextInt();
    }
}
