class Solution {
    public int solution(String s) {
        int answer = 0;
        
        int start = 0;
        int compare = 0;
        char temp = s.charAt(0);
        
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (temp == c) {
                start += 1;
            } else {
                compare += 1;
            }
            
            if (start == compare) {
                answer ++;
                start = 0;
                compare = 0;
                
                if (i < s.length() - 1) {    
                    temp = s.charAt(i+1);
                }
            }
        }
        
        if (start != compare) {
            answer++;
        }
        
        return answer;
    }
}