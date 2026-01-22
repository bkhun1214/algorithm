import java.util.*;
public class Main{
    public static String solution(String word) {
		String answer = "I'm Sorry Hansoo";
		int[] count = new int[26];
		
		for (char c : word.toCharArray()) {
			count[c - 'A']++;
		}
		
		int oddCount = 0;
		char oddAlphabet = 0;
		
		for (int i = 0; i < count.length; i++) {
			if (count[i] != 0) {
				if (count[i] % 2 == 1) {
					oddCount++;
					oddAlphabet = (char) (i + 'A');
				}
			}
		}
		
		boolean isOdd = word.length() % 2 == 1 ? true : false;
		
		if ((!isOdd && oddCount != 0) || (isOdd && oddCount != 1)) {
			return answer;
		}
		
		if (isOdd) {
			count[oddAlphabet - 'A']--;
		}
		
		StringBuffer sb = new StringBuffer();
		
		for (int i = 0; i < count.length; i++) {
			if (count[i] != 0) {
				for (int j = 0; j < count[i] / 2; j++) {
					sb.append((char)(i + 'A'));
				}
			}
		}
		
		answer = sb.toString();
		
		if (isOdd) {
			answer += oddAlphabet;
		}
		
		answer += sb.reverse().toString();
		
		return answer;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String word = sc.next();
		
		System.out.println(solution(word));
	}
}