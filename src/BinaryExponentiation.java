import java.util.Scanner;

public class BinaryExponentiation {

    static long power(long a, long b, long mod) {

        long result = 1;
        a = a % mod;

        while (b > 0) {
            if ((b & 1) == 1)
                result = (result * a) % mod;

            a = (a * a) % mod;
            b = b >> 1;
        }
        return result;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter base, exponent and mod: ");
        long a = sc.nextLong();
        long b = sc.nextLong();
        long mod = sc.nextLong();

        System.out.println("Result: " + power(a, b, mod));
        sc.close();
    }
}
