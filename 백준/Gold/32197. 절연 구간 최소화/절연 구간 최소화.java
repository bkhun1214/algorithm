import java.util.*;
import java.io.*;

public class Main{
    public static int solution(int n, int m, List<List<int[]>> lists, int start, int end) {
		int answer = 0;
		
		int[] cost = new int[n];
		Arrays.fill(cost, Integer.MAX_VALUE);
		
		Deque<int[]> q = new LinkedList<>();
		q.addFirst(new int[] {start, -1, -1});
		cost[start] = 0;
		
		while(!q.isEmpty()) {
			int[] poll = q.poll();
			
			if (poll[0] == end) {
				answer = poll[2];
				break;
			}
			
			List<int[]> list = lists.get(poll[0]);
			
			for (int i = 0; i < list.size(); i++) {
				int[] get = list.get(i);
				
				if (poll[1] == get[1]) {
					if (cost[get[0]] > poll[2]) {
						cost[get[0]] = poll[2];
						q.addFirst(new int[] {get[0], get[1], poll[2]});
					}
					
				} else {
					if (cost[get[0]] > poll[2]+1) {
						cost[get[0]] = poll[2]+1;
						q.addLast(new int[] {get[0], get[1], poll[2]+1});
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
		int m = Integer.parseInt(st.nextToken());
		
		List<List<int[]>> list = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			list.add(new ArrayList<>());
		}
		
		for (int i = 0; i < m; i++) {
			st = new StringTokenizer(br.readLine());
			
			int start = Integer.parseInt(st.nextToken()) - 1;
			int end = Integer.parseInt(st.nextToken()) - 1;
			int v = Integer.parseInt(st.nextToken());
			
			list.get(start).add(new int[] {end, v});
			list.get(end).add(new int[] {start, v});
		}
		
		st = new StringTokenizer(br.readLine());
		int start = Integer.parseInt(st.nextToken()) - 1;
		int end = Integer.parseInt(st.nextToken()) - 1;
		
		System.out.println(solution(n, m, list, start, end));
	}
}