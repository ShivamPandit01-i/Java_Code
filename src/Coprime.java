import java.util.Scanner;

public class Coprime {

    static int gcd(int a, int b) {
        if (b == 0)
            return a;
        return gcd(b, a % b);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (gcd(i, n) == 1)
                count++;
        }

        System.out.println("Coprime count: " + count);
        sc.close();
    }
}
