package javaintroexercises;

import java.util.Random;
import java.util.Scanner;

public class extra_ex10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        int num;
        int randomNum = random.nextInt(11);
        System.out.println(randomNum);

        while (true) {
            System.out.println("Ingrese un numero: ");
            num = sc.nextInt();

            if (num != randomNum)
                System.out.println("Numero incorrecto. Vuelvelo a intentar");
            else {
                System.out.println("Numero correcto :D");
                break;
            }
        }

    }
}
