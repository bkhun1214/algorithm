import java.util.*;
import java.util.stream.*;

class Solution {
    public int[] solution(String today, String[] terms, String[] privacies) {
        List<Integer> answer = new ArrayList<Integer>();
        Map<String, String> map = new HashMap<String, String>();
        
        for (String term : terms) {
            String[] termSplit = term.split(" ");
            map.put(termSplit[0], termSplit[1]);
        }
        
        for (int i = 0; i < privacies.length; i++) {
            String[] todaySplit = today.split("\\.");
            int todayYear = Integer.parseInt(todaySplit[0]);
            int todayMonth = Integer.parseInt(todaySplit[1]);
            int todayDay = Integer.parseInt(todaySplit[2]);
                
            String[] privacySplit = privacies[i].split(" ");
            String date = privacySplit[0];
            
            String[] expirySplit = date.split("\\.");
            int expiryYear = Integer.parseInt(expirySplit[0]);
            int expiryMonth = Integer.parseInt(expirySplit[1]);
            int expiryDay = Integer.parseInt(expirySplit[2]);
            
            expiryDay -= 1;
            if (expiryDay < 1) {
                expiryDay += 28;
                expiryMonth -= 1;
            }
            
            expiryMonth += Integer.parseInt(map.get(privacySplit[1]));
            while (expiryMonth > 12) {
                expiryMonth -= 12;
                expiryYear += 1;
            }
            
            // year
            if (todayYear > expiryYear) {
                answer.add(i+1);
                continue;
            } else if (todayYear < expiryYear) {
                continue; 
            } else {
                // month
                if (todayMonth > expiryMonth) {
                    answer.add(i+1);
                    continue;
                } else if (todayMonth < expiryMonth) {
                    continue;
                } else {
                    // day
                    if (todayDay > expiryDay) {
                        answer.add(i+1);
                        continue;
                    } else {
                        continue;
                    }
                }
            }
        }
        
        
        return answer.stream().mapToInt(i -> i).toArray();
    }
}