import java.util.*;
import java.io.*;
public class Main{
    public static String solution(int n, Map<String, Integer> map) {
		StringBuffer answer = new StringBuffer();
		
		List<String> list = new ArrayList<>(map.keySet());
		
		list.sort((s1, s2) -> {
			// 1. 자주 나오는 단어일수록 앞에 배치한다.
			// 2. 해당 단어의 길이가 길수록 앞에 배치한다.
			// 3. 알파벳 사전 순으로 앞에 있는 단어일수록 앞에 배치한다
			int count1 = map.get(s1);
			int count2 = map.get(s2);
			
			if (count1 == count2) {
				int length1 = s1.length();
				int length2 = s2.length();
				
				if (length1 == length2) {
					return s1.compareTo(s2);
				}
				
				return length2 - length1;
			}
			
			return count2 - count1;
		});
		
		for (int i = 0; i < list.size(); i++) {
			if (i != 0) {
				answer.append("\n");
			}
			answer.append(list.get(i));
		}
		
		return answer.toString();
	}
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String[] line = br.readLine().split(" ");
		int n = Integer.valueOf(line[0]);
		int m = Integer.valueOf(line[1]);
		
		Map<String, Integer> map = new HashMap<>();
		
		for (int i = 0; i < n; i++) {
			String s = br.readLine();
			
			if (s.length() < m) {
				continue;
			}
			
			map.put(s, map.getOrDefault(s, 0) + 1);
		}
		
		System.out.println(solution(n, map));
	}
}