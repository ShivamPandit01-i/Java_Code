public class Knapsack {

    static int knapsack(int[] wt, int[] val, int W, int n) {

        if (n == 0 || W == 0) {
            return 0;
        }

        if (wt[n - 1] > W) {

            return knapsack(wt, val, W, n - 1);
        }

        else {

            int include = val[n - 1]
                    + knapsack(wt, val,
                    W - wt[n - 1], n - 1);

            int exclude = knapsack(wt, val,
                    W, n - 1);


            return Math.max(include, exclude);
        }
    }

    public static void main(String[] args) {

        int[] wt = {1, 3, 4, 5};
        int[] val = {10, 40, 50, 70};

        int W = 8;

        int n = wt.length;

        int result = knapsack(wt, val, W, n);

        System.out.println("Maximum Profit = " + result);
    }
}