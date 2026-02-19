import java.util.*;
import java.io.*;

public class Main{
    public static int solution(String s1, String s2) {
		int answer = 0;
		
		Stack<String> stack = new Stack<>();
		stack.add(s2);
		
		int length = s1.length();
		
		while (!stack.isEmpty()) {
			String temp = stack.pop();
			int tempLength = temp.length();
			
			if (temp.equals(s1)) {
				return 1;
			}
			
			if (tempLength <= length) {
				continue;
			}
			
			// 1. 문자열의 뒤에 A를 추가한다. -> 맨 뒤가 A면 A제거
			if (temp.charAt(tempLength-1) == 'A') {
				StringBuffer sb = new StringBuffer();
				sb.append(temp.substring(0, tempLength-1));
				stack.add(sb.toString());
			}
			
			// 2. 문자열의 뒤에 B를 추가하고 문자열을 뒤집는다. -> 맨 앞이 B이면 제거 후 뒤집음
			if (temp.charAt(0) == 'B') {
				StringBuffer sb = new StringBuffer();
				sb.append(temp.substring(1, tempLength));
				sb.reverse();
				stack.add(sb.toString());
			}
		}
		
		return answer;
	}
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		String s1 = st.nextToken();
		
		st = new StringTokenizer(br.readLine());
		
		String s2 = st.nextToken();
		
		System.out.println(solution(s1, s2));
	}
}