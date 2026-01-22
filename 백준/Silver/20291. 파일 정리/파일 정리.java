import java.util.*;
public class Main{
    public static void solution(Map<String, Integer> map, List<String> words) {
		words.sort(null);
		
		for (int i = 0; i < words.size(); i++) {
			System.out.println(words.get(i) + " " + map.get(words.get(i)));
		}
		
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		sc.nextLine();
		
		Map<String, Integer> map = new HashMap<String, Integer>();
		List<String> words = new ArrayList<String>();
		
		for (int i = 0; i < N; i++) {
			String word = sc.nextLine();
			
			word = word.substring(word.indexOf(".") + 1, word.length());
			
			if (map.get(word) == null) {
				map.put(word, 1);
				words.add(word);
			} else {
				map.put(word, map.get(word) + 1);
			}
		}
		
		solution(map, words);
	}
}