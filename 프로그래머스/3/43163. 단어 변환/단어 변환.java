import java.util.*;
import java.io.*;

class Solution {
    static boolean[] visited;
    static int count;
    
    public int solution(String begin, String target, String[] words) {
        int answer = 0;
        visited = new boolean[words.length];
        count = Integer.MAX_VALUE;
        
        search(begin, target, 0, words);
        
        if (count == Integer.MAX_VALUE) {
        	count = 0;
        }
        answer = count;
        
        return answer;
    }
    
    public static void search(String word, String target, int num, String[] words) {
    	
    	if (word.equals(target)) {
    		if (count > num) {
    			count = num;
    		}
    		return;
    	}
    	
    	for (int i = 0; i < words.length; i++) {
    		if (compare(word, words[i]) && !visited[i]) {
    			visited[i] = true;
    			search(words[i], target, num+1, words);
    			visited[i] = false;
    		}
    	}
    }
    
    public static boolean compare(String word1, String word2) {
    	int count = 0;
    	
    	for (int i = 0; i < word1.length(); i++) {
    		if (word1.charAt(i) != word2.charAt(i)) {
    			count++;
    		}
    		
    		if (count > 1) {
    			return false;
    		}
    	}
    	
    	return true;
    }
}