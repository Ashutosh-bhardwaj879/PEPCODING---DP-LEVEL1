import java.util.*;
//Fibonacci till N
class FibonacciUsingDP {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        System.out.println(fibRecursion(n));
        System.out.println(fibonacciDP(n, new int[n + 1]));
        scn.close();
    }

    public static int fibRecursion(int n) {
        if (n == 0 || n == 1) {// BASE CASE
            return n;
        }
        // fibonacci of (n-1)
        int fibnm1 = fibRecursion(n - 1);
        // fianacci of (n-2)
        int fibnm2 = fibRecursion(n - 2);
        // fib of n = fib of (n-1) + fib of (n-2)
        int fibn = fibnm1 + fibnm2;
        return fibn;
    }

    public static int fibonacciDP(int n, int[] dp) {
        if (n == 0 || n == 1) {// base case if n reaches 0 or 1
            return n;
        }
        if (dp[n] != 0) {
            return dp[n];
        }
        // fibonacci of (n-1)
        int fibnm1 = fibonacciDP(n - 1, dp);
        // fianacci of (n-2)
        int fibnm2 = fibonacciDP(n - 2, dp);
        // fib of n = fib of (n-1) + fib of (n-2)
        int fibn = fibnm1 + fibnm2;

        dp[n] = fibn;
        return fibn;
    }
}