import java.util.*;
import java.io.*;

public class Main{
    static int max = Integer.MIN_VALUE;
	static int min = Integer.MAX_VALUE;
	static int[] arr;
	
	public static String solution(int n, int[] oper) {
		
		Queue<int[]> q = new LinkedList<>();
		
		q.add(new int[]{arr[0], 1, oper[0], oper[1], oper[2], oper[3]});
		
		while(!q.isEmpty()) {
			int[] poll = q.poll();
			int sum = poll[0];
			int count = poll[1];
			
			if (n == count) {
				if (sum > max) {
					max = sum;
				}
				
				if (sum < min) {
					min = sum;
				}
				
				continue;
			}
			
			// 덧셈
			if (poll[2] > 0) {
				q.add(new int[] {sum+arr[count], count+1, poll[2]-1, poll[3], poll[4], poll[5]});
			}
			
			// 뺄셈
			if (poll[3] > 0) {
				q.add(new int[] {sum-arr[count], count+1, poll[2], poll[3]-1, poll[4], poll[5]});
			}
			
			// 곱셈
			if (poll[4] > 0) {
				q.add(new int[] {sum * arr[count], count+1, poll[2], poll[3], poll[4]-1, poll[5]});
			}
			
			// 나눗셈
			if (poll[5] > 0) {
				int temp = Math.abs(sum);
				temp = temp / arr[count];
				
				if (sum < 0) {
					temp = temp * -1;
				}
				
				q.add(new int[] {temp, count+1, poll[2], poll[3], poll[4], poll[5]-1});
			}
		}
		
		StringBuffer sb = new StringBuffer();
		sb.append(max);
		sb.append("\n");
		sb.append(min);
		
		return sb.toString();
	}
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		
		arr = new int[n];
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		int[] oper = new int[4];
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < 4; i++) {
			oper[i] = Integer.parseInt(st.nextToken());
		}
		
		System.out.println(solution(n, oper));
	}
}