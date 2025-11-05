// Iterative Fibonaaci

import java.util.Scanner;

public class IterativeFibonacci {

    static void fib(int n) {
        int t0 = 0;
        int t1 = 1;
        int s;

        if (n <= 0) return;

        for (int i = 0; i < n; i++) {
            System.out.print(t0 + " ");
            s = t0 + t1;
            t0 = t1;
            t1 = s;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int n = sc.nextInt();

        fib(n);
        sc.close();
    }
}



// Recursive Fibonaaci

import java.util.Scanner;

public class RecursiveFibonacci {

    static int fib(int n) {
        if (n <= 1) {
            return n;
        }
        return fib(n - 2) + fib(n - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print(fib(i) + " ");
        }
        sc.close();
    }
}
