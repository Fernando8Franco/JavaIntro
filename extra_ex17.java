package javaintroexercises;

import java.util.Scanner;

public class extra_ex17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;

        while (true) {
            System.out.println("Ingrese un número [-1 para terminar]: ");
            num = sc.nextInt();
            if (num == -1) break;

            System.out.println((primeNumber(num) ? "" : "NO ") + "Es un número primo");
        }
    }

    public static boolean primeNumber (int n) {

        if (n == 2)
            return true;
        else if (n < 2 || n % 2 == 0)
            return false;

        for (int i = 3; i < Math.sqrt(n); i++) {
            if (n % i == 0)
                return false;
        }

        return true;
    }
}
