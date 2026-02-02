import java.util.*;

public class Main{
    public static String solution(int n, int[] arr) {
		StringBuffer answer = new StringBuffer();
		
		int num = 1;
		Stack<Integer> stack = new Stack<>();
		for (int i = 0; i < n; i++) {
			
			while (arr[i] >= num) {
				stack.push(num);
				answer.append("+\n");
				num++;
			}
			
			if (stack.peek() == arr[i]) {
				stack.pop();
				answer.append("-");
				if (i != n -1) {
					answer.append("\n");
				}
			} else {
				answer = new StringBuffer("NO");
				break;
			}
		}
		
		return answer.toString();
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		sc.nextLine();
		
		int[] arr = new int[n];
		
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
			sc.nextLine();
		}
		
		System.out.println(solution(n, arr));
	}
}