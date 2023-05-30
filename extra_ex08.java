package javaintroexercises;

import java.util.Scanner;

public class extra_ex08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num, cont_even = 0, cont_odd = 0, cont = 0;

        while (true) {
            System.out.println("Ingrese un número [No. multiplos de 5 para terminar]: ");
            num = sc.nextInt();
            if (num % 5 == 0) break;

            if(num == 0)
                cont_even++;
            else if (num % 2 == 0)
                cont_even++;
            else
                cont_odd++;

            cont++;
        }

        System.out.println("Numeros ingresados: " + cont);
        System.out.println("Numeros pares: " + cont_even);
        System.out.println("Numeros impares: " + cont_odd);
    }
}
