import java.util.*;
public class Main{
    public static void solution(String[] words) {
		String[] answer = new String[2];
		int max = 0;
		
		for (int i = 0; i < words.length - 1; i++) {
			String a = words[i];
			
			if (max > a.length()) {
				continue;
			}
			
			for (int j = i+1; j < words.length; j++) {
				String b = words[j];
				
				if (max > b.length()) {
					continue;
				}
				
				int length = a.length() > b.length() ? b.length() : a.length();
				int count = 0;
				for (int k = 0; k < length; k++) {
					if (a.charAt(k) != b.charAt(k)) {
						break;
					}
					count++;
				}
				
				if (max < count) {
					max = count;
					answer[0] = a;
					answer[1] = b;
				}
			}
		}
		
		System.out.println(answer[0]);
		System.out.println(answer[1]);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		sc.nextLine();
		
		String[] words = new String[N];
		
		for (int i = 0; i < N; i++) {
			words[i] = sc.nextLine();
		}
		
		solution(words);
	}
}