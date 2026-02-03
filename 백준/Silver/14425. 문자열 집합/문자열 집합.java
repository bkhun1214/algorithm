import java.util.*;

public class Main{
    public static int solution(int m, Map<String, Integer> map, String[] arr) {
		int answer = 0;
		
		for (int i = 0; i < m; i++) {
			if (map.get(arr[i]) != null) {
				answer++;
			}
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		sc.nextLine();
		
		Map<String, Integer> map = new HashMap<String, Integer>();
		String[] arr = new String[m];
		
		for (int i = 0; i < n; i++) {
			String word = sc.nextLine();
			map.put(word, 1);
		}
		
		for (int i = 0; i < m; i++) {
			arr[i] = sc.nextLine();
		}
		
		System.out.println(solution(m, map, arr));
	}
}