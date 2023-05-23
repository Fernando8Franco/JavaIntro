package javaintroexercises;

import java.util.Scanner;

public class exercise9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String phrase = "";

        while(true) {
            System.out.println("Ingrese una frase: ");
            phrase = sc.nextLine();
            System.out.println(!(phrase.charAt(0) != 'A') ? "CORRECTO" : "INCORRECTO");

            if(phrase.charAt(0) == 'A') break;
        }
    }
}
