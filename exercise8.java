package javaintroexercises;

import java.util.Scanner;

public class exercise8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String phrase = "";

        while(true) {
            System.out.println("Ingrese una frase: ");
            phrase = sc.nextLine();
            System.out.println(phrase.length() == 8 ? "CORRECTO" : "INCORRECTO");

            if(phrase.length() == 8) break;
        }
    }
}
