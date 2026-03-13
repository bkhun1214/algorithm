import java.util.*;

class Solution {
    public int solution(int n, int[][] wires) {
        int answer = Integer.MAX_VALUE;
        
        int[][] arr = new int[n][n];
        
        for (int i = 0; i < wires.length; i++) {
        	int start = wires[i][0] - 1;
        	int end = wires[i][1] - 1;
        	
        	arr[start][end] = 1;
        	arr[end][start] = 1;
        }
        
        for (int i = 0; i < wires.length; i++) {
        	// 하나 끊기
        	int start = wires[i][0] -1;
        	int end = wires[i][1] -1;
        	
        	arr[start][end] = 0;
        	arr[end][start] = 0;
        	
        	
        	boolean[] visited = new boolean[n];
        	Queue<Integer> q = new LinkedList<>();
        	q.add(0);
        	visited[0] = true;
        	int count = 0;
        	
        	while (!q.isEmpty()) {
        		count++;
        		int poll = q.poll();
        		
        		for (int j = 0; j < n; j++) {
        			if (arr[poll][j] == 1 && !visited[j]) {
        				visited[j] = true;
        				q.add(j);
        			}
        		}
        	}
        	
        	// 하나를 끊으면 다 이어지거나, 2개로 나뉘거나 -> count, n - count
        	int temp;
        	if (2 * count > n) {
        		temp = count - (n - count);
        	} else {
        		temp = (n - count) - count;
        	}
        	
        	if (temp < answer) {
        		answer = temp;
        	}
        	
        	arr[start][end] = 1;
        	arr[end][start] = 1;
        }
        
        return answer;
    }
}