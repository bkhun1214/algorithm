import java.util.*;

class Solution {
    public int[] solution(int[] sequence, int k) {
        int[] answer = {};
        int length = Integer.MAX_VALUE;
        int lt = 0;
        int start = 0;
        int end = 0;
        int sum = 0;
        
        for (int rt = 0; rt < sequence.length; rt++) {
        	sum += sequence[rt];
        	
        	while (k < sum) {
        		sum -= sequence[lt];
        		lt++;
        	}
        	
        	if (k == sum) {
        		int temp = rt - lt + 1;
        		if (length > temp) {
        			length = temp;
        			start = lt;
        			end = rt;
        		}
        	}
        }
        answer = new int[] {start, end};
        
        return answer;
    }
}