import java.util.*;

class Solution {
    public int solution(int[][] routes) {
        int answer = 0;
        
        Arrays.sort(routes, (s1, s2) -> {
            if (s1[1] == s2[1]) {
                return s1[0] - s2[0];
            }
            return s1[1] - s2[1];
        });
        
        int camera = -30001;
        
        for (int i = 0; i < routes.length; i++) {
            if (routes[i][0] > camera) {
                camera = routes[i][1];
                answer++;
            }
        }
        
        return answer;
    }
}