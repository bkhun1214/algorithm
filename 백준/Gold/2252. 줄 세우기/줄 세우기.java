import java.util.*;
import java.io.*;

public class Main{
    public static String solution(int n, int[] cost, List<List<Integer>> lists) {
		StringBuffer sb = new StringBuffer();
		
		Queue<Integer> q = new LinkedList<>();
		
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
				int e = list.get(i);
				cost[e]--;
				
				if (cost[e] == 0) {
					q.add(e);
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
		
		int[] cost = new int[n];
		List<List<Integer>> lists = new ArrayList<>();
		
		for (int i = 0; i < n; i++) {
			lists.add(new ArrayList<>());
		}
		
		for (int i = 0; i < m; i++) {
			st = new StringTokenizer(br.readLine());
			
			int s = Integer.parseInt(st.nextToken())-1;
			int e = Integer.parseInt(st.nextToken())-1;
			
			lists.get(s).add(e);
			cost[e]++;
		}
		
		System.out.println(solution(n, cost, lists));
	}
}