import java.util.*;
import java.io.*;

public class Main{
    public static String solution(int n, int m, List<List<int[]>> lists) {
		StringBuffer answer = new StringBuffer();
		
		long[] cost = new long[n];
		Arrays.fill(cost, Integer.MAX_VALUE);
		
		cost[0] = 0;
		
		for (int i = 0; i < n-1; i++) {
			boolean isChange = false;
			
			for(int j = 0; j < lists.size(); j++) {
				List<int[]> list = lists.get(j);
				for (int k = 0; k < list.size(); k++) {
					int[] get = list.get(k);
					if (cost[j] != Integer.MAX_VALUE && cost[j] + get[1] < cost[get[0]]) {
						cost[get[0]] = cost[j] + get[1];
						isChange = true;
					}
				}
			}
			
			if (!isChange) {
				break;
			}
		}
		
		for(int j = 0; j < lists.size(); j++) {
			List<int[]> list = lists.get(j);
			for (int k = 0; k < list.size(); k++) {
				int[] get = list.get(k);
				if (cost[j] != Integer.MAX_VALUE && cost[j] + get[1] < cost[get[0]]) {
					return "-1";
				}
			}
		}
		
		for (int i = 1; i < n; i++) {
			if (i != 1) {
				answer.append("\n");
			}
			
			if (cost[i] == Integer.MAX_VALUE) {
				answer.append("-1");
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
		
		for (int i = 0; i < m; i++) {
			st = new StringTokenizer(br.readLine());
			
			int s = Integer.parseInt(st.nextToken()) - 1;
			int e = Integer.parseInt(st.nextToken()) - 1;
			int v = Integer.parseInt(st.nextToken());
			
			lists.get(s).add(new int[] {e, v});
		}
		
		System.out.println(solution(n, m, lists));
	}
}