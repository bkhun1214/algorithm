import java.util.*;

public class Main{
    public static String solution(int n, String[] arr) {
		StringBuffer answer = new StringBuffer();
		
		for (int i = 0; i < n; i++) {
			if (i != 0) {
				answer.append("\n");
			}
			
			long count = 0;
			
			String[] split = arr[i].split(" ");
			int length = Integer.valueOf(split[0]) + 1;
			
			long a;
			long b;
			
			for (int j = 1; j < length - 1; j++) {
				for (int k = j+1; k < length; k++) {
					a = Long.valueOf(split[j]);
					b = Long.valueOf(split[k]);
					
					if (a < b) {
						long temp = a;
						a = b;
						b = temp;
					}
					
					while (b != 0) {
						long temp = a % b;
						a = b;
						b = temp;
					}
					
					count += a;
				}
			}
			
			answer.append(count);
		}
		
		return answer.toString();
	}
	
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		sc.nextLine();
		
		String[] arr = new String[n];
		
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextLine();
		}
		
		System.out.println(solution(n, arr));
	}
}