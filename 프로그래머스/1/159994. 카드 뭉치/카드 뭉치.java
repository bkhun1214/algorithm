import java.util.*;

class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        String answer = "Yes";
        
        List<String> cardList1 = new ArrayList<String>();
        cardList1.addAll(Arrays.asList(cards1));
        List<String> cardList2 = new ArrayList<String>();
        cardList2.addAll(Arrays.asList(cards2));
        
        for (String word : goal) {
            if (cardList1.size() > 0 && cardList1.get(0).equals(word)) {
                cardList1.remove(0);
            } else if (cardList2.size() > 0 && cardList2.get(0).equals(word)) {
                cardList2.remove(0);
            } else {
                answer = "No";
                break;
            }
        }
        
        return answer;
    }
}