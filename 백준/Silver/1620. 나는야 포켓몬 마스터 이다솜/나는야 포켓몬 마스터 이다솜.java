import java.util.*;

public class Main{
    public static String solution(int M, Map<String, Integer> name, Map<Integer, String> num, String[] solve) {
		StringBuffer answer = new StringBuffer();
		
		for (int i = 0; i < M; i++) {
			if (i != 0) {
				answer.append("\n");
			}
			
			char c = solve[i].charAt(0);
			if (Character.isDigit(c)) {
				answer.append(num.get(Integer.valueOf(solve[i])));
			} else {
				answer.append(name.get(solve[i]));
			}
		}
		
		return answer.toString();
    }
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		sc.nextLine();
		
		Map<String, Integer> name = new HashMap<>();
		Map<Integer, String> num = new HashMap<>();
		
		for (int i = 0; i < N; i++) {
			String s = sc.nextLine();
			name.put(s, i+1);
			num.put(i+1, s);
		}
		
		String[] solve = new String[M];
		
		for (int i = 0; i < M; i++) {
			solve[i] = sc.nextLine();
		}
		
		System.out.println(solution(M, name, num, solve));
	}
}