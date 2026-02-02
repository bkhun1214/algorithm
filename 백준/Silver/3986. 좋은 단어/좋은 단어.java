import java.util.*;

public class Main{
    public static int solution(int N, String[] words) {
		int answer = 0;
		
		for (int i = 0; i < N; i++) {
			
			String word = words[i];
			
			if (word.length() % 2 != 0) {
				continue;
			}
			
			Stack<String> stack = new Stack<>();
			stack.push(word.substring(0, 1));
			
			for (int j = 1; j < word.length(); j++) {
				String s = word.substring(j, j+1);
				
				if (stack.empty()) {
					stack.push(s);
				} else if (stack.peek().equals(s)) {
					stack.pop();
				} else {
					stack.push(s);
				}
			}
			
			if (stack.empty()) {
				answer++;
			}
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		sc.nextLine();
		
		String[] words = new String[N];
		
		for (int i = 0; i < N; i++) {
			words[i] = sc.nextLine();
		}
		
		System.out.println(solution(N, words));
	}
}