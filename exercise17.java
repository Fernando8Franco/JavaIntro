package javaintroexercises;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

import static java.lang.String.valueOf;

public class exercise17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        int[] cont = new int[5];

        System.out.println("Ingrese el tamaño del arreglo: ");
        int size = sc.nextInt();

        int[] numbers = new int[size];

        for (int i = 0; i < size; i++) {
            numbers[i] = random.nextInt(100000);
        }

        for (int c : cont) {
            c = 0;
        }

        for (int num : numbers) {
            switch (String.valueOf(num).length()) {
                case 1:
                    cont[0]++;
                    break;
                case 2:
                    cont[1]++;
                    break;
                case 3:
                    cont[2]++;
                    break;
                case 4:
                    cont[3]++;
                    break;
                case 5:
                    cont[4]++;
                    break;
                default:
                    System.out.println("Numero mayor a 5 digitos");
            }
        }

        System.out.println("En el arreglo hay: ");
        for (int i = 0; i < cont.length; i++) {
            System.out.println(cont[i] + " Numeros con " + (i + 1) + " cifras");
        }
    }
}
