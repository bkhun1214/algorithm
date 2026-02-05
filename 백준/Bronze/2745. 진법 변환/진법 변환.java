import java.util.*;

public class Main{
    public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		
		String[] line = sc.nextLine().split(" "); 
		
		StringBuffer sb = new StringBuffer(line[0]).reverse();
		int n = Integer.valueOf(line[1]);
		
		int answer = 0;
		int x = 1;
		
		for (char c : sb.toString().toCharArray()) {
			int temp;
			if (Character.isAlphabetic(c)) {
				temp = Integer.valueOf(c - 'A' + 10);
			} else {
				temp = Integer.valueOf(c - '0');
			}
			
			answer += temp * x;
			x *= n;
		}
		System.out.println(answer);
	}
}