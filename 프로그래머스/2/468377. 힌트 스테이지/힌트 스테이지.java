import java.util.*;

class Solution {
    static int count = Integer.MAX_VALUE;
	static int[] hintCount;
	
	public int solution(int[][] cost, int[][] hint) {
        int answer = 0;
        
        hintCount = new int[cost.length];
        
        stage(0, 0, cost, hint);
        
        answer = count;
        count = Integer.MAX_VALUE;
        
        return answer;
    }
	
	public static void stage(int value, int depth, int[][] cost, int[][] hint) {
		int a = hintCount[depth];
		if (cost.length - 1 < a) {
			a =  cost.length - 1;
		}
		value += cost[depth][a];
		
		if (depth == cost.length - 1) {
			
			if (value < count) {
				count = value;
			}
			return;
		}
		
		stage(value, depth+1, cost, hint);
		
		value += hint[depth][0];
		for (int i = 1; i < hint[depth].length; i++) {
			hintCount[hint[depth][i]-1] += 1;
		}
		stage(value, depth+1, cost, hint);
		for (int i = 1; i < hint[depth].length; i++) {
			hintCount[hint[depth][i]-1] -= 1;
		}
	}
}