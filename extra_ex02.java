package javaintroexercises;

public class extra_ex02 {
    public static void main(String[] args) {
        int a = 1, b = 2, c = 3, d = 4, aux;

        System.out.println("a = "+ a + " b = " + b + " c = " + c + " d = " + d);
        aux = b;
        b = c;
        c = a;
        a = d;
        d = aux;
        System.out.println("a = "+ a + " b = " + b + " c = " + c + " d = " + d);
    }
}
