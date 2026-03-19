import java.util.*;
import java.io.*;

public class Main{
    static int[] parent;
	
	public static int solution(int n, int c, int[][] arr) {
		int answer = 0;
		
		parent = new int[n];
		for (int i = 0; i < n; i++) {
			parent[i] = i;
		}
		
		Queue<int[]> q = new PriorityQueue<>((s1, s2) -> {
			return s1[2] - s2[2];	
		});
		
		for (int i = 0; i < n-1; i++) {
			for (int j = i+1; j < n; j++) {
				int x = Math.abs(arr[i][0] - arr[j][0]);
				int y = Math.abs(arr[i][1] - arr[j][1]);
				int temp = (x * x) + (y * y);
				
				if (c <= temp) {
					q.add(new int[] {i, j, temp});
				}
			}
		}
		
		while(!q.isEmpty()) {
			int[] poll = q.poll();
			int x = poll[0];
			int y = poll[1];
			
			if (!isSameParent(x, y)) {
				union(x, y);
				answer += poll[2];
			}
		}
		
		int p = find(parent[0]);
		for (int i = 1; i < n; i++) {
			if (find(i) != p) {
				answer = -1;
				break;
			}
		}
		
		return answer;
	}
	
	public static void union(int x, int y) {
		x = find(x);
		y = find(y);
		
		if (x != y) {
			
			if (x < y) {
				parent[y] = x;
			} else {
				parent[x] = y;
			}
		}
	}
	
	public static boolean isSameParent(int x, int y) {
		x = find(x);
		y = find(y);
		
		if (x == y) {
			return true;
		} else {
			return false;
		}
	}
	
	public static int find(int x) {
		if (parent[x] == x) {
			return x;
		} else {
			parent[x] = find(parent[x]);
			return parent[x];
		}
	}
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int c = Integer.parseInt(st.nextToken());
		
		int[][] arr = new int[n][2];
		
		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			
			arr[i][0] = x;
			arr[i][1] = y;
		}
		
		System.out.println(solution(n, c, arr));
	}
}