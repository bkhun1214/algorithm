import java.util.*;

class Solution {
    public int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];
        List<Integer> fame = new ArrayList<Integer>();
        
        for (int i=0; i < score.length; i++) {
            fame.add(score[i]);
            
            Collections.sort(fame, Collections.reverseOrder());
            if (fame.size() > k) {
                fame.remove(fame.size() - 1);
            }
            
            answer[i] = fame.get(fame.size() -1);
        }
        
        return answer;
    }
}