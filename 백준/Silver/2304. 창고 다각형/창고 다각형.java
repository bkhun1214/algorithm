import java.util.*;

public class Main{
    public static int solution(int n, Map<Integer, Integer> map, int max) {
		int answer = 0;
		List<Integer> list = new ArrayList<>(map.keySet());
		list.sort(null);
		
		// 왼쪽부터 가장 높은 곳 까지
		int first = list.get(0);
		int h = map.get(first);
		for (int i = first; i < max; i++) {
			if (map.get(i) != null && h < map.get(i)) {
				h = map.get(i);
			}
			
			answer += h;
		}
		
		// 가장 높은 곳
		answer += map.get(max);
		
		// 오른쪽부터 가장 높은 곳 까지
		int last = list.get(list.size()-1);
		h = map.get(last);
		
		for (int i = last; i > max; i--) {
			if (map.get(i) != null && h < map.get(i)) {
				h = map.get(i);
			}
			
			answer += h;
		}
		
		return answer;
	}
	
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.nextLine();
		
		int maxL = 0;
		int maxH = 0;
		
		Map<Integer, Integer> map = new HashMap<>();
		
		for (int i = 0; i < n; i++) {
			int l = sc.nextInt();
			int h = sc.nextInt();
			sc.nextLine();
			
			map.put(l, h);
			
			if (maxH < h) {
				maxH = h;
				maxL = l;
			}
		}
		
		System.out.println(solution(n, map, maxL));
	}
}