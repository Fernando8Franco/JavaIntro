package javaintroexercises;

import java.util.Locale;
import java.util.Scanner;

public class extra_ex05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el tipo de clase social [A - B - C]: ");
        String partner_class = sc.nextLine();
        System.out.println("Ingrese el coste del tratamiento: ");
        double cost = sc.nextDouble();

        switch (partner_class.toUpperCase()) {
            case "A":
                printCost(partner_class ,cost, .50);
                break;
            case "B":
                printCost(partner_class ,cost, .65);
                break;
            case "C":
                printCost(partner_class ,cost, 1);
                break;
            default:
                System.out.println("Clase de socio no valida");
        }
    }

    private static void printCost(String p, double c, double d) {
        System.out.println("El precio final para el socio " + p.toUpperCase() + " es de: " + (c * d));
    }

}
