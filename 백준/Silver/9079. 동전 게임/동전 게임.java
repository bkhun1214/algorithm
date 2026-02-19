import java.util.*;
import java.io.*;

public class Main{
    public static String solution(int n, String[] arr) {
		StringBuffer answer = new StringBuffer();
		
		for (int i = 0; i < n; i++) {
			if (i != 0) {
				answer.append("\n");
			}
			
			int count = -1;
			
			String line = arr[i];
			
			Map<String, Integer> map = new HashMap<>();
			Queue<String[]> q = new LinkedList<>();
			map.put(line, 0);
			q.add(new String[] {line, "0"});
			
			while (!q.isEmpty()) {
				String[] poll = q.poll();
				
				String coin = poll[0];
				int num = Integer.parseInt(poll[1]);
				
				char c = coin.charAt(0);
				boolean b = true;
				for (int j = 1; j < 9; j++) {
					if (c != coin.charAt(j)) {
						b = false;
						break;
					}
				}
				
				if (b) {
					count = num;
					break;
				}
				
				// 행
				for (int j = 0; j < 3; j++) {
					StringBuffer sb = new StringBuffer();
					sb.append(coin);
					
					int temp = j * 3;
					
					for (int k = 0; k < 3; k++) {
						if (coin.charAt(temp) == 'H') {
							sb.replace(temp, temp+1, "T");
						} else {
							sb.replace(temp, temp+1, "H");
						}
						temp++;
					}
					
					String change = sb.toString();
					if (map.get(change) == null) {
						map.put(change, num+1);
						q.add(new String[] {change, String.valueOf(num+1)});
					}
				}
				
				// 열
				for (int j = 0; j < 3; j++) {
					StringBuffer sb = new StringBuffer();
					sb.append(coin);
					
					int temp = j;
					
					for (int k = 0; k < 3; k++) {
						if (coin.charAt(temp) == 'H') {
							sb.replace(temp, temp+1, "T");
						} else {
							sb.replace(temp, temp+1, "H");
						}
						temp += 3;
					}
					
					String change = sb.toString();
					if (map.get(change) == null) {
						map.put(change, num+1);
						q.add(new String[] {change, String.valueOf(num+1)});
					}
				}
				
				// 대각선
				StringBuffer sb = new StringBuffer();
				sb.append(coin);
				
				for (int k = 0; k < 9; k +=4) {
					if (coin.charAt(k) == 'H') {
						sb.replace(k, k+1, "T");
					} else {
						sb.replace(k, k+1, "H");
					}
				}
				
				String change = sb.toString();
				if (map.get(change) == null) {
					map.put(change, num+1);
					q.add(new String[] {change, String.valueOf(num+1)});
				}
				
				
				sb = new StringBuffer();
				sb.append(coin);
				
				for (int k = 2; k < 7; k +=2) {
					if (coin.charAt(k) == 'H') {
						sb.replace(k, k+1, "T");
					} else {
						sb.replace(k, k+1, "H");
					}
				}
				
				change = sb.toString();
				if (map.get(change) == null) {
					map.put(change, num+1);
					q.add(new String[] {change, String.valueOf(num+1)});
				}
			}
			answer.append(count);
		}
		
		return answer.toString();
	}
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		String[] arr = new String[n];
		
		for (int i = 0; i < n; i++) {
			StringBuffer sb = new StringBuffer();
			for (int j = 0; j < 3; j++) {
				st = new StringTokenizer(br.readLine());
				for (int k = 0; k < 3; k++) {
					sb.append(st.nextToken());
				}
			}
			arr[i] = sb.toString();
		}
		
		System.out.println(solution(n, arr));
	}
}