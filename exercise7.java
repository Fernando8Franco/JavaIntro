package javaintroexercises;

import java.util.Scanner;

public class exercise7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String phrase = "";

        //Necesitas el ! porque el while debe tener TRUE para comenzarlo

        while (!phrase.equalsIgnoreCase("eureka")) {
            System.out.println("Ingrese una frase: ");
            phrase = sc.nextLine();
        }
    }
}
