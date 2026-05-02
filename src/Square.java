import java.util.Scanner;

public class Square{

    public static int floorSqrt(int n) {
        if (n == 0 || n == 1) {
            return n;
        }

        int start = 1, end = n, ans = 0;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (mid <= n / mid) {
                start = mid + 1;
                ans = mid;
            } else {
                end = mid - 1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int floor = floorSqrt(n);
        int ceil;
        if (floor * floor == n) {
            ceil = floor;
        } else {
            ceil = floor + 1;
        }

        System.out.println("Number: " + n);
        System.out.println("Floor of square root: " + floor);
        System.out.println("Ceil of square root: " + ceil);
        sc.close();
    }
}
