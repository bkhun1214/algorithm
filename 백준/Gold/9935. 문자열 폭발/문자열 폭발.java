import java.util.*;
import java.io.*;

public class Main{
    public static String solution(String s, String b) {
		StringBuffer answer = new StringBuffer();
		
		int boomLength = b.length();
		
		for (int i = 0; i < s.length(); i++) {
			answer.append(s.charAt(i));
			
			if (answer.length() >= boomLength) {
				boolean isBoom = true;
				
				for (int j = 0; j < boomLength; j++) {
					if (answer.charAt(answer.length() - boomLength + j) != b.charAt(j)) {
						isBoom = false;
						break;
					}
				}
				
				if (isBoom) {
					answer.delete(answer.length() - boomLength, answer.length());
				}
			}
		}

		if (answer.length() == 0) {
			return "FRULA";
		}
		
		return answer.toString();
	}
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		String s = st.nextToken();
		
		st = new StringTokenizer(br.readLine());
		
		String b = st.nextToken();
		
		System.out.println(solution(s, b));
	}
}