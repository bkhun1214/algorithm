import java.util.*;

public class Main{
    public static String solution(int n, int[] arr, int[] line) {
		String answer = "";
		
		for (int i = 0; i < n; i++) {
			int count = 0;
			int index = 0;
			
			for (int j = 0; j < n; j++) {
				
				if (i == line[j]) {
					index = j;
					break;
				}
				
				if (line[j] > i) {
					count++;
				}
			}
			
			if (count == arr[i]) {
				continue;
			} else if (count < arr[i]) {
				for (int j = index+1; j < n; j++) {
					if (line[j] > i) {
						count++;
						
						if (count == arr[i]) {
							int temp = line[index]; 
							line[index] = line[j];
							line[j] = temp;
							
							break;
						}
					}
				}
				
			} else if (count > arr[i]) {
				for (int j = index-1; j >=0; j--) {
					if (line[j] > i) {
						count--;
						
						if (count == arr[i]) {
							int temp = line[index];
							line[index] = line[j];
							line[j] = temp;
							
							break;
						}
					}
				}
			}
		}
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < n; i++) {
			if (i != 0) {
				sb.append(" ");
			}
			sb.append(line[i] + 1); // 1번부터 시작
		}
		
		answer = sb.toString();
		
		return answer;
    }
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.nextLine();
		int[] arr = new int[n];
		int[] line = new int[n];
		
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
			line[i] = i;
		}
		
		System.out.println(solution(n, arr, line));
	}
}