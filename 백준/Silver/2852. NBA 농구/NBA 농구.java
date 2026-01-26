import java.util.*;
public class Main{
    public static String solution(int N, String[] goals) {
		String answer = "";
		int[] winnerMinute = new int[2];
		
		int scoreA = 0;
		int scoreB = 0;
		
		int prevMinute = 0;
		
		for (int i = 0; i < N; i++) {
			
			String[] goal = goals[i].split(" ");
			int team = Integer.valueOf(goal[0]);
			String[] time = goal[1].split(":");
			int hour = Integer.valueOf(time[0]);
			int minute = Integer.valueOf(time[1]) + (hour * 60);
			
			if (i == 0) {
				prevMinute = minute;
				if (team == 1) {
					scoreA++;
				} else {
					scoreB++;
				}
				continue;
			}
			
			if (scoreA == scoreB) {
				prevMinute = minute;
				if (team == 1) {
					scoreA++;
				} else {
					scoreB++;
				}
				continue;
			}
			
			int winnerKeep = minute - prevMinute;
			
			if (scoreA > scoreB) {
				winnerMinute[0] += winnerKeep;
			} else {
				winnerMinute[1] += winnerKeep;
			}
			
			if (team == 1) {
				scoreA++;
			} else {
				scoreB++;
			}
			prevMinute = minute;
		}
		
		if (scoreA > scoreB) {
			winnerMinute[0] += (48 * 60) - prevMinute;
		} else if (scoreA < scoreB) {
			winnerMinute[1] += (48 * 60) - prevMinute;
		}
		
		answer += String.format("%02d:%02d", winnerMinute[0] / 60, winnerMinute[0] % 60);
		answer += "\n";
		answer += String.format("%02d:%02d", winnerMinute[1] / 60, winnerMinute[1] % 60);
		
		return answer;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		sc.nextLine();
		String[] goals = new String[N];
		
		for (int i = 0; i < N; i++) {
			goals[i] = sc.nextLine();
		}
		
		System.out.println(solution(N, goals));
	}
}