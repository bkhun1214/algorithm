import java.util.*;

class Solution {
    public int solution(String[][] book_time) {
        int answer = 0;
        
        int length = book_time.length;
        int[][] arr = new int[length][2];
        
        for (int i = 0; i < length; i++) {
        	String[] start = book_time[i][0].split(":");
        	String[] end = book_time[i][1].split(":");
        	
        	arr[i][0] = (Integer.parseInt(start[0]) * 60) + Integer.parseInt(start[1]);
        	arr[i][1] = (Integer.parseInt(end[0]) * 60) + Integer.parseInt(end[1]) + 10; // 10분 청소
        }
        
        Arrays.sort(arr, (s1, s2) -> {
        	if (s1[0] == s2[0]) {
        		return s1[1] - s2[1];
        	}
        	return s1[0] - s2[0];
        });
        
        List<Integer> room = new ArrayList<>();
        
        for (int i = 0; i < length; i++) {
        	boolean isCreate = true;
        	
        	for (int j = 0; j < room.size(); j++) {
        		int end = room.get(j);
        		if (end <= arr[i][0]) {
        			room.set(j, arr[i][1]);
        			isCreate = false;
        			break;
        		}
        	}
        	
        	if (isCreate) {
        		room.add(arr[i][1]);
        	}
        }
        
        answer = room.size();
        
        return answer;
    }
}