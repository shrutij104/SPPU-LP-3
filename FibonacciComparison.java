import java.util.Scanner;

public class FibonacciComparison {
    static int recursiveSteps = 0;
    static int iterativeSteps = 0;

    // Recursive Fibonacci
    static int fibonacciRecursive(int n) {
        recursiveSteps++; // count each call
        if (n <= 1)
            return n;
        return fibonacciRecursive(n - 1) + fibonacciRecursive(n - 2);
    }

    // Iterative Fibonacci
    static void fibonacciIterative(int n) {
        int a = 0, b = 1, c;
        System.out.print("Iterative Fibonacci series: ");
        if (n > 0)
            System.out.print(a + " ");
        if (n > 1)
            System.out.print(b + " ");

        for (int i = 2; i < n; i++) {
            iterativeSteps++;
            c = a + b;
            System.out.print(c + " ");
            a = b;
            b = c;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of terms: ");
        int n = sc.nextInt();

        System.out.print("Recursive Fibonacci series: ");
        for (int i = 0; i < n; i++)
            System.out.print(fibonacciRecursive(i) + " ");
        System.out.println("\nRecursive step count: " + recursiveSteps);

        fibonacciIterative(n);
        System.out.println("Iterative step count: " + iterativeSteps);

        sc.close();
    }
}