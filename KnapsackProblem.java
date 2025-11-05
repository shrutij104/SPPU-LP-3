import java.util.*;

public class KnapsackProblem {

    // Function to calculate maximum profit using Dynamic Programming
    static int knapsackProblem(int n, int m, int[][] items) {
        int[][] T = new int[n + 1][m + 1];

        for (int i = 1; i <= n; i++) {
            int profit = items[i - 1][0];
            int weight = items[i - 1][1];

            for (int j = 1; j <= m; j++) {
                if (weight <= j) {
                    T[i][j] = Math.max(T[i - 1][j], T[i - 1][j - weight] + profit);
                } else {
                    T[i][j] = T[i - 1][j];
                }
            }
        }

        return T[n][m];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of Objects: ");
        int n = sc.nextInt();

        System.out.print("Enter the knapsack capacity: ");
        int m = sc.nextInt();

        int[][] items = new int[n][2];
        System.out.println("Enter the profit and weights for knapsack: ");
        for (int i = 0; i < n; i++) {
            items[i][0] = sc.nextInt(); // profit
            items[i][1] = sc.nextInt(); // weight
        }

        int maxProfit = knapsackProblem(n, m, items);
        System.out.println("Maximum Profit : " + maxProfit);

        sc.close();
    }
}