import java.util.*;
import java.io.*;

public class Main{
    public static String solution(int n, int m, int start, List<List<int[]>> lists) {
		StringBuffer answer = new StringBuffer();
		
		int[] cost = new int[n];
		Arrays.fill(cost, Integer.MAX_VALUE);
		cost[start] = 0;
		
		Queue<int[]> q = new PriorityQueue<>((s1, s2) -> {return s1[1] - s2[1];});
		q.add(new int[] {start, 0});
		
		while(!q.isEmpty()) {
			int[] poll = q.poll();
			
			if (cost[poll[0]] < poll[1]) {
				continue;
			}
			
			List<int[]> list = lists.get(poll[0]);
			
			for (int i = 0; i < list.size(); i++) {
				int[] get = list.get(i);
				
				if (cost[get[0]] > poll[1]+get[1]) {
					cost[get[0]] = poll[1]+get[1];
					q.add(new int[] {get[0], poll[1]+get[1]});
				}
			}
		}
		
		for (int i = 0; i < n; i++) {
			if (i != 0) {
				answer.append("\n");
			}
			
			if (cost[i] == Integer.MAX_VALUE) {
				answer.append("INF");
			} else {
				answer.append(cost[i]);
			}
		}
		
		return answer.toString();
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
		
		int start = Integer.parseInt(br.readLine()) - 1;
		
		for (int i = 0; i < m; i++) {
			st = new StringTokenizer(br.readLine());
			
			int s = Integer.parseInt(st.nextToken()) - 1;
			int e = Integer.parseInt(st.nextToken()) - 1;
			int v = Integer.parseInt(st.nextToken());
			
			lists.get(s).add(new int[] {e, v});
		}
		
		System.out.println(solution(n, m, start, lists));
	}
}