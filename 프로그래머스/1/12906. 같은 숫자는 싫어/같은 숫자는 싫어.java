import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        int[] answer = {};
        List<Integer> list = new ArrayList<>();
        
        int prev = arr[0];
        list.add(prev);
        for (int i = 1; i < arr.length; i++) {
        	int temp = arr[i];
        	if (prev == temp) {
        		continue;
        	} else {
        		prev = temp;
        		list.add(prev);
        	}
        }
        
        answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
        	answer[i] = list.get(i);
        }

        return answer;
    }
}