package javaintroexercises;

import java.util.Scanner;
import java.text.DecimalFormat;

public class extra_ex06 {
    public static void main(String[] args) {
        DecimalFormat decimalFormat = new DecimalFormat("#.##");
        Scanner sc = new Scanner(System.in);
        int count = 0;
        float avg_ht_160 = 0, avg_ht = 0;

        System.out.println("Ingrese cuantas estaturas va a ingresar: ");
        int num_height = sc.nextInt();
        float[] heights = new float[num_height];

        for (int i = 0; i < num_height; i++) {
            System.out.println("Ingrese el valor de la estatura no. " + (i + 1) + ": ");
            heights[i] = sc.nextFloat();
        }
        for (float ht : heights) {
            if (ht < 1.60) {
                avg_ht_160 += ht;
                count++;
            }

            avg_ht += ht;
        }
        System.out.println("El promedio de las personas con estatura menor a 1.60 es de: "
                            + decimalFormat.format(avg_ht_160 / count));
        System.out.println("El promedio de todas las estaturas es de: "
                            + decimalFormat.format(avg_ht / heights.length));
    }
}
