import java.util.*;
import java.io.*;

public class Main{
    public static int solution(int n, int[][] arr) {
		int answer = 0;
		
		Arrays.sort(arr, (s1, s2) -> {
			if (s1[0] == s2[0]) {
				return s1[1] - s2[1];
			}
			return s1[0] - s2[0];
		});
		
		List<Integer> rooms = new ArrayList<>();
		
		for (int i = 0; i < n; i++) {
			boolean isCreate = true;
			
			for (int j = 0; j < rooms.size(); j++) {
				if (rooms.get(j) <= arr[i][0]) {
					rooms.set(j, arr[i][1]);
					isCreate = false;
					break;
				}
			}
			
			if (isCreate) {
				rooms.add(arr[i][1]);
			}
		}
		
		answer = rooms.size();
		
		return answer;
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