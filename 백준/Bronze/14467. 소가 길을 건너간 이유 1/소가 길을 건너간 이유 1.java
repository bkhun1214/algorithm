import java.util.*;
public class Main{
    public static int solution(int N, int[] cow, int[] move) {
		int answer = 0;
		int[] see = new int[N];
		
		for (int i = 0; i < N; i++) {
			see[i] = -1;
		}
		
		for (int i = 0; i < N; i++) {
			
			if (move[i] == 0) {
				if (see[cow[i]-1] == 1) {
					answer++;
				}
			} else {
				if (see[cow[i]-1] == 0) {
					answer++;
				}
			}
			
			see[cow[i]-1] = move[i];
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		sc.nextLine();
		
		int[] cow = new int[N];
		int[] move = new int[N];
		
		for (int i = 0; i < N; i++) {
			cow[i] = sc.nextInt();
			move[i] = sc.nextInt();
			sc.nextLine();
		}
		
		System.out.println(solution(N, cow, move));
	}
}