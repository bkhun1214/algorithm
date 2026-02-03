import java.util.*;

public class Main{
    public static String solution(int n, Map<Integer, Integer> map, Map<Integer, Integer> index) {
		StringBuffer answer = new StringBuffer();
		
		List<Integer> list = new ArrayList<>(map.keySet());
		
		list.sort((s1, s2) -> {
			int num1 = map.get(s1);
			int num2 = map.get(s2);
			
			if (num1 == num2) {
				return index.get(s1) - index.get(s2);
			}
			
			return num2 - num1;
		});
		
		for (int i = 0; i < list.size(); i++) {
			int num = list.get(i);
			for (int j = 0; j < map.get(num); j++) {
				answer.append(num);
				if (j != map.get(num) - 1) {
					answer.append(" ");
				}
			}
			
			if (i != list.size()-1) {
				answer.append(" ");
			}
		}
		
		return answer.toString();
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		sc.nextLine();
		
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		Map<Integer, Integer> index = new HashMap<Integer, Integer>();
		
		for (int i = 0; i < n; i++) {
			int num = sc.nextInt();
			
			if (map.get(num) == null) {
				map.put(num, 1);
				index.put(num, i);
			} else {
				map.put(num, map.get(num) + 1);
			}
		}
		
		System.out.println(solution(n, map, index));
	}
}