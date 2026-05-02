import java.util.Scanner;

public class DivisibleBy9 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }

        if (sum % 9 == 0)
            System.out.println("Divisible by 9");
        else
            System.out.println("Not divisible by 9");

        sc.close();
    }
}
