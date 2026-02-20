import java.util.*;
import java.io.*;

public class Main{
    public static int solution(int n, int d, int k, int c, int[] arr) {
		int answer = 0;
		int kind = 0;
		Map<Integer, Integer> map = new HashMap<>();
		
		for (int i = 0; i < k; i++) {
			if (map.get(arr[i]) == null) {
				map.put(arr[i], 1);
				kind++;
			} else {
				map.put(arr[i], map.get(arr[i]) + 1);
			}
		}
		
		answer = kind;
		if (map.get(c) == null) {
			answer++;
		}
		
		int lt = 0;
		
		for (int rt = k; rt < arr.length; rt++) {
			
			if (map.get(arr[rt]) == null) {
				map.put(arr[rt], 1);
				kind++;
			} else {
				map.put(arr[rt], map.get(arr[rt]) + 1);
			}
			
			if (map.get(arr[lt]) == 1) {
				map.remove(arr[lt]);
				kind--;
			} else {
				map.put(arr[lt], map.get(arr[lt]) - 1);
			}
			lt++;
			
			if (map.get(c) == null) {
				if (answer < kind+1) {
					answer = kind+1;
				}
			} else {
				if (answer < kind) {
					answer = kind;
				}
			}
		}
		
		return answer;
	}
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int d = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		int c = Integer.parseInt(st.nextToken());
		int[] arr = new int[n+k-1];
		
		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		for (int i = n; i < n+k-1; i++) {
			arr[i] = arr[i-n];
		}
		
		System.out.println(solution(n, d, k, c, arr));
	}
}