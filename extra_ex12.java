package javaintroexercises;

import java.text.DecimalFormat;

public class extra_ex12 {
    public static void main(String[] args) {
        DecimalFormat format_num = new DecimalFormat("000");
        String num_format;

        for (int i = 0; i < 1000; i++) {
            num_format = format_num.format(i).replace("3", "E");

            System.out.printf("%s-%s-%s%n", num_format.charAt(0), num_format.charAt(1), num_format.charAt(2));
        }
    }
}
