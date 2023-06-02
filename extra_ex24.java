package javaintroexercises;

import java.util.Scanner;

public class extra_ex24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el valor a llegar en la serie fibonacci: ");
        fibonacci(sc.nextInt());
    }

    private static void fibonacci(int n) {
        int aux1 = 1;
        int aux2 = 2;
        int num;

        if (n == 1)
            System.out.println("1 1");
        else if (n == 2)
            System.out.println("1 1 2");
        else {
            System.out.print("1 1 2 ");
            while (true) {
                num = aux1 + aux2;
                System.out.print(num + " ");

                if (num >= n) break;

                aux1 = aux2;
                aux2 = num;
            }
        }
    }
}
