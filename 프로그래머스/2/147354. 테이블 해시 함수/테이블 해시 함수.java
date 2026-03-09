import java.util.*;

class Solution {
    public int solution(int[][] data, int col, int row_begin, int row_end) {
        int answer = 0;
        
        Arrays.sort(data, (s1, s2) -> {
        	if (s1[col-1] == s2[col-1]) {
        		return s2[0] - s1[0];
        	}
        	return s1[col-1] - s2[col-1];
        });
        
        for (int i = row_begin-1; i < row_end; i++) {
        	int temp = 0;
        	
        	for (int j = 0; j < data[0].length; j++) {
        		temp += (data[i][j] % (i+1));
        	}
        	
        	if (i == row_begin-1) {
        		answer = temp;
        		continue;
        	} else {
        		answer = answer ^ temp;
        	}
        }
        
        return answer;
    }
}