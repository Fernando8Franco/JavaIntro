package javaintroexercises;
import java.util.Random;
import java.util.Scanner;

public class extra_ex23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[][] soup = new char[20][20];
        String word;

        System.out.println("Bienvenido a la sopa al generador de sopa de letras");
        System.out.println("Ingrese 5 palabras que tenga de 3-5 letras");

        for (int i = 1; i <= 5; i++) {
            while (true) {
                System.out.print("Ingrese la palabra no. " + i + ": ");
                word = sc.nextLine().toUpperCase();
                if(word.length() < 3 || word.length() > 5)
                    System.out.println("La palabra no esta en el rango de 3 a 5 letras");
                else
                    break;
            }
            putAlphabetSoup(word, soup);
        }

        fillAlphabetSoup(soup);

        showAlphabetSoup(soup);
    }

    private static void putAlphabetSoup(String w, char[][] s) {
        Random random = new Random();
        boolean flag = true;
        int row, col;

        while (true) {
            row = random.nextInt(16);
            col = random.nextInt(16);

            for (int j = col; j < (col + w.length()); j++) {
                if (s[row][j] != '\0') {
                    flag = false;
                    break;
                }
            }

            if (flag) break;
        }

        int k = 0;
        for (int j = col; j < (col + w.length()); j++) {
            s[row][j] = w.charAt(k++);
        }
    }

    private static void fillAlphabetSoup(char[][] s) {
        Random random = new Random();
        for (int i = 0; i < s.length; i++) {
            for (int j = 0; j < s.length; j++) {
                if (s[i][j] == '\0') s[i][j] = (char)(random.nextInt(26) + 'A');
            }
        }
    }

    private static void showAlphabetSoup(char[][] s) {
        for (int i = 0; i < s.length; i++) {
            for (int j = 0; j < s.length; j++) {
                System.out.print(s[i][j] + " ");
            }
            System.out.println();
        }
    }
}
