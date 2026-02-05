import java.util.*;

public class Main{
    public static String solution(int n, String[] problem, int m, String[] command) {
		StringBuffer answer = new StringBuffer();
		
		TreeSet<String> t = new TreeSet<>((s1, s2) -> {
			String[] split1 = s1.split(" ");
			int p1 = Integer.valueOf(split1[0]);
			int l1 = Integer.valueOf(split1[1]);
			
			String[] split2 = s2.split(" ");
			int p2 = Integer.valueOf(split2[0]);
			int l2 = Integer.valueOf(split2[1]);
			
			if (l1 == l2) {
				return p1 - p2;
			}
			
			return l1 - l2;
		});
		Map<Integer, Integer> map = new HashMap<>();
		
		for (int i = 0; i < n; i++) {
			t.add(problem[i]);
			String[] s = problem[i].split(" ");
			map.put(Integer.valueOf(s[0]), Integer.valueOf(s[1]));
		}
		
		for (int i = 0; i < m; i++) {
			String[] s = command[i].split(" ");
			
			if (s[0].equals("recommend")) {
				int x = Integer.valueOf(s[1]);
				
				if (answer.length() != 0) {
					answer.append("\n");
				}
				
				if (x == 1) {
					answer.append(t.last().split(" ")[0]);
				} else {
					answer.append(t.first().split(" ")[0]);
				}
				
			} else if (s[0].equals("add")) {
				t.add(s[1] + " " + s[2]);
				map.put(Integer.valueOf(s[1]), Integer.valueOf(s[2]));
			} else if (s[0].equals("solved")) {
				int x = Integer.valueOf(s[1]);
				t.remove(x + " " + map.get(x));
			}
		}
		
		return answer.toString();
	}
	
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.nextLine();
		
		String[] problem = new String[n];
		
		for (int i = 0; i < n; i++) {
			problem[i] = sc.nextLine();
		}
		
		int m = sc.nextInt();
		sc.nextLine();
		
		String[] command = new String[m];
		
		for (int i = 0; i < m; i++) {
			command[i] = sc.nextLine();
		}
		
		System.out.println(solution(n, problem, m, command));
	}
}