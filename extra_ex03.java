package javaintroexercises;

import java.util.Scanner;

public class extra_ex03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("Ingrese una letra");
            String character = sc.nextLine();

            if(character.equals("0")) break;

            System.out.println((character.matches("[aeiouAEIOU]") ? "" : "NO ") + "es una vocal");
        }

    }
}
