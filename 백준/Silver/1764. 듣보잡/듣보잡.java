import java.util.*;
public class Main{
    public static void solution(Map<String, Integer> map, List<String> member) {
		List<String> answer = new ArrayList<>();
		
		for (int i = 0; i < member.size(); i++) {
			if (map.get(member.get(i)) != null) {
				answer.add(member.get(i));
			}
		}
		
		answer.sort(null);
		
		System.out.println(answer.size());
		for (int i = 0; i < answer.size(); i++) {
			System.out.println(answer.get(i));
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		sc.nextLine();
		
		Map<String, Integer> map = new HashMap<>();
		List<String> member = new ArrayList<>();
		
		for (int i = 0; i < N; i++) {
			map.put(sc.nextLine(), 1);
		}
		
		for (int i = 0; i < M; i++) {
			member.add(sc.nextLine());
		}
		
		solution(map, member);
	}
}