import java.util.*;
import java.io.*;

public class Main{
    public static int solution(int n, List<List<int[]>> lists) {
		int answer = 0;
		int best = 0;
		int worst = 0;
		
		Queue<int[]> q = new PriorityQueue<>((s1, s2) -> {
			return s2[1] - s1[1];
		});
		boolean[] visited = new boolean[n+1];
		visited[0] = true;
		List<int[]> list = lists.get(0);
		for (int i = 0; i < list.size(); i++) {
			int[] get = list.get(i);
			q.add(new int[] {get[0], get[1]});
		}
		
		int count = 0;
		while(!q.isEmpty()) {
			int[] poll = q.poll();
			
			if (visited[poll[0]]) {
				continue;
			}
			
			visited[poll[0]] = true;
			count++;
			if (poll[1] == 0) {
				best++;
			}
			
			if (count == n) {
				break;
			}
			
			List<int[]> move = lists.get(poll[0]);
			for (int i = 0; i < move.size(); i++) {
				int[] get = move.get(i);
				q.add(new int[] {get[0], get[1]});
			}
		}
		
		q = new PriorityQueue<>((s1, s2) -> {
			return s1[1] - s2[1];
		});
		visited = new boolean[n+1];
		visited[0] = true;
		for (int i = 0; i < list.size(); i++) {
			int[] get = list.get(i);
			q.add(new int[] {get[0], get[1]});
		}
		
		count = 0;
		while(!q.isEmpty()) {
			int[] poll = q.poll();
			
			if (visited[poll[0]]) {
				continue;
			}
			
			visited[poll[0]] = true;
			count++;
			if (poll[1] == 0) {
				worst++;
			}
			
			if (count == n) {
				break;
			}
			
			List<int[]> move = lists.get(poll[0]);
			for (int i = 0; i < move.size(); i++) {
				int[] get = move.get(i);
				q.add(new int[] {get[0], get[1]});
			}
		}
		
		answer = (worst * worst) - (best * best);
		
		return answer;
	}
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		List<List<int[]>> lists = new ArrayList<>();
		
		for (int i = 0; i < n+1; i++) {
			lists.add(new ArrayList<>());
		}
		
		for (int i = 0; i < m+1; i++) {
			st = new StringTokenizer(br.readLine());
			
			int s = Integer.parseInt(st.nextToken());
			int e = Integer.parseInt(st.nextToken());
			int v = Integer.parseInt(st.nextToken());
			
			lists.get(s).add(new int[] {e, v});
			lists.get(e).add(new int[] {s, v});
		}
		
		System.out.println(solution(n, lists));
	}
}