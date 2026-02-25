import java.util.*;
import java.io.*;

public class Main{
    public static String solution(int t, List<Integer> ns, List<List<Integer>> arrs) {
		StringBuffer answer = new StringBuffer();
		
		for (int i = 0; i < t; i++) {
			if (i != 0) {
				answer.append("\n");
			}
			int n = ns.get(i);
			List<Integer> arr = arrs.get(i);
			
			Queue<Long> q = new PriorityQueue<>();
			for (int j = 0; j < n; j++) {
				q.add(Long.valueOf(arr.get(j)));
			}
			
			Long sum = 0L;
			
			while(q.size() > 1) {
				Long a = q.poll();
				Long b = q.poll();
				sum += a+b;
				q.add(a+b);
			}
			
			answer.append(sum);
		}
		
		return answer.toString();
	}
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int t = Integer.parseInt(st.nextToken());
		List<Integer> ns = new ArrayList<>();
		List<List<Integer>> arrs = new ArrayList<>();
		
		for (int i = 0; i < t; i++) {
			st = new StringTokenizer(br.readLine());
			int n = Integer.parseInt(st.nextToken());
			ns.add(n);
			
			List<Integer> arr = new ArrayList<>();
			st = new StringTokenizer(br.readLine());
			
			for (int j = 0; j < n; j++) {
				arr.add(Integer.parseInt(st.nextToken()));
			}
			
			arrs.add(arr);
		}
		
		System.out.println(solution(t, ns, arrs));
	}
}