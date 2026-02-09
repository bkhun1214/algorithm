import java.util.*;
import java.io.*;

public class Main{
    public static String solution(int n, int[] arr) {
		StringBuffer answer = new StringBuffer();
		
		for (int i = 0; i < n; i++) {
			if (i != 0) {
				answer.append("\n");
			}
			
			int num = arr[i];
			
			int two = 0;
			int five = 0;
			
			for (int j = 2; j <= num; j*=2) {
				two += num / j;
			}
			
			for (int j = 5; j <= num; j*=5) {
				five += num / j;
			}
			
			if (five > two) {
				answer.append(two);
			} else {
				answer.append(five);
			}
		}
		
		return answer.toString();
	}
	
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		sc.nextLine();
		
		int[] arr = new int[n];
		
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
			sc.nextLine();
		}
		
		System.out.println(solution(n, arr));
	}
}