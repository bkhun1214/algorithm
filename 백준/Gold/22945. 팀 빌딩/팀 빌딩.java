import java.util.*;
import java.io.*;

public class Main{
    public static int solution(int n, int[] arr) {
		int answer = 0;
		int lt = 0;
		int rt = n-1;
		
		while (rt > lt) {
			int length = rt - lt - 1;
			int min = arr[rt] > arr[lt] ? arr[lt++] : arr[rt--];
			int temp = length * min;
			
			if (answer < temp) {
				answer = temp;
			}
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