import java.util.*;
public class Main{
    public static int solution(String word) {
		int answer = Integer.MAX_VALUE;
		
		int aCount = 0;
		
		for (char c : word.toCharArray()) {
			if (c == 'a') {
				aCount++;
			}
		}
		
		for (int i = 0; i < word.length(); i++) {
			int bCount = 0;
			for (int j = 0; j < aCount; j++) {
				 int count = i + j;
				 if (count > word.length() - 1) {
					 count -= word.length(); 
				 }
				 if (word.charAt(count) == 'b') {
					 bCount++;
				 }
			}
			
			if (answer > bCount) {
				answer = bCount;
			}
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String word = sc.nextLine();
		
		System.out.println(solution(word));
	}
}