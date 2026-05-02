import java.util.Scanner;

public class ModularMultiplication {

    static long modularMultiply(long a, long b, long mod) {

        long result = 0;
        a = a % mod;

        while (b > 0) {
            if ((b & 1) == 1)
                result = (result + a) % mod;

            a = (a * 2) % mod;
            b = b >> 1;
        }
        return result;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a, b and mod: ");
        long a = sc.nextLong();
        long b = sc.nextLong();
        long mod = sc.nextLong();

        System.out.println("Result: " + modularMultiply(a, b, mod));
        sc.close();
    }
}
