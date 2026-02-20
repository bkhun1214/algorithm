import java.util.*;
import java.io.*;

public class Main{
    public static int solution(int n, int k, int[] arr) {
		int answer = 0;
		int lt = 0;
		int length = 0;
		
		for (int rt = 0; rt < n; rt++) {
			if (arr[rt] % 2 == 0) {
				length++;
			} else {
				while (k <= 0) {
					if (arr[lt] % 2 == 0) {
						length--;
						lt++;
					} else {
						k++;
						lt++;
					}
				}
				k--;
			}
			
			if (answer < length) {
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