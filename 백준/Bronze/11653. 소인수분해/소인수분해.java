import java.util.*;

public class Main{
    public static String solution(int n) {
		StringBuffer answer = new StringBuffer();
		
		int num = n;
		int[] arr = new int[num+1];
		int count = 2;
		while (num != 1) {
			if (arr[count] == 0) {
				for (int i = count; i < num; i+=count) {
					arr[i] = 1;
				}
				
				while (num % count == 0) {
					if (answer.length() != 0) {
						answer.append("\n");
					}
					answer.append(count);
					num = num / count;
				}
			}
			count++;
		}
		
		return answer.toString();
	}
	
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		System.out.println(solution(n));
	}
}