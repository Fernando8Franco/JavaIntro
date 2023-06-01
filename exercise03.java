package javaintroexercises;

import java.util.Locale;
import java.util.Scanner;

public class exercise3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese una frase: ");
        String phrase = sc.nextLine();

        System.out.println("La frase en mayusculas: " + phrase.toUpperCase());
        System.out.println("La frase en minusculas: " + phrase.toLowerCase());
    }

}
