package javaintroexercises;

import java.util.Scanner;
import java.text.DecimalFormat;

public class exercise14 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese la moneda (Dolares / Yenes / Libras): ");
        String coin = sc.nextLine();
        System.out.println("Ingrese la cantidad: ");
        float mount = sc.nextFloat();

        showChange(coin, mount);
    }

    private static void showChange(String c, float m) {
        DecimalFormat decimal_format = new DecimalFormat("0.00");

        if(c.equalsIgnoreCase("dolares")) {
            System.out.println(c + " dolares son " + decimal_format.format(m / 0.86) + " euros");
        } else if (c.equalsIgnoreCase("yenes")) {
            System.out.println(c + " yenes son " + decimal_format.format(m / 0.86) + " euros");
        } else if (c.equalsIgnoreCase("libras")) {
            System.out.println(c + " libras son " + decimal_format.format(m / 0.86) + " euros");
        } else {
            System.out.println("Moneda no valida");
        }
    }
}
