package javaintroexercises;

import java.util.Scanner;

public class extra_ex11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;

        while (true) {
            System.out.println("Ingresa un número [000 para terminar]: ");
            num = sc.nextInt();
            if (num == 000) break;

            System.out.println("El número ingresado tiene " + String.valueOf(num).length() + " dígitos");
        }
    }
}
