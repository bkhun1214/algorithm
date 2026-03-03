import java.util.*;
import java.io.*;

public class Main{
    public static Long solution(int n, int k, int[] arr) {
		Long answer = 0L;
		
		for (int i = 1; i < n; i++) {
			arr[i] = arr[i-1] + arr[i];
		}
		
		Map<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < n; i++) {
			if (arr[i] == k) {
				answer++;
			}
			if (map.get(arr[i]) != null) {
				answer += map.get(arr[i]);
			}
			map.put(arr[i]+k, map.getOrDefault(arr[i]+k, 0) + 1);
		}
		
		return answer;
	}
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		
		int[] arr = new int[n];
		
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		System.out.println(solution(n, k, arr));
	}
}