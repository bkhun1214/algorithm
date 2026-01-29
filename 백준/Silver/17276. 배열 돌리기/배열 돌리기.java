import java.util.*;
public class Main{
    public static String solution(int T, int[] ns, int[] ds, int[][][] arrs) {
		StringBuffer answer = new StringBuffer();

		for (int i = 0; i < T; i++) {
			int n = ns[i];
			int d = ds[i];
			int[][] arr = arrs[i];
			
			if (d < 0) {
				d += 360;
			}
			
			d = d / 45;
			int half = n/2;
			
			for (int j = 0; j < d; j++) {
				for (int k = 1; k <= half; k++) {
					// 1. [n/2 -i, n/2]	->	[n/2 -i, n/2 + i]
					// 2. [n/2 -1, n/2 + i]	->	[n/2, n/2 + i]
					// 3. [n/2, n/2 + i] -> [n/2 + i, n/2 + i]
					// 4. [n/2 + i, n/2 + i] -> [n/2 + i, n/2]
					// 5. [n/2 + i, n/2] -> [n/2 + i, n/2 - i]
					// 6. [n/2 + i, n/2 - i] -> [n/2, n/2 - i]
					// 7. [n/2, n/2 - i] -> [n/2 - i, n/2 - i]
					// 8. [n/2 - i, n/2 - i] -> [n/2 - i, n/2]
					int minus = half-k;
					int plus = half+k;
					
					int temp = arr[minus][half];
					arr[minus][half] = arr[minus][minus];
					arr[minus][minus] = arr[half][minus];
					arr[half][minus] = arr[plus][minus];
					arr[plus][minus] = arr[plus][half];
					arr[plus][half] = arr[plus][plus];
					arr[plus][plus] = arr[half][plus];
					arr[half][plus] = arr[minus][plus];
					arr[minus][plus] = temp;
				}
			}
			
			if (i != 0) {
				answer.append("\n");
			}
			
			for (int j = 0; j < n; j++) {
				for (int k = 0; k < n; k++) {
					answer.append(arr[j][k]);
					if (k != n-1) {
						answer.append(" ");
					}
				}
				if (j != n-1) {
					answer.append("\n");
				}
			}
		}
		
		return answer.toString();
    }
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		sc.nextLine();
		int n[] = new int[T];
		int d[] = new int[T];
		
		int[][][] arr = new int[T][][];
		
		for (int i = 0; i < T; i++) {
			n[i] = sc.nextInt();
			d[i] = sc.nextInt();
			sc.nextLine();
			
			arr[i] = new int[n[i]][n[i]];
			
			for (int j = 0; j < n[i]; j++) {
				for (int k = 0; k < n[i]; k++) {
					arr[i][j][k] = sc.nextInt();
				}
				sc.nextLine();
			}
		}
		
		System.out.println(solution(T, n, d, arr));
	}
}