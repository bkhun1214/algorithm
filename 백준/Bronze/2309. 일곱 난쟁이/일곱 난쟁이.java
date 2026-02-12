import java.util.*;
import java.io.*;

public class Main{
    public static String solution(List<Integer> list) {
		StringBuffer answer = new StringBuffer();
		
		int sum = 0;
		
		for (int i = 0; i < 9; i++) {
			sum += list.get(i);
		}
		list.sort(null);
		
		boolean isRemove = false;
		for (int i = 0; i < 8; i++) {
			for (int j = i+1; j < 9; j++) {
				if (sum - list.get(i) - list.get(j) == 100) {
					list.remove(i);
					list.remove(j-1);
					isRemove = true;
					break;
				}
			}
			if (isRemove) {
				break;
			}
		}
		
		for (int i = 0; i < 7; i++) {
			if (i != 0) {
				answer.append("\n");
			}
			answer.append(list.get(i));
		}
		
		return answer.toString();
	}
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st;
		
		List<Integer> list = new ArrayList<>();
		
		for (int i = 0; i < 9; i++) {
			st = new StringTokenizer(br.readLine());
			list.add(Integer.parseInt(st.nextToken())); 
		}
		
		System.out.println(solution(list));
	}
}