import java.util.*;

class Solution {
    public int solution(int[][] land) {
        int answer = 0;
        int n = land.length;
        int m = land[0].length;

        boolean[][] visited = new boolean[n][m];
        int[] num = new int[m];
        
        for (int i = 0; i < n; i++) {
        	for (int j = 0; j < m; j++) {
        		if (!visited[i][j] && land[i][j] == 1) {
        			
        	        int count = 0;
        	        boolean[] isAdd = new boolean[m];
        	        
        			Queue<int[]> q = new LinkedList<>();
        			q.add(new int[] {i, j});
        			visited[i][j] = true;
        			
        			while (!q.isEmpty()) {
        				int[] poll = q.poll();
        				
        				count++;
        				
        				if (!isAdd[poll[1]]) {
        					isAdd[poll[1]] = true;
        				}
        				
        				int[] dx = {-1, 1, 0, 0};
        				int[] dy = {0, 0, -1, 1};
        				
        				for (int d = 0; d < 4; d++) {
        					int x = poll[0] + dx[d];
        					int y = poll[1] + dy[d];
        					
        					if (x >= 0 && y >= 0 && x < n && y < m && !visited[x][y] && land[x][y] == 1) {
        						visited[x][y] = true;
        						q.add(new int[] {x, y});
        					}
        				}
        			}
        			
        			for (int k = 0; k < m; k++) {
        				if (isAdd[k]) {
        					num[k] += count;
        					
        					if (answer < num[k]) {
        						answer = num[k];
        					}
        				}
        			}
        		}
        	}
        }
        
        return answer;
    }
}