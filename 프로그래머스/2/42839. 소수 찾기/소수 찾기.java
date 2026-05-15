import java.util.*;

class Solution {
    
    static Set<Integer> set = new HashSet<>();
    static boolean[] visited;
    
    public int solution(String numbers) {
        int answer = 0;
        
        set = new HashSet<>();
        visited = new boolean[numbers.length()];
        
        for (int i = 0; i < numbers.length(); i++) {
            search("", numbers, 0, i+1);
        }
        
        for (Integer i : set) {
            if (i == 0 || i == 1) {
                continue;    
            }
            
            if (i == 2 || i == 3) {
                answer++;
                continue;
            }
            
            boolean isPrime = true;
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            
            if (isPrime) {
                answer++;
            }
        }
        
        return answer;
    }
    
    public void search(String number, String numbers, int depth, int length) {
        
        if (depth == length) {
            int temp = Integer.valueOf(number);
            set.add(temp);
            return;
        }
        
        for (int i = 0; i < numbers.length(); i++) {
            if (!visited[i]) {
                visited[i] = true;
                search(number + numbers.charAt(i), numbers, depth+1, length);
                visited[i] = false;
            }
        }
        
    }
}