import java.util.*;

public class FractionalKnapsack {

    // Method to calculate maximum profit
    static double fractionalKnapsack(double[][] items, double capacity) {
        int n = items.length;

        // Calculate profit/weight ratio
        for (int i = 0; i < n; i++) {
            items[i][2] = items[i][0] / items[i][1];
        }

        // Sort items by ratio in descending order
        Arrays.sort(items, (a, b) -> Double.compare(b[2], a[2]));

        double totalProfit = 0.0;

        for (int i = 0; i < n; i++) {
            if (capacity >= items[i][1]) {
                totalProfit += items[i][0];
                capacity -= items[i][1];
            } else {
                totalProfit += items[i][2] * capacity;
                break;
            }
        }

        return totalProfit;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of Objects: ");
        int n = sc.nextInt();

        System.out.print("Enter the knapsack capacity: ");
        double capacity = sc.nextDouble();

        double[][] items = new double[n][3]; // 0-profit, 1-weight, 2-ratio

        System.out.println("Enter profit and weight of each item:");
        for (int i = 0; i < n; i++) {
            items[i][0] = sc.nextDouble(); // profit
            items[i][1] = sc.nextDouble(); // weight
        }

        double maxProfit = fractionalKnapsack(items, capacity);
        System.out.printf("MaxProfit : %.4f", maxProfit);

        sc.close();
    }
}