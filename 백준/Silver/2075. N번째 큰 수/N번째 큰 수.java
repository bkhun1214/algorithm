import java.util.*;

public class Main{
    public static int solution(int n, int[][] arr) {
		int answer = 0;
		
//		int[] index = new int[n];
//		for (int i = 0; i < n; i++) {
//			index[i] = n-1;
//		}
//		
//		int count = 0;
//		while (count < n) {
//			int temp = Integer.MIN_VALUE;
//			int max = 0;
//			
//			for (int i = 0; i < n; i++) {
//				if (arr[i][index[i]] > temp) { 
//					answer = arr[i][index[i]];
//					temp = answer;
//					max = i;
//				}
//			}
//			index[max]--;
//			count++;
//		}
		
		Queue<Integer> q = new PriorityQueue<Integer>(Collections.reverseOrder());
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				q.add(arr[i][j]);
			}
		}
		
		for (int i = 0; i < n; i++) {
			answer = q.poll();
		}
		
		return answer;
	}
	
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.nextLine();
		
		int[][] arr = new int[n][n];
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		
		System.out.println(solution(n, arr));
	}
}