package javaintroexercises;

import java.util.Scanner;

public class exercise12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count_correct = 0, count_incorrect = 0;
        System.out.println("Dispositivo RS232 activo");

        while(true) {
            System.out.println("Ingrese la cadena: ");
            String chain = sc.nextLine();

            if (chain.equals("&&&&&")) {
                break;
            } else if (chain.length() == 5 && chain.charAt(0) == 'X' && chain.charAt(4) == 'O') {
                count_correct += 1;
            } else {
                count_incorrect += 1;
            }
        }

        System.out.println("Numero de lecturas correctas: " + count_correct);
        System.out.println("Numero de lecturas incorrectas: " + count_incorrect);
    }
}
