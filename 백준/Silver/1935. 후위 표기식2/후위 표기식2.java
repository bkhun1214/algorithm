import java.util.*;
import java.io.*;

public class Main{
    public static String solution(String line, int[] arr) {
		String answer = "";
		
		Stack<Double> stack = new Stack<>();
		
		for (char c : line.toCharArray()) {
			
			if (Character.isAlphabetic(c)) {
				stack.push((double) arr[c-'A']); 
			} else {
				double b = stack.pop();
				double a = stack.pop();
				double temp;
				
				if (c == '+') {
					temp = a + b;
				} else if (c == '-') {
					temp = a - b;
				} else if (c == '*') {
					temp = a * b;
				} else {
					temp = a / b;
				}
				stack.push(temp);
			}
		}
		
		answer = String.format("%.2f", stack.pop());
		
		return answer;
	}
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		String line = br.readLine();
		int[] arr = new int[26];
		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		System.out.println(solution(line, arr));
	}
}