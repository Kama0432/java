import java.util.*;

public class Prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        int i;
        for (i = 2; i < n; i++) {
            if (n % i == 0) {
                System.out.println(n + " not prime number");
                break;
            }
        }
        if (i == n) {
            System.out.println(n + " is prime number");
        }

    }
}
