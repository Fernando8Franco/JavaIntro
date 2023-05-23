package javaintroexercises;

import javax.swing.plaf.IconUIResource;
import java.util.Scanner;

public class exercise11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean flag = true;

        System.out.println("Ingrese dos numeros enteros positivos: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        while (flag) {
            menu();
            int op = sc.nextInt();
            switch (op) {
                case 1:
                    System.out.println("La suma de los dos numeros es: " + (num1 + num2));
                    break;
                case 2:
                    System.out.println("La resta de los dos numeros es: " + (num1 - num2));
                    break;
                case 3:
                    System.out.println("La multiplicación de los dos numeros es: " + (num1 * num2));
                    break;
                case 4:
                    System.out.println("La división de los dos numeros es: " + (num1 / num2));
                    break;
                case 5:
                    sc.nextLine();
                    System.out.println("¿Está seguro que desea salir del programa (S/N)?: ");
                    String exit = sc.nextLine();
                    if(exit.equalsIgnoreCase("S")) {
                        System.out.println("¡Gracias!");
                        flag = false;
                    }
                    break;
                default:
                    System.out.println("Opción no valida");
            }
        }
    }

    public static void menu() {
        System.out.println("MENU\n 1.Sumar\n 2.Restar\n 3.Multiplicar\n 4.Dividir\n 5.Salir\n Elija una opción: ");
    }
}
