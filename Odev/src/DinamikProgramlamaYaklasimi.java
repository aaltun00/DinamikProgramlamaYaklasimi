public class DinamikProgramlamaYaklasimi {

    public static int minTotalTime(int[][] cost, int[][] transition) {
        int n = cost.length;
        int m = cost[0].length;

        int[][] dp = new int[n][m];


        for (int j = 0; j < m; j++) {
            dp[0][j] = cost[0][j];
        }


        for (int i = 1; i < n; i++) {
            for (int j = 0; j < m; j++) {
                dp[i][j] = Integer.MAX_VALUE;
                for (int k = 0; k < m; k++) {
                    int current = dp[i-1][k] + transition[k][j] + cost[i][j];
                    dp[i][j] = Math.min(dp[i][j], current);
                }
            }
        }


        int result = Integer.MAX_VALUE;
        for (int j = 0; j < m; j++) {
            result = Math.min(result, dp[n-1][j]);
        }

        return result;
    }

    // Test
    public static void main(String[] args) {
        int[][] cost = {
                {4, 5},
                {6, 3},
                {2, 4}
        };

        int[][] transition = {
                {0, 2},
                {3, 0}
        };

        int minTime = minTotalTime(cost, transition);
        System.out.println("Minimum toplam süre: " + minTime);
    }
}
