import java.util.*;

class Solution {
    public int solution(int[] elements) {
        int answer = 0;
        int n = elements.length;
        
        int[] sum = new int[n];
        int[] round = new int[n-2];
        
        Set<Integer> set = new HashSet<>();
        
        sum[0] = elements[0];
        for (int i = 1; i < n; i++) {
        	sum[i] = elements[i] + sum[i-1];
        }
        
        for (int i = 0; i < n-2; i++) {
        	round[i] = sum[n-1] + sum[i];
        }
        
        for (int i = 0; i < n; i++) {
        	set.add(sum[i]);
        	for (int j = 0; j < i; j++) {
        		set.add(sum[i] - sum[j]);
        	}
        }
        
        for (int i = 0; i < n-2; i++) {
        	for (int j = i+1; j < n-1; j++) {
        		set.add(round[i] - sum[j]);
        	}
        }
        
        answer = set.size();
        
        return answer;
    }
}