import java.util.*;
import java.io.*;

public class Main{
    public static String solution(int n, int[][] arr) {
		StringBuffer answer = new StringBuffer();
		
		Map<Integer, Integer> count = new HashMap<>();
		
		for (int i = 0; i < n; i++) {
			int start = arr[i][0];
			int end = arr[i][1];
			
			count.put(start, count.getOrDefault(start, 0) + 1);
			count.put(end, count.getOrDefault(end, 0) - 1);
		}
		
		List<Integer> enter = new ArrayList<>(count.keySet());
		enter.sort(null);
		int max = 0;
		int sum = 0;
		int start = 0;
		int end = 0;
		boolean isEnd = false;
		
		for (int i = 0; i < enter.size(); i++) {
			sum += count.get(enter.get(i));
			
			if (max < sum) {
				max = sum;
				start = enter.get(i);
				isEnd = true;
			} else if ((max > sum) && isEnd) {
				end = enter.get(i);
				isEnd = false;
			}
		}
		
		if (max == sum) {
			end = enter.get(enter.size() - 1) + 1;
		}
		
		answer.append(max);
		answer.append("\n");
		answer.append(start);
		answer.append(" ");
		answer.append(end);

		return answer.toString();
	}
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int[][] arr = new int[n][2];
		
		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			arr[i][0] = Integer.parseInt(st.nextToken());
			arr[i][1] = Integer.parseInt(st.nextToken());
		}
		
		System.out.println(solution(n, arr));
	}
}