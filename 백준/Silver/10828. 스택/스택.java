import java.util.*;

public class Main{
    public static void solution(int N, String[] lines) {
        Stack<Integer> stack = new Stack<>();
        
        for (String line : lines) {
        	
        	if (line.startsWith("push")) {
        		stack.push(Integer.valueOf(line.split(" ")[1]));
        	} else if (line.startsWith("pop")) {
        		if (stack.empty()) {
        			System.out.println("-1");
        		} else {
        			System.out.println(stack.pop());
        		}
        	} else if (line.startsWith("size")) {
        		System.out.println(stack.size());
        	} else if (line.startsWith("empty")) {
        		System.out.println(stack.empty() ? "1" : "0");
        	} else if (line.startsWith("top")) {
        		if (stack.empty()) {
        			System.out.println("-1");
        		} else {
        			int temp = stack.pop();
        			stack.push(temp);
        			System.out.println(temp);
        		}
        	}
        	
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.nextLine();
        String[] lines = new String[N];
        
        for (int i = 0; i < N; i++) {
            lines[i] = sc.nextLine();
        }
        
        solution(N, lines);
    }
}