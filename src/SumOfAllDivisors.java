import java.util.Scanner;

public class SumOfAllDivisors {

    static long sum(int n) {
        long result = 0;
        for (int i = 1; i <= n; i++) {
            result += (long) i * (n / i);
        }
        return result;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        System.out.println("Sum of all divisors: " + sum(n));
        sc.close();
    }
}
