import java.util.*;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number for Factorial:");
        int n = sc.nextInt();
        int i, fact = 1;
        for (i = 1; i <= n; i++) {
            fact = fact * i;
        }
        System.out.println("factorial is:" + fact);

    }
}
