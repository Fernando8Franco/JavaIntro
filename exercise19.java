package javaintroexercises;

import java.util.Random;
import java.util.Scanner;

public class exercise19 {
    public static void main(String[] args) {
        int[][] matrix = new int[3][3];
        int[][] matrixT = new int[3][3];

        fillMatrix(matrix, 3);
        fillMatrixT(matrix, matrixT, 3);

        printMatrix(matrix);
        System.out.println();
        printMatrix(matrixT);
        System.out.println(checkAT(matrix, matrixT, 3) ? "Es una matriz anti simétrica" :
                                                              "NO es una matriz anti simétrica");
    }

    private static boolean checkAT(int[][] m, int[][] mt, int size) {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if(m[i][j] != -mt[i][j]) {
                    return false;
                }
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

    private static void fillMatrixT(int[][] m, int[][] mt, int size) {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                mt[j][i] = m[i][j];
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
