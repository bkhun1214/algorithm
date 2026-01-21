import java.util.*;
public class Main{
    public static String solution(String s) {
		s = s.toUpperCase();
		int[] count = new int[26];
		int max = 0;
		
		for (int i = 0; i < s.length(); i++) {
			int temp = s.charAt(i) - 'A';
			count[temp]++;
			
			if (max < count[temp]) {
				max = count[temp];
			}
		}
		
		int maxCount = 0;
		String answer = "";
		
		for (int j = 0; j < count.length; j++) {
			if (max == count[j]) {
				maxCount++;
				answer = String.valueOf((char) (j + 'A'));
			}
		}
		
		return maxCount == 1 ? answer : "?";
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();

		System.out.println(solution(s));
	}
}