import java.util.*;

class Solution {
    public boolean solution(String[] phone_book) {
        boolean answer = true;
        
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < phone_book.length; i++) {
        	map.put(phone_book[i], 1);
        }
        
        for (int i = 0; i < phone_book.length; i++) {
        	String phone = phone_book[i];
        	for (int j = 1; j < phone.length(); j++) {
        		String temp = phone.substring(0, j);
        		if (map.get(temp) != null) {
        			return false;
        		}
        	}
        }
        
        return answer;
    }
}