class Solution {
    public int solution(int m, int n, int[][] puddles) {
        int answer = 0;
        int[][] arr = new int[m][n];
        
        for (int i = 0; i < puddles.length; i++) {
            arr[puddles[i][0] - 1][puddles[i][1] - 1] = -1;
        }
        
        arr[0][0] = 1;
        
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if ((i == 0 && j == 0) || arr[i][j] == -1) {
					continue;
				}
				int temp = 0;
				
				if (i > 0 && arr[i-1][j] > 0) {
					temp += arr[i-1][j];
				}
				
				if (j > 0 && arr[i][j-1] > 0) {
					temp += arr[i][j-1];
				}
				
				arr[i][j] = temp % 1000000007;
            }
        }
        
        
        answer = arr[m-1][n-1];
        return answer;
    }
}