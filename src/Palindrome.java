import java.util.Scanner;

public class Palindrome {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int temp = n, rev = 0;
        while (temp != 0) {
            int r = temp % 10;
            rev = rev * 10 + r;
            temp /= 10;
        }

        if (rev == n)
            System.out.println("Palindrome");
        else
            System.out.println("Not Palindrome");

        sc.close();
    }
}
