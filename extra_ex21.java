package javaintroexercises;

import java.util.Scanner;
import java.util.stream.IntStream;

public class extra_ex21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float[][] students_score = new float[10][4];

        for (int i = 0; i < students_score.length; i++) {
            System.out.println("Estudiante no. " + (i + 1));
            System.out.println("Calificación del 1° Trabajo práctico: ");
            students_score[i][0] = sc.nextFloat();
            System.out.println("Calificación del 2° Trabajo práctico: ");
            students_score[i][1] = sc.nextFloat();
            System.out.println("Primer integrador: ");
            students_score[i][2] = sc.nextFloat();
            System.out.println("Segundo integrador: ");
            students_score[i][3] = sc.nextFloat();
        }

        for (int i = 0; i < students_score.length; i++) {
            float finalScore = calculateFinalScore(students_score[i]);
            System.out.println("Calificación final del estudiante " + (i + 1) + ": " + finalScore);
        }
    }

    public static float calculateFinalScore(float[] scores) {
        float[] percentages = {0.10f, 0.15f, 0.25f, 0.50f};
        float finalScore = 0;

        for (int i = 0; i < scores.length; i++) {
            finalScore += scores[i] * percentages[i];
        }

        return finalScore;
    }
}
