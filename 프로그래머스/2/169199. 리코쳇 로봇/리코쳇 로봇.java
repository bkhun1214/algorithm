import java.util.*;

class Solution {
    public int solution(String[] board) {
        int answer = -1;
        
        int n = board.length;
        int m = board[0].length();
        
        char[][] boards = new char[n][m];
        int[] start = new int[2];
        int[] end = new int[2];
        
        for (int i = 0; i < n; i++) {
        	for (int j = 0; j < m; j++) {
        		char c = board[i].charAt(j);
        		
        		if (c == 'R') {
        			start[0] = i;
        			start[1] = j;
        		}
        		
        		if (c == 'G') {
        			end[0] = i;
        			end[1] = j;
        		}
        		
        		boards[i][j] = c;
        	}
        }
        
        Queue<int[]> q = new LinkedList<>();
        boolean[][] visited = new boolean[n][m];
        visited[start[0]][start[1]] = true;
        q.add(new int[] {start[0], start[1], 0});
        
        while(!q.isEmpty()) {
        	int[] poll = q.poll();
        	
        	if (poll[0] == end[0] && poll[1] == end[1]) {
        		return poll[2];
        	}
        	
        	// 상
        	if (poll[0] > 0) {
        		int x = poll[0];
        		int y = poll[1];
        		for (; x >= 0; x--) {
            		if (boards[x][y] == 'D') {
            			break;
            		}
            	}
        		x++;
        		if (!visited[x][y]) {
        			visited[x][y] = true;
        			q.add(new int[] {x, y, poll[2]+1});
        		}
        	}
        	
        	// 하
        	if (poll[0] < n-1) {
        		int x = poll[0];
        		int y = poll[1];
        		for (; x < n; x++) {
        			if (boards[x][y] == 'D') {
        				break;
        			}
        		}
        		x--;
        		if (!visited[x][y]) {
        			visited[x][y] = true;
        			q.add(new int[] {x, y, poll[2]+1});
        		}
        	}
        	
        	// 좌
        	if (poll[1] > 0) {
        		int x = poll[0];
        		int y = poll[1];
        		for (; y >= 0; y--) {
        			if (boards[x][y] == 'D') {
        				break;
        			}
        		}
        		y++;
        		if (!visited[x][y]) {
        			visited[x][y] = true;
        			q.add(new int[] {x, y, poll[2]+1});
        		}
        	}
        	
        	// 우
        	if (poll[1] < m-1) {
        		int x = poll[0];
        		int y = poll[1];
        		for (; y < m; y++) {
        			if (boards[x][y] == 'D') {
        				break;
        			}
        		}
        		y--;
        		if (!visited[x][y]) {
        			visited[x][y] = true;
        			q.add(new int[] {x, y, poll[2]+1});
        		}
        	}
        }
        
        return answer;
    }
}