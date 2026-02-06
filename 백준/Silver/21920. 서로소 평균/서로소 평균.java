import java.util.*;

public class Main{
    public static String solution(int n, int[] arr, int x) {
		String answer = "";
		
		double sum = 0;
		double count = 0;
		
		for (int i = 0; i < n; i++) {
			int a = x;
			int b = arr[i];
			
			if (a < b) {
				int temp = a;
				a = b;
				b = temp;
			}
			
			while (b != 0) {
				int temp = a % b;
				a = b;
				b = temp;
			}
			
			if (a == 1) {
				sum += arr[i];
				count++;
			}
		}
		
		answer = String.valueOf(sum / count);
		
		return answer;
	}
	
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		sc.nextLine();
		
		int[] arr = new int[n];
		
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		sc.nextLine();
		
		int x = sc.nextInt();
		sc.nextLine();
		
		System.out.println(solution(n, arr, x));
	}
}