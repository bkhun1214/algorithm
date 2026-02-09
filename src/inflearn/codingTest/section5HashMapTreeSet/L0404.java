package inflearn.codingTest.section5HashMapTreeSet;

import java.util.*;
import java.io.*;

/**
 * 4. 모든 아나그램 찾기 
 * 
 * 설명
 * S문자열에서 T문자열과 아나그램이 되는 S의 부분문자열의 개수를 구하는 프로그램을 작성하세요.
 * 아나그램 판별시 대소문자가 구분됩니다. 부분문자열은 연속된 문자열이어야 합니다.
 * 
 * 입력
 * 첫 줄에 첫 번째 S문자열이 입력되고, 두 번째 줄에 T문자열이 입력됩니다.
 * S문자열의 길이는 10,000을 넘지 않으며, T문자열은 S문자열보다 길이가 작거나 같습니다.
 * 
 * 출력
 * S단어에 T문자열과 아나그램이 되는 부분문자열의 개수를 출력합니다.
 * 
 * 예시 입력 1
 * bacaAacba 
 * abc 
 * 
 * 예시 출력 1
 * 3
 */
public class L0404 {
	
	public static int solution(String s1, String s2) {
		int answer = 0;
		
		int length = s2.length();
		Map<Character, Integer> map1 = new HashMap<>();
		
		for (char c : s2.toCharArray()) {
			map1.put(c, map1.getOrDefault(c, 0) + 1);
		}
		
		Map<Character, Integer> map2 = new HashMap<>();
		for (int i = 0; i < length; i++) {
			char c = s1.charAt(i);
			map2.put(c, map2.getOrDefault(c, 0) + 1);
		}
		
		if (map1.equals(map2)) {
			answer++;
		}
		
		for (int i = length; i < s1.length(); i++) {
			char prev = s1.charAt(i-length);
			char c = s1.charAt(i);
			if (map2.get(prev) == 1) {
				map2.remove(prev);
			} else {
				map2.put(prev, map2.get(prev) - 1);
			}
			
			map2.put(c, map2.getOrDefault(c, 0) + 1);
			
			if (map1.equals(map2)) {
				answer++;
			}
		}

		return answer;
	}
	
	public int answer(String a, String b) {
		int answer=0;
		HashMap<Character, Integer> am= new HashMap<>();
		HashMap<Character, Integer> bm= new HashMap<>();
		for(char x : b.toCharArray()) bm.put(x, bm.getOrDefault(x, 0) + 1);
		int L= b.length()-1;
		for(int i=0; i<L; i++) am.put(a.charAt(i), am.getOrDefault(a.charAt(i), 0) + 1);
		int lt=0;
		for (int rt=L; rt<a.length(); rt++) {
			am.put(a.charAt(rt), am.getOrDefault(a.charAt(rt), 0) + 1);
			if (am.equals(bm)) answer++;
			am.put(a.charAt(lt), am.get(a.charAt(lt))-1);
			if(am.get(a.charAt(lt))==0) am.remove(a.charAt(lt));
			lt++;
		}
		
		return answer;
	}
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		String s1 = st.nextToken();
		
		st = new StringTokenizer(br.readLine());
		
		String s2 = st.nextToken();
		
		System.out.println(solution(s1, s2));
	}
}
