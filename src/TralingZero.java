import java.util.Scanner;

public class TralingZero {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        long fact = 1;
        for (int i = 1; i <= n; i++) {
            fact = fact * i;
        }

        System.out.println("Factorial of " + n + " is: " + fact);

        int count = 0;
        int temp = n;
        while (temp >= 5) {
            count += temp / 5;
            temp /= 5;
        }

        System.out.println("Number of trailing zeroes: " + count);
        sc.close();
    }
}
