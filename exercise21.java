package javaintroexercises;

import java.util.Scanner;

public class exercise21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] matrix = {{1, 26, 36, 47, 5, 6, 72, 81, 95, 10},
                          {11, 12, 13, 21, 41, 22, 67, 20, 10, 61},
                          {56, 78, 87, 90, 9, 90, 17, 12, 87, 67},
                          {41, 87, 24, 56, 97, 74, 87, 42, 64, 35},
                          {32, 76, 79, 1, 36, 5, 67, 96, 12, 11},
                          {99, 13, 54, 88, 89, 90, 75, 12, 41, 76},
                          {67, 78, 87, 45, 14, 22, 26, 42, 56, 78},
                          {98, 45, 34, 23, 32, 56, 74, 16, 19, 18},
                          {24, 67, 97, 46, 87, 13, 67, 89, 93, 24},
                          {21, 68, 78, 98, 90, 67, 12, 41, 65, 12}};

        int[][] sub_matrix = {{36, 5, 67},
                {89, 90, 75},
                {14, 22, 26}};

        boolean found = findSubMatrix(matrix, sub_matrix);

        if (found) {
            System.out.println("La submatriz fue encontrada.");
        } else {
            System.out.println("La submatriz no fue encontrada.");
        }
    }

    public static boolean findSubMatrix(int[][] matrix, int[][] sub_matrix) {
        int rowMatrix = matrix.length;
        int colMatrix = matrix[0].length;
        int rowSubmatrix = sub_matrix.length;
        int colSubmatrix = sub_matrix[0].length;

        for (int i = 0; i <= rowMatrix - rowSubmatrix; i++) {
            for (int j = 0; j <= colMatrix - colSubmatrix; j++) {
                boolean match = true;

                for (int k = 0; k < rowSubmatrix; k++) {
                    for (int l = 0; l < colSubmatrix; l++) {
                        if (matrix[i + k][j + l] != sub_matrix[k][l]) {
                            match = false;
                            break;
                        }
                    }

                    if (!match) {
                        break;
                    }
                }

                if (match) {
                    System.out.println(i + " " + j);
                    return true;
                }
            }
        }

        return false;
    }
}
