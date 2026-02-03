import java.util.*;
import java.io.*;

public class Main{
    public static String solution(int n, Map<String, Integer> map) {
		StringBuffer answer = new StringBuffer();
		
		List<String> list = new ArrayList<>(map.keySet());
		
		list.sort(null);
		
		for (int i = 0; i < list.size(); i++) {
			String word = list.get(i);
			float num = (float) map.get(word);
			answer.append(String.format("%s %.4f", word, (num / n * 100)));
			
			if (i != list.size() -1) {
				answer.append("\n");
			}
		}
		
		return answer.toString();
	}
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = 0;
		Map<String, Integer> map = new HashMap<>();
		
		while (true) {
			String tree = br.readLine();
			
			if (tree == null) {
				break;
			}
			
			n++;
			if (map.get(tree) == null) {
				map.put(tree, 1);
			} else {
				map.put(tree, map.get(tree) + 1);
			}
		}
		
		System.out.println(solution(n, map));
	}
}