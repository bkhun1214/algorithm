import java.util.*;
public class Main{
    public static String solution(int N, int M, int[] bulb, int[][] command) {
		String answer = "";
		
		for (int i = 0; i < M; i++) {
			int a = command[i][0];
			
			if (a == 1) {
				// i 번째 전구의 상태를 x로 변경한다.
				bulb[command[i][1] - 1] = command[i][2]; 
			} else if (a == 2) {
				// l번째부터 r번째까지의 전구의 상태를 변경한다. (켜져있는 전구는 끄고, 꺼져있는 전구는 킨다.)
				for (int j = command[i][1] - 1; j < command[i][2]; j++) {
					if (bulb[j] == 0) {
						bulb[j] = 1;
					} else {
						bulb[j] = 0;
					}
				}
			} else if (a == 3) {
				// l번째부터 r번째까지의 전구를 끈다.
				for (int j = command[i][1] - 1; j < command[i][2]; j++) {
					bulb[j] = 0;
				}
			} else if (a == 4) {
				// l번째부터 r번째까지의 전구를 킨다.
				for (int j = command[i][1] - 1; j < command[i][2]; j++) {
					bulb[j] = 1;
				}
			}
		}
		
		for (int i = 0; i < N; i++) {
			if (i != 0) {
				answer += " ";
			}
			answer += bulb[i];
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int M = sc.nextInt();
		sc.nextLine();
		
		int[] bulb = new int[N];
		int[][] command = new int[M][3];
		
		for (int i = 0; i < N; i++) {
			bulb[i] = sc.nextInt();
		}
		
		sc.nextLine();
		
		for (int j = 0; j < M; j++) {
			for (int k = 0; k < 3; k++) {
				command[j][k] = sc.nextInt();
			}
			sc.nextLine();
		}
		
		System.out.println(solution(N, M, bulb, command));
	}
}