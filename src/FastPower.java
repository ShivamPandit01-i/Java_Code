import java.util.Scanner;

public class FastPower {

    static long fastPower(long a, long b) {

        long result = 1;

        while (b > 0) {
            if ((b & 1) == 1)
                result = result * a;

            a = a * a;
            b = b >> 1;
        }
        return result;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter base and exponent: ");
        long a = sc.nextLong();
        long b = sc.nextLong();

        System.out.println("Result: " + fastPower(a, b));
        sc.close();
    }
}
