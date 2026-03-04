import java.util.*;

class Solution {
    static String[] words = {"A", "E", "I", "O", "U"};
	static List<String> list = new ArrayList<>();
	public int solution(String word) {
        int answer = 0;
        
        search("", 0);
        
        for (int i = 0; i < list.size(); i++) {
        	if (list.get(i).equals(word)) {
        		return i;
        	}
        }
        
        return answer;
    }
	
	public static void search(String word, int depth) {
		list.add(word);
		if (depth == 5) return;
		
		for (int i = 0; i < 5; i++) {
			search(word + words[i], depth+1);
		}
	}
}