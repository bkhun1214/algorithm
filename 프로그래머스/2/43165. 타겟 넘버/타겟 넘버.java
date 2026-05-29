import java.util.*;

class Solution {
    public int solution(int[] numbers, int target) {
        int answer = 0;
        
        Queue<int[]> q = new LinkedList<>();
        q.add(new int[]{numbers[0], 1});
        q.add(new int[]{numbers[0] * -1, 1});
        
        while(!q.isEmpty()) {
            int[] poll = q.poll();
            
            int number = poll[0];
            int depth = poll[1];
            
            if (depth == numbers.length) {
                if (number == target) {
                    answer++;
                }
                continue;
            }
            
            q.add(new int[]{number + (numbers[depth]), depth+1});
            q.add(new int[]{number - (numbers[depth]), depth+1});
        }
        
        return answer;
    }
}