import java.util.*;
public class Main{
    public static void solution(String[] words, int[] Ks) {
		for (int i = 0; i < words.length; i++) {
			String word = words[i];
			int K = Ks[i];
			
			int[] count = new int[26];
			for (char c : word.toCharArray()) {
				count[c - 'a']++;
			}
			
			int min = Integer.MAX_VALUE;
			int max = Integer.MIN_VALUE;
			
			for (int j = 0; j < word.length(); j++) {
				char c = word.charAt(j);
				if (K > count[c - 'a']) {
					continue;
				}
				
				int length = 1;
				int prev = j;
				
				for (int k = 0; k < K-1; k++) {
					int temp = word.indexOf(c, prev + 1);
					length += temp - prev;
					prev = temp;
				}
				
				if (length < min) {
					min = length;
				}
				
				if (length > max) {
					max = length;
				}
				
				count[c - 'a']--;
			}
			
			if (min == Integer.MAX_VALUE) {
				System.out.println("-1");
			} else {
				System.out.println(min + " " + max);
			}
		}
		
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		sc.nextLine();
		
		String[] words = new String[T];
		int[] Ks = new int[T];
		
		for (int i = 0; i < T; i++) {
			words[i] = sc.nextLine();
			Ks[i] = sc.nextInt();
			sc.nextLine();
		}
		
		solution(words, Ks);
	}
}