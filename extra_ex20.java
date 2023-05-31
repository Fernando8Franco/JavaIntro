package javaintroexercises;

import java.util.Random;

public class extra_ex20 {
    public static void main(String[] args) {
        int[] vector = new int[10];
        llenarVectorAleatorio(vector);
        imprimirVector(vector);
    }

    public static void llenarVectorAleatorio(int[] v) {
        Random random = new Random();
        for (int i = 0; i < v.length; i++) {
            v[i] = random.nextInt(100);
        }
    }

    public static void imprimirVector(int[] v) {
        for (int i = 0; i < v.length; i++) {
            System.out.print(v[i] + " ");
        }
        System.out.println();
    }
}
