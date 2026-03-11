import java.util.*;

class Solution {
    public int solution(int[] order) {
        int answer = 0;
        
        Stack<Integer> stack = new Stack<>();
        int num = 1;
        
        for (int i = 0; i < order.length; i++) {
        	
        	while (order[i] > num) {
        		stack.push(num);
        		num++;
        	}
        	
        	if (num == order[i]) {
        		answer++;
        		num++;
        		continue;
        	} else if (!stack.isEmpty() && stack.peek() == order[i]) {
        		stack.pop();
        		answer++;
        		continue;
        	} else {
        		break;
        	}
        }
        
        return answer;
    }
}