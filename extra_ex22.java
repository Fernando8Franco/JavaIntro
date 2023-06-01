package javaintroexercises;

import java.util.Random;

public class extra_ex22 {
    public static void main(String[] args) {
        int rows = 3; // Número de filas
        int columns = 4; // Número de columnas

        // Crear la matriz y rellenarla con valores aleatorios
        int[][] matrix = generateMatrix(rows, columns);

        // Mostrar la matriz
        System.out.println("Matriz:");
        displayMatrix(matrix);

        // Calcular la suma de los elementos de la matriz
        int sum = calculateSum(matrix);

        // Mostrar la suma de los elementos de la matriz
        System.out.println("Suma de los elementos: " + sum);
    }

    // Generar una matriz de tamaño rows x columns con valores aleatorios
    public static int[][] generateMatrix(int rows, int columns) {
        int[][] matrix = new int[rows][columns];
        Random random = new Random();

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                matrix[i][j] = random.nextInt(100); // Valores aleatorios entre 0 y 99
            }
        }

        return matrix;
    }

    // Mostrar la matriz en la consola
    public static void displayMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.printf("%2d ", matrix[i][j]);
            }
            System.out.println();
        }
    }

    // Calcular la suma de los elementos de la matriz
    public static int calculateSum(int[][] matrix) {
        int sum = 0;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                sum += matrix[i][j];
            }
        }

        return sum;
    }
}
