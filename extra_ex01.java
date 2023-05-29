package javaintroexercises;

import java.util.Scanner;

public class extra_ex01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese los minutos a convertir: ");
        int minutes = sc.nextInt();

        int days = (minutes / 1440);
        double hours = (minutes % 1440) / 60;

        System.out.println(minutes + " minutos son equivalentes a: ");
        System.out.println("Dias: " + days);
        System.out.println("Horas: " + hours);
    }
}
