import java.util.*;
public class Main{
    public static String solution(int T, int[] N, List<List<Integer>> grades) {
		String answer = "";
		int[] winners = new int[T];
		
		for (int i = 0; i < T; i++) {
			int n = N[i];
			List<Integer> grade = grades.get(i);
			
			int[] count = new int[n];
			int[] scores = new int[n];
			List<Integer> list = new ArrayList<>();
			
			for (int j : grade) {
				count[j]++;
				if (count[j] == 6) {
					list.add(j);
				}
			}
			
			int score = 0;
			
			for (int j = 0; j < grade.size(); j++) {
				if (list.contains(grade.get(j))) {
					score++;
					scores[j] = score; 
				}
			}
			
			Map<Integer, Integer> finalScore = new HashMap<>();
			Map<Integer, Integer> score5th = new HashMap<>();
			int temp = 0;
			
			for (int j : list) {
				for (int k = 0; k < grade.size(); k++) {
					if (grade.get(k) == j) {
						if (finalScore.get(j) == null) {
							finalScore.put(j, scores[k]);
							temp++;
						} else {
							if (temp < 4) {
								finalScore.put(j, (finalScore.get(j) + scores[k]));
								temp++;
							} else {
								score5th.put(j, scores[k]);
								break;
							}
						}
						
					}
				}
				temp = 0;
			}
			
			int min = Integer.MAX_VALUE;
			int winner = 0;
			
			for (int j : list) {
				if (min == finalScore.get(j)) {
					if (score5th.get(winner) > score5th.get(j)) {
						winner = j;
					}
				} else if (min > finalScore.get(j)) {
					min = finalScore.get(j);
					winner = j;
				}
			}
			
			winners[i] = winner;
		}
			
		for (int i = 0; i < T; i++) {
			answer += winners[i];
			if (i != T-1) {
				answer += "\n";
			}
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		sc.nextLine();
		int[] N = new int[T];
		List<List<Integer>> grades = new ArrayList<>(); 
		
		for (int i = 0; i < T; i++) {
			N[i] = sc.nextInt();
			sc.nextLine();
			List<Integer> grade = new ArrayList<>();
			for (int j = 0; j < N[i]; j++) {
				grade.add(sc.nextInt());
			}
			grades.add(grade);
		}
		
		System.out.println(solution(T, N, grades));
	}
}