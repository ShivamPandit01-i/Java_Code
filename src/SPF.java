import java.util.Scanner;

public class SPF {

    static final int MAX = 100000;
    static int spf[] = new int[MAX + 1];

    static void computeSPF() {

        for (int i = 1; i <= MAX; i++)
            spf[i] = i;

        for (int i = 2; i * i <= MAX; i++) {
            if (spf[i] == i) {
                for (int j = i * i; j <= MAX; j += i) {
                    if (spf[j] == j)
                        spf[j] = i;
                }
            }
        }
    }

    public static void main(String[] args) {

        computeSPF();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        while (n != 1) {
            System.out.print(spf[n] + " ");
            n = n / spf[n];
        }
        sc.close();
    }
}
