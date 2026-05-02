import java.util.Scanner ;

public class PowerNumber {

    static long powerRecursive(int base, int exp) {
        if (exp == 0)
            return 1;
        return base * powerRecursive(base, exp - 1);
    }

    static long powerIterative(int base, int exp) {
        long result = 1;
        for (int i = 1; i <= exp; i++) {
            result *= base;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter base: ");
        int base = sc.nextInt();

        System.out.print("Enter exponent: ");
        int exponent = sc.nextInt();

        long recursiveResult = powerRecursive(base, exponent);
        long iterativeResult = powerIterative(base, exponent);

        System.out.println("\nUsing Recursive Method: " + base + "^" + exponent + " = " + recursiveResult);
        System.out.println("Using Iterative Method: " + base + "^" + exponent + " = " + iterativeResult);

        sc.close();
    }
}
