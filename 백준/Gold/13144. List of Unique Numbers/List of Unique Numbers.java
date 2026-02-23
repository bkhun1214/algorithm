import java.util.*;
import java.io.*;

public class Main{
    public static Long solution(int n, int[] arr) {
		Long answer = 0L;
		int lt = 0;
		int num = 0;
		
		Map<Integer, Integer> map = new HashMap<>();
		
		for (int rt = 0; rt < n; rt++) {
			int valueR = arr[rt];
			num++;
			if (map.get(valueR) == null) {
				map.put(valueR, 1);
			} else {
				while (true) {
					int valueL = arr[lt];
					lt++;
					num--;
					if (valueR == valueL) {
						break;
					} else {
						map.remove(valueL);
					}
				}
			}
			
			answer += num;
		}
		
		return answer;
	}
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		
		int[] arr = new int[n];
		
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		System.out.println(solution(n, arr));
	}
}