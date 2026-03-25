import java.util.*;
import java.io.*;

public class Main{
    public static String solution(int n, List<List<Integer>> lists, int[] cost) {
		StringBuffer sb = new StringBuffer();
		
		Queue<Integer> q = new PriorityQueue<>((s1, s2) -> {return s1-s2;});
		for (int i = 0; i < n; i++) {
			if (cost[i] == 0) {
				q.add(i);
			}
		}
		
		while(!q.isEmpty()) {
			int poll = q.poll();
			
			if (sb.length() != 0) {
				sb.append(" ");
			}
			sb.append(poll+1);
			
			List<Integer> list = lists.get(poll);
			
			for (int i = 0; i < list.size(); i++) {
				int temp = list.get(i);
				cost[temp]--;
				
				if (cost[temp] == 0) {
					q.add(temp);
				}
			}
		}
		
		return sb.toString();
	}
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		List<List<Integer>> lists = new ArrayList<>();
		int[] cost = new int[n];
		
		for (int i = 0; i < n; i++) {
			lists.add(new ArrayList<>());
		}
		
		for (int i = 0; i < m; i++) {
			st = new StringTokenizer(br.readLine());
			
			int s = Integer.parseInt(st.nextToken()) - 1;
			int e = Integer.parseInt(st.nextToken()) - 1;
			
			lists.get(s).add(e);
			cost[e]++;
		}
		
		System.out.println(solution(n, lists, cost));
	}
}