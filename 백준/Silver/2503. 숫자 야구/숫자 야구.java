import java.util.*;
import java.io.*;

public class Main{
    public static int solution(int n, String[] nums, int[][] tc) {
		int answer = 0;
		
		for (int i = 1; i < 10; i++) {
			for (int j = 1; j < 10; j++) {
				if (i == j) {
					continue;
				}
				for (int k = 1; k < 10; k++) {
					if (i == k || j == k) {
						continue;
					}
					StringBuffer sb = new StringBuffer();
					sb.append(i);
					sb.append(j);
					sb.append(k);
					
					boolean b = true;
					
					for (int l = 0; l < n; l++) {
						if (strikeCount(sb.toString(), nums[l]) != tc[l][0]) {
							b = false;
							break;
						}
						
						if (ballCount(sb.toString(), nums[l]) != tc[l][1]) {
							b = false;
							break;
						}
					}
					
					if (b) {
						answer++;
					}
				}
			}
		}
		
		return answer;
	}
	
	public static int strikeCount(String num1, String num2) {
		int answer = 0;
		
		for (int i = 0; i < 3; i++) {
			if (num1.charAt(i) == num2.charAt(i)) {
				answer++;
			}
		}
		
		return answer;
	}
	
	public static int ballCount(String num1, String num2) {
		int answer = 0;
		
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (i == j) {
					continue;
				}
				if (num1.charAt(i) == num2.charAt(j)) {
					answer++;
				}
			}
		}
		
		return answer;
	}
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		
		String[] nums = new String[n];
		int[][] tc = new int[n][2];
		
		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			nums[i] = st.nextToken();
			tc[i][0] = Integer.parseInt(st.nextToken());
			tc[i][1] = Integer.parseInt(st.nextToken());
		}
		
		System.out.println(solution(n, nums, tc));
	}
}