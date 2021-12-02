import java.util.*;

class ZeroOneKnapsack {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int[] value = new int[n];
        int[] weight = new int[n];
        for (int i = 0; i < n; i++) {
            value[i] = scn.nextInt();
        }

        for (int i = 0; i < n; i++) {
            weight[i] = scn.nextInt();
        }

        int balls = scn.nextInt();

        int[][] dp = new int[n + 1][balls + 1];

        for (int i = 1; i < dp.length; i++) {
            for (int j = 1; j < dp[0].length; j++) {
                if (j >= weight[i - 1]) {
                    int remaining_balls = j - weight[i - 1];
                    if (dp[i - 1][remaining_balls] + value[i - 1] > dp[i - 1][j]) {
                        dp[i][j] = dp[i - 1][remaining_balls] + value[i - 1];
                    } else {
                        dp[i][j] = dp[i - 1][j];
                    }
                } else {
                    dp[i][j] = dp[i - 1][j];
                }
            }
        }
        System.out.println(dp[n][balls]);
        scn.close();
    }
}