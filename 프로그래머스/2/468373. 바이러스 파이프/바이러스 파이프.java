import java.util.*;

class Solution {
    static boolean[] visited;
	static int[][] typeA;
	static int[][] typeB;
	static int[][] typeC;
	static int result;
	
	public int solution(int n, int infection, int[][] edges, int k) {
        int answer = 0;
        visited = new boolean[n+1];
        typeA = new int[n+1][n+1];
    	typeB = new int[n+1][n+1];
    	typeC = new int[n+1][n+1];
    	result = 0;
        visited[infection] = true;
        
        for (int i = 0; i < edges.length; i++) {
        	int[] edge = edges[i];
        	int type = edge[2];
        	if (type == 1) {
        		typeA[edge[0]][edge[1]] = 1;
        		typeA[edge[1]][edge[0]] = 1;
        	} else if (type == 2) {
        		typeB[edge[0]][edge[1]] = 1;
        		typeB[edge[1]][edge[0]] = 1;
        	} else {
        		typeC[edge[0]][edge[1]] = 1;
        		typeC[edge[1]][edge[0]] = 1;
        	}
        }
        search(0, k);
        answer = result;
        
        return answer;
    }
	
	public static void search(int depth, int k) {
		List<Integer> infection = new ArrayList<>();
		for (int i = 0; i < visited.length; i++) {
			if (visited[i]) {
				infection.add(i);
			}
		}
		
		if (depth == k) {
			int count = infection.size();
			if (result < count) {
				result = count;
			}
			return;
		}
		
		// typeA
		Stack<Integer> stack = new Stack<>();
		for (int i = 0; i < infection.size(); i++) {
			stack.add(infection.get(i));
		}
		List<Integer> addInfection = new ArrayList<>();
		while(!stack.isEmpty()) {
			int temp = stack.pop();
			for (int i = 0; i < visited.length; i++) {
				if (typeA[temp][i] == 1 && !visited[i]) {
					addInfection.add(i);
					visited[i] = true;
					stack.add(i);
				}
			}
		}
		search(depth+1, k);
		for (int j = 0; j < addInfection.size(); j++) {
			visited[addInfection.get(j)] = false;
		}
		
		// typeB
		stack = new Stack<>();
		for (int i = 0; i < infection.size(); i++) {
			stack.add(infection.get(i));
		}
		addInfection = new ArrayList<>();
		while(!stack.isEmpty()) {
			int temp = stack.pop();
			for (int i = 0; i < visited.length; i++) {
				if (typeB[temp][i] == 1 && !visited[i]) {
					addInfection.add(i);
					visited[i] = true;
					stack.add(i);
				}
			}
		}
		search(depth+1, k);
		for (int j = 0; j < addInfection.size(); j++) {
			visited[addInfection.get(j)] = false;
		}
		
		// typeC
		stack = new Stack<>();
		for (int i = 0; i < infection.size(); i++) {
			stack.add(infection.get(i));
		}
		addInfection = new ArrayList<>();
		while(!stack.isEmpty()) {
			int temp = stack.pop();
			for (int i = 0; i < visited.length; i++) {
				if (typeC[temp][i] == 1 && !visited[i]) {
					addInfection.add(i);
					visited[i] = true;
					stack.add(i);
				}
			}
		}
		search(depth+1, k);
		for (int j = 0; j < addInfection.size(); j++) {
			visited[addInfection.get(j)] = false;
		}
	}
}