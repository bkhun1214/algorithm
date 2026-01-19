class Solution {
    public int solution(String[] storage, String[] requests) {
        int answer = 0;
        String[][] container = new String[storage.length][storage[0].length()];
        
        for (int i = 0; i < storage.length; i++) {
        	for (int j = 0; j < storage[0].length(); j++) {
        		container[i][j] = storage[i].substring(j, j+1);
        	}
        }
        
        
        for (String request : requests) {
        	if (request.length() == 1) {
        		// 지게차
        		forklift(container, request);
        		for (int i = 0; i < storage.length; i++) {
                	for (int j = 0; j < storage[0].length(); j++) {
                	}
                }
        	} else {
        		// 크레인
        		String temp = request.substring(0, 1);
        		
        		for (int i = 0; i < storage.length; i++) {
                	for (int j = 0; j < storage[0].length(); j++) {
                		if (container[i][j].equals(temp)) {
                			container[i][j] = "0";
                		}
                	}
                }
        	}
        }
        
        // 남아있는 컨테이너 수
        for (int i = 0; i < storage.length; i++) {
        	for (int j = 0; j < storage[0].length(); j++) {
        		if (!container[i][j].equals("0")) {
        			answer++;
        		}
        	}
        }
        
        return answer;
    }
	
	public void forklift(String[][] container, String request) {
		boolean[][] visited = new boolean[container.length][container[0].length];

		for (int i = 0; i < container.length; i++) {
			for (int j = 0; j < container[0].length; j++) {
				// 끝에만 탐색해야 함.
				if ((i == 0 || j == 0 || i == container.length - 1 || j == container[0].length -1) && !visited[i][j]) {
					dfs(container, request, i, j, visited);
				}
			}
		}
	}
	
	public void dfs(String[][] container, String request, int x, int y, boolean[][] visited) {
		if (x < 0 || y < 0 || x > container.length - 1 || y > container[0].length -1 || visited[x][y]) {
			return;
		}
		
		visited[x][y] = true;
		int[] dx = {0,0,1,-1};
        int[] dy = {1,-1,0,0};
		
		if (!container[x][y].equals("0") && !container[x][y].equals(request)) {
			return;
		}
		
		if (container[x][y].equals(request)) {
			// 꺼내고 꺼내는 탐색이 하면 안되는듯 ! -> return
			container[x][y] = "0";
			return;
		}
		
		for (int i = 0; i < 4; i++) {
			dfs(container, request, x + dx[i], y + dy[i], visited);
		}
	}
}