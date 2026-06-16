import java.util.*;

class Solution {
    public int solution(int n, int[][] edge) {
        int answer = 0;
        
        List<List<Integer>> lists = new ArrayList<>();
        
        for (int i = 0; i < n; i++) {
        	lists.add(new ArrayList<>());
        }
        
        for (int i = 0; i < edge.length; i++) {
        	lists.get(edge[i][0]-1).add(edge[i][1]-1);
        	lists.get(edge[i][1]-1).add(edge[i][0]-1);
        }
        
        int[] arr = new int[n];
        boolean[] visited = new boolean[n];
        
        Queue<int[]> q = new LinkedList<>();
        q.add(new int[] {0, 0});
        visited[0] = true;
        
        while(!q.isEmpty()) {
        	int[] poll = q.poll();
        	
        	arr[poll[0]] = poll[1];
        	
        	List<Integer> list = lists.get(poll[0]);
        	for (int i = 0; i < list.size(); i++) {
        		int temp = list.get(i);
        		if (!visited[temp]) {
        			visited[temp] = true;
        			q.add(new int[] {temp, poll[1]+1});
        		}
        	}
        }
        
        int max = 0;
        
        for (int i = 1; i < n; i++) {
        	if (max == arr[i]) {
        		answer++;
        	} else if (max < arr[i]) {
        		answer = 1;
        		max = arr[i];
        	}
        }
        
        return answer;
    }
}