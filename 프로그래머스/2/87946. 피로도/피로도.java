class Solution {
    static int count = 0;
	
	public int solution(int k, int[][] dungeons) {
        int answer = -1;
        
        int n = dungeons.length;
        
        boolean[] visited = new boolean[n];
        
        for (int i = 0; i < n; i++) {
        	if (!visited[i] && k >= dungeons[i][0]) {
        		visited[i] = true;
        		search(k-dungeons[i][1], dungeons, visited, 1);
        		visited[i] = false;
        	}
        }
        
        answer = count;
        count = 0;
        
        return answer;
    }
	
	public static void search(int k, int[][] dungeons, boolean[] visited, int depth) {
		
		if (depth > count) {
			count = depth;
		}
		
		for (int i = 0; i < dungeons.length; i++) {
			if (!visited[i] && k >= dungeons[i][0]) {
				visited[i] = true;
				search(k - dungeons[i][1], dungeons, visited, depth+1);
				visited[i] = false;
			}
		}
	}
}