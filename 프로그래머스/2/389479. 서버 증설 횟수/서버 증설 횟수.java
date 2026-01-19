class Solution {
    public int solution(int[] players, int m, int k) {
        int answer = 0;
        int[] server = new int[players.length];
        
        for (int i = 0; i < players.length; i++) {
        	
        	if (players[i] / m > server[i]) {
        		int addServer = (players[i] / m) - server[i];
        		answer += addServer;
        		
        		int hold = i + k;
        		if (i + k > players.length) {
        			hold = players.length;
        		}
        		
        		for (int j = i; j < hold; j++) {
        			server[j] += addServer;
        		}
        	}
        }
        return answer;
    }
}