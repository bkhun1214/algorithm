import java.util.*;

class Solution {
    public int[] solution(int m, int n, int h, int w, int[][] drops) {
        int[] answer = new int[2];
        int count = 0;
        int[][] arr = new int[m][n];
        
        for (int i = 0; i < m; i++) {
        	Arrays.fill(arr[i], 500000);
        }
        
        for (int i = 0; i < drops.length; i++) {
        	arr[drops[i][0]][drops[i][1]] = i+1;
        }
        
        
        // 가로
        for (int i = 0; i < m; i++) {
        	Deque<int[]> dq = new LinkedList<>();
        	for (int j = 0; j < n; j++) {
        		int rain = arr[i][j];
        		while(!dq.isEmpty() && dq.peekLast()[1] > rain) {
        			dq.pollLast();
        		}
        		
        		dq.add(new int[] {j, rain});
        		
        		if (j-w >= dq.peekFirst()[0]) {
        			dq.pollFirst();
        		}
        		
        		if (j-w+1 >= 0) {
        			arr[i][j-w+1] = dq.peekFirst()[1];
        		}
        		
        	}
        	
        	for (int j = n-w; j < n; j++) {
        		arr[i][j] = dq.peekFirst()[1];
        	}
        	
        }
        
        // 세로
        for (int j = 0; j < n; j++) {
        	Deque<int[]> dq = new LinkedList<>();
        	for (int i = 0; i < m; i++) {
        		int rain = arr[i][j];
        		while(!dq.isEmpty() && dq.peekLast()[1] > rain) {
        			dq.pollLast();
        		}
        		
        		dq.add(new int[] {i, rain});
        		
        		if (i-h >= dq.peekFirst()[0]) {
        			dq.pollFirst();
        		}
        		
        		if (i-h+1 >= 0) {
        			arr[i-h+1][j] = dq.peekFirst()[1];
        		}
        	}
        	
        	for (int i = m-h; i < m; i++) {
        		arr[i][j] = dq.peekFirst()[1];
        	}
        }
        
        // 최댓값 찾기
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				if (arr[i][j] > count) {
					count = arr[i][j];
					answer[0] = i;
					answer[1] = j;
				}
			}
		}
        
        return answer;
    }
}