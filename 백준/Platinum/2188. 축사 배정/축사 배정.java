import java.util.*;
import java.io.*;

public class Main{
    static List<List<Integer>> lists;
	static int[] arr;
	static boolean[] visited;
	
	public static int solution(int n, int m) {
		int answer = 0;
		for (int i = 1; i <= n; i++) {
			visited = new boolean[m+1];
			if (search(i)) {
				answer++;
			}
		}
		
		return answer;
	}
	
	public static boolean search(int n) {
		
		List<Integer> list = lists.get(n);
		
		for (int i = 0; i < list.size(); i++) {
			int temp = list.get(i);
			if (!visited[temp]) {
				visited[temp] = true;
				if (arr[temp] == 0 || search(arr[temp])) {
					arr[temp] = n;
					return true;
				}
			}
		}
		
		return false;
	}
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		lists = new ArrayList<>();
		arr = new int[m+1];
		visited = new boolean[m+1];
		lists.add(new ArrayList<>());
		
		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			
			List<Integer> list = new ArrayList<>();
			int size = Integer.parseInt(st.nextToken());
			for (int j = 0; j < size; j++) {
				list.add(Integer.parseInt(st.nextToken()));
			}
			
			lists.add(list);
		}
		
		System.out.println(solution(n, m));
	}
}