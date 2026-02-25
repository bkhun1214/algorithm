import java.util.*;
import java.io.*;

public class Main{
    public static int solution(int n, int[][] arr, int maxDay) {
		int answer = 0;
		Arrays.sort(arr, (s1, s2) -> {
			if (s1[0] == s2[0]) {
				return s2[1] - s1[1];
			}
			return s2[0] - s1[0];
		});
		
		boolean[] visited = new boolean[maxDay];
		
		for (int i = 0; i < n; i++) {
			for (int j = arr[i][1]-1; j >= 0; j--) {
				if (!visited[j]) {
					answer += arr[i][0];
					visited[j] = true;
					break;
				}
			}
		}
		
		return answer;
	}
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int[][] arr = new int[n][2];
		
		int maxDay = 0;
		
		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			arr[i][0] = Integer.parseInt(st.nextToken());
			arr[i][1] = Integer.parseInt(st.nextToken());
			
			if (maxDay < arr[i][1]) {
				maxDay = arr[i][1];
			}
		}
		
		System.out.println(solution(n, arr, maxDay));
	}
}