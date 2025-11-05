import java.util.Scanner;
public class daa1 {
    
    static int fibRecursive(int num) {
        if (num == 0 || num == 1) return num;
        return fibRecursive(num-1)+fibRecursive(num-2); 
    }

    static int fibIterative(int num){
        if(num == 0 || num == 1) return num;
        
        int f1 = 0,  f2= 1, curr = 0;

        for (int i = 2; i<=num; i++){
            curr = f1+f2;
            f1 = f2;
            f2 = curr;
        }        
        return curr;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("enter number: ");
        int n = sc.nextInt();
        
        long startRec = System.nanoTime();
        System.out.println("recursive approach: ");
        for (int i = 0; i<n; i++){
            System.out.print(fibRecursive(i)+" ");
        }
        long endRec = System.nanoTime();

        long timeRecursive = endRec-startRec;
        long spaceRec = (long) Integer.BYTES * n;
        System.out.println("\ntime: " + timeRecursive + " ns" + "    " +"space: "+ spaceRec + " bytes");

        System.out.println();

        long startIter = System.nanoTime();
        System.out.println("iterative approach: ");
        for (int i = 0; i<n; i++){
            System.out.print(fibIterative(i)+" ");
        }
        long endIter = System.nanoTime();

        long timeIter = endIter - startIter;
        long spaceIter = (long) Integer.BYTES * 4;
        System.out.println("\ntime: " + timeIter +" ns" + "    " +"space: "+ spaceIter +" bytes");

        sc.close();
    }

}
