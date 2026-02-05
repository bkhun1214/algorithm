import java.util.*;

public class Main{
    public static String solution(int m, int n) {
		StringBuffer answer = new StringBuffer();
		List<Integer> list = new ArrayList<>();
		
		for (int i = m; i<=n; i++) {
			if (i == 1) {
				continue;
			}
			boolean flag = true;
			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					flag = false;
					break;
				}
			}
			if (flag) {
				list.add(i);
			}
		}
		
		if (list.size() == 0) {
			answer.append("-1");
		} else {
			int sum = 0;
			for (int i = 0; i < list.size(); i++) {
				sum += list.get(i);
			}
			answer.append(sum);
			answer.append("\n");
			answer.append(list.get(0));
		}
		
		return answer.toString();
	}
	
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		sc.nextLine();
		int n = sc.nextInt();
		sc.nextLine();
		
		System.out.println(solution(m, n));
	}
}