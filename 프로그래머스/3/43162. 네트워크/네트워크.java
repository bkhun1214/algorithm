import java.util.*;

class Solution {
    public int solution(int n, int[][] computers) {
        int answer = 0;
        
        boolean[] visited = new boolean[n];
        
        for (int i = 0; i < n; i++) {
            if (visited[i] == false) {
                answer++;
                Queue<Integer> q = new LinkedList<>();
                visited[i] = true;
                
                for (int j = 0; j < n; j++) {
                    if (computers[i][j] == 1 && visited[j] == false) {
                        q.add(j);
                    }
                }
                
                while(!q.isEmpty()) {
                    int c = q.poll();
                    
                    if (visited[c] == true) {
                        continue;
                    }
                    
                    visited[c] = true;
                    
                    for (int j = 0; j < n; j++) {
                        if (computers[c][j] == 1 && visited[j] == false) {
                            q.add(j);
                        }
                    }
                }
            }
        }
        
        return answer;
    }
}