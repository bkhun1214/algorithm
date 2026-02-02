import java.util.*;

public class Main{
    public static String solution(int t, List<Map<String, Integer>> lists, List<List<String>> kind) {
		StringBuffer answer = new StringBuffer();
		
		for (int i = 0; i < t; i++) {
			if (i != 0) {
				answer.append("\n");
			}
			int num = 1;
			Map<String, Integer> map = lists.get(i);
			List<String> list = kind.get(i);
			
			for (int j = 0; j < list.size(); j++) {
				num *= (map.get(list.get(j)) + 1);
			}
			
			num -= 1;
			
			answer.append(num);
		}
		
		return answer.toString();
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		sc.nextLine();
		
		List<Map<String, Integer>> lists = new ArrayList<>();
		List<List<String>> kind = new ArrayList<>();
		
		for (int i = 0; i < t; i++) {
			int n = sc.nextInt();
			sc.nextLine();
			
			Map<String, Integer> map = new HashMap<>();
			List<String> list = new ArrayList<>();
			
			for (int j = 0; j < n; j++) {
				String wears = sc.nextLine();
				String[] wear = wears.split(" ");
				
				if (map.get(wear[1]) == null) {
					list.add(wear[1]);
					map.put(wear[1], 1);
				} else {
					map.put(wear[1], map.get(wear[1]) + 1);
				}
			}
			lists.add(map);
			kind.add(list);
		}
		
		System.out.println(solution(t, lists, kind));
	}
}