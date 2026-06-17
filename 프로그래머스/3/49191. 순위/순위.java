class Solution {
    public int solution(int n, int[][] results) {
        int answer = 0;
    	
    	int[][] arr = new int[n][n];
    	
    	for (int i = 0; i < results.length; i++) {
    		int win = results[i][0] - 1;
    		int lose = results[i][1] - 1;
    		
    		arr[win][lose] = 1;
    		arr[lose][win] = -1;
    	}
    	
    	for (int i = 0; i < n; i++) {
    		for (int j = 0; j < n; j++) {
    			if (i==j) continue;
    			for (int k = 0; k < n; k++) {
    				if (i==k || j==k) continue;
    				if (arr[i][j] == 1 && arr[j][k] == 1) {
    					arr[i][k] = 1;
    					arr[k][i] = -1;
    				}
    				
    				if (arr[i][j] == -1 && arr[j][k] == -1) {
    					arr[i][k] = -1;
    					arr[k][i] = 1;
    				}
    			}
    		}
    	}
    	
    	for (int i = 0; i < n; i++) {
    		boolean b = true;
    		for (int j = 0; j < n; j++) {
    			if (i == j) continue;
    			if (arr[i][j] == 0) {
    				b = false;
    				break;
    			}
    		}
    		if (b) {
    			answer++;
    		}
    	}
    	
    	return answer;
    }
}