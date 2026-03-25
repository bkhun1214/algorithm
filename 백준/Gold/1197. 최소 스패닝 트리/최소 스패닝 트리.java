import java.util.*;
import java.io.*;

public class Main{
    public static int solution(int n, List<List<int[]>> lists) {
		int answer = 0;
		
		boolean[] visited = new boolean[n];
		Queue<int[]> q = new PriorityQueue<>((s1, s2) -> {return s1[1] - s2[1];});
		visited[0] = true;
		List<int[]> list = lists.get(0);
		for (int i = 0; i < list.size(); i++) {
			q.add(list.get(i));
		}
		
		int num = 0;
		while(!q.isEmpty()) {
			int[] poll = q.poll();
			
			int e = poll[0];
			int v = poll[1];
			
			if (visited[e]) {
				continue;
			}
			
			visited[e] = true;
			num++;
			answer += v;
			
			if (num == n-1) {
				break;
			}
			
			list = lists.get(e);
			for (int i = 0; i < list.size(); i++) {
				q.add(list.get(i));
			}
		}
		
		return answer;
	}
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		List<List<int[]>> lists = new ArrayList<>();
		
		for (int i = 0; i < n; i++) {
			lists.add(new ArrayList<>());
		}
		
		for (int i = 0; i < m; i++) {
			st = new StringTokenizer(br.readLine());
			
			int s = Integer.parseInt(st.nextToken()) - 1;
			int e = Integer.parseInt(st.nextToken()) - 1;
			int v = Integer.parseInt(st.nextToken());
			
			lists.get(s).add(new int[] {e, v});
			lists.get(e).add(new int[] {s, v});
		}
		
		System.out.println(solution(n, lists));
	}
}