import java.util.*;

public class Main{
    public static int solution(int N, int[][] schedule) {
		int answer = 0;
		
		int[] days = new int[365];
		
		for (int i = 0; i < N; i++) {
			int start = schedule[i][0];
			int end = schedule[i][1];
			
			for (int j = start; j <= end; j++) {
				days[j-1]++;
			}
		}
		
		int max = 0;
		int day = 0;
		for (int i = 0; i < 365; i++) {
			if (days[i] != 0) {
				day++;
				if (max < days[i]) {
					max = days[i];
				}
			} else {
				if (day != 0) {
					answer += (max*day);
					
					max = 0;
					day = 0;
				}
			}
		}
		
		if (day != 0) {
			answer += (max*day);
		}
		
		return answer;
    }
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		sc.nextLine();
		
		int[][] schedule = new int[N][2];
		
		for (int i = 0; i < N; i++) {
			schedule[i][0] = sc.nextInt();
			schedule[i][1] = sc.nextInt();
			sc.nextLine();
		}
		
		System.out.println(solution(N, schedule));
	}
}