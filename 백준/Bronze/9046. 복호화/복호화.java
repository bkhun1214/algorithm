import java.util.*;
public class Main{
    public static void solution(int n, String[] arr) {
		
		for (int i = 0; i < n; i++) {
			String s = arr[i].replaceAll(" ", "");
			int[] count = new int[26];
			int max = 0;
			
			for (int j = 0; j < s.length(); j++) {
				int temp = s.charAt(j) - 'a';
				count[temp]++;
				
				if (max < count[temp]) {
					max = count[temp];
				}
			}
			
			int maxCount = 0;
			char answer = 0;
			for (int k = 0; k < count.length; k++) {
				if (count[k] == max) {
					maxCount++;
					answer = (char)( k + 'a');
				}
			}
			
			System.out.println(maxCount == 1 ? answer : "?");
		}
		
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.nextLine();
		String[] arr = new String[n];

		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextLine();
		}

		solution(n, arr);
	}
}