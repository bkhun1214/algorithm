import java.util.*;

class Solution {
    public int[] solution(int[] fees, String[] records) {
        int[] answer = {};
        Map<String, Integer> moneys = new HashMap<>();
        Map<String, Integer> in = new HashMap<>();
        Map<String, Integer> sum = new HashMap<>();
        
        for (int i = 0; i < records.length; i++) {
        	String[] split = records[i].split(" ");
        	
        	String time[] = split[0].split(":");
    		int minute = (Integer.parseInt(time[0]) * 60) + Integer.parseInt(time[1]);
        	
        	if ("IN".equals(split[2])) {
        		in.put(split[1], minute);
        	} else {
        		int fee = minute - in.get(split[1]);
        		in.remove(split[1]);
        		sum.put(split[1], sum.getOrDefault(split[1], 0) + fee);
        	}
        }
        
        for (String car : in.keySet()) {
        	int fee = ((23 * 60) + 59) - (in.get(car));
        	
        	sum.put(car, sum.getOrDefault(car, 0) + fee);
        }
        
        for (String car : sum.keySet()) {
        	int fee = sum.get(car);
        	
        	int money = fees[1];
    		fee -= fees[0];
    		
    		if (fee > 0) {
    			money += (fee / fees[2]) * fees[3];
    			
    			if (fee % fees[2] > 0) {
    				money += fees[3];
    			}
    		}
    		
    		moneys.put(car, moneys.getOrDefault(car, 0) + money);
        }
        
        List<String> cars = new ArrayList<>(moneys.keySet());
        cars.sort((s1, s2) -> {
        	return Integer.parseInt(s1) - Integer.parseInt(s2);
        });
        answer = new int[moneys.size()];
        
        for (int i = 0; i < moneys.size(); i++) {
        	answer[i] = moneys.get(cars.get(i));
        }
        
        return answer;
    }
}