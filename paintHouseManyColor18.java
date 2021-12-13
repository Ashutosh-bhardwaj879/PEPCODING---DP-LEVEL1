import java.util.*;

class paintHouseManyColor {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int c = scn.nextInt();

        int[][] arr = new int[n][c];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < c; j++) {
                arr[i][j] = scn.nextInt();
            }
        }

        int[][] dp = new int[n][c];

        int least = Integer.MAX_VALUE;
        int second_least = Integer.MAX_VALUE;

        for (int j = 0; j < c; j++) {
            dp[0][j] = arr[0][j];

            if (arr[0][j] <= least) {
                second_least = least;
                least = arr[0][j];
            } else if (arr[0][j] <= second_least) {
                second_least = arr[0][j];
            }
        }

        for (int i = 1; i < dp.length; i++) {
            int temp_least = Integer.MAX_VALUE;
            int temp_second_least = Integer.MAX_VALUE;
            for (int j = 0; j < dp[0].length; j++) {

                if (dp[i - 1][j] == least) {
                    dp[i][j] = second_least + arr[i][j];
                } else {
                    dp[i][j] = least + arr[i][j];
                }

                if (dp[i][j] <= temp_least) {
                    temp_second_least = temp_least;
                    temp_least = dp[i][j];
                } else if (dp[i][j] <= temp_second_least) {
                    temp_second_least = dp[i][j];
                }
            }
            least = temp_least;
            second_least = temp_second_least;
        }
        System.out.println(least);
        scn.close();
    }
}