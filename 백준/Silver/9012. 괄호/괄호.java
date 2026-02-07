import java.util.*;

public class Main{
    public static String solution(int n, String[] arr) {
		StringBuffer answer = new StringBuffer();
		
		for (int i = 0; i < n; i++) {
			if (i != 0) {
				answer.append("\n");
			}
			String s = arr[i];
			
			if (s.length() % 2 != 0) {
				answer.append("NO");
				continue;
			}
			
			Stack<Character> stack = new Stack<>();
			
			for (char c : s.toCharArray()) {
				if (stack.isEmpty() || c == '(') {
					stack.add(c);
					continue;
				} else {
					if (stack.peek() == '(') {
						stack.pop();
					} else {
						break;
					}
				}
			}
			if (stack.isEmpty()) {
				answer.append("YES");
			} else {
				answer.append("NO");
			}
			
		}
		
		return answer.toString();
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        String[] arr = new String[n];
        sc.nextLine();
        
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextLine();
        }
        
        System.out.println(solution(n, arr));
    }
}