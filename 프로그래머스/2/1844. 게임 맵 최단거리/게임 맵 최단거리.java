import java.util.*;

class Solution {

    public int solution(int[][] maps) {
        int answer = 0;
        
        int[] dx = {1, -1, 0, 0};
        int[] dy = {0, 0, 1, -1};
        boolean[][] visited = new boolean[maps.length][maps[0].length];
        
        Queue<int[]> q = new LinkedList<>();
        q.add(new int[]{0, 0, 1});
        visited[0][0] = true;
        
        while(!q.isEmpty()) {
            int[] poll = q.poll();
            
            if (poll[0] == maps.length -1 && poll[1] == maps[0].length - 1) {
                return poll[2];
            }
            
            for (int i = 0; i < 4; i++) {
                int x = poll[0] + dx[i];
                int y = poll[1] + dy[i];
                
                if (x >= 0 && y >= 0 && x < maps.length && y < maps[0].length && maps[x][y] == 1 && visited[x][y] == false) {
                    visited[x][y] = true;
                    q.add(new int[]{x, y, poll[2]+1});
                }
            }
        }
        
        answer = -1;
        
        return answer;
    }
}