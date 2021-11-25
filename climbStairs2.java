
//count paths
import java.util.*;

class climbStairs2 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int cp1 = countPathRecursion(n);
        int cp2 = countPathMemoizationDP(n, new int[n + 1]);
        int cp3 = countPathTabulationDP(n);
        System.out.println(cp1 + " " + cp2 + " " + cp3);
        scn.close();
    }

    public static int countPathRecursion(int n) {
        if (n == 0) {
            return 1;
        } else if (n < 0) {
            return 0;
        }

        int cp1 = countPathRecursion(n - 1);
        int cp2 = countPathRecursion(n - 2);
        int cp3 = countPathRecursion(n - 3);

        int cp = cp1 + cp2 + cp3;
        return cp;
    }

    public static int countPathMemoizationDP(int n, int[] dp) {
        if (n == 0) {
            return 1;
        } else if (n < 0) {
            return 0;
        }

        if (dp[n] != 0) {
            return dp[n];
        }

        int cp1 = countPathMemoizationDP(n - 1, dp);
        int cp2 = countPathMemoizationDP(n - 2, dp);
        int cp3 = countPathMemoizationDP(n - 3, dp);
        int cp = cp1 + cp2 + cp3;

        dp[n] = cp;

        return cp;
    }

    public static int countPathTabulationDP(int n) {
        int[] dp = new int[n + 1];
        dp[0] = 1;
        for (int i = 1; i < dp.length; i++) {
            if (i == 1) {
                dp[i] = dp[i - 1];
            } else if (i == 2) {
                dp[i] = dp[i - 1] + dp[i - 2];
            } else {
                dp[i] = dp[i - 1] + dp[i - 2] + dp[i - 3];
            }
        }
        return dp[n];
    }
}
