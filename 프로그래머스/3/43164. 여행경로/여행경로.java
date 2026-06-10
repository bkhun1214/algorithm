import java.util.*;

class Solution {
    static String[] travel;
    static boolean[] visited;
    static boolean isFinished;
    
    public String[] solution(String[][] tickets) {
        travel = new String[tickets.length+1];
        visited = new boolean[tickets.length];
        isFinished = false;
        
        Arrays.sort(tickets, (s1, s2) -> {
        	if (s1[0].equals(s2[0])) {
        		return s1[1].compareTo(s2[1]);
        	}
        	
        	return s1[0].compareTo(s2[0]);
        });
        
        search("ICN", 0, tickets);
        
        
        return travel;
    }
    
    public static void search(String departure, int depth, String[][] tickets) {
    	
    	if (isFinished) {
    		return;
    	}
    	
    	travel[depth] = departure;
    	
    	if (depth == tickets.length) {
    		isFinished = true;
    		return;
    	}
    	
    	for (int i = 0; i < tickets.length; i++) {
    		if (tickets[i][0].equals(departure) && !visited[i]) {
    			visited[i] = true;
    			search(tickets[i][1], depth+1, tickets);
    			visited[i] = false;
    		}
    	}
    }
}