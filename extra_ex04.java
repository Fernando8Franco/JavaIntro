package javaintroexercises;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

public class extra_ex04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] roman_nums = {"I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X"};

        while (true) {
            System.out.println("Ingrese un numero del 1 al 10 (000 para terminar): ");
            int num = sc.nextInt();

            if (num == 000) break;

            if (num >= 1 && num <= 10) {
                System.out.println(num + " su número romano es: " + roman_nums[num - 1]);
            } else {
                System.out.println("Número ingresado no valido");
            }
        }
    }
}
