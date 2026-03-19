import java.util.*;
import java.io.*;

public class Main{
    static Map<Integer, List<int[]>> map;
    public static int solution(int n, int k, int start) {
		int count = 0;
		
		Queue<Integer> q = new LinkedList<>();
		boolean[] visited = new boolean[n];
		visited[start] = true;
		q.add(start);
		
		while(!q.isEmpty()) {
			int poll = q.poll();
			List<int[]> list = map.get(poll);
			
			for (int i = 0; i < list.size(); i++) {
				int[] arr = list.get(i);
				if (arr[1] >= k && !visited[arr[0]]) {
					visited[arr[0]] = true;
					count++;
					q.add(arr[0]);
				}
			}
		}
		
		return count;
	}
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int q = Integer.parseInt(st.nextToken());
		
		map = new HashMap<>();
		
		for (int i = 0; i < n-1; i++) {
			st = new StringTokenizer(br.readLine());
			int num1 = Integer.parseInt(st.nextToken()) - 1;
			int num2 = Integer.parseInt(st.nextToken()) - 1;
			int usado = Integer.parseInt(st.nextToken());
			
			List<int[]> list = map.getOrDefault(num1, new ArrayList<>());
			list.add(new int[] {num2, usado});
			map.put(num1, list);
			
			list = map.getOrDefault(num2, new ArrayList<>());
			list.add(new int[] {num1, usado});
			map.put(num2, list);
		}
		
		int[][] questions = new int[q][2];
		
		for (int i = 0; i < q; i++) {
			st = new StringTokenizer(br.readLine());
			int k = Integer.parseInt(st.nextToken());
			int num = Integer.parseInt(st.nextToken()) - 1;
			
			questions[i][0] = k;
			questions[i][1] = num;
		}
		
		
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < q; i++) {
			if (i != 0) {
				sb.append("\n");
			}
			int[] question = questions[i];
			int count = solution(n, question[0], question[1]);
			sb.append(count);
		}
		
		System.out.println(sb.toString());
	}
}