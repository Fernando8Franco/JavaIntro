package javaintroexercises;

import java.util.Scanner;

public class exercise20 {
    public static void main(String[] args) {
        int[][] matrix = new int[3][3];

        fillMatrix(matrix, 3);
        printMatrix(matrix);

        System.out.println(checkMagicMatrix(matrix) ? "Es una matriz magica" : "No es una matriz magica");
    }

    private static boolean checkMagicMatrix(int[][] m) {
        int size = m.length;
        int sumadiagonal1 = 0;
        int sumadiagonal2 = 0;

        for (int i = 0; i < size; i++) {
            sumadiagonal1 += m[i][i];
            sumadiagonal2 += m[i][size - i - 1];
        }

        if (sumadiagonal1 != sumadiagonal2) {
            return false;
        }

        for (int i = 0; i < size; i++) {
            int sumafila = 0;
            int sumacolumna = 0;

            for (int j = 0; j < size; j++) {
                sumafila += m[i][j];
                sumacolumna += m[j][i];
            }

            if (sumafila != sumadiagonal1 || sumacolumna != sumadiagonal1) {
                return false;
            }
        }

        return true;
    }

    private static void fillMatrix(int[][] m, int size) {
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print("Ingrese el valor de la posición [" + i + "][" + j + "]: ");
                m[i][j] = sc.nextInt();
            }
        }
    }

    private static void printMatrix(int[][] m) {
        for (int[] fila : m) {
            for (int elemento : fila) {
                //System.out.print(elemento + " ");
                System.out.print(String.valueOf(elemento).length() > 1 ? elemento + " " :  " " + elemento + " ");
            }
            System.out.println();
        }
    }
}
