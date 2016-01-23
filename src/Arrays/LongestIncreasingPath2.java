package Arrays;

public class LongestIncreasingPath2 {

    public static void main(String[] args) {
        int[][] arr = {{9, 9, 4}, {6, 6, 8}, {2, 1, 1}};
        int longestIncreasingPath = new LongestIncreasingPath2().longestIncreasingPath(arr);
        System.out.println(longestIncreasingPath);
    }

    public int longestIncreasingPath(int[][] matrix) {
        int[][] dp = new int[matrix.length][matrix[0].length];
        dp[0][0] = 1;
        for (int i = 1; i < matrix.length; i++) {
            if (matrix[i][0] > matrix[i - 1][0]) {
                if (dp[i - 1][0] > 0) {
                    dp[i][0] = dp[i - 1][0] + 1;
                } else {
                    dp[i][0] = 2;
                }
            } else if (matrix[i][0] < matrix[i - 1][0]) {
                if (dp[i - 1][0] < 0) {
                    dp[i][0] = dp[i - 1][0] - 1;
                } else {
                    dp[i][0] = -2;
                }
            } else {
                dp[i][0] = 1;
            }
        }
        
        for (int j = 1; j < matrix[0].length; j++) {
            if (matrix[0][j] > matrix[0][j - 1]) {
                if (dp[0][j-1] > 0) {
                    dp[0][j] = dp[0][j - 1] + 1;
                } else {
                    dp[0][j] = 2;
                }
            } else if (matrix[0][j] < matrix[0][j - 1]) {
                if (dp[0][j - 1] < 0) {
                    dp[0][j] = dp[0][j - 1] - 1;
                } else {
                    dp[0][j] = -2;
                }
            } else {
                dp[0][j] = 1;
            }
        }
        
        
        for (int i = 1; i < matrix.length; i++) {
            for (int j = 1; j < matrix[0].length; j++) {

                int current = matrix[i][j];
                int pre_x = Integer.MIN_VALUE;
                int pre_y = Integer.MIN_VALUE;

                if (i - 1 >= 0) {
                    pre_x = matrix[i - 1][j];
                }
                if (j - 1 >= 0) {
                    pre_y = matrix[i][j - 1];
                }

                if (current > pre_x && current > pre_y) {
                    if (dp[i - 1][j] > 0 || dp[i][j - 1] > 0) {
                        dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]) + 1;
                    } else {
                        dp[i][j] = 1;
                    }
                } else if (current < pre_x && current < pre_y) {
                    if (dp[i - 1][j] < 0 || dp[i][j - 1] < 0) {
                        dp[i][j] = Math.min(dp[i - 1][j], dp[i][j - 1]) - 1;
                    } else {
                        dp[i][j] = 1;
                    }
                } else {
                    if(current == pre_x || current == pre_y){
                        
                    }
                    
                    
                }
                    
                    
                    
                    
                    
                    
                    if (Math.abs(dp[i - 1][j]) > Math.abs(dp[i][j - 1])) {
                    if (dp[i - 1][j] > 0) {
                        dp[i][j] = dp[i - 1][j] + 1;
                    } else {
                        dp[i][j] = dp[i - 1][j] - 1;
                    }
                } else if (dp[i][j - 1] > 0) {
                    dp[i][j] = dp[i][j - 1] + 1;
                } else {
                    dp[i][j] = dp[i][j - 1] - 1;
                }
            }
        }
        
        for (int i = 0; i < dp.length; i++) {
            for (int j = 0; j < dp[0].length; j++) {
                System.out.print(dp[i][j] + "  ");
            }
            System.out.println();
        }
        
        
        return 0;
    }
}
