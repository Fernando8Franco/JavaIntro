package javaintroexercises;

import java.util.Scanner;

public class extra_ex13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String num = "";

        System.out.println("Ingresa el tamaño de la escalera: ");
        int size = sc.nextInt();

        for (int i = 1; i <= size; i++) {
            num = num.concat(String.valueOf(i));
            System.out.println(num);
        }
    }
}
