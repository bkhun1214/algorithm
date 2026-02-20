import java.util.*;
import java.io.*;

public class Main{
    public static int solution(int n, int k, int[] arr) {
		int answer = 0;
		int lt = 0;
		int length = 0;
		
		Map<Integer, Integer> map = new HashMap<>();
		
		for (int rt = 0; rt < n; rt++) {
			int value = arr[rt];
			map.put(value, map.getOrDefault(value, 0) + 1);
			
			int count = map.get(value);
			
			while (count > k) {
				int temp = map.get(arr[lt]);
				
				if (temp == 1) {
					map.remove(arr[lt]);
				} else {
					map.put(arr[lt], temp-1);
				}
				
				if (value == arr[lt]) {
					count--;
				}
				
				lt++;
			}
			
			length = rt-lt+1;
			
			if (answer < (length)) {
				answer = length;
			}
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