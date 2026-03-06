import java.util.*;

class Solution {
    public int[] solution(int[] numbers) {
		int length = numbers.length;
		int[] answer = new int[length];
		
		Stack<int[]> stack = new Stack<>();
		
		for (int i = 0; i < length; i++) {
			
			if (stack.size() == 0) {
				stack.push(new int[] {i, numbers[i]});
				continue;
			}
			
			while (stack.size() != 0 && stack.peek()[1] < numbers[i]) {
				int[] pop = stack.pop();
				answer[pop[0]] = numbers[i];
			}
			
			stack.push(new int[] {i, numbers[i]});
		}
		
		while (stack.size() != 0) {
			answer[stack.pop()[0]] = -1;
		}
		
		return answer;
	}
}