import java.util.*;
import java.io.*;

public class Main{
    public static int solution(int n, int m, List<List<int[]>> lists, int start, int end) {
		int answer = 0;
		
		int[] cost = new int[n];
		Arrays.fill(cost, Integer.MAX_VALUE);
		
		Queue<int[]> q = new PriorityQueue<>((s1, s2) -> {
			return s1[1] - s2[1];
		});
		q.add(new int[] {start, 0});
		cost[start] = 0;
		
		while(!q.isEmpty()) {
			int[] poll = q.poll();
			
			if (cost[poll[0]] < poll[1]) {
				continue;
			}
			
			List<int[]> list = lists.get(poll[0]);
			
			for (int i = 0; i < list.size(); i++) {
				int[] get = list.get(i);
				
				if (cost[get[0]] > get[1]+poll[1]) {
					cost[get[0]] = get[1]+poll[1];
					q.add(new int[] {get[0], get[1]+poll[1]});
				}
			}
		}
		
		answer = cost[end];
		
		return answer;
	}
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(br.readLine());
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
		}
		
		st = new StringTokenizer(br.readLine());
		int start = Integer.parseInt(st.nextToken()) - 1;
		int end = Integer.parseInt(st.nextToken()) - 1;
		
		System.out.println(solution(n, m, list, start, end));
	}
}