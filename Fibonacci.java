import java.util.*;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("entera a number for fibonacci series:");
        int n = sc.nextInt();
        int a = 0, b = 1, c = 0;
        for (int i = 1; i <= n; i++) {
            System.out.println(a);
            c = a + b;
            a = b;
            b = c;

        }

    }
}
