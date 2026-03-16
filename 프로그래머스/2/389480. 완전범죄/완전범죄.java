import java.util.*;

class Solution {
    public int solution(int[][] info, int n, int m) {
		int answer = Integer.MAX_VALUE;
		
		int[][] dp = new int[info.length+1][m];
		
		for (int i = 1; i < info.length+1; i++) {
			Arrays.fill(dp[i], 120);
		}
		
		for (int i = 0; i < info.length; i++) {
			int a = info[i][0];
			int b = info[i][1];
			
			for (int j = 0; j < m; j++) {
				// A도둑
				dp[i+1][j] = Math.min(dp[i+1][j], dp[i][j] + a);
				
				// B도둑
				if (b + j < m) {
					dp[i+1][b+j] = Math.min(dp[i+1][b+j], dp[i][j]);
				}
			}
		}
		
		for (int i = 0; i < m; i++) {
			answer = Math.min(answer, dp[info.length][i]);
		}
		
		if (answer >= n) {
			answer = -1;
		}
		
		return answer;
	}
}