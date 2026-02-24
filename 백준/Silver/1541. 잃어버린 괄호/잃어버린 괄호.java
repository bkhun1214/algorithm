import java.util.*;
import java.io.*;

public class Main{
    public static int solution(String s) {
		int answer = 0;
		int length = s.length();
		List<Integer> cal = new ArrayList<>();
		
		boolean isAdd = true;
		
		int num = 0;
		while (num < length) {
			String temp = "";
			while(num < length && s.charAt(num) != '+' && s.charAt(num) != '-') {
				temp += s.charAt(num) - '0';
				num++;
			}
			
			int a = Integer.parseInt(temp);
			if (isAdd) {
				cal.add(a);
			} else {
				cal.add(-a);
			}
			
			if (num < length) {
				if (s.charAt(num) == '-' && isAdd) {
					isAdd = false;
				}
				num++;
			}
		}
		
		for (int i = 0; i < cal.size(); i++) {
			answer += cal.get(i);
		}
		
		return answer;
	}
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		String s = st.nextToken();
		
		System.out.println(solution(s));
	}
}