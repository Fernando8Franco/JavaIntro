package javaintroexercises;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class exercise16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        int cont = 0;
        List<Integer> positions = new ArrayList<>();

        System.out.println("Ingrese el tamaño del arreglo: ");
        int size = sc.nextInt();

        int[] numbers = new int[size];

        for (int i = 0; i < size; i++) {
            numbers[i] = random.nextInt(1001);
        }

        while (true) {
            System.out.println("Ingrese el numero a buscar: ");
            int search_num = sc.nextInt();

            for (int i = 0; i < size; i++) {
                if (numbers[i] == search_num) {
                    positions.add(i);
                    cont++;
                }
            }

            if (cont > 0) {
                System.out.println("El numero: " + search_num + " fue encontrado: " + cont + " veces");
                System.out.print("Se encuentra en las posiciones del arreglo: ");
                for (int pos : positions) {
                    System.out.print(pos + " ");
                }
                break;
            } else {
                System.out.println("El numero: " + search_num + " NO fue encontrado dentro del arreglo");
            }
        }

    }
}
