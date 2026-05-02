import java.util.Scanner;

public class ModInverse {

    static long power(long a, long b, long mod) {

        long result = 1;
        while (b > 0) {
            if ((b & 1) == 1)
                result = (result * a) % mod;

            a = (a * a) % mod;
            b = b >> 1;
        }
        return result;
    }

    static long modInverse(long a, long mod) {
        return power(a, mod - 2, mod);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number and mod: ");
        long a = sc.nextLong();
        long mod = sc.nextLong();

        System.out.println("Modular Inverse: " + modInverse(a, mod));
        sc.close();
    }
}
