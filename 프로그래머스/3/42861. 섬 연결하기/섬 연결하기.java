import java.util.*;

class Solution {
    public int solution(int n, int[][] costs) {
        int answer = 0;
        
        List<List<int[]>> list = new ArrayList<>();
        boolean[] visited = new boolean[n];
        
        for (int i = 0; i < n; i++) {
            list.add(new ArrayList<>());
        }
        
        for (int i = 0; i < costs.length; i++) {
            int start = costs[i][0];
            int end = costs[i][1];
            int cost = costs[i][2];
            
            list.get(start).add(new int[]{end, cost});
            list.get(end).add(new int[]{start, cost});
        }
        
        Queue<int[]> q = new PriorityQueue<>((s1, s2) -> {return s1[1] - s2[1];});
        for (int i = 0; i < list.get(0).size(); i++) {
            int[] temp = list.get(0).get(i);
            q.add(new int[]{temp[0], temp[1]});
        }
        visited[0] = true;
        
        while(!q.isEmpty()) {
            int[] poll = q.poll();
            
            if (visited[poll[0]]) {
                continue;
            }
            
            visited[poll[0]] = true;
            answer += poll[1];
            
            for (int i = 0; i < list.get(poll[0]).size(); i++) {
                int[] temp = list.get(poll[0]).get(i);
                if (!visited[temp[0]]) {
                    q.add(new int[]{temp[0], temp[1]});
                }
            }
        }
        
        return answer;
    }
}