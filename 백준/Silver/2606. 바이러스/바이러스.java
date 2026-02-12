import java.util.*;
import java.io.*;

public class Main{
    public static int solution(int n, List<List<Integer>> list) {
		int answer = -1;
		
		boolean[] visited = new boolean[n+1];
		
		Queue<Integer> q = new LinkedList<>();
		visited[1] = true;
		q.add(1);
		
		while(!q.isEmpty()) {
			answer++;
			int poll = q.poll();
			
			if (list.get(poll).size() != 0) {
				for (int i : list.get(poll)) {
					if (!visited[i]) {
						visited[i] = true;
						q.add(i);
					}
				}
			}
		}
		
		return answer;
	}
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(br.readLine());
		int m = Integer.parseInt(st.nextToken());
		
		List<List<Integer>> list = new ArrayList<>();
		
		for (int i = 0; i <= n; i++) {
			list.add(new ArrayList<>());
		}
		
		for (int i = 0; i < m; i++) {
			st = new StringTokenizer(br.readLine());
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			
			list.get(x).add(y);
			list.get(y).add(x);
		}
		
		System.out.println(solution(n, list));
	}
}