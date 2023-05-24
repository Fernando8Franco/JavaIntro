package javaintroexercises;

import java.util.Random;

public class exercise18 {
    public static void main(String[] args) {
        int[][] matrix = new int[4][4];

        fillMatrix(matrix, 4);

        System.out.println("Matriz normal: ");
        printMatrix(matrix);

        System.out.println("\n\nMatriz transpuesta: ");
        printMatrixT(matrix, 4);
    }

    private static void printMatrixT(int[][] m, int size) {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(m[j][i] + " ");
            }
            System.out.println();
        }
    }

    private static void printMatrix(int[][] m) {
        for (int[] fila : m) {
            for (int elemento : fila) {
                System.out.print(elemento + " ");
            }
            System.out.println();
        }
    }

    private static void fillMatrix(int[][] m, int size) {
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                m[i][j] = random.nextInt(10);
            }
        }
    }
}
