import java.util.*;
import java.io.*;

public class Main{
    public static String solution(String s) {
		StringBuffer answer = new StringBuffer();
		
		int num = 0;
		
		for (char c : s.toCharArray()) {
			if (c == 'X') {
				num++;
				if (num == 4) {
					answer.append("AAAA");
					num = 0;
				}
			} else {
				if (num == 0) {
					answer.append(".");
					continue;
				} else if (num == 2) {
					answer.append("BB.");
					num = 0;
					continue;
				} else {
					return "-1";
				}
			}
		}
		
		if (num == 2) {
			answer.append("BB");
		} else if (num != 0) {
			return "-1";
		}
		
		return answer.toString();
	}
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		String s = st.nextToken();
		
		System.out.println(solution(s));
	}
}